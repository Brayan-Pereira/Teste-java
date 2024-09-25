public class ResultadoSoma {

    int soma = 0;
    int k = 1;
    int indice = 12;

    public void resultadoSoma(){
        while (k < 12) {
            
            k++;
            soma += k;
            System.out.println("K: " + k);
            System.out.println("Soma: " + soma);
        }
        System.out.println("----------------------------");
        System.out.println("Resultado final da soma: " + soma);
    }
}
