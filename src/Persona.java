import java.util.ArrayList;
import java.util.List;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private String documento;
    private List<Perro> perrosAdoptados;



    public Persona(String nombre, String apellido, int edad, String documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.perrosAdoptados = new ArrayList<>();
    }
    public String getDocumento(){
        return documento;
    }
    public boolean adoptarPerro(Perro perro){
        if (perrosAdoptados.size()<3){
            perrosAdoptados.add(perro);
            return true;
        } else  {
            return false;
        }
    }
    public Perro perrosMasGrande(){
        if (perrosAdoptados.isEmpty())return null;
        Perro mayor= perrosAdoptados.get(0);
        for (Perro p: perrosAdoptados){
            if (p.getEdad()> mayor.getEdad()){
                mayor = p;
            }
        }
        return mayor;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder("Nombre:"+nombre+""+apellido+",Edad:"+edad+",Documento:"+documento+"\nPerros adoptados:\n");
        for (Perro p: perrosAdoptados){
            sb.append("  -  ").append(p).append("\n");
        }
        return sb.toString();

    }
}
