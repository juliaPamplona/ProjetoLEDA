package entities.algorithms;

public class SelectionSort {

	public void Selection_Sort(double []array) {

        Integer tamanho = array.length;

        for (int i = 0; i < tamanho-1; i++) {
            
            int indexMenorValor = i;

            for (int j = i+1; j < tamanho; j++) {
                
                if(array[j] < array[indexMenorValor]){

                    indexMenorValor = j;

                }

            }

            double auxiliar = array[i];
            array[i] = array[indexMenorValor];
            array[indexMenorValor] = auxiliar;

}
}
	}