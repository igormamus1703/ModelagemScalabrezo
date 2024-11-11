package state;

public class Rejeitado implements Estado{

    @Override
    public String getNomeEstado() {
        return "Rejeitado";
    }

    @Override
    public void proximaTransicao(Pedido pedido) {
        pedido.setEstado(new Arquivado());
    }
}
