public class CuentaBancaria {
    int saldo;

    public void retirar(int cantidad) {
        assert cantidad > 0 : "la cantidad no debe ser menor a 0";
        assert cantidad > saldo : "la cantidad no debe superar al saldo";

    }

    public void depositar(int cantidad){
        assert cantidad > 0 : "La cantidad a depositar no debe ser menor a 0";
        saldo += cantidad;

    }
}
 /*
 // MAL (si el assert está desactivado, la acción no se ejecuta)
assert procesarPedido() : "Error al procesar";

// BIEN (siempre se ejecuta la acción, luego se comprueba el resultado)
boolean resultado = procesarPedido();
assert resultado == true : "El pedido debería haberse procesado correctamente";

// Procesamos primero
realizarOperacion();

// Luego comprobamos el estado final
assert this.banderaProcesado == true : "La bandera no se bajó correctamente después de la operación";
assert this.resultadoCalculado >= 0 : "El resultado no puede ser negativo";

*/