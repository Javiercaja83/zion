public class ProcesarDatos {
    private boolean banderaProcesado = false;
    private int resultado = -1 ;

    public void procesar(int valor){
        // Flujo normal de procesamiento
        if (valor > 0) {
            resultado = valor * 2; //ejemplo de procesamiento
            banderaProcesado = true;
        } else {
            resultado = 0; // resultado por defecto para valores no positivos
            banderaProcesado = false;
        }

        //AQUI utilizamos assert para verificar el estado final después del procesamiento
        assert banderaProcesado == (valor > 0) : "La banderaProcesado deberia ser true" +  banderaProcesado; 
        assert resultado >= 0 : "El resultado no puede ser negativo";
        
        assert banderaProcesado == (valor < 0) : "La banderaProcesado deberia ser false" + banderaProcesado;
        assert resultado == 0 : "El resultado deberia ser 0" + resultado;
        

    }
}
