import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value01,value02;
        char calcularNovamente = 'S';
        String tipoOperacao;

        while (calcularNovamente == 'S'){
            System.out.println("Digite o primeiro valor: ");
            value01 = input.nextInt();

            System.out.println("Informe o tipo de operação que deseja realizar: ");
            input.nextLine();
            tipoOperacao = input.nextLine();

            System.out.println("Digite o segundo valor: ");
            value02 = input.nextInt();

            // classe que imprime o resultado da operação
            imprimeResultado(value01, value02, tipoOperacao);

            // pergunta se vai continuar a execução do programa
            System.out.println("Deseja continuar calculando? ");
            calcularNovamente = input.next().charAt(0);

            if (calcularNovamente == 'S'){
                calcularNovamente = 'S';
            }else {
                calcularNovamente = 'N';
            }
        }

        System.out.println();
        System.out.println("FIM DO PROGRAMA!");

    }

    public static void imprimeResultado(int value01, int value02, String tipoOperacao){
        int resultado;
        switch (tipoOperacao) {
            case "+" -> {
                resultado = value01 + value02;
                System.out.println("################################");
                System.out.println("################################");
                System.out.println("O resultado de " + value01 + " + " + value02 + " é " + resultado);
                System.out.println("################################");
                System.out.println("################################\n");
            }
            case "-" -> {
                resultado = value01 - value02;
                System.out.println("################################");
                System.out.println("################################");
                System.out.println("O resultado de " + value01 + " - " + value02 + " é " + resultado);
                System.out.println("################################");
                System.out.println("################################\n");
            }
            case "*" -> {
                resultado = value01 * value02;
                System.out.println("################################");
                System.out.println("################################");
                System.out.println("O resultado de " + value01 + " * " + value02 + " é " + resultado);
                System.out.println("################################");
                System.out.println("################################\n");
            }
            case "/" -> {
                resultado = value01 / value02;
                System.out.println("################################");
                System.out.println("################################");
                System.out.println("O resultado de " + value01 + " / " + value02 + " é " + resultado);
                System.out.println("################################");
                System.out.println("################################\n");
            }
            default ->  System.out.println("Operação invalida!!");
        }
    }

    /*
    * Com esse mini projeto pude aprender melhro como funciona o nextLine(); após o uso de
    * um nextInt();*/
}