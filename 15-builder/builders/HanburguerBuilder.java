
public class HanburguerBuilder extends LancheBuilder {

    @Override
    public void buildNome() {
        item.nome = "hambúrguer";
    }

    @Override
    public void buildPreco() {
        item.preco = 10.0;
    }

    @Override
    public void buildDentroDaCaixa() {
        item.dentroDaCaixa = true;
    }

}
