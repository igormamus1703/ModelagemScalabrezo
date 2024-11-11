package composite.modelo;

import composite.modelo.Produtos.*;
import composite.modelo.Portfolio.*;
import composite.modelo.Universidade.*;

public class Main {
    public static void main(String[] args) {

        CategoriaRaiz CRaiz = new CategoriaRaiz("Categoria Raiz");

        Categoria comestivel = new Categoria("Comestível");

        Categoria diversos = new Categoria("Diversos");

        CategoriaFolha cereal = new CategoriaFolha("Cereal");
        cereal.adicionar(new Cereal("P1"));
        cereal.adicionar(new Cereal("P2"));
        cereal.adicionar(new Cereal("P3"));
        diversos.adicionar(cereal);

        CategoriaFolha bebida = new CategoriaFolha("Bebidas");
        bebida.adicionar(new Bebida("P4"));
        bebida.adicionar(new Bebida("P5"));
        bebida.adicionar(new Bebida("P6"));
        diversos.adicionar(bebida);

        comestivel.adicionar(diversos);

        Categoria proteinaAnimal = new Categoria("Proteína Animal");

        CategoriaFolha defumado = new CategoriaFolha("Defumado");
        defumado.adicionar(new Defumado("P7"));
        defumado.adicionar(new Defumado("P8"));
        defumado.adicionar(new Defumado("P9"));
        proteinaAnimal.adicionar(defumado);

        CategoriaFolha carne = new CategoriaFolha("Carne");
        carne.adicionar(new Carne("P10"));
        carne.adicionar(new Carne("P11"));
        carne.adicionar(new Carne("P12"));
        proteinaAnimal.adicionar(carne);

        comestivel.adicionar(proteinaAnimal);

        CRaiz.adicionar(comestivel);

        CategoriaFolha limpeza = new CategoriaFolha("Limpeza");

        limpeza.adicionar(new Limpeza("L1"));
        limpeza.adicionar(new Limpeza("L2"));
        limpeza.adicionar(new Limpeza("L3"));

        CRaiz.adicionar(limpeza);

        CRaiz.listar(0);

        // -----------------------------------------------------------------

        Portfolio pRaiz = new Portfolio("Portfolio");

        Projeto projeto1 = new Projeto("Projeto 1");

        Projeto subprojeto1 = new Projeto("Subprojeto 1.1");

        Atividade atividade1 = new Atividade("Atividade 1");
        Atividade atividade2 = new Atividade("Atividade 2");

        atividade1.adicionar(new Tarefa("T1"));
        atividade1.adicionar(new Tarefa("T2"));
        atividade1.adicionar(new Tarefa("T3"));

        atividade2.adicionar(new Tarefa("T4"));
        atividade2.adicionar(new Tarefa("T5"));
        atividade2.adicionar(new Tarefa("T6"));

        subprojeto1.adicionar(atividade1);
        subprojeto1.adicionar(atividade2);

        Projeto subprojeto2 = new Projeto("Subprojeto 1.2");

        Atividade atividade8 = new Atividade("Atividade 8");
        Atividade atividade9 = new Atividade("Atividade 9");

        atividade8.adicionar(new Tarefa("T7"));
        atividade8.adicionar(new Tarefa("T8"));
        atividade8.adicionar(new Tarefa("T9"));

        atividade9.adicionar(new Tarefa("T10"));
        atividade9.adicionar(new Tarefa("T11"));
        atividade9.adicionar(new Tarefa("T12"));

        subprojeto2.adicionar(atividade8);
        subprojeto2.adicionar(atividade9);

        projeto1.adicionar(subprojeto1);
        projeto1.adicionar(subprojeto2);

        ProjetoSimples projeto2 = new ProjetoSimples("Projeto 2");

        projeto2.adicionar(new Tarefa("TS1"));
        projeto2.adicionar(new Tarefa("TS2"));
        projeto2.adicionar(new Tarefa("TS3"));

        pRaiz.adicionar(projeto1);
        pRaiz.adicionar(projeto2);

        pRaiz.listar(0);

        //-------------------------------------------------------------

        Universidade universidade = new Universidade("Universidade");
        Campus curitiba = new Campus("Curitiba");

        Bloco azul = new Bloco("Bloco Azul");
        Bloco verde = new Bloco("Bloco Verde");

        Andar primeiro = new Andar("Primeiro andar");
        Andar segundo = new Andar("Segundo andar");

        primeiro.adicionar(new Corredor("P1"));
        primeiro.adicionar(new Sala("P2"));
        primeiro.adicionar(new Sala("P3"));

        segundo.adicionar(new Corredor("P4"));
        segundo.adicionar(new Sala("P5"));
        segundo.adicionar(new Laboratorio("P6"));

        azul.adicionar(primeiro);
        azul.adicionar(segundo);

        Andar terceiro = new Andar("Terceiro andar");
        Andar quarto = new Andar("Quarto andar");

        terceiro.adicionar(new Laboratorio("P7"));
        terceiro.adicionar(new Auditorio("P8"));
        terceiro.adicionar(new Cantina("P9"));

        quarto.adicionar(new Sala("P10"));
        quarto.adicionar(new Sala("P11"));
        quarto.adicionar(new Laboratorio("P12"));

        verde.adicionar(terceiro);
        verde.adicionar(quarto);

        curitiba.adicionar(azul);
        curitiba.adicionar(verde);

        Campus londrina = new Campus("Londrina");

        londrina.adicionar(new Auditorio("L1"));
        londrina.adicionar(new Sala("L2"));
        londrina.adicionar(new Laboratorio("L3"));

        universidade.adicionar(curitiba);
        universidade.adicionar(londrina);

        universidade.listar(0);
    }
}