package Objects;

import java.util.ArrayList;

public class RepositorioFornecedor {
	private ArrayList<Fornecedor> listaFornecedores = new ArrayList<Fornecedor>();
	
	public ArrayList<Fornecedor> getListaFornecedores() {
		return listaFornecedores;
	}
	
	public void setListaFornecedores(ArrayList<Fornecedor> listaFornecedores) {
		this.listaFornecedores = listaFornecedores;
	}
	
	public boolean cadastrarFornecedor(Fornecedor fornecedor) {
		boolean igual = false;
		if(fornecedor != null) {
			if((listaFornecedores.contains(fornecedor))) {
				return igual;
			}
			else {
				listaFornecedores.add(fornecedor);
			}
		}
		return igual;
	}
	
	public boolean alterarFornecedor(Fornecedor novoFornecedor) {
		boolean igual = false;
		if(novoFornecedor != null) {
			for(int c = 0; c < listaFornecedores.size(); c++) {
				if(novoFornecedor.getCodigo() == listaFornecedores.get(c).getCodigo()) {
					listaFornecedores.remove(c);
					listaFornecedores.add(novoFornecedor);
					igual = true;
				}
			}
		}
		return igual;
	}
	
	public Fornecedor buscarFornecedor(int codigo) {
		for(Fornecedor fornecedor : listaFornecedores) {
			if(fornecedor.getCodigo() == codigo) {
				return fornecedor;
			}
		}
		return null;
	}
	
	public boolean removerFornecedor(int codigo) {
		boolean igual = false;
		for (int i = 0; i < listaFornecedores.size(); i++){
			if(listaFornecedores.get(i).getCodigo() == codigo){
				listaFornecedores.remove(i);
				igual = true;
			}
		}
		return igual;
	}
	
	@Override
	public String toString() {
		return "RepositorioFornecedor [listaFornecedores = " + listaFornecedores +"]";
	}

}
