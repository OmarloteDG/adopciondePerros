import jdk.internal.icu.text.UnicodeSet;

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




        do{
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

            switch (opcion){
                case 1 -> {
                    System.out.println("Nombre:");
                    nombre = teclado.next();
                    System.out.println("Apellido:");
                    apellido = teclado.next();
                    System.out.println("Edad:");
                    edad = teclado.nextInt();
                    System.out.println("Documento:");
                    documento = teclado.next();
                    personas.add( new Persona(nombre,apellido,edad,documento));
                    System.out.println("Persona Registrada Correctamente.");
                }
                case 2 ->{
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

                    perrosDisponibles.add(new Perro(placa,nombre,raza,edad,tamano));
                }


            }
        }




    }
}