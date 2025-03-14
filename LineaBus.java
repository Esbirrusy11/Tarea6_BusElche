import java.util.HashSet;
import java.util.Set;

public class LineaBus {

    String letra;

    Set<ParadaBus> paradabus=new HashSet<>();

    public LineaBus(String letra) {
        this.letra = letra;
    }

    public String getLetra() {
        return letra;
    }


    public void validarletra(String l){

        if (l.length()>1){
            System.out.println("La letra de la línea no puede más de 1 caracteres");
        }
        char pri=l.charAt(0);
        if (!Character.isLetter(pri)){
            System.out.println("Tiene que ser una letra");
        }
    }

    public boolean addParada(ParadaBus pb){
        if(!paradabus.contains(pb)){
            paradabus.add(pb);
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "LineaBus= " +
                "Letra= " + letra + '\'' ;

    }
}
