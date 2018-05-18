package figury;

public class Kwadrat extends Figura {
    private double bok;
    public Kwadrat(double bok) {
        // TODO Auto-generated constructor stub
        this.bok=bok;
        rodzaj="figury.figury.Kwadrat";
    }

    @Override
    public double getPole() {
        // TODO Auto-generated method stub
        return bok*bok;
    }

    @Override
    public double getObwód() {
        // TODO Auto-generated method stub
        return 4*bok;
    }

}
