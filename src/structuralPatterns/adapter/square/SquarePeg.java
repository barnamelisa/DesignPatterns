package structuralPatterns.adapter.square;

public class SquarePeg {
    private double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return this.width;
    }

    public double getSquare() {
        double result = Math.pow(this.width, 2.0);
        return result;
    }
}