package SistemaElectoral;

import java.time.LocalDate;

public class Voto {
	private LocalDate horario;
	private Candidato referencia;
	
	public Voto(Candidato referencia) {
		super();
		this.horario = LocalDate.now();
		this.referencia = referencia;
	}
	
	public Voto() {
		this.horario = LocalDate.now();
	}

	public LocalDate getHorario() {
		return horario;
	}

	public void setHorario(LocalDate horario) {
		this.horario = horario;
	}

	public Candidato getReferencia() {
		return referencia;
	}

	public void setReferencia(Candidato referencia) {
		this.referencia = referencia;
	}
	
}
