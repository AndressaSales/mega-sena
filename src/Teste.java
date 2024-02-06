import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Cadastro cd = new Cadastro();
        Scanner tela = new Scanner(System.in);

        System.out.println("--------------X----------------");
        System.out.println("Bem vindos ao Mega True");
        System.out.println("-------------------------------");
        System.out.printf("%S%n","Area de cadastro");
        System.out.println("-------------------------------");
        System.out.println("Nome: ");
        cd.setNome(tela.nextLine());
        System.out.println("Telefone: ");
        cd.setTelefone(tela.nextLine());

        System.out.println();
        System.out.println("-------------------------------");
        System.out.printf("%S%n", "cadastro finalizado com sucesso");
        System.out.println(cd);
        System.out.println("-------------------------------");
        System.out.println();

        System.out.printf("%S%n", "area da aposta");
        System.out.println("-------------------------------");
        sorteio();
        System.out.println();
        System.out.println("Quer mais números? ");
        String res = tela.nextLine();
        if(res.equalsIgnoreCase("sim")){
            sorteio();
            System.out.println("\nBoa sorte!");
        }else{
            System.out.println("Fim do programa");
            System.exit(0);
        }
        System.out.println();
        System.out.println("--------------X----------------");

    }
    public static void sorteio() {
        int[] valor = new int[6];

        for(int i = 0; i< valor.length; i++){
            valor[i] = (int) (Math.floor(Math.random() * 60 + 1));
            System.out.print(valor[i] + " ");
        }
    }
}
