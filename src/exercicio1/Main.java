package exercicio1;

public class Main {
    public static void main(String[] args) {
        int[] vetorBubble = {5, 22, 1, 106, 32, 25, 6};
        int[] vetorSelection = {51, 212, 10, 6, 16, 1025, 1};
        int[] vetorInsertion = {151, 2, 120, 64, 16, 102,};
        Ordenacao.imprimirVetor(vetorBubble);
        Ordenacao.bubbleSort(vetorBubble);
        Ordenacao.imprimirVetor(vetorBubble);

        Ordenacao.imprimirVetor(vetorSelection);
        Ordenacao.selectionSort(vetorSelection);
        Ordenacao.imprimirVetor(vetorSelection);

        Ordenacao.imprimirVetor(vetorInsertion);
        Ordenacao.insertionSort(vetorInsertion);
        Ordenacao.imprimirVetor(vetorInsertion);


    }
}
