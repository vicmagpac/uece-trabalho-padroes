
public class BatataMediaBuilder extends LancheBuilder {

    @Override
    public void buildNome() {
        item.nome = "batata média";
    }

    @Override
    public void buildPreco() {
        item.preco = 6.0;
    }

    @Override
    public void buildDentroDaCaixa() {
        item.dentroDaCaixa = true;
    }
    
}
