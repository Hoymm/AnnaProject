public class Prostokąt implements Figura {
    private final double wys;
    private final double szer;

    Prostokąt(double wys, double szer){
        this.wys = wys;
        this.szer = szer;
    }

    @Override
    public double pole() {
        return wys*szer;
    }

    @Override
    public double obwód() {
        return 2*(wys+szer);
    }

}
