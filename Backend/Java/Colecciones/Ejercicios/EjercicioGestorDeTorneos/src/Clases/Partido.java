package Clases;

import java.time.LocalDateTime;

public class Partido {
    private Equipo equipoLocal;
    private Equipo equipoVistante;
    private Estadio estadio;
    private LocalDateTime fechaHora;
    private int marcadorLocal;
    private int marcadorVisitante;
    private String marcadorPartido;

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

// Constructor más práctico para crear partidos antes de jugarlos
public Partido(Equipo equipoLocal, Equipo equipoVisitante, 
               Estadio estadio, LocalDateTime fechaHora) {
    
    this.equipoLocal = equipoLocal;
    this.equipoVistante = equipoVisitante;
    this.estadio = estadio;
    this.fechaHora = fechaHora;
    this.marcadorLocal = 0;
    this.marcadorVisitante = 0;
    this.marcadorPartido = "0 - 0";
}
    public void setMarcadorLocal(int marcadorLocal) {
    this.marcadorLocal = marcadorLocal;
    this.marcadorPartido = marcadorLocal + " - " + marcadorVisitante; // Actualiza el string
}

public void setMarcadorVisitante(int marcadorVisitante) {
    this.marcadorVisitante = marcadorVisitante;
    this.marcadorPartido = marcadorLocal + " - " + marcadorVisitante; // Actualiza el string
}

public int getMarcadorLocal() {
    return marcadorLocal;
}

public int getMarcadorVisitante() {
    return marcadorVisitante;
}

// Método para obtener el ganador (equipo con más goles)
public Equipo getGanador() {
    if (marcadorLocal > marcadorVisitante) {
        return equipoLocal;
    } else if (marcadorVisitante > marcadorLocal) {
        return equipoVistante;
    } else {
        // Empate: desempate aleatorio (como propusiste)
        return Math.random() > 0.5 ? equipoLocal : equipoVistante;
    }
}
}
