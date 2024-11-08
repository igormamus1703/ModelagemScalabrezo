package state;

public class Encomendado implements Estado {

    @Override
    public String getNomeEstado() {
        return "Encomendado";
    }

    @Override
    public void proximaTransicao(Pedido pedido) {
        pedido.setEstado(new Faturado());
    }
}

