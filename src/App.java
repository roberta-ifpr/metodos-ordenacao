import java.util.Arrays;
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
        // TODO: implementar Selection Sort
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
    // Habner, Gustavo Miguel, Samuel Asafe
    // =========================================================
    public static void combSort(int[] vetor) {
        double gap = vetor.length;

        for (int i = 0; i < vetor.length; i++) {
            gap = gap / 1.3;

            for (int j = 0; j < vetor.length; j++) {

                if (j <= ((vetor.length - gap) - 1)) {

                    if (vetor[j] > vetor[(int) gap + j]) {
                        int a = vetor[j];
                        vetor[j] = vetor[(int) gap + j];
                        vetor[(int) gap + j] = a;
                    }
                }
            }

        }
    }

    // =========================================================
    // SHELL SORT
    // Aniela
    // =========================================================
    public static void shellSort(int[] vetor) {
        int gap;
        for(gap = vetor.length/2; gap > 0; gap = gap / 2) {
            for(int j = gap; j<vetor.length; j++) {
                for(int k = j-gap; k>=0; k -= gap) {
                    if(vetor[k+gap] >= vetor[k]){
                        break;
                    }
                    else {
                        int temp;
                        temp = vetor[k+gap];
                        vetor[k+gap] = vetor[k];
                        vetor[k] = temp;
                    }
                }
            }
        }
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
        int[] balde1 = new int[vetor.length]; 
        int[] balde2 = new int[vetor.length]; 
        int[] balde3 = new int[vetor.length];   // 
//comment
        int c1 = 0, c2 = 0, c3 = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] >= 1 && vetor[i] <= 5) {
                c1 = inserirOrdenado(balde1, c1, vetor[i]);
            } else if (vetor[i] <= 10) {
                c2 = inserirOrdenado(balde2, c2, vetor[i]);
            } else {
                c3 = inserirOrdenado(balde3, c3, vetor[i]);
            }
        }
    
        int k = 0;
        for (int i = 0; i < c1; i++) vetor[k++] = balde1[i];
        for (int i = 0; i < c2; i++) vetor[k++] = balde2[i];
        for (int i = 0; i < c3; i++) vetor[k++] = balde3[i];
    }

    private static int inserirOrdenado(int[] balde, int tamanho, int valor) {
        int i = tamanho - 1;
        while (i >= 0 && balde[i] > valor) {
            balde[i + 1] = balde[i];
            i--;
        }
        balde[i + 1] = valor;
        return tamanho + 1;
    }
    
    // =========================================================
    // COUNTING SORT
    // Bruno, Luciano
    // =========================================================
    public static void countingSort(int[] vetor) {

        int maior = Integer.MIN_VALUE;

        for (int i = 0; i < vetor.length; i++) {
            
            if (vetor[i] > maior) {

                maior = vetor[i];
                
            }

        }

        int[] temp = new int[maior+1];

        for (int i = 0; i < vetor.length; i++) {
 
            temp[vetor[i]]++;

        }

        int indiceSaida = 0;

        for (int i = 0; i < temp.length; i++) {

            if (temp[i] >= 1) {
                
                for (int j = 0; j < temp[i]; j++) {

                    vetor[indiceSaida] = i;

                    indiceSaida++;

                }

            }

        }

    }
}

