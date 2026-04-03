package Clases;

public class CartaEspecial extends Carta {
    private Efecto efecto;

    public CartaEspecial(int numero, Color color, Efecto efecto) {
        super(numero, color);
        this.efecto = efecto;
    }

    // Getter and setter for efecto
    public Efecto getEfecto() {
        return efecto;
    }

    public void setEfecto(Efecto efecto) {
        this.efecto = efecto;
    }

    public void aplicarEfecto() {
    	switch (efecto) {
    	case POR2:
    		System.out.println("doblando los numeros...");
    		super.numero  = super.numero * 2;
    	case MAS1:
    		System.out.println("Sumando un numero");
    		super.numero += super.numero;
    	}
    }
}

