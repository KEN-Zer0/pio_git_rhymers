package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private static final int INITIAL_REJECTED_VALUE = 0;

    int totalRejected = INITIAL_REJECTED_VALUE;

    public int reportRejected() {
        return totalRejected;
    }

    public void countIn(int in) {
        if (!isEmpty() && in > peek())
            totalRejected++;
        else
            super.countIn(in);
    }
}