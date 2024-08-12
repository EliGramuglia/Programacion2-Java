package CooperativaAgricultores;

import java.util.ArrayList;

public class Cooperativa {
	private ArrayList<Cereal> cereales;
	private ArrayList<Lote> lotes;
	private ArrayList<String> mineralesPrimarios;
	
	//no tiene constructor
	
	public boolean esEspecial(Lote lote) {
		for(int i = 0; i < mineralesPrimarios.size(); i++) {
			if(lote.tieneMineral(this.mineralesPrimarios.get(i))) {
				return true;
			}
		}
		return false;
	}
	
	public ArrayList<Cereal> listaCerealesParaLote(Lote lote){
		ArrayList<Cereal> aux = new ArrayList<Cereal>();
		for(int i = 0; i < this.cereales.size(); i++) {
			if(lote.sePuedeSembrar(cereales.get(i))) {
				aux.add(cereales.get(i));
			}
		}
		return aux;
	}
	
	public ArrayList<Lote> listaLotesParaCereal(Cereal cereal){
		ArrayList<Lote> aux = new ArrayList<Lote>();
		for(int i = 0; i < this.lotes.size(); i++) {
			if(cereal.sePuedeSembrar(lotes.get(i))) {
				aux.add(lotes.get(i));
			}
		}
		return aux;
	}
}
