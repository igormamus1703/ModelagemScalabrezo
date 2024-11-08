package state;

public interface Estado {
    String getNomeEstado();
    void proximaTransicao(Pedido pedido);
}

