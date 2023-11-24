import java.util.Scanner;
/**
 *
 * @author andreajs
 */
public class Circunferencia {
    public static void main(String[] args) {
        //Entrada
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la coordenada x1:");
        double x1= entrada.nextDouble();    
        System.out.println("Ingrese la coordenada y1:");
        double y1= entrada.nextDouble();
        System.out.println("Ingrese el radio r de la circunferencia: ");
        double r = entrada.nextDouble();
        System.out.println("Ingrese la coordenada x2 del punto T ");
        double x2= entrada.nextDouble();
        System.out.println("Ingrese la coordenada y2 del punto T");
        double y2= entrada.nextDouble();
        
        //proceso
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        
        if (distancia <= r){
            System.out.println("El punto T está dentro del área de la circunferencia.");
           
        } else {
            System.out.println("El punto T está fuera del área de la circunferencia.");
            
    }
    
}
}