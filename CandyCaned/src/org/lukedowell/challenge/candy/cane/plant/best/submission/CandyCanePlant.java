package org.lukedowell.challenge.candy.cane.plant.best.submission;

/**
 * Created by ldowell on 12/1/15.
 */
public class CandyCanePlant {

    private boolean hasBred;

    private int candyCanesProducedPerWeek;

    public CandyCanePlant(int candyCanesProducedPerWeek) {
        this.candyCanesProducedPerWeek = candyCanesProducedPerWeek;
    }

    public boolean hasBred() {
        return hasBred;
    }

    public void setHasBred(boolean hasBred) {
        this.hasBred = hasBred;
    }

    public int getCandyCanesProducedPerWeek() {
        return candyCanesProducedPerWeek;
    }

    public void setCandyCanesProducedPerWeek(int candyCanesProducedPerWeek) {
        this.candyCanesProducedPerWeek = candyCanesProducedPerWeek;
    }
}
