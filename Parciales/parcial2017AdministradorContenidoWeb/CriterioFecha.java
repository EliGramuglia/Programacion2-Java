package parcial2017AdministradorContenidoWeb;
import java.util.*;
public class CriterioFecha implements Criterio {
	private Date fecha;
	public CriterioFecha(Date fecha) {
		this.fecha = fecha;
	}
	public boolean cumple (Pagina p) {
		return fecha.equals(p.getFecha());
	}
}
