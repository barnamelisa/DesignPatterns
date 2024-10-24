package structuralPatterns.adapter;

import structuralPatterns.adapter.adapters.SquarePegAdapter;
import structuralPatterns.adapter.round.RoundHole;
import structuralPatterns.adapter.round.RoundPeg;
import structuralPatterns.adapter.square.SquarePeg;

public class Demo {
    public Demo() {
    }

    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5.0);
        RoundPeg rpeg = new RoundPeg(5.0);
        if (hole.fits(rpeg)) {
            System.out.println("Round peg r5 fits round hole r5.");
        }

        SquarePeg smallSqPeg = new SquarePeg(2.0);
        SquarePeg largeSqPeg = new SquarePeg(20.0);
        SquarePegAdapter smallSqPegAddapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAddapter = new SquarePegAdapter(largeSqPeg);
        if (hole.fits(smallSqPegAddapter)) {
            System.out.println("Square peg w2 fits round hole r5.");
        }

        if (!hole.fits(largeSqPegAddapter)) {
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }

    }
}