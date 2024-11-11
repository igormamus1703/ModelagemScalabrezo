package state;

public class Cotado implements Estado {

    @Override
    public String getNomeEstado() {
        return "Cotado";
    }

    @Override
    public void proximaTransicao(Pedido pedido) {
        if (pedido.negativaChamado == 1){
            pedido.setEstado(new Rejeitado());
        }else{
            pedido.setEstado(new Encomendado());
        }
    }
}

