package state;

public class Pedido {
    private Estado estadoAtual;
    public int negativaChamado = 0;

    public Pedido() {
        // O pedido começa no estado Solicitado
        this.estadoAtual = new Solicitado();
    }

    public String solicita() {
        return estadoAtual.getNomeEstado();
    }

    public String cotacao() {
        if (estadoAtual instanceof Solicitado) {
            estadoAtual.proximaTransicao(this);
        } else {
            throw new IllegalStateException("Transição inválida");
        }
        return estadoAtual.getNomeEstado();
    }

    public String encomenda() {
        if (estadoAtual instanceof Cotado) {
            estadoAtual.proximaTransicao(this);
        } else {
            throw new IllegalStateException("Transição inválida");
        }
        return estadoAtual.getNomeEstado();
    }

    public String entrega() {
        if (estadoAtual instanceof Encomendado) {
            estadoAtual.proximaTransicao(this);
        } else {
            throw new IllegalStateException("Transição inválida");
        }
        return estadoAtual.getNomeEstado();
    }

    public String fatura() {
        if (estadoAtual instanceof Entregue) {
            estadoAtual.proximaTransicao(this);
        } else {
            throw new IllegalStateException("Transição inválida");
        }
        return estadoAtual.getNomeEstado();
    }

    public String paga() {
        if (estadoAtual instanceof Faturado) {
            estadoAtual.proximaTransicao(this);
        } else {
            throw new IllegalStateException("Transição inválida");
        }
        return estadoAtual.getNomeEstado();
    }

    public String arquiva() {
        if (estadoAtual instanceof Pago || estadoAtual instanceof Cancelado || estadoAtual instanceof Rejeitado || estadoAtual instanceof Faturado) {
            estadoAtual.proximaTransicao(this);
        } else {
            throw new IllegalStateException("Transição inválida");
        }
        return estadoAtual.getNomeEstado();
    }

    //Estados de negação

    public String rejeita() {
        negativaChamado = 1;
        if (estadoAtual instanceof Cotado) {
            estadoAtual.proximaTransicao(this);
        } else {
            throw new IllegalStateException("Transição inválida");
        }
        return estadoAtual.getNomeEstado();
    }

    public String cancela() {
        negativaChamado = 1;
        if (estadoAtual instanceof Encomendado) {
            estadoAtual.proximaTransicao(this);
        } else {
            throw new IllegalStateException("Transição inválida");
        }
        return estadoAtual.getNomeEstado();
    }

    public void setEstado(Estado novoEstado) {
        this.estadoAtual = novoEstado;
    }
}
