import Clases.*;

import java.time.*;
import java.time.temporal.TemporalAdjusters;

public class AppPartido {
    public static void main(String[] args) {
        Equipo[] equipos = createEquipos();
        Estadio[] estadios = createEstadios();
        LocalDate fecha = LocalDate.now();
        LocalDate[] sabados = obtenerSabados(4);
        LocalDateTime fechaPrimerPartido;
        LocalDateTime fechaPrimerPartido;
        LocalDateTime fechaSegundoPartido;
        LocalDateTime fechaTercerPartido;
        LocalDateTime fechaCuartoPartido;
        
        Partido[] jornada1 = crearJornada(equipos, , estadios);

    }

    public static Partido[] crearJornada(Equipo[] equipos, LocalDate fecha, Estadio[] estadios) {
        Partido[] jornada = new Partido[4];

        jornada[0] = new Partido(equipos[0], equipos[1], estadios[0], fecha, 0, 0, null);
        jornada[1] = new Partido(equipos[2], equipos[3], , estadios[1], 0, 0, null);
        jornada[2] = new Partido(equipos[4], equipos[5], , estadios[2], 0, 0, null);
        jornada[3] = new Partido(equipos[6], equipos[7], , estadios[3], 0, 0, null);
    
    return jornada;
    }

    public static Equipo simularYActualizarPartido(Partido partido) {
        if (partido == null) {
            throw new IllegalArgumentException("el partido no puede ser nulo");
        }

        int golesLocal = 0;
        int golesVisitante = 0;

        for (int i = 0; i < 3; i++) {
            double tirada = Math.random() * 10;
            if (tirada > 5) {
                golesLocal++;
            } else {
                golesVisitante++;
            }
        }

        partido.setMarcadorLocal(golesLocal);
        partido.setMarcadorVisitante(golesVisitante);

        return partido.getGanador();
    }

    public static Equipo[] createEquipos() {
        Equipo equipo1 = new Equipo("Atletico de Madrid", "Madrid");
        Equipo equipo2 = new Equipo("Real Madrid", "Madrid");
        Equipo equipo3 = new Equipo("FC Barcelona", "Barcelona");
        Equipo equipo4 = new Equipo("Villarreal", "Villarreal");
        Equipo equipo5 = new Equipo("Real Betis", "Sevilla");
        Equipo equipo6 = new Equipo("Athletic Club", "Bilbao");
        Equipo equipo7 = new Equipo("Sevilla", "Sevilla");
        Equipo equipo8 = new Equipo("Real Sociedad", "San Sebastian");
        return new Equipo[] { equipo1, equipo2, equipo3, equipo4, equipo5, equipo6, equipo7, equipo8 };
    }

    public static Estadio[] createEstadios() {
        Estadio estadio1 = new Estadio("Estadio A", "Dirección A");
        Estadio estadio2 = new Estadio("Estadio B", "Dirección B");
        Estadio estadio3 = new Estadio("Estadio C", "Dirección C");
        Estadio estadio4 = new Estadio("Estadio D", "Dirección D");

        return new Estadio[] { estadio1, estadio2, estadio3, estadio4 };
    }

    public static Partido[] partidos(Equipo[] equipos){
        Partido partido = new Partido(equipos[0], null, null, null, 0, 0, null)
        return null;
    }

    public static LocalDate[] obtenerSabados(int cantidad) {
        LocalDate[] sabados = new LocalDate[cantidad];
        LocalDate currentSaturday = LocalDate.now()
                .with(TemporalAdjusters.next(DayOfWeek.SATURDAY));

        for (int i = 0; i < cantidad; i++) {
            sabados[i] = currentSaturday;
            currentSaturday = currentSaturday.plusWeeks(1);
        }
        return sabados;
    }

}
