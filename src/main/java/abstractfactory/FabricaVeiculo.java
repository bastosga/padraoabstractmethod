package abstractfactory;

public class FabricaVeiculo implements FabricaAbstrata {

    @Override
    public Cadastro createCadastro() {
        return new CadastroVeiculo();
    }

    @Override
    public Historico createHistorico() {
        return new HistoricoVeiculo();
    }
}
