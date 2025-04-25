package LaboratorioSem1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
import java.util.Scanner; 
public class Almendarez_Galatea_Cuotas {
    public static void main(String[]args){
        System.out.println("ingrese el monto total de la cuota");
        Scanner Monto = new Scanner(System.in);
        
        int Montocliente = Monto.nextInt();
        System.out.println("ingrese la cantidad de meses que tiene de limite para pagar el monto:");
        
        Scanner tiempo = new Scanner(System.in);
        int limiteTiempo = tiempo.nextInt();
        
        System.out.println("Ingrese el interes que se le atribuye");
        Scanner Interes= new Scanner(System.in);
        double interespuesto= Interes.nextInt();
        double interess= interespuesto/100;
        
        System.out.println("Ingrese la comision por cuota");
        Scanner cuota= new Scanner(System.in);
        double comision= cuota.nextInt();
        
        System.out.println("Ingrese el seguro que tiene");
        Scanner seguropro= new Scanner(System.in);
        double segurofinal= cuota.nextInt();
        
        double interestotal= Montocliente*interess/limiteTiempo;
        System.out.println("su interes mensual es:" + interestotal);
        
        double cuotabasemensual = (Montocliente + interestotal)/limiteTiempo;
        System.out.println("su interes mensual es:" + cuotabasemensual);
        
        
        double cuotamensual = (Montocliente + comision + segurofinal)/limiteTiempo;
        System.out.println("su cuota mensual es:" + cuotamensual);
        
         double totalpagar = cuotamensual*limiteTiempo ;
        System.out.println("su total final es:" + totalpagar);
            
        
    }
}
