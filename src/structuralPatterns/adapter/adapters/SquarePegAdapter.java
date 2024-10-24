package structuralPatterns.adapter.adapters;

import structuralPatterns.adapter.round.RoundPeg;
import structuralPatterns.adapter.square.SquarePeg;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    public double getRadius() {
        double result = Math.sqrt(Math.pow(this.peg.getWidth() / 2.0, 2.0) * 2.0);
        return result;
    }
}