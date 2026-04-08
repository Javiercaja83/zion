import java.util.HashMap;

public class Dinero {
    private HashMap<Integer, Integer> billetes;
    private HashMap<Double, Integer> monedas;

    public Dinero(HashMap<Integer, Integer> billetes, HashMap<Double, Integer> monedas) {
        this.billetes = billetes;
        this.monedas = monedas;
    }

    
}