package ordenadores;
//import java.util.ArrayList;
import java.util.Arrays;

public class OrdenarPorContagemSimples implements Ordenador{

    @Override
    public int[] ordene(int[] array) {
        int max = Arrays.stream(array).max().orElse(0) + 1;
        boolean[] cont = new boolean[max];
        int[] arrayOrdenado = new int[array.length];
        

        for (int num : array){
            cont[num]= true;
        }

        int index = 0;

        for(int i = 0; i < max; i++){
            if(cont[i]){
                arrayOrdenado[index++] = i;
                // arrayOrdenado[index++] = array[i];
                // cont[array[i]] = false;
            }
        }
         return Arrays.copyOfRange(arrayOrdenado,0, index);
        //return array;
    }
    
}
