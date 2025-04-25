/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LaboratorioSem1;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class Almendarez_Galatea_formulas {
    public static void main(String[]args){
        
        System.out.println("ejercicio 1" + "\n ingrese el numerador 1:");
        Scanner nume = new Scanner(System.in);
        double numerador1 = nume.nextDouble(); 
         System.out.println("ingrese el denominador 1:");
        Scanner deno1 = new Scanner(System.in);
        double denominador1 = deno1.nextDouble(); 
        
        System.out.println("ingrese el numerador 2:");
        Scanner nume2 = new Scanner(System.in);
        double numerador2 = nume2.nextDouble(); 
         System.out.println("ingrese el denominador 2:");
        Scanner deno2 = new Scanner(System.in);
        double denominador2 =deno2.nextDouble(); 
        
        double resultado = ((numerador1/denominador1) + (numerador2/denominador2));
        
        System.out.println("su resultado es:" + resultado);
                
        //ejercicio 2  primera parte
        System.out.println("ejercicio 2" + "\n ingrese el numerador 1 ");
        Scanner numeejer2 = new Scanner(System.in);
        double numeradorparte1 = numeejer2.nextDouble(); 
        
        System.out.println("ingrese el denominador 1:");
        Scanner denounooriginalpro = new Scanner(System.in);
        double denominador1ultrapromax = denounooriginalpro.nextDouble(); 
        
        System.out.println("ingrese el denominador 2:");
        Scanner denodosoriginalpro = new Scanner(System.in);
        double denominador2ultrapromax = denodosoriginalpro.nextDouble();
        
        //ejercicio 2 segunda ultra mega parte
         System.out.println("ingrese el denominador 1:");
        Scanner deno1 = new Scanner(System.in);
        double denominador1 = deno1.nextDouble(); 
        //ejer c
        System.out.println("ingrese el numerador 1:");
        Scanner ejercdeno = new Scanner(System.in);
        double ejer3deno = ejercdeno.nextDouble(); 
         System.out.println("ingrese el denominador 1:");
        Scanner denoc3= new Scanner(System.in);
        double denominadorc1 =denoc3.nextDouble(); 
        //Suma
        Scanner numc1= new Scanner(System.in);
        double numepic =numc1.nextDouble(); 
        double respuestac= (ejer3deno/denominadorc1)+ numepic;
        System.out.println("su respuesta es" respuestac);
        
        
    }
}
