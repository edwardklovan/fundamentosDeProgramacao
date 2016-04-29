/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author Sandro
 */
public class ExercicioCondominio {

    /**
     * Cadastra um determinado número de terrenos nos vetores passados por
     * parâmetro. Se já existem terrenos nos vetores (numTerrenos > 0), então
     * acrescenta os novos terrenos lidos no vetor já existente.
     *
     * @param numeros vetor onde colocar os numeros lidos
     * @param areas vetor onde colocar areas lidas
     * @param numTerrenos quantidade existente de lotes nos vetores
     * @return novo número de terrenos nos vetores
     */
    public static int opcaoCadastraTerreno(int[] numeros, double[] areas, int numTerrenos) {
        int continuar = 1;
        int i = numTerrenos;
        Scanner entrada = new Scanner(System.in);
        
        do { 
            System.out.println("Digite o número do terreno:");       
            numeros[i] = entrada.nextInt();
            
            System.out.println("Digite a área do terreno:");       
            areas[i] = entrada.nextInt();
                
            System.out.println("Digite 1 para continuar.");       
            continuar = entrada.nextInt();
            i++;
        
        } while (continuar == 1 && i < numeros.length);
        
        return i;
    }

    /**
     * Imprime na tela uma tabela com duas colunas, onde a primeira tabela
     * contém o numero de cada terreno e a segunda contem as áreas de cada
     * terreno.
     *
     * @param numeros vetor com os numeros
     * @param areas vetor com as áreas
     * @param numTerrenos numero de terrenos nos vetores
     */
    public static void opcaoMostrarTodosOsTerrenos(int[] numeros, double[] areas, int numTerrenos) {
        //IMPLEMENTE ESSA!
        //Use somente um for
        
        for (int i = 0; i < numTerrenos; i++ ) {
            System.out.println(numeros[i] + "-" + areas[i]);
        }

    }

    /**
     * Busca o indice da posição do vetor com maior área. Retorna -1 caso não
     * houverem áreas cadastrada. Se existem áreas iguais, então termina retorna
     * qualquer índice das iguais.
     *
     * @param areas vetor com todas as áreas
     * @param nTerrenos numero de elementos no vetor
     * @return retorna indice da maior área ou -1 caso não houverem áreas
     */
    public static int buscaIndiceMaiorTerreno(double[] areas, int nTerrenos) {
        //IMPLEMENTE ESSA!!

        return 0; //mude
    }

    /**
     * Busca e mostra na tela maior terreno cadastrado.
     *
     * @param numeros vetor com numernos dos terrenos
     * @param areas vetor com áreas dos terrenos
     * @param nTerrenos número total de terrenos cadastrados
     */
    public static void opcaoMaiorTerreno(int[] numeros, double[] areas, int nTerrenos) {
        System.out.print("O maior terreno é");

        int i = buscaIndiceMaiorTerreno(areas, nTerrenos);
        if (i == -1) {
            System.out.println("Não existem terrenos cadastrados!");
        } else {
            System.out.println("O terreno n. " + numeros[i] + " é o maior terreno com " + areas[i] + "m^2");
        }

    }

    /**
     * Busca indice do vetor corresponte ao terreno com numero indicado no
     * parâmetro q. Retorna -1 caso não encontrado.
     *
     * @param q numero do terrano a ser buscado
     * @param numeros vetor com numeros dos terrenos
     * @param nTerrenos numero de terrenos no vetor
     * @return indice do vetor onde n foi encontrado, ou -1 caso não encontrado
     */
    public static int buscaIndiceTerreno(int q, int[] numeros, int nTerrenos) {
        //IMPLEMENTE ESSA!!

        return 0; // mudar!
    }

    /**
     * Pede ao usuário um número de terreno, e mostra na tela a área
     * correspondente.
     *
     * @param numeros vetor com os numeros
     * @param areas vetor com as áreas
     * @param numTerrenos numero de terrenos nos vetores
     */
    public static void opcaoBuscarArea(int[] numeros, double[] areas, int nTerrenos) {
        int query;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o numero de um terreno:");
        query = entrada.nextInt();

        int i = buscaIndiceTerreno(query, numeros, nTerrenos);

        if (i == -1) {
            System.out.println("Terreno não encontrado!");
        } else {
            System.out.println("Área do terreno " + query + " é " + areas[i]);
        }
    }

