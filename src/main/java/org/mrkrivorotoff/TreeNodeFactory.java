package org.mrkrivorotoff;

public final class TreeNodeFactory {
    private TreeNodeFactory() throws InstantiationException {
        throw new InstantiationException();
    }

    public static TreeNode ofValues(final Integer... values) {
        final var valuesLength = values.length;
        if (valuesLength == 0)
            return null;
        final var steps = new int[getNumberOfLevels(valuesLength) - 1];
        return createNode(steps, -1, -1, values);
    }

    static int getNumberOfLevels(int numberOfValues) {
        var numberOfLevels = 0;
        for (int i = 0, base = 1; numberOfValues > 0; i++, numberOfLevels++, base <<= 1)
            numberOfValues -= base;
        if (numberOfValues < 0)
            throw new IllegalArgumentException();
        return numberOfLevels;
    }

    static TreeNode createNode(int[] steps, int currentStepIndex, int currentStep, Integer[] values) {
        if (currentStepIndex >= 0)
            steps[currentStepIndex] = currentStep;
        final var value = values[getIndexOfNode(steps, currentStepIndex)];
        if (value == null)
            return null;
        if (currentStepIndex < steps.length - 1) {
            final TreeNode left = createNode(steps, currentStepIndex + 1, 0, values);
            final TreeNode right = createNode(steps, currentStepIndex + 1, 1, values);
            return new TreeNode(value, left, right);
        } else {
            return new TreeNode(value);
        }
    }

    static int getIndexOfNode(int[] steps, int currentStepIndex) {
        var base = 0;
        for (int i = 0, offsetIncrement = 1; i <= currentStepIndex; i++, offsetIncrement <<= 1)
            base += offsetIncrement;
        var currentStepOffset = 0;
        for (int i = currentStepIndex, offsetIncrement = 1; i >= 0; i--, offsetIncrement <<= 1)
            if (steps[i] != 0)
                currentStepOffset += offsetIncrement;
        return base + currentStepOffset;
    }
}
