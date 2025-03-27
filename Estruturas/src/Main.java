import java.util.Scanner;

public class Main {

    public static int EscolherTipo() {
        //Escolher o tipo da estrutura
        Scanner scanner = new Scanner(System.in);
        int escolha;
        do {
            System.out.println("Escolha o tipo da sua estrutura:\n1=Integer\n2=String\n3=Float\n0=Sair");
            escolha=scanner.nextInt();
        } while (escolha<0||escolha>3);
        return escolha;

    }
    public static int EscolherMetodoSimples(){
        //Métodos das classes Simples
        Scanner scanner = new Scanner(System.in);
        int escolha;
        do {
            System.out.println("Escolha o método:\n0=Sair\n2=Visualizar estrutura\n3=Adicionar Valor\n4=Excluir Valor"+
                    "\n5=Encontrar Valor(conteudo)\n6=Encontrar Valor (indice)\n7=Modificar Valor por (conteudo)\n8=Modificar Valor por (indice)");
            escolha=scanner.nextInt();
        } while (escolha<0||escolha>8);
        return escolha;
    }

    public static int EscolherMetodoDinamicos(){
        //Métodos das classes dinamicas
        Scanner scanner = new Scanner(System.in);
        int escolha;
        do {
            System.out.println("Escolha o método:\n0=Sair\n2=Visualizar estrutura\n3=Adicionar Valor\n4=Excluir Valor"+
                    "\n5=Encontrar Valor(conteudo)\n6=Encontrar Valor (contagem)\n7=Modificar Valor por (conteudo)\n8=Modificar Valor por (contagem)");
            escolha=scanner.nextInt();
        } while (escolha<0||escolha>8);
        return escolha;
    }

    public static int escolher (){
        //Scanner normal
        int numero;
        Scanner scanner = new Scanner(System.in);
        numero = scanner.nextInt();
        return numero;
    }
    public static void main(String[] args) {
        int escolhaEstrutura, escolhaTipo=9, escolhatipo2, metodos;

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
                        do {
                            escolhatipo2= EscolherTipo();
                            if (escolhatipo2==1){
                                //Int e lista
                                do {
                                    metodos = EscolherMetodoSimples();


                                } while (metodos!=0);

                            }
                            if (escolhatipo2==2) {
                                //String e lista
                            }
                            if (escolhatipo2==3){
                                //Float e lista

                            }

                        } while (escolhatipo2 == 0);
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
                System.out.println("Obrigado por usar");
            }

        } while (escolhaEstrutura != 0 && escolhaTipo != 0);

    }

}

