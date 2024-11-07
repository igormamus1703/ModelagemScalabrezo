package composite.modelo;

public class Produto extends Folha {

    public Produto(String nome) {
        super(nome);
    }

    @Override
    public void listar(int nivel) {
        super.tabular(nivel);
        System.out.println("Produto: " + this.nome);
    }
}
