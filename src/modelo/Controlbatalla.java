
package modelo;

import java.util.Random;
import vista.Game;


public class Controlbatalla {
    
    int oceano[][] = new int[10][10];
   
    boolean ver=false;
    int con=0;
   
    public int[][] getOceano() {
        return oceano;
    }
    public boolean verificar(int fi, int col){
        ver=false;
       Game o = new Game();
        if (oceano[fi][col]==1) {
            System.out.println("\nmuere");
             ver=true;
             con++;
             if (con==9) {
                 System.out.println("Winer");
            }
             oceano[fi][col]=0;
        }else {
             System.out.println("\nvive");
        }
        return ver;
       
    }
   
    
    public void limpiar(){
        for (int fila = 0; fila < 10; fila++) {
            for (int columna = 0; columna < 10; columna++) {
                    oceano[fila][columna]=0;
            }
        }
    }
    public void imprimir(){
        System.out.println("\n\tOCEANO M");
        for (int fila = 0; fila < 10; fila++) {
            System.out.println("");
            for (int columna = 0; columna < 10; columna++) {
                System.out.print("\t"+oceano[fila][columna]);
            }
        }
    }
    
public void asignarsubmarinos(){
        Random aleatorio=new Random();
        
        for (int fila = 0; fila < 10; fila++) {
        oceano[fila][aleatorio.nextInt(9)]=1;
    }
}


}