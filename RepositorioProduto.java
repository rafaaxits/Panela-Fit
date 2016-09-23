package Objects;

import java.util.ArrayList;

public class RepositorioProduto {
	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	
	public ArrayList<Produto> getListaProdutos() {
		return listaProdutos;
	}
	
	public void setListaProdutos(ArrayList<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}
	
	public boolean cadastrarProduto(Produto produto) {
		boolean igual = false;
		if(produto != null) {
			if((listaProdutos.contains(produto))) {
				return igual;
			}
			else {
				listaProdutos.add(produto);
			}
		}
		return igual;
	}
	
	public boolean alterarProduto(Produto novoProduto) {
		boolean igual = false;
		if (novoProduto != null) {
			for(int i = 0; i < listaProdutos.size(); i++) {
				if(novoProduto.getCodigo() == listaProdutos.get(i).getCodigo()) {
					listaProdutos.remove(i);
					listaProdutos.add(novoProduto);
					igual = true;
				}
			}
		}
		return igual;
	}
	
	public Produto buscarProduto(int codigo) {
		for(Produto produto : listaProdutos) {
			if(produto.getCodigo() == codigo) {
				return produto;
			}
		}
		return null;
	}
	
	public boolean removerProduto(int codigo) {
		boolean igual = false;
		for(Produto produto : listaProdutos) {
			if(produto.getCodigo() == codigo) {
				listaProdutos.remove(produto);
				igual = true;
			}
		}
		return igual;
	}

	
	@Override
	public String toString() {
		return "RepositorioProduto [listaProdutos = " + listaProdutos + "]";
			
	}
	
	

}