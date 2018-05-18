import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        wypiszFigury(przykładowaListaZFigurami(), System.out::println);
    }

    private static List<Figura> przykładowaListaZFigurami() {
        return Arrays.asList(new Prostokąt(2, 4), new Kwadrat(3.5), new Okrąg(10));
    }

    private static <T extends Figura> void wypiszFigury(List <T> listaFigur, Consumer <String> strumieńDoWypisu) {
        for (T figura : listaFigur){
            String tekstDoWypisania = String.format("%s pole %.2f, obwód: %.2f", figura.getClass().getTypeName(), figura.pole(), figura.obwód());
            strumieńDoWypisu.accept(tekstDoWypisania);
        }
    }
}
