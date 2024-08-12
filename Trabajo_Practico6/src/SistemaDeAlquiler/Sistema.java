package SistemaDeAlquiler;

import java.time.LocalDate;
import java.util.ArrayList;

public class Sistema {
	private ArrayList<Cliente> clientes;
	private ArrayList<Item>items;
	
	public Sistema() {
		this.items = new ArrayList<>();
		this.clientes = new ArrayList<>();
	}
	
	public void addCliente(Cliente cliente) {
		if(!this.clientes.contains(cliente)) {
			this.clientes.add(cliente);
		}
	}
	public void addItem(Item item) {
		if(!this.items.contains(item)) {
			this.items.add(item);
		}
	}
	
	//Alquilar un item a un cliente hasta una fecha determinada
	public void alquilarItem(Item item, Cliente cliente, LocalDate devolucion) {
		if(item.disponible()==true) {
			item.alquilar(devolucion);
			cliente.alquilarItem(item);
		} else {
			System.out.println("No se puede alquilar.");
		}
	}
	
	//llevar control de los ítems alquilados a cada cliente
	public ArrayList<Item> tieneAlquilado(Cliente cliente){
		return cliente.getAlquileres();		
	}
	
	//quiénes son los clientes que poseen alquileres vencidos
	public ArrayList<Cliente> verDeudores(){
		ArrayList<Cliente> aux = new ArrayList<>();
		for(int i=0; i < this.clientes.size(); i++) {
			if(this.clientes.get(i).esDeudor()){
				aux.add(this.clientes.get(i));
			}
		}
		return aux;
	}
	
	
}
