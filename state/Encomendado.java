package state;

public class Encomendado implements Estado {

    @Override
    public String getNomeEstado() {
        return "Encomendado";
    }

    @Override
    public void proximaTransicao(Pedido pedido) {
        if (pedido.negativaChamado == 1){
            pedido.setEstado(new Cancelado());
        }else{
            pedido.setEstado(new Entregue());
        }
    }
}

