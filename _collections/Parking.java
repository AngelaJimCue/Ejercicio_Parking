package _collections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Parking {
	/*PROPIEDADES*/
	private String nombre;
	private int totalPlazas;
	private List<Coche>listaDeCoches = new ArrayList<>();
	private Map <Color, Integer> mapDeColores = new HashMap<>();
	private Map <Marca, Integer> mapDeMarcas = new HashMap<>();
	private Map <Coche, Integer> mapDeCochesIguales = new HashMap<>();
	private Set <Coche> setCochesAlmacenado = new HashSet<>();
	
	/*CONSTRUCTOR*/
	public Parking(String nombre, int totalPlazas) {
		this.nombre = nombre;
		this.totalPlazas = totalPlazas;
	}
	
	/*GETTER*/
	public String getNombre() {
		return nombre;
	}	
	
	public int getTotalPlazas() {
		return totalPlazas;
	}	
	
	
	/*MÉTODO*/	
	private boolean parkingLleno() {
		return totalPlazas == listaDeCoches.size();
	}
		
	private boolean introducirColorDelCoche(Coche cochecito) {
		if (!mapDeColores.containsKey(cochecito.getColor())) {
			mapDeColores.put(cochecito.getColor(), 1);
		} else {
			mapDeColores.put(cochecito.getColor(), mapDeColores.get(cochecito.getColor()) + 1);
		}
		return true;
	}
	
	private boolean introducirMarcaDelCoche(Coche cochecito){
		if (!mapDeMarcas.containsKey(cochecito.getMarca())) {
			mapDeMarcas.put(cochecito.getMarca(), 1);
		} else {
			mapDeMarcas.put(cochecito.getMarca(), mapDeMarcas.get(cochecito.getMarca()) + 1);
		}
		return true;
	}
	
	private boolean introducirCochesIguales(Coche cochecito) {
		if (mapDeCochesIguales.containsKey(cochecito)) {
			mapDeCochesIguales.put(cochecito, mapDeCochesIguales.get(cochecito) + 1);
		} else {			
			mapDeCochesIguales.put(cochecito, 1);
		}
		return true;
	}
	
	private void introducirSetCoches(Coche cochecito) {
		setCochesAlmacenado.add(cochecito);
	}
	
	private boolean salirParking(Coche cochecito) {
		return listaDeCoches.remove(cochecito);
	}
	
	private void salirColorDelCoche(Coche cochecito) {
		if (mapDeColores.get(cochecito.getColor())- 1==0) {
			mapDeColores.remove(cochecito.getColor());
		} else {
			mapDeColores.put(cochecito.getColor(), mapDeColores.get(cochecito.getColor()) - 1);
		}
	}
	
	private void salirMarcaDelCoche(Coche cochecito) {
		if (mapDeMarcas.get(cochecito.getMarca())- 1==0) {
			mapDeMarcas.remove(cochecito.getMarca());
		} else {
			mapDeMarcas.put(cochecito.getMarca(), mapDeMarcas.get(cochecito.getMarca()) - 1);
		}
	}
	
	private void salirCochesIguales(Coche cochecito) {
		if (mapDeCochesIguales.get(cochecito)-1==0) {
			mapDeCochesIguales.remove(cochecito);
		} else {
			mapDeCochesIguales.put(cochecito, mapDeCochesIguales.get(cochecito)-1);
		}
	}
	
	private boolean salirCocheAlmacenado (Coche cochecito) {
		if(listaDeCoches.contains(cochecito)) {
			return false;
		}
		setCochesAlmacenado.remove(cochecito);
		return true;
	}
	
	private boolean parkingVacio(){
		return listaDeCoches.isEmpty() || listaDeCoches.size()==0;
	}
	
	
	/*ENTRA COCHE*/	
	public boolean entraCoche(Coche cochecito) {
       if (parkingLleno()) {
    	   return false;
       }
		
		for (Coche coche : listaDeCoches) { 
			if(cochecito==coche) {
				return false;
			}
		}
	
       //EN EL CASO DE QUE NO ESTE EN EL PARKING.           
    	listaDeCoches.add(cochecito);
       	introducirColorDelCoche(cochecito);
       	introducirMarcaDelCoche(cochecito);
       	introducirCochesIguales(cochecito);
       	introducirSetCoches(cochecito);       	 
       return true; 
	}
	
	/*SALE COCHE*/		
	public boolean saleCoche(Coche cochecito){		
		if(parkingVacio()){
			return false;
		}
		
		if(listaDeCoches.contains(cochecito)) {
			salirParking(cochecito); 
			salirColorDelCoche(cochecito);
			salirMarcaDelCoche(cochecito);
			salirCochesIguales(cochecito);
			salirCocheAlmacenado(cochecito);
			return true;
		}
		return false;
	}
	
	/*SALE COCHE ALEATORIO*/
	public boolean saleCocheAleatorio(){
		if(listaDeCoches.size()>=1){
			Random random = new Random();
			Coche eliminarCoche = listaDeCoches.remove(random.nextInt(listaDeCoches.size()));
			salirParking(eliminarCoche);
			salirColorDelCoche(eliminarCoche);
			salirMarcaDelCoche(eliminarCoche);
			salirCochesIguales(eliminarCoche);
			salirCocheAlmacenado(eliminarCoche);
			return true;			
		}
			return false;
	}
	
	/*VACIAR PARKIN*/
	public boolean vaciarParking(){
		if(parkingVacio()) {
			return false;
		}
		
		for (int i = listaDeCoches.size(); i > 0; i--) {
			Coche eliminarCoche = listaDeCoches.remove(i-1);				
			salirColorDelCoche(eliminarCoche);
			salirMarcaDelCoche(eliminarCoche);
			salirCochesIguales(eliminarCoche);
			salirCocheAlmacenado(eliminarCoche);
		}
		return true;
	}
	
	
	/*MOSTRAR*/
	public void reportParking(){
		System.out.printf("%nLISTADO COCHES%n");
		System.out.println("==============");
		System.out.printf("Parking: %s%n",nombre);
		
		for (Coche coche : listaDeCoches){
			System.out.printf("Coche: %s %s%n",coche.getMarca(),coche.getColor());
		}
		
		System.out.printf("Total coches: %d, ",listaDeCoches.size());
		System.out.printf("plazas libres: %d.%n",totalPlazas - listaDeCoches.size());
	}
	
	public void reportColores() {
		System.out.printf("%nREPORT DE COLORES%n");
		System.out.println("=================");
		System.out.printf("Parking: %s%n",nombre);
		
		for (Color coche : mapDeColores.keySet()){ 
			System.out.printf("El coche de color %s se repite %d %s.%n",
					coche.getNombreLargo(),mapDeColores.get(coche),mapDeColores.get(coche)==1? "vez":"veces");
		}
		
		System.out.printf("Total coches: %d.%n",listaDeCoches.size());
	}
	
	public void reportMarcas() {
		System.out.printf("%nREPORT DE MARCAS%n");
		System.out.println("=================");
		System.out.printf("Parking: %s%n",nombre);
		
		for (Marca coche : mapDeMarcas.keySet()){ 
			System.out.printf("El coche de marca %s se repite %d %s.%n",
					coche.getNombreLargoMarca(),mapDeMarcas.get(coche),mapDeMarcas.get(coche)==1? "vez":"veces");
		}
		
		System.out.printf("Total coches: %d.%n",listaDeCoches.size());
	}

	public void reportCochesIguales() { 
		System.out.printf("%nREPORT DE COCHES IGUALES%n");
		System.out.println("=================");
		System.out.printf("Parking: %s%n",nombre);
		
		for (Coche coche : mapDeCochesIguales.keySet()){ 
			System.out.printf("%s se repite %d %s.%n",
					coche, mapDeCochesIguales.get(coche),mapDeCochesIguales.get(coche)==1? "vez":"veces");
		}
		
		System.out.printf("Total coches: %d.%n",listaDeCoches.size());
	}
	
	public void reportCochesAlmacenar() { 
		System.out.printf("%nREPORT DE COCHES ALMACENADOS%n");
		System.out.println("=================");
		System.out.printf("Parking: %s%n",nombre);
		
		for (Coche coche : setCochesAlmacenado){
			System.out.printf("%s.%n",
					coche, coche.getMarca(),coche.getColor());
		}
		
		System.out.printf("Total items: %d.%n",setCochesAlmacenado.size());
	}
}

