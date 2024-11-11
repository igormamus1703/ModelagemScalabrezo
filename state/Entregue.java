package state;

public class Entregue implements Estado{

    @Override
    public String getNomeEstado() {
        return "Entregue";
    }

    @Override
    public void proximaTransicao(Pedido pedido) {
        pedido.setEstado(new Faturado());
    }
}
