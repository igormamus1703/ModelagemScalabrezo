package state;

public class Pedido {
    private Estado estadoAtual;

    public Pedido() {
        // O pedido começa no estado Solicitado
        this.estadoAtual = new Solicitado();
    }

    public String solicita() {
        // Retorna o nome do estado atual
        return estadoAtual.getNomeEstado();
    }

    public String cotacao() {
        // Transita para o próximo estado e retorna o nome do novo estado
        estadoAtual.proximaTransicao(this);
        return estadoAtual.getNomeEstado();
    }

    public String encomenda() {
        // Transita para o próximo estado e retorna o nome do novo estado
        estadoAtual.proximaTransicao(this);
        return estadoAtual.getNomeEstado();
    }

    public String entrega() {
        // Transita para o próximo estado e retorna o nome do novo estado
        estadoAtual.proximaTransicao(this);
        return estadoAtual.getNomeEstado();
    }

    public String paga() {
        // Transita para o próximo estado e retorna o nome do novo estado
        estadoAtual.proximaTransicao(this);
        return estadoAtual.getNomeEstado();
    }

    public String arquiva() {
        // Transita para o próximo estado e retorna o nome do novo estado
        estadoAtual.proximaTransicao(this);
        return estadoAtual.getNomeEstado();
    }

    public void setEstado(Estado novoEstado) {
        // Define o novo estado
        this.estadoAtual = novoEstado;
    }
}

