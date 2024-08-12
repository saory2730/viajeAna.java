import java.util.Scanner;
/**
 * viajeAna
 */
public class viajeAna {
    public static void main(String[] args) {
        int edad;
        Double valorTiquete= 1000000.0;
        Double valorFinalTiquete= 0.0;
        
        Scanner leer = new Scanner(System.in);
               System.out.println("Ingrese su edad");
               edad=leer.nextInt();
        
            if (edad<2) {
                System.out.println("Prohibido viajar");
               }
              else  if (edad>=2 && edad<5) {
                
                System.out.println("Viaja gratis");
               }
            
               else if (edad>=5 && edad<11) {
                valorFinalTiquete=valorTiquete/2;
                System.out.println(valorFinalTiquete);
               }
              else  if (edad>=11 && edad <15) {
                valorFinalTiquete=(valorTiquete*3)/4;
                System.out.println(valorFinalTiquete);
               }
             else   if (edad>=15) {
                System.out.println(valorTiquete);
               }
               
        }
    
}