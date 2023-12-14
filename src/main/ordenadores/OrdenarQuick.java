package ordenadores;
public class OrdenarQuick implements Ordenador{

    @Override
    public int[] ordene(int[] array) {

        return array;
    }

    public int quickParticio(int[] array, int inicio, int fim){
    int pivo = array[fim];
    int i = (inicio - 1);

    for(int j - inicio; j < fim; j++){
        if(array[j] <= pivo){
            i ++;
            tro_pos(array,i, j);

    }
    }
    tro_pos(array,i + 1,fim);
    return i+ 1;
}
private void troca(int [] array, int i, int j){
    int temp= array[i];
    int [i]= array[j];
    int[j] = temp
}


        // return 0;
    }
    

