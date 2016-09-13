
public abstract class YogurtDecorator extends Yogurt {
    Yogurt yogurt;

    public YogurtDecorator(Yogurt umYogurt){
        this.yogurt = umYogurt;
    }

    @Override
    public double getPreco() {
        return yogurt.getPreco() + preco;
    }

    @Override
    public String getNome() {
        return yogurt.getNome() + " + " + nome;
    }
}
