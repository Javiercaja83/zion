package Clases;

public class Jugador {
	private TipoJugador tipoJugador;
	private boolean turno;
	public Jugador(TipoJugador tipoJugador, boolean turno) {
		super();
		this.tipoJugador = tipoJugador;
		this.turno = turno;
	}
	
	private boolean cambiarTurno(boolean turno) {
		return !turno;
	}
	
	
}
	