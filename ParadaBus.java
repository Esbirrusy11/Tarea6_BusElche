public class ParadaBus{

    int num;
    String nombre;
    String direccion;
    int tiempo;

    public ParadaBus(int num, String nombre, String direccion, int tiempo) {
        this.num = num;
        this.nombre = nombre;
        this.direccion = direccion;
        this.tiempo = tiempo;
    }

    public int getNum() {
        return num;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "ParadaBus{" +
                "num=" + num +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", tiempo=" + tiempo +
                '}';
    }
}
