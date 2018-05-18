
public class Okrąg extends Figura {
    private double promieñ;

    public Okrąg(double promieñ) {
        this.promieñ = promieñ;
        rodzaj = "Okrąg";
        // TODO Auto-generated constructor stub
    }

    @Override
    public double getPole() {
        // TODO Auto-generated method stub
        return Math.PI * promieñ * promieñ;
    }

    @Override
    public double getObwód() {
        // TODO Auto-generated method stub
        return 2 * Math.PI * promieñ;
    }
}
