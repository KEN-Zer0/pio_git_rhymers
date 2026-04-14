package edu.kis.vh.nursery;

/**
 * A rhymer that rejects numbers greater than the current top element.
 *
 * This class extends DefaultCountingOutRhymer and modifies the behavior
 * of adding elements. If the inserted number is greater than the element
 * currently at the top of the structure, it is rejected and not stored.
 * Rejected elements are counted and can be reported.
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    private static final int INITIAL_REJECTED_VALUE = 0;

    /**
     * Number of elements rejected during insertion.
     */
    private int totalRejected = INITIAL_REJECTED_VALUE;

    /**
     * Returns the total number of rejected elements.
     *
     * @return number of rejected values
     */
    public int reportRejected() {
        return totalRejected;
    }

    /**
     * Adds a number to the rhymer.
     *
     * The number is rejected if it is greater than the current top element.
     * In such case, it is not stored and the rejection counter is incremented.
     *
     * @param in number to be added
     */
    @Override
    public void countIn(int in) {
        if (!isEmpty() && in > peek())
            totalRejected++;
        else
            super.countIn(in);
    }
}