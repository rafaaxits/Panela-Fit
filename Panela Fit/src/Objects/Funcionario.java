package Objects;

public class Funcionario extends Pessoa {
	private int nivel;
	private int codigo;

	
	public Funcionario(int nivel, int codigo){
		super();
		this.nivel = nivel;
		this.codigo = codigo;
	}
	
	public Funcionario(){
		
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public boolean equals(Funcionario funcionario){
		boolean igual = false;
			if(funcionario!=null){
				if(this.codigo==funcionario.getCodigo()){
					igual = true;
				}
			}
		return igual;
	}

	@Override
	public String toString() {
		return "Funcionario [nivel=" + nivel + ", codigo=" + codigo + ", nome=" +this.getNome()+ ", cpf=" +this.getCpf()+ ", idade=" +this.getIdade()+ ", endereco=" +this.getEndereco()+ ", telefone=" +this.getTelefone()+ "]";
	}
	
	
}
