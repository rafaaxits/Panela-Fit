package Objects;

import java.util.ArrayList;

public class RepositorioMateriaPrima {
	private ArrayList<MateriaPrima> listaMateriasPrimas = new ArrayList<MateriaPrima>();
	
	
	public ArrayList<MateriaPrima> getListaMateriasPrimas() {
		return listaMateriasPrimas;
	}

	public void setListaMateriasPrimas(ArrayList<MateriaPrima> listaMateriasPrimas) {
		this.listaMateriasPrimas = listaMateriasPrimas;
	}

	public boolean cadastrarMateriaPrima(MateriaPrima materiap){
		boolean igual = false;
		if(materiap!=null){
			if((listaMateriasPrimas.contains(materiap))){
				return igual;
			}
			else{
				listaMateriasPrimas.add(materiap);
			}
		}
		return igual;
	}
	
	public boolean alterarMateriaPrima(MateriaPrima novaMateriaPrima) {
		boolean igual = false;
		if (novaMateriaPrima != null) {
			for(int i = 0; i < listaMateriasPrimas.size(); i++) {
				if(novaMateriaPrima.getCodigo() == listaMateriasPrimas.get(i).getCodigo()) {
					listaMateriasPrimas.remove(i);
					listaMateriasPrimas.add(novaMateriaPrima);
					igual = true;
				}
			}
		}
		return igual;
	}
	
	public MateriaPrima buscarMateriaPrima(int codigo) {
		for(MateriaPrima materiap : listaMateriasPrimas) {
			if(materiap.getCodigo() == codigo) {
				return materiap;
			}
		}
		return null;
	}
	
	public boolean removerMateriaPrima(int codigo) {
		boolean igual = false;
		for(MateriaPrima materiap : listaMateriasPrimas) {
			if(materiap.getCodigo() == codigo) {
				listaMateriasPrimas.remove(materiap);
				igual = true;
			}
		}
		return igual;
	}
	
	@Override
	public String toString() {
		return "RepositorioMateriaPrima [listaMateriasPrimas = " + listaMateriasPrimas + "]";
			
	}
	
	

}