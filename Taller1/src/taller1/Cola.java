/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package taller1;

import java.util.Scanner;
/**
 *
 * @author ulacit
 */
public class Cola {

    NodoCola inicio, fin;
    int tama;
    int variable;

    public void limpiarCola() {
        inicio = fin = null;
        tama = 0;
    }

    public boolean ColaVacia() {
        return inicio == null;
    }

    public void insertar(int ele) {
        NodoCola nuevo = new NodoCola(ele);
        if (ColaVacia()) {
            inicio = nuevo;
        } else {
            fin.siguiente = nuevo;
        }
        fin = nuevo;
        tama++;
    }
    
     public int obtenerTamanio() {
            int tamanio = 0;
            NodoCola nodoActual = inicio;
            while (nodoActual != null) {
                tamanio++;
                nodoActual = nodoActual.siguiente;
            }
            return tamanio;
        }
    
    public void MostrarCola(){
        
        while(!ColaVacia()){        
               variable = eliminar(); 
               System.out.println("Mostrar cola: "+ variable);
          }
        
    }
    
  
    public int eliminar(){
        int aux=inicio.dato;
        inicio=inicio.siguiente;
        tama--;
        return aux;
       }
    
     public void proceso2(Cola cola) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("PROCESO 2");
        System.out.println("Ingrese 20 números:");
        for (int i = 1; i <= 20; i++) {
            System.out.print("Número " + i + ": ");
            int numero = scanner.nextInt();
            
            if (numero % 2 == 0) {
                cola.insertar(numero);
            }
        }
        
        int mitad = cola.obtenerTamanio() / 2;
        
        System.out.println("La mitad de los elementos en la cola es:");
        for (int i = 1; i <= mitad; i++) {
            int elemento = cola.eliminar();
            System.out.println(elemento);
        }
        
        scanner.close();
    }


}