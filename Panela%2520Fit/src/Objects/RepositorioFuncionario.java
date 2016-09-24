package Objects;

import java.util.ArrayList;

public class RepositorioFuncionario {
	private ArrayList<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();
	
	public ArrayList<Funcionario> getListaFuncionarios() {
		return listaFuncionarios;
	}
	
	public void setListaFuncionarios(ArrayList<Funcionario> listaFuncionarios) {
		this.listaFuncionarios = listaFuncionarios;
	}
	
	public boolean cadastrarFuncionario(Funcionario funcionario) {
		boolean igual = false;
		if(funcionario != null) {
			if((listaFuncionarios.contains(funcionario))) {
				return igual;
			}
			else {
				listaFuncionarios.add(funcionario);
			}
		}
		return igual;
	}
	
	public boolean alterarFuncionario(Funcionario novoFuncionario) {
		boolean igual = false;
		if (novoFuncionario != null) {
			for(int i = 0; i < listaFuncionarios.size(); i++) {
				if(novoFuncionario.getCodigo() == listaFuncionarios.get(i).getCodigo()) {
					listaFuncionarios.remove(i);
					listaFuncionarios.add(novoFuncionario);
					igual = true;
				}
			}
		}
		return igual;
	}
	
	public Funcionario buscarFuncionario(int codigo) {
		for(Funcionario funcionario : listaFuncionarios) {
			if(funcionario.getCodigo() == codigo) {
				return funcionario;
			}
		}
		return null;
	}
	
	public boolean removerFuncionario(int codigo) {
		boolean igual = false;
		for (int i = 0; i < listaFuncionarios.size(); i++){
			if(listaFuncionarios.get(i).getCodigo() == codigo){
				listaFuncionarios.remove(i);
				igual = true;
			}
		}
		return igual;
	}
	
	@Override
	public String toString() {
		return "RepositorioFuncionario [listaFuncionarios = " + listaFuncionarios + "]";
			
	}
	
	

}
