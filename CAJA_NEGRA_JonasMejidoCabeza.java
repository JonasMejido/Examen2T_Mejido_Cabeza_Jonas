package examenSegundoTrimestre;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CAJA_NEGRA_JonasMejidoCabeza {

//Compañia con nombre invalido
	@Test
	void testDepartamentoSinNombre() {
		Departamento dep = new Departamento("", 100);
		assertEquals("El nombre es invalido",dep);
	}
//Compañia con presupuesto invalido
	@Test
	void testDepartamentoPresupuesto() {
		Departamento dep = new Departamento("Dep1", -100);
		assertEquals("El presupuesto no puede ser negativo",dep);
	}

//Un pedido con un monto invalido (lo pongo negativo porque para que sea inválido debe ser menor que el presupuesto así que si es negativo si o si será menor)
	@Test
	void testProcesarPedido() {
		Departamento dep = new Departamento("Dep1", 100);
		boolean resultado= dep.procesarPedido(-100);
		assertEquals("El monto es invalido",resultado);
	}
//Un instituto con capacidad invalida
	@Test
	void testInstituto() {
		Instituto ins = new Instituto (-100);
		assertEquals("El instituto no puede tener capacidad negativa",ins);

	}
//Agregar un departamento cuyo nombre sea invalido
	@Test
	void testAgregarDepartamentoSinNombre() {
		Instituto ins = new Instituto (100);
		ins.agregarDepartamento("", 100);
		assertEquals ("Nombre del departamento invalido",ins);

	}
//Agregar un departamento cuyo presupuesto sea invalido
		@Test
		void testAgregarDepartamentoPresupuesto() {
			Instituto ins = new Instituto (100);
			ins.agregarDepartamento("Dep1", -100);
			assertEquals ("Presupuesto del departamento invalido",ins);

		}
//Realizar un pedido cuya compañia no tenga nombre
	@Test
	void testRealizarPedidoSinNombre() {
		Instituto ins = new Instituto (100);
		boolean resultado= ins.realizarPedido("",100);
		assertEquals ("Nombre de departamento inválido", resultado);
	}
	//Realizar un pedido cuyo monto sea inválido (lo pongo negativo porque para que sea inválido debe ser menor que el presupuesto así que si es negativo si o si será menor)
		@Test
		void testRealizarPedidoSinMonto() {
			Instituto ins = new Instituto (100);
			boolean resultado= ins.realizarPedido("Compañia1",-100);
			assertEquals ("El monto indicado es invalido", resultado);
		}

}
