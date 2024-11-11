package state;

public class Arquivado implements Estado {

    @Override
    public String getNomeEstado() {
        return "Arquivado";
    }

    @Override
    public void proximaTransicao(Pedido pedido) {
        // Não faz nada, é o estado final
    }
}

