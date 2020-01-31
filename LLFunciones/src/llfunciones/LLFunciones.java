/*
 * Clase para las funciones lógicas de una lavadora
 */
package llfunciones;

public class LLFunciones {

    private int Kilos = 0, LlenadoCompleto = 0, TipoDeRopa = 0, LavadoCompleto = 0, SecadoCompleto = 0;

    public LLFunciones(int Kilos, int TipoDeRopa) {// Este método es el de las funciones de la lavadora
        this.Kilos = Kilos;
        this.TipoDeRopa = TipoDeRopa;
    }

    private void Llenado() {// Este método sirve para llenar lavadora
        if (Kilos <= 12) {
            LlenadoCompleto = 1;
            System.out.println("LLenando.....");
            System.out.println("Llenado completo.");
        } else {
            System.out.println("La carga de ropa es muy pesada, reduce la carga");
        }
    }

    private void Lavado() {// Este método sirve para lavar 
        Llenado();
        if (LlenadoCompleto == 1) {
            if (TipoDeRopa == 1) {
                System.out.println("Ropa Blanca / Lavado suave");
                System.out.println("Lavando....");
                LavadoCompleto = 1;
            } else if (TipoDeRopa == 2) {
                System.out.println("Ropa de color / Lavado intenso");
                System.out.println("Lavando....");
                LavadoCompleto = 1;
            } else {
                System.out.println("El tipo de ropa no está disponible.");
                System.out.println("Se lavará como ropa de color / Lavado intenso");
                LavadoCompleto = 1;
            }
        }
    }

    private void Secado() {// Este método sirve para el secado de la lavadora
        Lavado();
        if (LavadoCompleto == 1) {
            System.out.println("Secando....");
            SecadoCompleto = 1;
        }
    }

    public void CicloFinalizado() {// método solicitado por Samsung
        Secado();
        if (SecadoCompleto == 1) {
            System.out.println("Tu ropa está lista.");
        }
    }
}
