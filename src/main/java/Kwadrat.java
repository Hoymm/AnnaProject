public class Kwadrat implements Figura {
    private final double bok;

    Kwadrat(double bok) {
        this.bok = bok;
    }

    @Override
    public double pole() {
        return bok*bok;
    }

    @Override
    public double obwód() {
        return 4*bok;
    }

}
