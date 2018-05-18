package figury;

public abstract class Figura {
    protected String rodzaj;
    public abstract double getPole();
    public abstract double getObwód();
    public String getRodzaj(){
        return rodzaj;
    }
}