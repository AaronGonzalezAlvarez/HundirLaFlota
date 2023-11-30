package aaron.gonzalez.alvarez.HundirLaFlota;

import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
        int size = 10;
        Tablero juego = new Tablero(size);
        
        //PUEDEN COMPARTI *
        
        //correcto
        //juego.colocarBarco(5, 0, 0, "horizontal");
        
        //solapamiento
        //juego.colocarBarco(5, 0, 1, "horizontal");
        
        //salida de tablero
        //juego.colocarBarco(4, 0, 7, "horizontal");
        
        //correcto vertical
        //juego.colocarBarco(4, 5, 5, "vertical");
        
        //solapamiento        
        //juego.colocarBarco(3, 6, 5, "horizontal");
        
        //salida de tablero
        //juego.colocarBarco(5, 9, 8, "vertical");
        
        /*juego.colocarBarco(4, 5, 4, "horizontal");
        juego.colocarBarco(4, 9, 4, "horizontal");
        juego.colocarBarco(2, 1, 4, "horizontal");*/
        
        //vertical
        //juego.colocarBarco(4, 0, 0, "vertical");
        
        //juego.colocarBarco(3, 4, 4, "horizontal");
        
        Random rand = new Random();
        int posicionX = rand.nextInt(10);
        int posicionY = rand.nextInt(10);
        int sizeBarco = rand.nextInt(4) + 2;

        //juego.colocarBarco(5, 1, 1, "horizontal");
        for (int i = 0; i < 1; i++) {
            boolean valor = true;            
            while(valor){
                valor = juego.colocarBarco(sizeBarco, posicionX, posicionY, "horizontal");
                posicionX = rand.nextInt(10);
                posicionY = rand.nextInt(10);
                sizeBarco = rand.nextInt(4) + 2;
            }            
        }
        
        for (int i = 0; i < 1; i++) {
            boolean valor = true;            
            while(valor){
                valor = juego.colocarBarco(sizeBarco, posicionX, posicionY, "vertical");
                posicionX = rand.nextInt(10);
                posicionY = rand.nextInt(10);
                sizeBarco = rand.nextInt(4) + 2;
            }            
        }  
        
        juego.imprimirTablero();
    }
}
