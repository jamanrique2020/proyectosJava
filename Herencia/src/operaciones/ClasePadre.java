package operaciones;

import java.util.Scanner;

public class ClasePadre {

    protected int valor1, valor2, Resultado;
    Scanner entrada = new Scanner(System.in);

    // este método pide los valores al usuario
    public void PedirDatos() {
        System.out.print("Dame el primer valor: ");
        valor1 = entrada.nextInt();
        System.out.print("Dame el segundo valor: ");
        valor2 = entrada.nextInt();
    }

    // ESte método muestra el resultado
    public void MostrarResultado() {
        System.out.println(Resultado);
    }
}