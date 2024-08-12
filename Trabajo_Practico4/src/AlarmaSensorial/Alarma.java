package AlarmaSensorial;

import java.util.ArrayList;

public class Alarma {
	private Timbre timbre;
	private ArrayList <Sensor> sensores;
	
	public Alarma() {
		this.timbre = new Timbre();
		this.sensores = new ArrayList <Sensor>();
	}
	
	public boolean comprobar(){
		for(int i=0; i < this.sensores.size(); i++) {
			if(this.sensores.get(i).detectarAnomalia() == true) {
				System.out.println(sensores.get(i).getZonaControl());
				return true;
			}
		}
		return false;
	}
	
	
	public void addSensor(Sensor sensor) {
		this.sensores.add(sensor);
	}
	
	
	public boolean activarAlarma() {
		if(this.comprobar() == true) {
			this.timbre.sonarTimbre();
			return true;
		}
		return false;
	}
	
	public void apagarAlarma() {
		this.timbre.apagarTimbre();
	}

	public Timbre getTimbre() {
		return timbre;
	}

	
	
	
}
