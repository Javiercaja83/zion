package Clases;
import java.time.LocalDateTime;

public class Partido {
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private int golesLocal;
    private int golesVisitante;
    private LocalDateTime fechaPartido;
    private Estadio estadioPartido;
    private String resultado;
    public Partido(Equipo equipoLocal, Equipo equipoVisitante, LocalDateTime fechaPartido, Estadio estadioPartido,
            String resultado) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.fechaPartido = fechaPartido;
        this.estadioPartido = estadioPartido;
        this.resultado = resultado;
    }

    
    public String actualizarResultado() {
        String resultado = golesLocal + " - " + golesVisitante;
        return resultado;
    }

    public Equipo simularPartido(Equipo equipoLocal, Equipo equipoVistante, int golesLocal, int golesVisitante, int resultado, Estadio estadioPartido, LocalDateTime fechaYhoraPartido) {
        //TODO: imprimir equipos que juegan, 
        // asignar goles aleatoriamente a ambos, comparar goles, seleccionar al ganador, hacer copia y devolverla.
        Equipo equipoGanador;
        System.out.println(equipoLocal.getNombre() +  " - " + equipoVistante + "JUGARAN EN EL " + estadioPartido.getNombre() + " EL DIA Y HORA " +  fechaYhoraPartido);
        for (int i = 0; i < 5; i++) {
            if (Math.random() > 0.48) {
                golesLocal++;
            } else {
                golesVisitante++;
            }
        }
        if (golesLocal > golesVisitante) {
            equipoGanador = equipoLocal;
        }else {
            equipoGanador = equipoVistante;
        }
        return equipoGanador;
    }

}
