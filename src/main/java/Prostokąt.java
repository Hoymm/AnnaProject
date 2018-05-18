
public class Prostokąt extends Figura {
    private double wys;
    private double szer;

    public Prostokąt(double wys, double szer) {
        this.wys = wys;
        this.szer = szer;
        rodzaj = "Prostokąt";
    }
// TODO Auto-generated constructor stub

    @Override
    public double getPole() {
        // TODO Auto-generated method stub
        return wys * szer;
    }

    @Override
    public double getObwód() {
        // TODO Auto-generated method stub
        return 2 * (wys + szer);
    }
}