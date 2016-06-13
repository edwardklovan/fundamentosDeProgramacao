
public class PessoaTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Criando uma pessoa com um construtor e testando
		Pessoa p1 = new Pessoa("Joao", 23);
		p1.setEndereco("Av. Ipiranga, 234");
		
		System.out.println(p1.getNome());
		System.out.println("Esperado: Joao");

		System.out.println(p1.getIdade());
		System.out.println("Esperado: 23");

		System.out.println(p1.getEndereco());
		System.out.println("Esperado: Av. Ipiranga, 234");

		//Criando uma pessoa com outro construtor e testando
		Pessoa p2 = new Pessoa("Maria", 103, "Avenida Bento Goncalves, 23");

		p2.setIdade(104); //mudando idade
		
		System.out.println(p2.getNome());
		System.out.println("Esperado: Maria");

		System.out.println(p2.getIdade());
		System.out.println("Esperado: 104");

		System.out.println(p2.getEndereco());
		System.out.println("Esperado: Avenida Bento Goncalves, 23");
	}

}
