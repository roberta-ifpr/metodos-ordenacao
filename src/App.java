import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            exibirMenu();
            opcao = lerInteiro(scanner, "Escolha uma opção: ");

            switch (opcao) {
                case 1 -> executarOrdenacao(scanner, "Quick Sort");
                case 2 -> executarOrdenacao(scanner, "Tim Sort");
                case 3 -> executarOrdenacao(scanner, "Selection Sort");
                case 4 -> executarOrdenacao(scanner, "Merge Sort");
                case 5 -> executarOrdenacao(scanner, "Comb Sort");
                case 6 -> executarOrdenacao(scanner, "Shell Sort");
                case 7 -> executarOrdenacao(scanner, "Radix Sort");
                case 8 -> executarOrdenacao(scanner, "Heap Sort");
                case 9 -> executarOrdenacao(scanner, "Bucket Sort");
                case 10 -> executarOrdenacao(scanner, "Counting Sort");
                case 0 -> System.out.println("Encerrando o programa...");
                default -> System.out.println("Opção inválida!");
            }

            System.out.println();

        } while (opcao != 0);

        scanner.close();
    }

    public static void exibirMenu() {

        System.out.println("==========================================");
        System.out.println("        MENU DE MÉTODOS DE ORDENAÇÃO      ");
        System.out.println("==========================================");
        System.out.println("1  - Quick Sort");
        System.out.println("2  - Tim Sort");
        System.out.println("3  - Selection Sort");
        System.out.println("4  - Merge Sort");
        System.out.println("5  - Comb Sort");
        System.out.println("6  - Shell Sort");
        System.out.println("7  - Radix Sort");
        System.out.println("8  - Heap Sort");
        System.out.println("9  - Bucket Sort");
        System.out.println("10 - Counting Sort");
        System.out.println("0  - Sair");
        System.out.println("==========================================");

    }

    public static void executarOrdenacao(Scanner scanner, String metodo) {

        int tamanho = lerInteiro(scanner, "Informe o tamanho do vetor: ");

        if (tamanho <= 0) {
            System.out.println("Tamanho inválido.");
            return;
        }

        int[] vetor = new int[tamanho];

        System.out.println("Digite os elementos do vetor:");

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = lerInteiro(scanner, "Elemento [" + i + "]: ");
        }

        int[] vetorOrdenado = Arrays.copyOf(vetor, vetor.length);

        System.out.println("\nVetor original: " + Arrays.toString(vetor));

        switch (metodo) {

            case "Quick Sort" -> quickSort(vetorOrdenado, 0, vetorOrdenado.length - 1);
            case "Tim Sort" -> timSort(vetorOrdenado);
            case "Selection Sort" -> selectionSort(vetorOrdenado);
            case "Merge Sort" -> mergeSort(vetorOrdenado, 0, vetorOrdenado.length - 1);
            case "Comb Sort" -> combSort(vetorOrdenado);
            case "Shell Sort" -> shellSort(vetorOrdenado);
            case "Radix Sort" -> radixSort(vetorOrdenado);
            case "Heap Sort" -> heapSort(vetorOrdenado);
            case "Bucket Sort" -> bucketSort(vetorOrdenado);
            case "Counting Sort" -> countingSort(vetorOrdenado);

            default -> {
                System.out.println("Método não encontrado.");
                return;
            }
        }

        System.out.println("Método escolhido: " + metodo);
        System.out.println("Vetor ordenado: " + Arrays.toString(vetorOrdenado));

    }

    public static int lerInteiro(Scanner scanner, String mensagem) {

        while (true) {

            System.out.print(mensagem);

            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Entrada inválida! Digite um número inteiro.");
                scanner.next();
            }
        }
    }

    // =========================================================
    // QUICK SORT
    // João Pedro, Felipe e Luiz
    // =========================================================
    public static void quickSort(int[] vetor, int inicio, int fim) {
        // TODO: implementar Quick Sort
    }

    // =========================================================
    // TIM SORT
    // José Miguel, Caio, Lucas, Higor
    // =========================================================
    public static void timSort(int[] vetor) {
        // TODO: implementar Tim Sort
    }

    // =========================================================
    // SELECTION SORT
    // Natalia, Isabele Louise, Amanda, Lovemika
    // =========================================================
    public static void selectionSort(int[] vetor) {
        //preencher automático
        preencherVetor(vetor);

        for(int i = 0; i < vetor.length; i++) {

            System.out.print(vetor[i] + " ");
            
        }

        System.out.println();

        //preencher manualmente
        /*for(int i = 0; i < vetor.length; i++) {

            vetor[i] = lerNumeroInt();
        }*/

        selectionSortDois(vetor);
	}

    public static void preencherVetor(int[]vetor) {

        Random random = new Random();

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100) + 1;
        }
    }

    public static void selectionSortDois(int[] vetor) {

        for (int i = 0; i < vetor.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < vetor.length; j++) {
                if(vetor[j] < vetor[min]) {
                    min = j;
                }
            }

            if(min != i) {
                int temp = vetor[i];
                vetor[i] = vetor[min];
                vetor[min] = temp;
            }
        }

        //imprimir vetor

        System.out.println();

        for(int i = 0; i < vetor.length; i++) {

            System.out.print(vetor[i] + " ");
            
        }

        System.out.println();
    }

    public static void lerVetor() {
		int n = lerInteiro(null, "Digite o tamanho do vetor: ");
		
		int[] vetor = new int[n];

		for(int i = 0; i < vetor.length; i++) {

            vetor[i] = lerInteiro(null, "Digite o valor do vetor:");
        }
	}

    // =========================================================
    // MERGE SORT
    // Gustavo, Angelo, Leticia, Murilo, Isabele
    // =========================================================
    public static void mergeSort(int[] vetor, int inicio, int fim) {
        // TODO: implementar Merge Sort
    }

    // =========================================================
    // COMB SORT
    // Habner, Gustavo Miguel, Samuel Asafi
    // =========================================================
    public static void combSort(int[] vetor) {
        // TODO: implementar Comb Sort
    }

    // =========================================================
    // SHELL SORT
    // Aniela
    // =========================================================
    public static void shellSort(int[] vetor) {
        // TODO: implementar Shell Sort
    }

    // =========================================================
    // RADIX SORT
    // Enzo, João Peres, Jonas, Leandro
    // =========================================================
    public static void radixSort(int[] vetor) {
        // TODO: implementar Radix Sort
    }

    // =========================================================
    // HEAP SORT
    // Lara, Marcelo, Samuel Almeida
    // =========================================================
    public static void heapSort(int[] vetor) {
        // TODO: implementar Heap Sort
    }

    // =========================================================
    // BUCKET SORT
    // Davi Casagrande, Davi Lopes, Gabriel Silva, Daniel
    // =========================================================
    public static void bucketSort(int[] vetor) {
        // TODO: implementar Bucket Sort
    }

    // =========================================================
    // COUNTING SORT
    // Bruno, Luciano
    // =========================================================
    public static void countingSort(int[] vetor) {
        // TODO: implementar Counting Sort
    }
}

