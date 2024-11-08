package state;

public class Pago implements Estado {

    @Override
    public String getNomeEstado() {
        return "Pago";
    }

    @Override
    public void proximaTransicao(Pedido pedido) {
        pedido.setEstado(new Fim());
    }
}

