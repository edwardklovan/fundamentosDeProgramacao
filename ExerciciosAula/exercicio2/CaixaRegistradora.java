
public class CaixaRegistradora {

	private double[] precoItens;
	private int totalItens;
	
	public CaixaRegistradora(){
		precoItens = new double[10];
		totalItens = 0;
	}
	
	public void addItem(double preco){
		if (totalItens < 10) {
			precoItens[totalItens] = preco;
			totalItens++;
		}
	}
	
	public double getTotal(){
		double total = 0;
		for (int i = 0; i < totalItens; i++) {
			total = total + precoItens[i];
		}
		return total;
	}
	
	public int getNumItens(){
		return totalItens;
	}
	
	public void limpa(){
		totalItens = 0;
	}

	public void imprimeItens() {
		for (int i =0; i < totalItens; i++) {
			System.out.println("Preco do item " + i + ": " + precoItens[i]);
		}
	}
		
}
