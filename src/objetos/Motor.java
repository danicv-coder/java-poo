package objetos;

public class Motor {
	private double cilindrado;
	private TipoMotor tipo;

	public Motor() {
	}

	public Motor(double cilindrado, TipoMotor tipo) {
		super();
		this.cilindrado = cilindrado;
		this.tipo = tipo;
	}

	public double getCilindrado() {
		return cilindrado;
	}

	public void setCilindrado(double cilindrado) {
		this.cilindrado = cilindrado;
	}

	public TipoMotor getTipo() {
		return tipo;
	}

	public void setTipo(TipoMotor tipo) {
		this.tipo = tipo;
	}
	
}
