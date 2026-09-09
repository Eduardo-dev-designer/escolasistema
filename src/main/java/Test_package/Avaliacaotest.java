package Test_package;

import model.Avaliacao;
import  org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Avaliacaotest {


@Test
public void testValidarNota() {
    Avaliacao avaliacao = new Avaliacao();

    assertTrue(avaliacao.validarNota(7));
    assertTrue(avaliacao.validarNota(0));
    assertTrue(avaliacao.validarNota(10));
    assertFalse(avaliacao.validarNota(-1));
    assertFalse(avaliacao.validarNota(11));
}

@Test
public void testValidarFrequencia() {
    Avaliacao avaliacao = new Avaliacao();

    assertTrue(avaliacao.validarFrequencia(75));
    assertTrue(avaliacao.validarFrequencia(100));
    assertTrue(avaliacao.validarFrequencia(0));
    assertFalse(avaliacao.validarFrequencia(-1));
    assertFalse(avaliacao.validarFrequencia(101));
}

@Test
public void testCalcularMedia() {
    Avaliacao avaliacao = new Avaliacao();

    double resultado = avaliacao.calcularMedia(8, 6);

    assertEquals(7, resultado);
}

@Test
public void testFrequenciaMinima() {
    Avaliacao avaliacao = new Avaliacao();

    assertTrue(avaliacao.possuiFrequenciaMinima(75));
    assertTrue(avaliacao.possuiFrequenciaMinima(80));
    assertFalse(avaliacao.possuiFrequenciaMinima(74));
}

@Test
public void testAprovado() {
    Avaliacao avaliacao = new Avaliacao();

    String resultado = avaliacao.verificarSituacao(7, 75);

    assertEquals("APROVADO", resultado);
}

@Test
public void testRecuperacao() {
    Avaliacao avaliacao = new Avaliacao();

    String resultado = avaliacao.verificarSituacao(6, 75);

    assertEquals("RECUPERAÇÃO", resultado);
}

@Test
public void testReprovado() {
    Avaliacao avaliacao = new Avaliacao();

    String resultado = avaliacao.verificarSituacao(4, 75);

    assertEquals("REPROVADO", resultado);
}

@Test
public void testReprovadoPorFrequencia() {
    Avaliacao avaliacao = new Avaliacao();

    String resultado = avaliacao.verificarSituacao(9, 74);

    assertEquals("REPROVADO POR FREQUÊNCIA", resultado);
}


}
