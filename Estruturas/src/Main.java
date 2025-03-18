import java.util.Scanner;

public class Main {

    public static int escolher (){
        int numero;
        Scanner scanner = new Scanner(System.in);
        numero = scanner.nextInt();
        return numero;
    }
    public static void main(String[] args) {
        int escolhaEstrutura, escolhaTipo=9;


        Scanner scanner= new Scanner(System.in);
        do {

            do {
                System.out.println("Escolha qual estrutura você gostaria de usar");
                System.out.println("1_Lista");
                System.out.println("2_Fila");
                System.out.println("3_Pilha");
                System.out.println("0_Sair");

                escolhaEstrutura = escolher();
            } while (escolhaEstrutura <0 || escolhaEstrutura >3);
            if (escolhaEstrutura != 0) {
                do {
                    System.out.println("Escolha se é simples ou dinamica");
                    System.out.println("1_Simples");
                    System.out.println("2_Dinamica");
                    System.out.println("0_Sair");
                    escolhaTipo = escolher();
                } while (escolhaTipo < 0 || escolhaTipo > 2);

            }

            if (escolhaTipo==1){
                switch (escolhaEstrutura){
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;

                }

            } else if (escolhaTipo==2) {
                switch (escolhaEstrutura){
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                }

            } else {
                System.out.println("Obrigado por uar");
            }

        } while (escolhaEstrutura != 0 && escolhaTipo != 0);

    }

}

