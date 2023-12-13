package main;

public class Main {

    public static int torreDeHanoi(int numDiscos) {
        return moverDiscos(numDiscos, 'A', 'C', 'B');
    }

    private static int moverDiscos(int n, char origem, char destino, char auxiliar) {
        int movimentos = 0;
        if (n > 0) {
            movimentos += moverDiscos(n - 1, origem, auxiliar, destino);
            movimentos += moverDisco(origem, destino, n);
            movimentos += moverDiscos(n - 1, auxiliar, destino, origem);
        }
        return movimentos;
    }

    private static int moverDisco(char origem, char destino, int disco) {
        System.out.println("Mover disco " + disco + " de " + origem + " para " + destino);
        return 1;
    }
}