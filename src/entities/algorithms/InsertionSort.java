package entities.algorithms;

public class InsertionSort {
	public void Insertion_Sort(double[] array) {

        Integer tamanho = array.length;

        for (int i = 1; i < tamanho; i++) {

            double numeroAtual = array[i];
            int indexAnterior = i-1;

            while ((indexAnterior >= 0) && (array[indexAnterior] > numeroAtual)) {
                
                array[indexAnterior+1] = array[indexAnterior];
                indexAnterior -= 1;

            }
            array[indexAnterior+1] = numeroAtual;
        }
    }
}
