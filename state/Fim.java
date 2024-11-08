package state;

public class Fim implements Estado {

    @Override
    public String getNomeEstado() {
        return "FIM";
    }

    @Override
    public void proximaTransicao(Pedido pedido) {
        // Não faz nada, é o estado final
    }
}

