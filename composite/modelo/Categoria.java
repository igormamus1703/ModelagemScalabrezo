package composite.modelo;

public class Categoria extends Composicao {

    public Categoria(String nome) {
        super(nome);
    }

    @Override
    public void listar(int nivel) {
        super.tabular(nivel);
        System.out.println("Categoria: " + this.nome);
        for (Elemento e : this.elemento) {
            e.listar(nivel + 1);
        }
    }
}
