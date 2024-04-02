package _collections;
public enum Marca {
	/*LITERAL*/
	AU("Audi"), HO("Honda"), SE("Seat"), TO("Toyota"), FI("Fiat"), VO("Volvo"),RE("Renault"), ;
	
	/*PROPIEDADES*/
	private String nombreLargoMarca;
	/*CONSTRUCTORES*/
	private Marca(String nombreLargoMarca) {
		this.nombreLargoMarca = nombreLargoMarca;
	}
	
	/*GETTER*/
	public String getNombreLargoMarca() {
		return nombreLargoMarca;
	}
}