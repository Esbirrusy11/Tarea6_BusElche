import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

   static Map<String,ParadaBus> mapabus=new HashMap<>();
   static Set<LineaBus> lb=new HashSet<>();
    public static void main(String[] args) {

    LineaBus A=new LineaBus("A");
    ParadaBus a1=new ParadaBus(001,"Doctor Caro","Doctor Caro – C ",75);
    ParadaBus a2=new ParadaBus(002,"Vicente Blasco Ibañez","Vicente Blasco Ibañez,22",60);
    ParadaBus a3=new ParadaBus(003,"Vicente Blasco Ibañez","Vicente Blasco Ibañez,80",40);
    ParadaBus a4=new ParadaBus(004,"Inem Carrús","Inem Carrús",50);
    ParadaBus a5=new ParadaBus(005,"Pedro Moreno Sastre","Pedro Moreno Sastre,62",80);

    LineaBus I=new LineaBus("I");
    ParadaBus i1=new ParadaBus(003,"Vicente Blasco Ibañez","Vicente Blasco Ibañez,22",50);
    ParadaBus i2=new ParadaBus(071,"Jorge Juan-Reina Victoria","Jorge Juan-Reina Victoria",100);
    ParadaBus i3=new ParadaBus(335,"Gabriel Miró","Gabriel Miró",70);
    ParadaBus i4=new ParadaBus(346,"Passeig de Germanles","Passeig de Germanles",50);
    ParadaBus i5=new ParadaBus(347,"Federico G.Lorca","Federico G.Lorca-Asilo",120);

    LineaBus J=new LineaBus("J");
    ParadaBus j1=new ParadaBus(115,"Centre-Avg.C.Valenciana","Centre-Avg.C.Valenciana",125);
    ParadaBus j2=new ParadaBus(002,"Vicente Blasco Ibañez","Vicente Blasco Ibañez,22",75);
    ParadaBus j3=new ParadaBus(89,"Avinguda Llibertat","Avinguda Llibertat,11",40);
    ParadaBus j4=new ParadaBus(90,"Renfe-Parc Municipal","Renfe-Parc Municipal",80);
    ParadaBus j5=new ParadaBus(117,"Virgen de la Cabeza","Virgen de la Cabeza-LL. del Pensionista",40);

    LineaBus F=new LineaBus("F");
    ParadaBus f1=new ParadaBus(115,"Centre-Avg.C.Valenciana","Centre-Avg.C.Valenciana",125);
    ParadaBus f2=new ParadaBus(002,"Vicente Blasco Ibañez","Vicente Blasco Ibañez,22",45);
    ParadaBus f3=new ParadaBus(056,"Cristóbal Sanz","Cristóbal Sanz",40);
    ParadaBus f4=new ParadaBus(89,"Avinguda Llibertat","Avinguda Llibertat,11",75);
    ParadaBus f5=new ParadaBus(90,"Renfe-Parc Municipal","Renfe-Parc Municipal",70);

    lb.add(A);
    A.addParada(a1);
    mapabus.put("001",a1);
    A.addParada(a2);
    mapabus.put("002",a2);
    A.addParada(a3);
    mapabus.put("003",a3);
    A.addParada(a4);
    mapabus.put("004",a4);
    A.addParada(a5);
    mapabus.put("005",a5);

    lb.add(I);
    I.addParada(i1);
    mapabus.put("003",i1);
    I.addParada(i2);
    mapabus.put("071",i2);
    I.addParada(i3);
    mapabus.put("335",i3);
    I.addParada(i4);
    mapabus.put("346",i4);
    I.addParada(i5);
    mapabus.put("347",i5);

    lb.add(J);
    J.addParada(j1);
    mapabus.put("115",j1);
    J.addParada(j2);
    mapabus.put("002",j2);
    J.addParada(j3);
    mapabus.put("89",j3);
    J.addParada(j4);
    mapabus.put("90",j4);
    J.addParada(j5);
    mapabus.put("115",j5);

    }
}
