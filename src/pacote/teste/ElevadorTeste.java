package pacote.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.fiap.Elevador;

public class ElevadorTeste {

	Elevador elev = new Elevador();
	
	@Test
	public void Entrar60() {
		assertEquals(elev.entrarNoElevador(60),60, 0);
	}
	
	@Test
	public void Entrar70() {
		assertEquals(elev.entrarNoElevador(70),70, 0);
	}
	
	@Test
	public void Sair80() {
		elev.setCargaAtual(50);
		assertEquals(elev.sairDoElevador(80), 80, 0);
	}
	
	@Test
	public void Sair90() {
		elev.setCargaAtual(50);
		assertEquals(elev.sairDoElevador(90), 90, 0);
	}
	
	@Test
	public void Alerta() {
		assertEquals(elev.avaliarPeso(200), true);
	}

}
