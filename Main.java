import java.util.*;

public class Main {

 static Map<String, ParadaBus> mapabus = new HashMap<>();
 static Set<LineaBus> lb = new HashSet<>();

 public static void main(String[] args) {

  LineaBus A = new LineaBus("A");
  ParadaBus a1 = new ParadaBus(001, "Doctor Caro", "Doctor Caro – C ", 75);
  ParadaBus a2 = new ParadaBus(002, "Vicente Blasco Ibañez", "Vicente Blasco Ibañez,22", 60);
  ParadaBus a3 = new ParadaBus(003, "Vicente Blasco Ibañez", "Vicente Blasco Ibañez,80", 40);
  ParadaBus a4 = new ParadaBus(004, "Inem Carrús", "Inem Carrús", 50);
  ParadaBus a5 = new ParadaBus(005, "Pedro Moreno Sastre", "Pedro Moreno Sastre,62", 80);

  LineaBus I = new LineaBus("I");
  ParadaBus i1 = new ParadaBus(003, "Vicente Blasco Ibañez", "Vicente Blasco Ibañez,22", 50);
  ParadaBus i2 = new ParadaBus(071, "Jorge Juan-Reina Victoria", "Jorge Juan-Reina Victoria", 100);
  ParadaBus i3 = new ParadaBus(335, "Gabriel Miró", "Gabriel Miró", 70);
  ParadaBus i4 = new ParadaBus(346, "Passeig de Germanles", "Passeig de Germanles", 50);
  ParadaBus i5 = new ParadaBus(347, "Federico G.Lorca", "Federico G.Lorca-Asilo", 120);

  LineaBus J = new LineaBus("J");
  ParadaBus j1 = new ParadaBus(115, "Centre-Avg.C.Valenciana", "Centre-Avg.C.Valenciana", 125);
  ParadaBus j2 = new ParadaBus(002, "Vicente Blasco Ibañez", "Vicente Blasco Ibañez,22", 75);
  ParadaBus j3 = new ParadaBus(890, "Avinguda Llibertat", "Avinguda Llibertat,11", 40);
  ParadaBus j4 = new ParadaBus(900, "Renfe-Parc Municipal", "Renfe-Parc Municipal", 80);
  ParadaBus j5 = new ParadaBus(117, "Virgen de la Cabeza", "Virgen de la Cabeza-LL. del Pensionista", 40);

  LineaBus F = new LineaBus("F");
  ParadaBus f1 = new ParadaBus(115, "Centre-Avg.C.Valenciana", "Centre-Avg.C.Valenciana", 125);
  ParadaBus f2 = new ParadaBus(002, "Vicente Blasco Ibañez", "Vicente Blasco Ibañez,22", 45);
  ParadaBus f3 = new ParadaBus(056, "Cristóbal Sanz", "Cristóbal Sanz", 40);
  ParadaBus f4 = new ParadaBus(890, "Avinguda Llibertat", "Avinguda Llibertat,11", 75);
  ParadaBus f5 = new ParadaBus(900, "Renfe-Parc Municipal", "Renfe-Parc Municipal", 70);

  lb.add(A);
  A.addParada(a1);
  mapabus.put("001", a1);
  A.addParada(a2);
  mapabus.put("002", a2);
  A.addParada(a3);
  mapabus.put("003", a3);
  A.addParada(a4);
  mapabus.put("004", a4);
  A.addParada(a5);
  mapabus.put("005", a5);

  lb.add(I);
  I.addParada(i1);
  mapabus.put("003", i1);
  I.addParada(i2);
  mapabus.put("071", i2);
  I.addParada(i3);
  mapabus.put("335", i3);
  I.addParada(i4);
  mapabus.put("346", i4);
  I.addParada(i5);
  mapabus.put("347", i5);

  lb.add(J);
  J.addParada(j1);
  mapabus.put("115", j1);
  J.addParada(j2);
  mapabus.put("002", j2);
  J.addParada(j3);
  mapabus.put("890", j3);
  J.addParada(j4);
  mapabus.put("900", j4);
  J.addParada(j5);
  mapabus.put("117", j5);

  lb.add(F);
  F.addParada(f1);
  mapabus.put("115", f1);
  F.addParada(f2);
  mapabus.put("002", f2);
  F.addParada(j3);
  mapabus.put("056", f3);
  F.addParada(f4);
  mapabus.put("890", f4);
  F.addParada(f5);
  mapabus.put("900", f5);

  Scanner sc = new Scanner(System.in);

  System.out.print("Elige la parada inicial: ");
  String parada;
  do {
   parada = sc.next();
   if (!parada.matches("\\d{3}")) {
    System.out.println("Error las paradas deben tener 3 dígitos");
   } else if (!mapabus.containsKey(parada)) {
    System.out.println("La parada no existe");
   }

  } while (!parada.matches("\\d{3}") || !mapabus.containsKey(parada));
  System.out.println("Has elegido " + mapabus.get(parada).getNombre() + " - " + mapabus.get(parada).getDireccion());

  mostrarLinea(parada);

  System.out.print("Elige la parada final: ");
  String parada2;
  do {
   parada2 = sc.next();
   if (!parada2.matches("\\d{3}")) {
    System.out.println("Error las paradas deben tener 3 dígitos");
   } else if (!mapabus.containsKey(parada2)) {
    System.out.println("La parada no existe");
   }

  } while (!parada2.matches("\\d{3}") || !mapabus.containsKey(parada2));
  System.out.println("Has elegido " + mapabus.get(parada2).getNombre() + " - " + mapabus.get(parada2).getDireccion());

  calcularTiempo(parada,parada2);
 }

 public static void mostrarLinea(String parada) {

  ParadaBus paradaSeleccionada = mapabus.get(parada);

   for (LineaBus linea : lb) {
    if (linea.contieneParada(paradaSeleccionada)) {
     System.out.println("Línea de bus: " + linea.getLetra());
    }
  }
 }

 public static void calcularTiempo(String paradaInicio, String paradaFin) {

  ParadaBus inicio = mapabus.get(paradaInicio);
  ParadaBus fin = mapabus.get(paradaFin);

  LineaBus linea = null;

  for (LineaBus l : lb) {
   if (l.contieneParada(inicio) && l.contieneParada(fin)) {
    linea = l;
    break;
   }
  }

  if (linea == null) {
   System.out.println("Las paradas no están en la misma línea de bus.");
   return;
  }


  List<ParadaBus> paradasLinea = new ArrayList<>(linea.getParadabus());
  paradasLinea.sort(Comparator.comparingInt(ParadaBus::getNum));


  boolean encontradoInicio = false;
  int tiempoTotalSegundos = 0;

  for (ParadaBus p : paradasLinea) {
   if (p.equals(inicio)) {
    encontradoInicio = true;
   }
   if (encontradoInicio) {
    tiempoTotalSegundos += p.getTiempo();
   }
   if (p.equals(fin)) {
    break;
   }
  }

  int minutos = tiempoTotalSegundos / 60;
  int segundos = tiempoTotalSegundos % 60;

  System.out.println("Tiempo: " + minutos + " minutos y " + segundos + " segundos.");
 }


}
