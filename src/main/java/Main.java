import java.util.ArrayList;

public class MainClass {

    public static void main(String[] args) {
        ArrayList<Figura> figura=new ArrayList<>();

        figura.add(new Prostokąt(2, 4));
        figura.add(new Kwadrat(3.5));
        figura.add(new Okrąg(10));
        for(int i=0;i<figura.size();i++)
            System.out.println(figura.get(i).getRodzaj()+" pole: "+figura.get(i).getPole()+", obwód:"+figura.get(i).getObwód());

    }

}