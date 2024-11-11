package state;

public class Faturado implements Estado {

    @Override
    public String getNomeEstado() {
        return "Faturado";
    }

    @Override
    public void proximaTransicao(Pedido pedido) {
        if (pedido.negativaChamado == 1){
            pedido.setEstado(new Pago());
        }else{
            pedido.setEstado(new Arquivado());
        }
    }
}

