package Objects;

import java.util.ArrayList;

public class RepositorioCliente {
	private ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
	
	
	public ArrayList<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(ArrayList<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	public boolean cadastrarCliente(Cliente cliente){
		boolean igual = false;
		if(cliente!=null){
			if((listaClientes.contains(cliente))){
				return igual;
			}
			else{
				listaClientes.add(cliente);
			}
		}
		return igual;
	}
	
	public boolean alterarCliente(Cliente novoCliente){
		boolean igual = false;
			if(novoCliente != null){
				for(int i=0; i<listaClientes.size();i++){
					if(novoCliente.getCodigo()==listaClientes.get(i).getCodigo()){
						listaClientes.remove(i);
						listaClientes.add(novoCliente);
						igual = true;
					}
				}
			}
			return igual;
	}
	
	public Cliente buscarCliente(int codigo){
		for (Cliente cliente : listaClientes) {
			if(cliente.getCodigo() == codigo){
				return cliente;
			}
		}
		return null;
	}
	
	public boolean removerCliente(int codigo){
		boolean igual=false;
		for (Cliente cliente : listaClientes) {
			if(cliente.getCodigo()==codigo){
				listaClientes.remove(cliente);
				igual = true;
			}
		}
		return igual;
	}

	@Override
	public String toString() {
		return "RespositorioCliente [listaClientes=" + listaClientes + "]";
	}
	
	
}
