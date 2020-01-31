package lavadora_uno;

import libreria.LLFunciones;
import java.util.Scanner;

public class Lavadora_Uno {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿La ropa es de blanca o de color?");
        System.out.println("Por favor Presiona 1 - Ropa Blanca // 2 - Ropa de color");
        int TipoDeRopa = entrada.nextInt();
        
        System.out.println("?Cuantos kilos de ropa?");
        int Kilos = entrada.nextInt();
        
        LLFunciones mensajero = new LLFunciones(Kilos, TipoDeRopa);
        mensajero.CicloFinalizado();
    }
}
