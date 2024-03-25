package org.example.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaminhaoBuilderTest {

    @Test
    void deveRetornarExcecaoParaCaminhaoSemPlaca() {
        try {
            CaminhaoBuilder caminhaoBuilder = new CaminhaoBuilder();
            Caminhao caminhao = caminhaoBuilder
                    .setChassi("Caminhao 1")
                    .setCor("Vermelho")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Numeração da Placa inválida", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaCaminhaoSemChassi() {
        try {
            CaminhaoBuilder caminhaoBuilder = new CaminhaoBuilder();
            Caminhao caminhao = caminhaoBuilder
                    .setPlaca("CAM-123")
                    .setCor("Vermelho")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Numeração do Chassi inválida", e.getMessage());
        }
    }

    @Test
    void deveRetornarCaminhaoValido() {
        CaminhaoBuilder caminhaoBuilder = new CaminhaoBuilder();
        Caminhao caminhao = caminhaoBuilder
                .setChassi("Caminhao 1")
                .setPlaca("CAM-123")
                .build();

        assertNotNull(caminhao);
    }

}
