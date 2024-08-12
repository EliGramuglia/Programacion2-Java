package PuertoDeCereales;

import java.util.ArrayList;

public class ColaDeEspera {
	private ArrayList<ItemOrdenable> items;
	
	public ColaDeEspera() {
		this.items = new ArrayList<>();
	}
	
	public void addItem(ItemOrdenable item) {
		if(!items.contains(item)) {
			
			int i= 0;
			boolean encontrado = false;
			
			while(i < this.items.size() && encontrado == false) {
				if(item.esMayor(this.items.get(i))) {
					encontrado = true;
				} else {
					i++;
				}
			}
			if(encontrado == true) {
				this.items.add(i, item);
			}else {
				this.items.add(item);
			}
		}
	}

	public ArrayList<ItemOrdenable> getItems() {
		return new ArrayList<>(this.items);
	}
	
	
	
}
