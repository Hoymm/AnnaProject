package figury;

public class Okrąg extends Figura {
    private double promień;
    public Okrąg(double promień){
        this.promień=promień;
        rodzaj="figury.figury.Okrąg";
        // TODO Auto-generated constructor stub
    }

    @Override
    public double getPole() {
        // TODO Auto-generated method stub
        return Math.PI*promień*promień;
    }

    @Override
    public double getObwód() {
        // TODO Auto-generated method stub
        return 2*Math.PI*promień;
    }
}


