package state;

public class Solicitado implements Estado {

    @Override
    public String getNomeEstado() {
        return "Solicitado";
    }

    @Override
    public void proximaTransicao(Pedido pedido) {
        pedido.setEstado(new Cotado());
    }
}

