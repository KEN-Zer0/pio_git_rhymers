package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    // Punkt 6: Stała zamiast literału 0
    private static final int INITIAL_REJECTED_VALUE = 0;

    int totalRejected = INITIAL_REJECTED_VALUE;

    public int reportRejected() {
        return totalRejected;
    }

    @Override 
    public void countIn(int in) {
        if (!isEmpty() && in > peek())
            totalRejected++;
        else
            super.countIn(in);
    }
}