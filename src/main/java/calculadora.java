/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ceti
 */
public class calculadora { 
    
    
    public static int Suma(int a, int b) {
        return a+b;
    }
    public static int Resta(int a, int b) {
        return a-b;
    }
    
      
        public static int Multiplicacion(int a, int b) {
        return a*b;
    }
        public static int Division(int a, int b) {
        return a/b;
    }
        
        public static int Suma_3_parametros(int a, int b, int c) {
        return a+b+c;
    }
        
        
        
        
        
            public static void main(String args[])
    {

        
        
        System.out.println("Suma de 1 + 1 = "+ Suma(1,1));
        System.out.println("Resta de 2 - 1 = "+ Resta(2,1));
        
        
        System.out.println("Multiplicación de 3 * 3 = "+ Multiplicacion(3,3));
        System.out.println("Division de 5 / 5 = "+ Division(5,5));
        System.out.println("Suma de 1 + 3 = "+ Suma_3_parametros(1,3,5));

   
    }
        
        
    
}
