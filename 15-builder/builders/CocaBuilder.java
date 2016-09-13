
public class CocaBuilder extends LancheBuilder {

    @Override
    public void buildNome() {
        item.nome = "coca";
    }

    @Override
    public void buildPreco() {
        item.preco = 4.0;
    }

    @Override
    public void buildDentroDaCaixa() {
        item.dentroDaCaixa = false;
    }
    
}
