
public class CaixaRegistradora {

	private double precoTotal;
	private int numItens;
	
	public CaixaRegistradora(){
		precoTotal = 0;
		numItens = 0;
	}
	
	public void addItem(double preco){
		precoTotal += preco;
	}
	
	public double getTotal(){
		return precoTotal;
	}
	
	public int getNumItens(){
		return numItens;
	}
	
	public void limpa(){
		precoTotal = 0;
		numItens = 0;
	}
	
	
}
