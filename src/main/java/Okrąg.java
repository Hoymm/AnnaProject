public class Okrąg implements Figura {
    private final double promień;

    Okrąg(double promień){
        this.promień = promień;
    }

    @Override
    public double pole() {
        return Math.PI*promień*promień;
    }

    @Override
    public double obwód() {
        return 2*Math.PI*promień;
    }
}


