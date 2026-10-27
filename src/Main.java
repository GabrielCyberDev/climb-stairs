public class Main {

    /**
     * Retorna de quantas maneiras distintas é possível subir n degraus,
     * subindo 1 ou 2 degraus por vez.
     */
    public static int subirEscada(int n) {
        // Caso base: para n = 1 há 1 maneira; para n = 2 há 2 maneiras
        if (n <= 2) {
            return n;
        }
        // Passo recursivo: F(n) = F(n-1) + F(n-2)
        return subirEscada(n - 1) + subirEscada(n - 2);
    }

    public static void main(String[] args) {
        // Exemplos do enunciado
        System.out.println("n = 2 -> " + subirEscada(2) + " maneiras (esperado: 2)");
        System.out.println("n = 3 -> " + subirEscada(3) + " maneiras (esperado: 3)");
        System.out.println("n = 4 -> " + subirEscada(4) + " maneiras (esperado: 5)");

        // Outros valores
        System.out.println("n = 1 -> " + subirEscada(1) + " maneira (esperado: 1)");
        System.out.println("n = 5 -> " + subirEscada(5) + " maneiras (esperado: 8)");
        System.out.println("n = 10 -> " + subirEscada(10) + " maneiras (esperado: 89)");
    }
}