package state;

public class Cotado implements Estado {

    @Override
    public String getNomeEstado() {
        return "Cotado";
    }

    @Override
    public void proximaTransicao(Pedido pedido) {
        pedido.setEstado(new Encomendado());
    }
}

