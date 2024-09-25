public class Fibonacci {

    public static boolean calculo(int num) {
        if (num == 0 || num == 1) {
            return true;
        }

        int a = 0;
        int b = 1;
        int valor = 0;

        while (valor < num) {
            valor = a + b;
            a = b;
            b = valor;

            if (valor == num) {
                return true;
            }
        }
        return false;

    }

    public void result(boolean result) {
        if (result) {
            System.out.println("O número pertence à sequência");
        }
        else {
            System.out.println("O número não pertence à sequência");
        }
    }
}
