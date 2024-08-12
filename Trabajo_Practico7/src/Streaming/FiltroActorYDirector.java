package Streaming;

public class FiltroActorYDirector extends Filtro {
	private String actor;
	private String director;
	

	public FiltroActorYDirector(String actor, String director) {
		super();
		this.actor = actor;
		this.director = director;
	}


	@Override
	public boolean cumple(Pelicula peli) {
		return peli.contieneActor(this.actor) && !peli.getDirector().equals(this.director);
	}

}
