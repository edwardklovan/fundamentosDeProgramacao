public class CaixaRegistradoraTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CaixaRegistradora caixa = new CaixaRegistradora();

		// adiciona tres itens
		caixa.addItem(1.99);
		caixa.addItem(2.99);
		caixa.addItem(1.50);

		System.out.println(caixa.getTotal()); 
		System.out.println("Esperado: 6.48");
		System.out.println(caixa.getNumItens()); 
		System.out.println("Esperado: 3");
		
		//imprime contaudo da caixa
		caixa.imprimeItens();
		System.out.println("Esperado: ");
		System.out.println("Item 1: 1.99");
		System.out.println("Item 2: 2.99");
		System.out.println("Item 3: 1.50");
		
		//limpa
		caixa.limpa();
		System.out.println(caixa.getTotal()); 
		System.out.println("Esperado: 0");
		System.out.println(caixa.getNumItens()); 
		System.out.println("Esperado: 0");
	}

}
