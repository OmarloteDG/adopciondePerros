import jdk.internal.icu.text.UnicodeSet;        /// Omar Daniel Lote Garcia
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<Persona> personas = new ArrayList<>();
        List<Perro> perrosDisponibles = new ArrayList<>();
        int opcion, edad;
        String nombre, apellido, documento, raza, placa, tamano;


        do {
            System.out.println("MENU DE OPCIONES");
            System.out.println("1. Registrar Persona");
            System.out.println("2. Registrar Perro");
            System.out.println("3. Ver Personas Registradas");
            System.out.println("4. Ver Perros Disponibles");
            System.out.println("5. Adoptar Perro");
            System.out.println("6. Consultar el Perro mas Viejo");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("Nombre:");
                    nombre = teclado.next();
                    System.out.println("Apellido:");
                    apellido = teclado.next();
                    System.out.println("Edad:");
                    edad = teclado.nextInt();
                    System.out.println("Documento:");
                    documento = teclado.next();
                    personas.add(new Persona(nombre, apellido, edad, documento));
                    System.out.println("Persona Registrada Correctamente.");
                }
                case 2 -> {
                    System.out.println("Placa:");
                    placa = teclado.next();
                    System.out.println("Nombre:");
                    nombre = teclado.next();
                    System.out.println("Raza:");
                    raza = teclado.next();
                    System.out.println("Edad:");
                    edad = teclado.nextInt();
                    System.out.println("Tamaño:");
                    tamano = teclado.next();
                    perrosDisponibles.add(new Perro(placa, nombre, raza, edad, tamano));
                    System.out.println("Perro Registrado Correctamente.");
                }
                case 3 -> {
                    if (personas.isEmpty()) {
                        System.out.println("no hay personas registradas.");
                    } else {
                        personas.forEach(System.out::println);
                    }
                }
                case 4 -> {
                    if (perrosDisponibles.isEmpty()) {
                        System.out.println("no hay perros disponibles.");
                    } else {
                        perrosDisponibles.forEach(System.out::println);
                    }
                }
                case 5 -> {
                    System.out.println("Documento:");
                    documento = teclado.next();
                    Persona adptante= null;
                    for (Persona p :personas){
                        if (p.getDocumento().equals(documento)){
                            adptante = p;

                        }
                    }
                    if (adptante == null){
                        System.out.println("persona no encontrada");
                    }
                    System.out.println("placa:");
                    placa = teclado.next();
                    Perro perroAsoptado = null;
                    for (Perro p : perrosDisponibles){
                        if (p.getPlaca().equals(placa)){
                            perroAsoptado = p;
                        }
                    }
                    if (perroAsoptado == null){
                        System.out.println("perro no disponible o no existe");
                    }else {
                        if (adptante.adoptarPerro(perroAsoptado)){
                            perrosDisponibles.remove(perroAsoptado);
                            System.out.println("perro adoptado con exito");
                        }else {
                            System.out.println("ya adopto mas de 3 perros");
                        }
                    }
                }
                case 6 -> {
                    System.out.println("Documento:");
                    documento = teclado.next();
                    Persona persona = null;
                    for (Persona p: personas){
                        if (p.getDocumento().equals(documento)){
                            persona = p;
                        }
                    }
                    if (persona == null){
                        System.out.println("Pesona no encontrada.");
                    }else{
                        Perro viejo = persona.perrosMasGrande();
                        if (viejo == null){
                            System.out.println("no hay perros grande");
                        }else {
                            System.out.println("El perro mas Grande es:"+ viejo);
                        }
                    }

                }
                case 7 -> {
                    System.out.println("GRACIAS POR USAR EL SISTEMAS.");
                }
            }
        }while (opcion !=7);
    }
}


