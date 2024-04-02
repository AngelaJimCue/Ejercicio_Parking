package _collections;
import java.util.Objects;
import java.util.Random;
public class Coche {
	/*PROPIEDAD*/
	private Color color;
	private Marca marca;
	
	/*CONSTRUCTORES*/
	public Coche(Color color, Marca marca) {
		this.color = color;
		this.marca = marca;
	}
	
	
	public Coche() {
		Random random = new Random();
		this.marca=Marca.values()[random.nextInt(Marca.values().length)];
		this.color=Color.values()[random.nextInt(Color.values().length)];
	}
	
	
	/*GETTER*/
	public Color getColor() {
		return color;
	}	
	public Marca getMarca() {
		return marca;
	}
	
	
	/*TOSTRING*/
	@Override
	public String toString() {
		return String.format("Coche: %s %s",marca,color);
	}

	
	
	/*hashCode y equals*/
	@Override
	public int hashCode() {
		return Objects.hash(color, marca);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coche otroCoche = (Coche) obj;
		return color == otroCoche.color && marca == otroCoche.marca;
	}
}