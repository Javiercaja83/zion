	package Clases;
	
	public class CartaEspecial2 extends Carta{
		private Efecto efecto;
		public CartaEspecial2 (Efecto efecto) {
			this.efecto = efecto;
		}
		
		private void aplicarEfecto() {
			switch (efecto) {
			case REPETIR: 
				System.out.println("Repitiendo turno");
				break;
			}
		}
	}