    /** Calcula e retorna área total dos terrenos
     * 
     * @param areas vetor com áreas.
     * @param nTerrenos número de elementos no vetor
     * @return soma área total de todos os terrenos
     */
    public static double calculaAreaTotal(double[] areas, int nTerrenos) {
        //IMPLEMENTAR ESSA!
        
        return 0;
    }

    
    /** Calcula o valor do condominio de cada terreno segundo sua área. Terrenos
     * maiores pagam um valor maior. Retorna valores em um vetor de doubles com
     * o mesmo numero de elementos que o vetor areas (nTerrenos).
     * 
     * @param valorTotal valor que deve ser rateado entre terrenos
     * @param areas vetor com áreas de todos os terrenos
     * @param nTerrenos número de terrenos
     * @return vetor com os valores calculados;
     */
    public static double[] rateiaCondominio(double valorTotal, double[] areas, int nTerrenos){
        //IMPLEMENTAR ESSA
        //Chame a função calculaAreaTotal para saber a area total
        //Como calcular o valor de cada terreno no valor? Faça um calculo a mão 
        //para descobrir a expressão
        //Para cada valor calculado, coloque no vetor valores, que será retornado pela função
        
        double[] valores = new double[nTerrenos]; //afinal, existem tantaos valores quanto terrenos...
        
        
        //codigo aqui!
                //Não use mais do que um for para resolver essa questão

        
        return valores;
    } 
    
    
    /** Pede ao usuário o valor total do condomínio e mostra parcela
     * de cada terreno;
     * 
     * @param areas 
     * @param nTerrenos
     * @return 
     */
    public static void opcaoCalcularValorCondominios(int[] numeros, double[] areas, int nTerrenos) {
        double total;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Valor total do condomínio a ser repartido (R$): ");
        total = entrada.nextDouble();
        
        double[] condominios = rateiaCondominio(total, areas, nTerrenos);
    
        for (int i = 0; i < nTerrenos; i++) {
            System.out.println("Terreno n. " + numeros[i] + " deve R$ " + condominios[i]);
        }
    }
    
    /** 
     * Gera alguns valores iniciais!
     */
    public static int geraValoresIniciais(int[] numeros, double[] areas, int numTerrenos){
        
        numeros[0] = 233;
        numeros[1] = 234;
        numeros[2] = 235;
        
        
        areas[0] = 150.23;
        areas[1] = 100.62;
        areas[2] = 150.65;
        
        return 3;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        //vetor com dados
        int[] numerosTerrenos = new int[15];
        double[] areaTerrenos = new double[15];
        int nTerrenos = 0;

        //variavel para armazenar opção do usuário
        int opcao = 0;

        //inicializa alguns valores iniciais
        nTerrenos = geraValoresIniciais(numerosTerrenos,areaTerrenos,nTerrenos);
        
        Scanner entrada = new Scanner(System.in);

        do {

            System.out.println("Opções:");
            System.out.println("1)  Cadastrar terrenos");
            System.out.println("2)  Mostrar todos os terrenos (número e área na tela)");
            System.out.println("3)  Buscar a área de um terreno dado o seu número");
            System.out.println("4)  Buscar o terreno de maior área");
            System.out.println("5)  Calcular a área total do condomínio ");
            System.out.println("6)  Calcular o valor o valor mensal do condomínio");
            System.out.println("7)  Sair");
            System.out.println("Escolha uma opção:");

            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    //cadastra novos lotes e atualiza nTerrenos com a nova quantidade
                    nTerrenos = opcaoCadastraTerreno(numerosTerrenos, areaTerrenos, nTerrenos);
                    break;
                case 2:
                    opcaoMostrarTodosOsTerrenos(numerosTerrenos, areaTerrenos, nTerrenos);
                    break;
                case 3:
                    opcaoBuscarArea(numerosTerrenos, areaTerrenos, nTerrenos);
                    break;
                case 4:
                    opcaoMaiorTerreno(numerosTerrenos, areaTerrenos, nTerrenos);
                    break;
                case 5:
                    double areaTotal = calculaAreaTotal(areaTerrenos, nTerrenos);
                    System.out.println("Area total dos terrenos cadastrados é " + areaTotal + "m^2");
                    break;
                case 6:
                    opcaoCalcularValorCondominios(numerosTerrenos, areaTerrenos, nTerrenos);
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");

            }

        } while (opcao != 7);
    }

}
