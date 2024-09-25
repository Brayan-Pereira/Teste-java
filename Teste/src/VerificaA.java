public class VerificaA {

    public static void verificarLetraA(String texto) {
        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (c == 'a' || c == 'A') {
                contador++;
            }
        }

        if (contador > 0) {
            System.out.println("A letra 'a' ou 'A' aparece " + contador + " vez(es) na string.");
        } else {
            System.out.println("A letra 'a' ou 'A' não aparece na string.");
        }
    }

}