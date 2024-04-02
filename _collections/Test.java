package _collections;

public class Test {
	public static void main(String[] args) {
		Coche coche1 = new Coche (Color.AZ, Marca.SE);
		System.out.println(coche1);
		Coche coche2 = new Coche (Color.IN, Marca.HO);
		System.out.println(coche2); 
		Coche coche3 = new Coche (Color.IN, Marca.HO);
		System.out.println(coche3); 
		
		System.out.printf("%nMARCA Y COLOR DEL COCHE ALEATORIAMENTE:%n***************************************%n");
		Coche coche5 = new Coche ();
		System.out.println(coche5); 
		
		System.out.printf("%n--------------------------------------------------------------------%n");
		Parking parking1 = new Parking("Presión", 10);		
		
		//PROBAR ENTRACOCHE		
		/*parking1.reportParking();
		parking1.entraCoche(coche2);
		parking1.entraCoche(coche1);
		parking1.reportParking();*/
		
		//PROBAR SALE COCHE
		/*parking1.reportParking();
		parking1.entraCoche(coche2);
		parking1.reportParking();
		parking1.saleCoche(coche2);
		parking1.reportParking();*/
		
		//PROBAR SALE COCHE ALEATORIO
		/*parking1.reportParking();
		parking1.entraCoche(coche2);
		parking1.entraCoche(coche5);
		parking1.reportParking();
		parking1.saleCocheAleatorio();
		parking1.reportParking();*/
		
		//PROBAR VACIAR PARKING
		/*parking1.reportParking();
		parking1.entraCoche(coche2);
		parking1.entraCoche(coche5);
		parking1.reportParking();
		parking1.vaciarParking();
		parking1.reportParking();*/
		
		/*CON COLOR*/
		//PROBAR ENTRACOCHE
		/*parking1.reportColores();
		parking1.entraCoche(coche2);
		parking1.entraCoche(coche1);
		parking1.reportColores();*/
		
		//PROBAR SALE COCHE
		/*parking1.entraCoche(coche2);
		parking1.entraCoche(coche1);
		parking1.reportColores();
		parking1.saleCoche(coche1);
		parking1.reportColores();*/
		
		//PROBAR SALE COCHE ALEATORIO 
		/*parking1.entraCoche(coche2);
		parking1.entraCoche(coche1);
		parking1.reportColores();
		parking1.saleCocheAleatorio();
		parking1.reportColores();*/
		
		//PROBAR VACIAR PARKING
		/*parking1.entraCoche(coche2);
		parking1.entraCoche(coche1);
		parking1.reportColores();
		parking1.vaciarParking();
		parking1.reportColores();*/
		
		/*CON MARCA*/
		//PROBAR ENTRACOCHE
		/*parking1.reportMarcas();
		parking1.entraCoche(coche2);
		parking1.entraCoche(coche1);
		parking1.reportMarcas();*/
		
		//PROBAR SALE COCHE
		/*parking1.entraCoche(coche2);
		parking1.entraCoche(coche1);
		parking1.reportMarcas();
		parking1.saleCoche(coche2);
		parking1.reportMarcas();*/
		
		//PROBAR SALE COCHE ALEATORIO 
		/*parking1.entraCoche(coche2);
		parking1.entraCoche(coche1);
		parking1.reportMarcas();
		parking1.saleCocheAleatorio();
		parking1.reportMarcas();*/
		
		//PROBAR VACIAR PARKING
		/*parking1.entraCoche(coche2);
		parking1.entraCoche(coche1);
		parking1.reportMarcas();
		parking1.vaciarParking();
		parking1.reportMarcas();*/	
		
		/*COCHES IGUALES*/
		//PROBAR ENTRA COCHE
		/*parking1.reportCochesIguales();
		parking1.entraCoche(coche2);
		parking1.entraCoche(coche1);
		parking1.entraCoche(coche3);
		parking1.reportCochesIguales();*/
		
		//PROBAR SALE COCHE
		/*parking1.entraCoche(coche2);
		parking1.entraCoche(coche1);
		parking1.entraCoche(coche3);
		parking1.reportCochesIguales();
		parking1.saleCoche(coche1);
		parking1.reportCochesIguales();*/
		
		//PROBAR SALE COCHE ALEATORIO
		/*parking1.entraCoche(coche2);
		parking1.entraCoche(coche1);
		parking1.entraCoche(coche3);
		parking1.reportCochesIguales();
		parking1.saleCocheAleatorio();
		parking1.reportCochesIguales();*/
		
		//PROBAR VACIAR PARKING
		/*parking1.entraCoche(coche2);
		parking1.entraCoche(coche1);
		parking1.entraCoche(coche3);
		parking1.reportCochesIguales();
		parking1.vaciarParking();
		parking1.reportCochesIguales();*/
		
		
		/**/
		//PROBAR ENTRA COCHE
		/*parking1.entraCoche(coche2);
		parking1.entraCoche(coche1);
		parking1.entraCoche(coche3);
		parking1.reportCochesAlmacenar();*/
		
		//PROBAR SALE COCHE
		/**/parking1.entraCoche(coche2);
		parking1.entraCoche(coche3);
		parking1.entraCoche(coche1);
		parking1.reportCochesAlmacenar();		
		parking1.saleCoche(coche2);
		parking1.reportCochesAlmacenar();
		
		//PROBAR SALE COCHE ALEATORIO
		/*parking1.entraCoche(coche2);
		parking1.entraCoche(coche1);
		parking1.saleCocheAleatorio();
		parking1.reportCochesAlmacenar();*/
		
		//PROBAR VACIAR PARKING
		/*parking1.entraCoche(coche2);
		parking1.entraCoche(coche1);
		parking1.reportCochesAlmacenar();
		parking1.vaciarParking();
		parking1.reportCochesAlmacenar();*/
	}
}
