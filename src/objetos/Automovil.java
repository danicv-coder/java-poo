package objetos;

public class Automovil implements Comparable {
	// Atributos del objeto o estado del objeto
	private int id;
	private String nombre;
	private String modelo;
	private String color;
	private String placa;
	private Persona1 conductor;
	private Motor motor;
	private Tanque estanque;
	private Rueda[] ruedas;
	private int indiceRueda;
	private static int ultimoId;
	private TipoAutomovil tipo;
	public static final int VELOCIDA_MAXIMA = 120;

	// Construtores
	public Automovil() {
		this.id = ++ultimoId;
		this.ruedas = new Rueda[5];
	}
	
	public Automovil(String nombre, String modelo) {
		this.nombre = nombre;
		this.modelo = modelo;
	}

	public Automovil(String nombre, String modelo, String color, String placa, Persona1 conductor, Motor motor,
			Tanque estanque, Rueda ruedas) {
		this();
		this.nombre = nombre;
		this.modelo = modelo;
		this.color = color;
		this.placa = placa;
		this.conductor = conductor;
		this.motor = motor;
		this.estanque = estanque;

	}

	// metodos get y set
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Persona1 getConductor() {
		return conductor;
	}

	public void setConductor(Persona1 conductor) {
		this.conductor = conductor;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Tanque getEstanque() {
		return estanque;
	}

	public void setEstanque(Tanque estanque) {
		this.estanque = estanque;
	}

	public Rueda[] getRuedas() {
		return ruedas;
	}

	public void setRuedas(Rueda[] ruedas) {
		this.ruedas = ruedas;
	}

	public TipoAutomovil getTipo() {
		return tipo;
	}

	public void setTipo(TipoAutomovil tipo) {
		this.tipo = tipo;
	}

	// Metodos
	public String detalle() {

//		StringBuilder parrafo = new StringBuilder();
//		parrafo.append("\n Auto:".concat(this.nombre));
//		parrafo.append("\n Modelo:".concat(this.modelo));
//		parrafo.append("\n Color:".concat(this.color));
//		parrafo.append("\n Placa:".concat(this.placa));

		return "\nConductor:" + conductor + "\n AutoId: " + this.id + "\n Auto: = " + this.nombre + "\n Modelo: = "
				+ this.modelo + "\n Motor:" + this.motor.getCilindrado() + "\n Color: = " + this.color + "\n Placa: = "
				+ this.placa;

	}

	public String acelerar(int kmh) {
		return "El auto " + this.nombre + " " + this.modelo + " " + "esta acelerando a " + kmh + "km/h";
	}

	public String frenar() {
		return "El auto " + this.nombre + " " + this.modelo + " " + "frenando";
	}

	public String acelerarFrenar(int kmh) {
		return this.acelerar(kmh) + "\n" + this.frenar();
	}

	// Principio de sobre carga de metodos
	public float calcularConsumo(int kmh, double consumoGasolina) {

		return (float) (kmh / (consumoGasolina * this.estanque.getCapacidad()));
	}

	public String detalleConsumoGasolina(int kmh, double ConsumoGasolina) {
		return "\nkilometro por litro del auto " + this.nombre + " " + this.modelo + ": "
				+ this.calcularConsumo(kmh, ConsumoGasolina);
	}

	public float calcularConsumo(int kmh, int consumoGasolina) {

		return kmh / (consumoGasolina * (this.estanque.getCapacidad() / 100f));
	}

	public String detalleConsumoGasolina(int kmh, int consumoGasolina) {
		return "\nkilometro por litro del auto " + this.nombre + " " + this.modelo + ": "
				+ this.calcularConsumo(kmh, consumoGasolina);
	}

	public void addRuerda(Rueda rueda) {
		if (indiceRueda < this.ruedas.length) {
			this.ruedas[indiceRueda++] = rueda;

		}
	}

	@Override
	public boolean equals(Object obj) {

		if (!(obj instanceof Automovil)) {
			return false;
		}

		if (this.modelo != null || this.nombre != null) {
			Automovil a = (Automovil) obj;
			return (this.modelo.equals(a.getModelo()) && this.nombre.equals(a.getNombre()));
		}
		return false;

	}

	@Override
	public String toString() {
		return nombre + " - " + modelo;
	}

	@Override
	public int compareTo(Object o) {
		Automovil a = (Automovil) o ;
		return this.nombre.compareTo(a.nombre);
	}
	
	

}
