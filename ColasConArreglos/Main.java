package ColasConArreglos;
import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        
        Scanner leer = new Scanner(System.in);
        boolean continuar = true;
        int opcion;        
        String pal;
        Cola yo = new Cola();
        
        while(continuar){
            System.out.println("");
            System.out.println("*********************************************");
            System.out.println("********************Menú*********************");
            System.out.println("****1.- Insertar                         ****");
            System.out.println("****2.- Eliminar                         ****");
            System.out.println("****3.- Mostrar                          ****");            
            System.out.println("****4.- Salir                            ****");
            System.out.println("*********************************************");
            System.out.println("*********************************************");            
            opcion = leer.nextInt();
            
            switch(opcion){
                case 1 -> {                    
                    System.out.println("Palabra a insertar");
                    pal = leer.next();
                    yo.Insertar(pal);
                }      
                case 2 ->{                    
                    if (!yo.ColaV()) {
                    System.out.println(" Se borró " + yo.Eliminar());                
                    }
                    else {
                        System.out.println("Está vacia");                
                    }
                }
                case 3 -> {                    
                    yo.Mostrar();
                }
                case 4 -> continuar = false;
                default -> System.out.println("Opción incorrecta.....Vuelve a intentarlo");                                                  
            }
        }
    }
}
