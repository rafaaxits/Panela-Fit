package Objects;

public class TEST {

	public static void main(String[] args) {
		RepositorioCliente rep = new RepositorioCliente();
		Cliente c1 = new Cliente(3);
		c1.setNome("Juvenal");
		c1.setCpf("10303577495");
		c1.setEndereco("Rua pedro Atonio da Silva");
		c1.setIdade(25);
		c1.setTelefone("997457748");
		rep.cadastrarCliente(c1);
		System.out.println(" " +rep.toString());
		System.out.println(" " +c1.toString());
		
		Cliente c2 = new Cliente(3);
		c2.setNome("zé pilinta");
		c2.setCpf("10455882923");
		c2.setEndereco("Rua Ernesto Paula Santos");
		c2.setIdade(18);
		c2.setTelefone("987984573");
		
		rep.alterarCliente(c2);
		System.out.println(" " +rep.toString());
		
		System.out.print("buscando Cliente: " +rep.buscarCliente(3)); 
		System.out.println(" " +rep.removerCliente(3));
		System.out.println(" " +rep.toString());
		
	}

}
