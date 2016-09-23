package Objects;

import java.time.*;

public class Produto {
	private String nome;
	private int peso;
	private int calorias;
	private int codigo;
	private int quantEstoque;
	private LocalDate dataFabricacao;

	
	public Produto(String nome, int peso, int calorias, int codigo, int quantEstoque, LocalDate dataFabricacao){
		this.nome = nome;
		this.peso = peso;
		this.calorias = calorias;
		this.codigo = codigo;
		this.quantEstoque = quantEstoque;
		this.dataFabricacao = dataFabricacao;
	}
	
	public Produto (){
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getCalorias() {
		return calorias;
	}

	public void setCalorias(int calorias) {
		this.calorias = calorias;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getQuantEstoque() {
		return quantEstoque;
	}

	public void setQuantEstoque(int quantEstoque) {
		this.quantEstoque = quantEstoque;
	}

	public LocalDate getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(LocalDate dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	
	public boolean equals(Produto produto){
		boolean igual = false;
			if(produto!=null){
				if(this.codigo == produto.getCodigo()){
					igual = true;
				}
		}
			return igual;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", peso=" + peso + ", calorias=" + calorias + ", codigo=" + codigo
				+ ", quantEstoque=" + quantEstoque + ", dataFabricacao=" + dataFabricacao + "]";
	}
	
	
}