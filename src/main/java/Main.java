import figury.Figura;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Figura> listaFigur = stwórzListęZFigurami();
        wypiszFigury(listaFigur);
    }

    private static ArrayList<Figura> stwórzListęZFigurami() {
        ArrayList<Figura> listaFigur = new ArrayList<>();
        listaFigur.add(new figury.Prostokąt(2, 4));
        listaFigur.add(new figury.Kwadrat(3.5));
        listaFigur.add(new figury.Okrąg(10));
        return listaFigur;
    }
    private static void wypiszFigury(ArrayList<Figura> listaFigur) {
        for (Figura figura : listaFigur){
            System.out.println(figura.getRodzaj() + " pole " + figura.getPole() + ", obwód: " + figura.getObwód());
            System.out.printf("%s pole %4.2f, obwód: %4.2f\n", figura.getRodzaj(), figura.getPole(), figura.getObwód());
        }
    }
}
