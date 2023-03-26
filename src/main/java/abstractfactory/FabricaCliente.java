package abstractfactory;

public class FabricaCliente implements FabricaAbstrata {

    @Override
    public Cadastro createCadastro() {
        return new CadastroCliente();
    }

    @Override
    public Historico createHistorico() {
        return new HistoricoCliente();
    }
}
