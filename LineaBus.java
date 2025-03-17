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

    public Set<ParadaBus> getParadabus() {
        return paradabus;
    }

    public LineaBus() {
    }

    public boolean addParada(ParadaBus pb){
        if(!paradabus.contains(pb)){
            paradabus.add(pb);
            return true;
        }else {
            return false;
        }
    }
    public boolean contieneParada(ParadaBus parada) {
        return this.paradabus.contains(parada);
    }
    @Override
    public String toString() {
        return "LineaBus= " +
                "Letra= " + letra + '\'' ;

    }
}
