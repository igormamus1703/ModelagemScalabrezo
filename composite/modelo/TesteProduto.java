package composite.modelo;

public class TesteProduto {

    public static void main(String[] args) {
        try {
            Categoria eletronicos = new Categoria("Eletrônicos");
            Categoria informatica = new Categoria("Informática");
            Categoria smartphones = new Categoria("Smartphones");

            Produto tv = new Produto("TV");
            Produto notebook = new Produto("Notebook");
            Produto iphone = new Produto("iPhone");
            Produto galaxy = new Produto("Galaxy");

            eletronicos.adicionar(tv);
            eletronicos.adicionar(informatica);

            informatica.adicionar(notebook);
            informatica.adicionar(smartphones);

            smartphones.adicionar(iphone);
            smartphones.adicionar(galaxy);

            eletronicos.listar(0);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
