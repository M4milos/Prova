import java.util.Scanner;
/*Faça um programa em Java que crie uma matriz de X linhas por X colunas e peça para o
usuário informar os valores dos elementos desta matriz, após isto o programa deve analisar a
matriz e encontrar o maior valor da matriz, menor valor da matriz, soma de todos os valores
da matriz e média. Deve mostrar os valores em formato de matriz, ou seja, respeitando o
número de linhas e colunas. Deve também mostrar uma saída dos valores em linha, um
abaixo do outro, apresentando um gráfico usando o símbolo “#” para representar os valores,
conforme exemplo abaixo.
5: #####
3: ###
...
Não esqueça de montar um código que possa funcionar independente do número de linhas e
colunas e a matriz sempre deve ser quadrada, ou seja, o número de linhas sempre será igual
ao número de colunas. (10,0)
Critérios de Avaliação
Criação da matriz: (1,00)
Leitura e armazenamento dos valores: (2,00)
Maior: (1,00)
Menor: (1,00)
Soma: (1,00)
Média: (1,00)
Gráfico: (3,00)
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int TAMANHO_MATRIZ;
        int maior = 0;
        int menor = 0;
        int soma = 0;
        double media = 0;

        System.out.println("Digite o tamanho do matriz: ");
        TAMANHO_MATRIZ = sc.nextInt();

        int[][] matriz = new int[TAMANHO_MATRIZ][TAMANHO_MATRIZ];

        for (int x = 0; x < TAMANHO_MATRIZ; x++) {
            for (int y = 0; y < TAMANHO_MATRIZ; y++) {
                System.out.print("Matriz[" + (x + 1) + "][" + (y + 1) + "]: ");
                int val =  sc.nextInt();
                if((x == 0 && y == 0) || maior > val) {
                    maior = val;
                }
                if((x == 0 && y == 0) || menor < val) {
                    menor = val;
                }
                soma += val;
                matriz[x][y] = val;
            }
        }
        media = (double)soma / (TAMANHO_MATRIZ * TAMANHO_MATRIZ);

        for (int x = 0; x < TAMANHO_MATRIZ; x++) {
            System.out.print("Matriz[ ");
            for (int y = 0; y < TAMANHO_MATRIZ; y++) {
                System.out.print(" " + matriz[x][y]);
            }
            System.out.print(" ]");
            System.out.print("\n");
        }

        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);
        System.out.println("O valor da soma é: " + soma);
        System.out.println("O valor da média é: " + media);

        for (int x = 0; x < TAMANHO_MATRIZ; x++) {
            for (int y = 0; y < TAMANHO_MATRIZ; y++) {
                int val = matriz[x][y];
                String grafico = "";
                grafico += val + " ";
                for (int i = 0; i < val; i++) {
                    grafico += "#";
                }
                System.out.println(grafico);
            }
        }
    }
}
