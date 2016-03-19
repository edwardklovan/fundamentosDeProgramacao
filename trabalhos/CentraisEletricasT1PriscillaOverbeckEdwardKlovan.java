import java.util.*;
import java.lang.*;

public class CentraisEletricasT1PriscillaOverbeckEdwardKlovan{

    public static void main(String [] args){

        double qtdCentral1, qtdCentral2, qtdCentral3, qtdCentral4;
        double qtdMedia, subutilizadas;
        int centraisSub, central1, central2, central3, central4;

        Scanner entrada = new Scanner (System.in);

        System.out.println("Digite o código da primeira central: ");
        central1 = entrada.nextInt();

        System.out.println("Digite a quantidade de energia gerada na central: " + central1 + " : ");
        qtdCentral1 = entrada.nextDouble();

        System.out.println("Digite o código da segunda central: ");
        central2 = entrada.nextInt();

        System.out.println("Digite a quantidade de energia gerada na central: " + central2 + " : ");
        qtdCentral2 = entrada.nextDouble();

        System.out.println("Digite o código da terceira central: ");
        central3 = entrada.nextInt();

        System.out.println("Digite a quantidade de energia gerada na central: " + central3 + " : ");
        qtdCentral3 = entrada.nextDouble();

        System.out.println("Digite o código da quarta central: ");
        central4 = entrada.nextInt();

        System.out.println("Digite a quantidade de energia gerada na central: " + central4 + " : ");
        qtdCentral4 = entrada.nextDouble();



        //A quantidade média de energia gerada pelas quatro centrais;

        qtdMedia = (qtdCentral1 + qtdCentral2 + qtdCentral3 + qtdCentral4)/4;

        //O número de centrais subutilizadas (gerando menos de 800 MW)

        centraisSub = 0;

        if (qtdCentral1 < 800){

            centraisSub++;

        }else if (qtdCentral1 > 10000){

            System.out.println("A central " + central1 + " contribui bastante para o sistema.");

        }

        if (qtdCentral2 < 800){

        centraisSub++;

        }else if (qtdCentral2 > 10000){

            System.out.println("A central " + central2 + " contribui bastante para o sistema.");

        }

        if (qtdCentral3 < 800){

        centraisSub++;

        } else if (qtdCentral3 > 10000){

            System.out.println("A central " + central3 + " contribui bastante para o sistema.");

        }

        if (qtdCentral4 < 800){

            centraisSub++;

        }else if (qtdCentral4 > 10000){

            System.out.println("A central " + central4 + " contribui bastante para o sistema.");

        }

        System.out.println("O número de centrais subtulizadas é: " + centraisSub);


       //O código da central que gera mais energia.

        if ((qtdCentral1 > qtdCentral2) && (qtdCentral1 > qtdCentral3) && (qtdCentral1 > qtdCentral4)){

            System.out.println ("A central que gera mais energia é a :" + central1);


        }else if ((qtdCentral1 < qtdCentral2) && (qtdCentral2 > qtdCentral3) && (qtdCentral2 > qtdCentral4)){

            System.out.println ("A central que gera mais energia é a : " + central2);


        }else if ((qtdCentral1 < qtdCentral3) && (qtdCentral2 < qtdCentral3) && (qtdCentral3 > qtdCentral4)) {

            System.out.println ("A central que gera mais energia é a : " + central3);

        }else{

            System.out.println ("A central que gera mais energia é a : " + central4);
        }

}


    }
