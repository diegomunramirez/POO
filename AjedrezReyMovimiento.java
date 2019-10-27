import java.util.Scanner;
import java.io.IOException;
public class AjedrezReyMovimiento {

    public static void main(String[] args) {
    
    cls();   

    String Tablero[][] = new String[9][9]; 
    Scanner Lectura = new Scanner(System.in);
    int posicionx = 8;
    int posiciony = 5;
    int ingresadax = 0;
    int ingresaday = 0;
    int opcion = 2;
    int contador = 0;    

  
    System.out.println("");
    System.out.println("###Bienvenido al Ajedrez###");
    System.out.println("Pieza a mover: Rey (R)");    
    System.out.println("___________________________________");
    
    //Llenar tablero
    
    for (int i = 1; i <= 8;i++){
        for (int j = 1; j<= 8;j++){
         
            Tablero[i][j] = "* ";
        }
    }
    Tablero[posicionx][posiciony] = "R "; //posicion inicial del rey
    
    //imprimir tablero
    System.out.println("1 2 3 4 5 6 7 8 ");
    System.out.println("");
    
     for (int i = 1; i <= 8;i++){
        for (int j = 1; j<= 8;j++){
         
           System.out.print(Tablero[i][j]);
        }
	contador = i;	
        System.out.println(" "+contador);
    }   
    
    
     do{
     System.out.println("");
     System.out.println("¿Que desea hacer?");
     System.out.println("Para realizar un movimiento pulse 1");
     System.out.println("Para salir pulse 0");   
     System.out.println("");
     System.out.println("Ingrese opcion: ");   
     opcion = Lectura.nextInt();   
     
    switch (opcion){
        case 1:
        //Ingresar la posicion a donde desea moverse
     System.out.println("Pieza a mover:Rey");       
     System.out.println("Ingresa la fila a la que deseas mover la pieza");
     ingresadax = Lectura.nextInt();
     System.out.println("Ingresa la columna a la que deseas mover la pieza");
     ingresaday = Lectura.nextInt();
     
     if (ingresadax > 8){
         System.out.println("Este movimiento no esta disponible :( ");
         System.out.println("La pieza se mantiene en su posicion");
     }else if (ingresaday > 8 ){
        System.out.println("Este movimiento no esta disponible :( ");
        System.out.println("La pieza se mantiene en su posicion");
    }
     
     if (Math.abs(posicionx - ingresadax) <= 1 && Math.abs(posiciony-ingresaday) <= 1) {
        Tablero[posicionx][posiciony] = "* "; 
        posicionx = ingresadax;
        posiciony = ingresaday;
        
        Tablero[posicionx][posiciony] = "R ";
        System.out.println("");
        cls();
        System.out.println("");
        System.out.println("¡Movimiento exitoso!");
     } else{
         System.out.println("");
         cls();
         System.out.println("Este movimiento no esta disponible :( ");
         System.out.println("La pieza se mantiene en su posicion");
     }
     

     //cls();
     //imprimir tablero
    System.out.println("");
    System.out.println("1 2 3 4 5 6 7 8 ");
    System.out.println("");
    
     for (int i = 1; i <= 8;i++){
        for (int j = 1; j<= 8;j++){
         
           System.out.print(Tablero[i][j]);
        }
        contador = i;	
        System.out.println(" "+contador);
    } 
        break;
        case 0:
          System.out.println("Gracias por jugar :) ");  
        break;
            
        default: 
            System.out.println("Esta opcion no esta disponible en el menu :( ");
            break;
    }
     }while(opcion!=0);
    
    }

  //Funcion para limpiar pantalla
    public static void cls(){
      try{
           new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
      }catch(Exception E)
      {
          System.out.println(E);
      }
}
    
}
