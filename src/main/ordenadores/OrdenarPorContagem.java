package ordenadores;

public class OrdenarPorContagem implements Ordenador {

    @Override
    public int[] ordene(int[] array) {
        int[] arraayOrdenado = new int[array.length];
        int[] arrayCont = new int[maiorValor(array) + 1];
        // return array;
        for (int i = 0; i < array.length; i++) {
            arrayCont[array[i]] += 1;
        }
        for (int i = 1; i < arrayCont.length; i++) {
            arrayCont[i] += arrayCont[i - 1];
        }
        for (int i = array.length - 1; i >= 0; i--) {
            arrayCont[array[i]] -= 1;
            arraayOrdenado[arrayCont[array[i]]] = array[i];

        }
        return arraayOrdenado;

    }

    public int maiorValor(int[] array) {
        int maior = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maior) {
                maior = array[i];
            }
        }
        return maior;
    }
}
