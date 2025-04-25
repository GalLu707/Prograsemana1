/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LaboratorioSem1;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class Almendarez_Galatea_PlanilladeEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //se le indica al usuario que debe de hacer 
        System.out.println("Ingrese su nombre completo:");
        Scanner NombreU = new Scanner(System.in);
        NombreU.useDelimiter("\n");
        
        String NombreCompleto = NombreU.next();
        System.out.println("Ingrese la cantidad de horas mensuales que hizo");
        Scanner HorasT = new Scanner(System.in);
        int HorasMensuales = HorasT.nextInt(); 
        System.out.println("ingrese su tarifa por hora:");
        Scanner tarifa = new Scanner(System.in);
        Double TarifaPorHora = tarifa.nextDouble(); 
        Double SalarioSemanal = (HorasMensuales*TarifaPorHora)/4 ; 
        
        System.out.println("----Boleta de empleado---");
        System.out.println("Nombre del empleado:"+ NombreCompleto + "\nHoras trabajadas al mes:"+ HorasMensuales+ "\nTarifa por hora:"+ TarifaPorHora+"lps."+ "\nSu salario semanal es:" + SalarioSemanal);
        
      
        
    }
    
}
