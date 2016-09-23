package Objects;

public class Cliente extends Pessoa{
	private int codigo;
	
	public Cliente(int codigo){
		super();
		this.codigo = codigo;
	}
	
	public Cliente(){
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public boolean equals(Cliente cliente){
		boolean igual = false;
		if(cliente!=null){
			if(this.codigo==cliente.getCodigo()){
				igual = true;
			}
		}
		return igual;
	}

	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + "]";
	}
	
	
}
