package abstractfactory;

public class Mecanico {

    private Cadastro Cadastro;
    private Historico historico;

    public Mecanico (FabricaAbstrata fabrica) {
        this.Cadastro = fabrica.createCadastro();
        this.historico = fabrica.createHistorico();
    }

    public String emitirCadastro() {
        return this.Cadastro.emitir();
    }

    public String emitirHistorico() {
        return this.historico.emitir();
    }
}
