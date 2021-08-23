package objetos;

public enum TipoAutomovil {
 SUBCOMPACTO("Subcompacto", "auto mediano", 4),
 FAMILIAR("familiar", "auto grande", 4),
 SEDAN("sedan", "auto mediano", 2),
 BERLINA("berlina", "auto grande", 4),
 DESCAPOTABLE("descapotable", "Auto mediano", 2),
 COUPE("coupe", "auto chico", 2),
 COVERTIBLE("convertible", "auto grande", 2);
 
 private final String nombre;
 private final int numPuertas;
 private final String descripcion;
 
private TipoAutomovil(String nombre, String descripcion,  int numPuertas) {
	this.nombre = nombre;
	this.numPuertas = numPuertas;
	this.descripcion = descripcion;
	
	
}

public String getNombre() {
	return nombre;
}

public int getNumPuertas() {
	return numPuertas;
}

public String getDescripcion() {
	return descripcion;
}
 
}
