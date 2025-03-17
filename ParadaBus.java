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

    public ParadaBus() {
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

    public int getTiempo() {
        return tiempo;
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
