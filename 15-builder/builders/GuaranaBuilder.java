
public class GuaranaBuilder extends LancheBuilder {

    @Override
    public void buildNome() {
        item.nome = "guaraná";
    }

    @Override
    public void buildPreco() {
        item.preco = 5.0;
    }

    @Override
    public void buildDentroDaCaixa() {
        item.dentroDaCaixa = false;
    }
    
}
