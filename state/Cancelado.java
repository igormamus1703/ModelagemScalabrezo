package state;

public class Cancelado implements Estado{
    @Override
    public String getNomeEstado() {
        return "Cancelado";
    }

    @Override
    public void proximaTransicao(Pedido pedido) {
        pedido.setEstado(new Arquivado());
    }
}
