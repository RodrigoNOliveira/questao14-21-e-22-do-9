import java.util.Scanner;

class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int nmr, qtd;
        int maior = 0;

        int rep = 0;
        System.out.print("Digite a quantidade de número que deseja inserir: ");
        qtd = scanner.nextInt();

        System.out.println("Digite números: ");

        while (qtd > 0) {
            nmr = scanner.nextInt();

            if (nmr > maior) {
                maior = nmr;
                rep =1;
                
        }
            else if (maior == nmr){
                rep= rep+1;
            }

            qtd--;

        }

        System.out.println("O maior número digitado é:" + maior);
        System.out.println("A quantidade de vezes que o maior número foi digitado foi de: " + rep);
    }
}