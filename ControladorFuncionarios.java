package negocios;

import beans.Funcionario;
import dados.RepositorioFuncionario;

public class ControladorFuncionarios {
	private RepositorioFuncionario repositorio;
	
	public ControladorFuncionarios() {
		this.repositorio = RepositorioFuncionario.getInstance();
	}
	
	public void cadastrar(Funcionario f) {
		if(f == null) {
			throw new IllegalArgumentException("Funcionario inválido!");
		} else {
			if(f.getCodigo() != 0) {
				this.repositorio.cadastrarFuncionario(f);
			}
		}
	}
	
	public Funcionario buscar(int codigo) {
		return this.repositorio.buscarFuncionario(codigo);
	}
	
	public void remover(int codigo) {
		this.repositorio.removerFuncionario(codigo);
	}
	
	public boolean alterar(Funcionario novoFunc) {
		boolean igual = false;
		if(novoFunc != null) {
			this.repositorio.alterarFuncionario(novoFuncionario);
			igual = true;
		}
		return igual;
	}
	
}
