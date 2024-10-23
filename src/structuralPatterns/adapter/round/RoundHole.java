package structuralPatterns.adapter.round;

public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public boolean fits(RoundPeg peg) {
        boolean result = this.getRadius() >= peg.getRadius();
        return result;
    }
}