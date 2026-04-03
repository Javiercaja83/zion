package Clases;

public abstract class Carta {
    protected int numero;
    protected Color color;

    public Carta(int numero, Color color) {
        this.numero = numero;
        this.color = color;
    }
    
    public Carta() {}

    // Getters and setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
