/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller1;

import java.util.Scanner;
/**
 *
 * @author asanc
 */
public class Taller1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scanner = new Scanner(System.in);
    
        Pila pila = new Pila(10);
        Cola cola = new Cola();
        
        int opcion;
        do {
            System.out.println("MENU");
            System.out.println("1. Inicializar Cola");
            System.out.println("2 Inicializar Pila");
            System.out.println("3. Cola Vacía");
            System.out.println("4 Pila Vacía");
            System.out.println("5 Pila Llena");
            System.out.println("6 Insertar Cola");
            System.out.println("7 Push");
            System.out.println("8 Eliminar Cola");
            System.out.println("9 Pop");
            System.out.println("10 Mostrar Cola");
            System.out.println("11 Mostrar Pila");
            System.out.println("12 Inicio de Cola");
            System.out.println("13 Proceso 1");
            System.out.println("14 Proceso 2");
            System.out.println("15 Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                
                case 1:
                    cola = new Cola();
                    System.out.println("Cola inicializada.");
                    break;
                case 2:
                    pila = new Pila(10);
                    System.out.println("Pila inicializada.");
                    break;
                case 3:
                    if (cola.ColaVacia()) {
                        System.out.println("La cola está vacía.");
                    } else {
                        System.out.println("La cola no está vacía.");
                    }
                    break;
                case 4:
                    if (pila.pilaVacia()) {
                        System.out.println("La pila está vacía.");
                    } else {
                        System.out.println("La pila no está vacía.");
                    }
                    break;
                case 5:
                    if (pila.pilaLlena(10)) {
                        System.out.println("La pila está llena.");
                    } else {
                        System.out.println("La pila no está llena.");
                    }
                    break;
                case 6:
                    System.out.print("Ingrese un número para insertar en la cola: ");
                    int elementoCola = scanner.nextInt();
                    cola.insertar(elementoCola);
                    break;
                case 7:
                    System.out.print("Ingrese un número para insertar en la pila: ");
                    int elementoPila = scanner.nextInt();
                    pila.push(elementoPila);
                    break;
                case 8:
                    int elementoEliminadoCola = cola.eliminar();
                    if (elementoEliminadoCola != -1) {
                        System.out.println("Se eliminó el elemento " + elementoEliminadoCola + " de la cola.");
                    }
                    break;
                case 9:
                    int elementoEliminadoPila = pila.pop();
                    if (elementoEliminadoPila != -1) {
                        System.out.println("Se eliminó el elemento " + elementoEliminadoPila + " de la pila.");
                    }
                    break;
                case 10:
                    cola.MostrarCola();
                    break;
                case 11:
                    pila.MostrarPila();
                    break;
                case 12:
                    if (cola.ColaVacia()) {
                        System.out.println("La cola está vacía.");
                    } else {
                        System.out.println("El inicio de la cola es: " + cola.inicio.dato);
                    }
                    break;
                case 13:
                    pila.proceso1(pila, cola);
                    break;
                case 14:
                    cola.proceso2(cola);
                    break;
                case 15:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }
            
            System.out.println();
        } while (opcion != 15);
        
        scanner.close();
    }
    
}
