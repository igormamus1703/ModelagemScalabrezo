package state;

public class Faturado implements Estado {

    @Override
    public String getNomeEstado() {
        return "Faturado";
    }

    @Override
    public void proximaTransicao(Pedido pedido) {
        pedido.setEstado(new Pago());
    }
}

