package examenSegundoTrimestre;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class INTEGRACION_JonasMejidoCabeza {
//Solamente testearemos los métodos que relacionan ambas clases para comprobar si todo se integra correctamente
	

	@Test
	void testAgregarDepartamento() {
		Departamento dep = new Departamento ("Dep1", 100);
		Instituto ins = new Instituto (100);
		ins.agregarDepartamento("Dep1",100);
		assertTrue(ins.realizarPedido("Dep1", 80));
		//Uso el metodo de agregar un departamento para agregarlo al array de departamentos de la clase instituto, seguidamente uso el de realizarpedido ya que para realizarlo debes indicar un departamento que ya exista, por tanto si el departamento que agregamos antes existe y se ha agregado correctamente debería ir bien
		
	}
	
	@Test
	void testProcesarPedido() {
		Departamento dep = new Departamento ("Dep1", 100);
		assertTrue(dep.procesarPedido(80));
		//Si el departamento creado anteriormente se ha creado correctamente, no debería de dar problema puesto que el presupuesto es superior al monto
		
	}
}
