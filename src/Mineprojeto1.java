import java.util.Scanner;
public class Mineprojeto1 {
    public static void main(String[] args) {
        //Criar Variavel do tipo Scanner
        Scanner input = new Scanner(System.in);

        //Texto do capítulo 1
        String TextoCap1 = "Você se encontra perdido em uma colina próxima a um deserto perto do mar. Há uma entrada de caverna à sua frente.";
        String EscolhaCap1 = "Escolha 1: Entrar na caverna. Escolha 2: Descer a colina e ir embora.";

        //Texto do capítulo 2
        String TextoCap2 = "Ao entar na caverna você enconta um homen  que lhe diz o seguinte: ao entar na caverna não há mais espacatoria para você, não lute você apenas irá perder.";
        String EscolhaCap2 = "Ecolha número 1: Lutar com o homem misterioso. Escolha número 2: Tentar uma outra saída para fugir. Escolha número 3: Se render ao homem.";

        //Texto dos 3 finais principais
        String Final1 = "Ao lutar com o homem você o derrota, conseguindo assim reabrir a passagem da caverna e fugir.";
        String Final2 = "Você corre pela escuridão da caverna mal iluminada, aos tropeços encontra uma fonte de luz, que se revela ser uma passagem que leva ao mar, assim conseguindo fugir.";
        String Final3 = "Você se rende ao homem misterioso, ficando sob seu comando, sendo obrigado e servilo e trazer mais pessoas para a caverna.";

        //Escolha feita entre dois caimnhos para ir para o capitulo 2
        System.out.println(TextoCap1);
        System.out.println(EscolhaCap1);
        System.out.println("Digite o número da ecolha que deseja fazer.");
        int RespostaCap1 = input.nextInt();
        
        //Seguindo caminho para o capítulo 2
        if (RespostaCap1 == 1) {
            //Esolha feita entre as 3 opões dadas
            System.out.println(TextoCap2);
            System.out.println(EscolhaCap2);
            System.out.println("Digite o número da ecolha que deseja fazer.");
            int RespostaCap2 = input.nextInt();
            //Seguindo caminho 1 para o capítulo 3
            if (RespostaCap2 == 1) {
                System.out.println(Final1);
                System.out.println("Fim da aventura!");
            }
            //Seguindo caminho 2 para o capítulo 3
            else if (RespostaCap2 == 2) {
                System.out.println(Final2);
                System.out.println("Fim da aventura!");
            }
            //Seguindo caminho 3 para o capítulo 3
            else if (RespostaCap2 == 3) {
                System.out.println(Final3);
                System.out.println("Fim da aventura!");
            }
            else {
                System.out.println("Ouve um erro de digitação na resposta.");
            }
        }
        else if (RespostaCap1 == 2) {
            System.out.println("Ao não entar na caverna você termina sua aventura. Fim!");
        }
        else {
            System.out.println("Ouve um erro de digitação na resposta.");
        }
        //Fechar o Scanner
        input.close();
    }
}
