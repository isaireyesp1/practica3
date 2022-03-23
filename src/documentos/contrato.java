package documentos;

public class contrato {

    private String nombre;

    private int duracion;

    public void insertarDatos(String Nombre, int Duracion) {
        nombre = Nombre;
        duracion = Duracion;
        System.out.println("Contrato a nombre de: " + nombre);
        System.out.println("Con una durcion de " + duracion + " Meses");
    }
}
