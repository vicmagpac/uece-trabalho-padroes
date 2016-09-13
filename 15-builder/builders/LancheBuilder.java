
public abstract class LancheBuilder {
    protected ItemProduct item = new ItemProduct();
    public abstract void buildPreco();
    public abstract void buildDentroDaCaixa();
    public abstract void buildNome();
    public ItemProduct getItem(){
        return item;
    };
}
