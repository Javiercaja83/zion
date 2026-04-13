package Clases;

public class Leccion {
    private String pregunta;
    private String respuestaCorrecta;
    int puntos;

    public Leccion() {}

    public Leccion(String pregunta, String respuestaCorrecta, int puntos) {
        this.pregunta = pregunta;
        this.respuestaCorrecta = respuestaCorrecta;
        this.puntos = puntos;
        
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public void setRespuestaCorrecta(String respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

}
