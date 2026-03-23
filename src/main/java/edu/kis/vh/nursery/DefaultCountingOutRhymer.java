package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int INITIAL_CAPACITY = 12;
    public static final int EMPTY_RHYMER_INDICATOR = -1;
    public static final int MAX_SIZE = 11;

    private final int[] numbers = new int[INITIAL_CAPACITY];

    public int totalCount = EMPTY_RHYMER_INDICATOR;

    public void countIn(int in) {
        if (!isFull())
            numbers[++totalCount] = in;
    }

    public boolean isEmpty() {
        return totalCount == EMPTY_RHYMER_INDICATOR;
    }

    public boolean isFull() {
        return totalCount == MAX_SIZE;
    }

    protected int peek() {
        if (isEmpty())
            return EMPTY_RHYMER_INDICATOR;
        return numbers[totalCount];
    }

    public int countOut() {
        if (isEmpty())
            return EMPTY_RHYMER_INDICATOR;
        return numbers[totalCount--];
    }

}