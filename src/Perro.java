public class Perro {
    private String placa;
    private String nombre;
    private String raza;
    private int edad;
    private String tamaño;


    public Perro(String placa, String nombre, String raza, int edad, String tamaño) {
        this.placa = this.placa;
        this.edad = this.edad;
        this.nombre = this.nombre;
        this.raza = this.raza;
        this.tamaño = this.tamaño;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Placa:"+placa +",Nombre:" + nombre + ",Raza:" + raza +",Edad:" +edad+ ",Tamaño:"+tamaño;
    }
}
