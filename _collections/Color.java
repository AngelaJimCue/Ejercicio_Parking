package _collections;
public enum Color {
	/*LITERAL*/
	RO("Rojo"), NA("Naranja"), AM("Amarillo"), VE("Verde"), AZ("Azul"), IN("Índigo"),VI("Violeta"), ;
	
	/*PROPIEDADES*/
	private String nombreLargoColor;
	/*CONSTRUCTORES*/
	private Color(String nombreLargoColor) {
		this.nombreLargoColor = nombreLargoColor;
	}
	/*GETTER*/
	public String getNombreLargo() {
		return nombreLargoColor;
	}
}
