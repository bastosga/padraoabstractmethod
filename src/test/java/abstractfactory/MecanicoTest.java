package abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MecanicoTest {

    @Test
    void deveEmitirCadastroCliente() {
        FabricaAbstrata fabrica = new FabricaCliente();
        Mecanico mecanico = new Mecanico(fabrica);
        assertEquals("Cliente Cadastrado", mecanico.emitirCadastro());
    }

    @Test
    void deveEmitirCadastroVeiculo() {
        FabricaAbstrata fabrica = new FabricaVeiculo();
        Mecanico mecanico = new Mecanico(fabrica);
        assertEquals("Veículo Cadastrado", mecanico.emitirCadastro());
    }

    @Test
    void deveEmitirHistoricoCliente() {
        FabricaAbstrata fabrica = new FabricaCliente();
       Mecanico mecanico = new Mecanico(fabrica);
        assertEquals("Histórico de Cliente", mecanico.emitirHistorico());
    }

    @Test
    void deveEmitirHistoricoVeiculo() {
        FabricaAbstrata fabrica = new FabricaVeiculo();
        Mecanico mecanico = new Mecanico(fabrica);
        assertEquals("Histórico de Veículo", mecanico.emitirHistorico());
    }

}