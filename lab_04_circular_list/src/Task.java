/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Student Name:
 * Description: Lab 04 - Task
 */

public class Task {

    private int size;
    private int priority;
    private boolean dead;

    public static final int LOW_PRIORITY = 1;
    public static final int STANDARD_PRIORITY = 2;
    public static final int HIGH_PRIORITY  = 3;
    private static final int MIN_TASK_SIZE = 1;

    /**
     * TODO #1: a task has size > 0 (set it to 1 if given value is invalid) and a priority (1, 2, or 3); tasks are always created in the "alive" state
     * @param size it has to be > 0
     * @param priority it has to be 1, 2, or 3
     */
    public Task(int size, int priority) {

    }

    /**
     * TODO #2: this creates a task with a (given) size and standard priority
     * @param size
     */
    public Task(int size) {

    }

    public int getSize() {
        return size;
    }

    public int getPriority() {
        return priority;
    }

    public boolean isDead() {
        return dead;
    }

    /**
     * TODO #3: if the task is alive, run the task one unit of time by decrementing its size; update the task status if its size becomes zero
     */
    public void run() {

    }
}
