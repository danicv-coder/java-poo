package objetos;

import java.lang.reflect.Array;
import java.util.Arrays;

public class EjemploAutoStatic {

	public static void main(String[] args) {
		// Auto Nissan skyline
		Persona1 nissanConductor = new Persona1("Daniel", "Calderon");
		Motor nissanMotor = new Motor(4.0, TipoMotor.BENCINA);
		Tanque nissanTanque = new Tanque();
		Automovil nissan = new Automovil("Nissan", "Skyline", "Azul", "AB16Z89", nissanConductor, nissanMotor,
				nissanTanque, null);
		nissan.setTipo(TipoAutomovil.COVERTIBLE);
		Rueda[] nissanRuedas = new Rueda[5];
		for (int i = 0; i < nissanRuedas.length; i++) {

			nissan.addRuerda(new Rueda("Yokahama", 17, 7.5));
		}

//		nissan.setRuedas(nissanRuedas);

		// Auto Toyota supra
		Persona1 toyotaConductor = new Persona1("Reyner", "Finol");
		Motor toyotaMotor = new Motor(3.0, TipoMotor.DIESEL);
		Tanque toyotaTanque = new Tanque(30);
		Automovil toyota = new Automovil("Toyota", "Supra", "naranja", "BC238X6", toyotaConductor, toyotaMotor,
				toyotaTanque, null);
		Rueda[] toyotaRuedas = new Rueda[5];
		for (int i = 0; i < toyotaRuedas.length; i++) {
			toyota.addRuerda(new Rueda("Pirelli", 16, 6.5));
		}
//		toyota.setRuedas(toyotaRuedas);

//		Automovil auto1 = new Automovil("Nissan", "Skyline", "Azul", "AB16Z89", new Motor(3.0, TipoMotor.DIESEL), new Tanque(),);
//		Automovil auto2 = new Automovil();
		TipoAutomovil tipoNissan = nissan.getTipo();

		String modelo = new String();
//		System.out.println(auto.detalle());
//		System.out.println(auto.acelerar(150));
//		System.out.println(auto.frenar());
		System.out.println(nissan.detalle());

		for (Rueda r : nissan.getRuedas()) {
			System.out.println(
					"Fabricante:" + r.getFabricante() + " " + "Aro:" + r.getAro() + " " + "Ancho:" + r.getAncho());
		}

		System.out.println("Velocida maxima: " + Automovil.VELOCIDA_MAXIMA);
		System.out.println(tipoNissan);

		// auto mazda
		Automovil mazda = new Automovil("Rx", "Mazda");
		System.out.println(mazda);

//		System.out.println("Son iguales? " + (nissan == toyota));
//		System.out.println("Son iguales con equal? " + (nissan.equals(auto1)));
//		System.out.println("Son iguales con equal? " + (nissan.equals(auto1)));
//		System.out.println("Son iguales con equal? " + (nissan.equals(modelo)));

		// Principio de encapsulamientp
		System.out.println(nissan.detalleConsumoGasolina(300, 0.6));
		System.out.println(nissan.detalleConsumoGasolina(300, 60));

		System.out.println(toyota.detalle());
		for (Rueda r : toyota.getRuedas()) {
			System.out.println(
					"Fabricante:" + r.getFabricante() + " " + "Aro:" + r.getAro() + " " + "Ancho:" + r.getAncho());

		}

		// Principio de encapsulamientp
		System.out.println(toyota.detalleConsumoGasolina(300, 0.6));
		System.out.println(toyota.detalleConsumoGasolina(300, 60));
		System.out.println("");
		System.out.println("");

		switch (tipoNissan) {

		case COVERTIBLE ->

			System.out.println("El auto movil es deportivo y descapotable de dospuertas");

		case SUBCOMPACTO ->

			System.out.println("El auto movil es pequeño de dos puertas y tipicamente deportivo");

		case FAMILIAR ->

			System.out.println("El auto movil grande comodo para una familia");

		case SEDAN ->

			System.out.println("El auto movil mediano");

		case BERLINA ->

			System.out.println("El auto movil mediano compacto, mediante deportivo");

		case DESCAPOTABLE ->

			System.out.println("El auto movil es deportivo y decapotable");

		case COUPE ->

			System.out.println("El auto movil es pequeño de dos puertas para dos personas");

		}

		TipoAutomovil[] tipos = TipoAutomovil.values();
		for (TipoAutomovil ta : tipos) {
			System.out.println("");
			System.out.println(ta + "=>" + ta.name() + "," + ta.getNombre() + ", " + ta.getDescripcion() + ", "
					+ ta.getNumPuertas());
			System.out.println();
		}

		Automovil[] autos = new Automovil[3];
		autos[0] = toyota;
		autos[1] = nissan;
		autos[2] = mazda;

		Arrays.sort(autos);
		for (Automovil a : autos) {
			System.out.println(a);
		}
	}

}
