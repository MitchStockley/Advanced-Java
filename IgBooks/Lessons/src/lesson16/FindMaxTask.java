package lesson16;

import java.util.concurrent.RecursiveTask;

public class FindMaxTask extends RecursiveTask<Integer> {

    private final int threshold;
    private final int[] myArray;
    private final int start;
    private final int end;

    public FindMaxTask(int[] myArray, int start, int end, int threshold) {
        // copy parameters to fields
        this.myArray = myArray;
        this.start = start;
        this.end = end;
        this.threshold = threshold;
    }

    @Override
    protected Integer compute() {
        // If the task is small enough, compute directly
        if (end - start <= threshold) {
            int max = Integer.MIN_VALUE;
            for (int i = start; i < end; i++) {
                max = Math.max(max, myArray[i]);
            }
            return max;
        } else {
            // Split the task into two parts
            int mid = start + (end - start) / 2;
            FindMaxTask leftTask = new FindMaxTask(myArray, start, mid, threshold);
            FindMaxTask rightTask = new FindMaxTask(myArray, mid, end, threshold);

            // Execute the subtasks in parallel
            leftTask.fork();
            rightTask.fork();

            // Wait for the results of the subtasks and combine them
            int rightResult = rightTask.join();
            int leftResult = leftTask.join();
            return Math.max(leftResult, rightResult);
        }
    }

    // A simple method to utilize this class and test it
    public static void main(String[] args) {
        // Example usage
        int[] array = {1, 5, 3, 8, 4, 9, 6, 2, 7, 0};
        int threshold = 2; // Adjust based on your preference and array size
        FindMaxTask task = new FindMaxTask(array, 0, array.length, threshold);

        // Typically, you would use a ForkJoinPool to execute this task
        java.util.concurrent.ForkJoinPool pool = java.util.concurrent.ForkJoinPool.commonPool();
        int result = pool.invoke(task);

        System.out.println("Max value: " + result);
    }

}
