package negocios;

import beans.Fornecedor;
import dados.RepositorioFornecedor;

public class ControladorFornecedor {
	private RepositorioFornecedor repositorio;
	
	public ControladorFornecedor() {
		this.repositorio = RepositorioFornecedor.getInstance();
	}
	
	public void cadastrar(Fornecedor fo) {
		if(fo == null) {
			throw new IllegalArgumentException("Fornecedor inválido!");
		} else {
			if(fo.getCodigo() != 0) {
				this.repositorio.cadastrarFornecedor(f);
			}
		}
	}
	
	public Fornecedor buscar(int codigo) {
		return this.repositorio.buscarFornecedor(codigo);
	}
	
	public void remover(int codigo) {
		this.repositorio.removerFornecedor(codigo);
	}
	
	public boolean alterar(Fornecedor novoForn) {
		boolean igual = false;
		if(novoForn != null) {
			this.repositorio.alterarFornecedor(novoForn);
			igual = true;
		}
		return igual;
	}
	
}