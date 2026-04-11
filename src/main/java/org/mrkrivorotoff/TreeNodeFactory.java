package org.mrkrivorotoff;

public final class TreeNodeFactory {
    private TreeNodeFactory() {
        throw new AssertionError();
    }

    public static TreeNode ofValues(Integer... values) {
        var valuesLength = values.length;
        if (valuesLength == 0)
            return null;
        var steps = new int[getNumberOfLevels(valuesLength) - 1];
        return createNode(steps, -1, -1, values);
    }

    static int getNumberOfLevels(int numberOfValues) {
        var numberOfLevels = 0;
        for (var decrement = 1; numberOfValues > 0; numberOfLevels++, decrement <<= 1)
            numberOfValues -= decrement;
        if (numberOfValues < 0)
            throw new IllegalArgumentException();
        return numberOfLevels;
    }

    static TreeNode createNode(int[] steps, int currentStepIndex, int currentStep, Integer[] values) {
        if (currentStepIndex >= 0)
            steps[currentStepIndex] = currentStep;
        var value = values[getIndexOfNode(steps, currentStepIndex)];
        if (value == null)
            return null;
        if (currentStepIndex == steps.length - 1)
            return new TreeNode(value);
        var left = createNode(steps, currentStepIndex + 1, 0, values);
        var right = createNode(steps, currentStepIndex + 1, 1, values);
        return new TreeNode(value, left, right);
    }

    static int getIndexOfNode(int[] steps, int currentStepIndex) {
        var nodesInPrevLevels = 0;
        for (int i = 0, offsetIncrement = 1; i <= currentStepIndex; i++, offsetIncrement <<= 1)
            nodesInPrevLevels += offsetIncrement;
        var currentStepOffset = 0;
        for (int i = currentStepIndex, offsetIncrement = 1; i >= 0; i--, offsetIncrement <<= 1)
            if (steps[i] != 0)
                currentStepOffset += offsetIncrement;
        return nodesInPrevLevels + currentStepOffset;
    }
}
