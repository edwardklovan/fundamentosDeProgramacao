import java.util.*;
import java.lang.Math;

public class CentraisEletricasPriscillaOverbeckEdwardKlovan{

    public static void main (String [] args){
    
        int codCentral1, codCentral2, codCentral3, codCentral4, codCentral5, codCentral;
        int qtdCentral1, qtdCentral2, qtdCentral3, qtdCentral4, qtdCentral5, qtdEnergia;
        double media;
        double desvio1, desvio2, desvio3, desvio4, desvio5, desvio;
        media = 0;
        
        Scanner entrada = new Scanner (System.in);
        
        codCentral1 = 50;
        qtdCentral1 = 0;
        
        codCentral2 = 51;
        qtdCentral2 = 0;
        
        codCentral3 = 52;
        qtdCentral3 = 0;
        
        codCentral4 = 53;
        qtdCentral4 = 0;
        
        codCentral5 = 54;
        qtdCentral5 = 0;
        
        System.out.println("Digite o código da central a ser alterada ou 0 para sair: ");
        codCentral = entrada.nextInt();
        
            while (codCentral != 0){
                
                System.out.println("Digite a quantidade de energia: ");
                qtdEnergia = entrada.nextInt();
        
                if (codCentral == codCentral1){
                
                    while ((qtdCentral1 + qtdEnergia > 10000) || (qtdCentral1 + qtdEnergia < 0)){               
                        System.out.println("Erro: a produção dever estar entre 0 MW e 10000 MW.");
                        System.out.println("Digite a quantidade de energia: ");
                        qtdEnergia = entrada.nextInt();
                    }
                        qtdCentral1 = qtdEnergia + qtdCentral1;
                    
                } else if(codCentral == codCentral2){
                
                    while ((qtdCentral2 + qtdEnergia > 10000) || (qtdCentral2 + qtdEnergia < 0)){               
                        System.out.println("Erro: a produção dever estar entre 0 MW e 10000 MW.");
                        System.out.println("Digite a quantidade de energia: ");
                        qtdEnergia = entrada.nextInt();
                    }
                        qtdCentral2 = qtdEnergia + qtdCentral2;
               
                }else if(codCentral == codCentral3){
                
                    while ((qtdCentral3 + qtdEnergia > 10000) ||  (qtdCentral3 + qtdEnergia < 0)){               
                        System.out.println("Erro: a produção dever estar entre 0 MW e 10000 MW.");
                        System.out.println("Digite a quantidade de energia: ");
                        qtdEnergia = entrada.nextInt();
                    }
                        qtdCentral3 = qtdEnergia + qtdCentral3;
                    
               }else if(codCentral == codCentral4){
                
                    while ((qtdCentral4 + qtdEnergia > 10000) ||  (qtdCentral4 + qtdEnergia < 0)){               
                        System.out.println("Erro: a produção dever estar entre 0 MW e 10000 MW.");
                        System.out.println("Digite a quantidade de energia: ");
                        qtdEnergia = entrada.nextInt();
                    }
                        qtdCentral4 = qtdEnergia + qtdCentral4;

                }else if(codCentral == codCentral5){
                
                    while ((qtdCentral5 + qtdEnergia > 10000) ||  (qtdCentral5 + qtdEnergia > 0)){               
                        System.out.println("Erro: a produção dever estar entre 0 MW e 10000 MW.");
                        System.out.println("Digite a quantidade de energia: ");
                        qtdEnergia = entrada.nextInt();
                    }
                        qtdCentral5 = qtdEnergia + qtdCentral5;
                
                }
                
                media = (qtdCentral1 + qtdCentral2 + qtdCentral3 + qtdCentral4 + qtdCentral5)/5;
                
                System.out.println("Centrais: ");
                System.out.println("Central " + codCentral1 + ": " + qtdCentral1 + " MW");
                System.out.println("Central " + codCentral2 + ": " + qtdCentral2 + " MW");
                System.out.println("Central " + codCentral3 + ": " + qtdCentral3 + " MW");
                System.out.println("Central " + codCentral4 + ": " + qtdCentral4 + " MW");
                System.out.println("Central " + codCentral5 + ": " + qtdCentral5 + " MW");
                System.out.println("A média de geração de energia das centrais é: " + media );
                
                desvio1 = Math.pow((qtdCentral1 - media),2);
                desvio2 = Math.pow((qtdCentral2 - media),2);
                desvio3 = Math.pow((qtdCentral3 - media),2);
                desvio4 = Math.pow((qtdCentral4 - media),2);
                desvio5 = Math.pow((qtdCentral5 - media),2);
            
                desvio = (desvio1 + desvio2 + desvio3 + desvio4 + desvio5) / 5;
            
                System.out.println("Desvio padrão: " + desvio);
                
                System.out.println("Digite o código da central a ser alterada ou 0 para sair: ");
                codCentral = entrada.nextInt();
         
            }
                  
            System.out.println("Finalizado.");
            }
                
            }
        
        
        
        
                    
                    
                    
                    
                    
                    
                    
                    