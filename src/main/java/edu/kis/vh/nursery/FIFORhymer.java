package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    public int countOut() {
        while (!isEmpty())
            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.isEmpty())
            countIn(temp.countOut());

        return ret;
    }
}