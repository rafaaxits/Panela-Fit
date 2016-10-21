import beans.Cliente;
import dados.RepositorioCliente;

public class ControladorClientes {
	private RepositorioCliente repositorio;
	public ControladorClientes(){
		this.repositorio = RepositorioCliente.getInstance();
	}
public void cadastrar(Cliente c){
	if(c==null){
		throw new IllegalArgumentException("Cliente inválido");
	}
	else{
		if(c.getCodigo()!=0){
			this.repositorio.cadastrarCliente(c);
		}
	}
	}
public Cliente buscar(int codigo){
	return this.repositorio.buscarCliente(codigo);
	}
public void remover(int codigo){
	this.repositorio.removerCliente(codigo);
	}
	public boolean alterar(Cliente novoCliente){
		boolean igual = false;
		if(novoCliente!=null){
			this.repositorio.alterarCliente(novoCliente);
			igual = true;
		}
		return igual;
	}
}