/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1;

import java.util.Scanner;
/**
 *
 * @author ulacit
 */
public class Pila {
int vectorPila[];
int vectorPila2[];

int cima;
int variable;

        public Pila(int tamano){
            vectorPila = new int[tamano];
            cima = 0 ;
        }
        
        
        
        public void push(int dato){
            
                vectorPila[cima] = dato;
                cima++;
           }
        
        public int pop(){
            
                int eliminar = 0;
                if (cima == 0){
                System.out.println("pila vacia");
                }else{
                eliminar = vectorPila[cima-1];
                cima--;
                }
                return eliminar;
        }
        
        public int tamano(){
            return vectorPila.length;
        }
        
        public boolean pilaVacia(){
            if (cima == 0){
            return true;
            }else
            {
            return false;
            }
        }
        
        public boolean pilaLlena(int tamano){
            if (cima == tamano ){
            return true;
            }else
            {
            return false;
            }
        }
        
        public void MostrarPila(){
         while(true){
            if (pilaVacia() != true){
                variable = pop();
                
               System.out.println("Pila: "+ variable);
         
                }
       
       }
           
        }
        
         public void MostrarPilaFondo(){
             
              System.out.println(pop());
             while(pilaVacia() == false){
            
                variable = pop();
       
       }
         }
         
          public void Transferir(Pila p){
             Pila pila = new Pila(10);
             Cola c = new Cola();
 
              while(pilaVacia() == false){
                  int variable = pop();
            
                     if (variable % 2 == 0) {
                     c.insertar(variable);
                     }
  
                }  
            
              
              c.MostrarCola();
                   
        }
          
        public void proceso1(Pila pila, Cola cola) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("PROCESO 1");
        System.out.println("Ingrese 10 números:");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + ": ");
            int numero = scanner.nextInt();
            int resultado = numero * 100;
            
            if (resultado > 100000) {
                pila.push(resultado);
            } else {
                cola.insertar(resultado);
            }
        }
        
        System.out.println("Valores ingresados a la pila:");
        pila.MostrarPila();
        
        System.out.println("Valores ingresados a la cola:");
        cola.MostrarCola();
        
        scanner.close();
    }
        
        
          
          
}