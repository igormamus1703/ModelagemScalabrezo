package interpretador.prefixada;

import java.util.ArrayList;

public class Teste
{
    public static void execute() {
        ArrayList<Expressao> programa = new ArrayList<Expressao>();
    
        // Constantes e variáveis
        Expressao n = new Constante(10.0);
        programa.add(n);
    
        Expressao c1 = new Constante(20.0);
        programa.add(c1);
    
        Expressao c2 = new Constante(40.0);
        programa.add(c2);
    
        Expressao v1 = new Variavel("v1", 10.0);
        programa.add(v1);
    
        Expressao v2 = new Variavel("v2", 100.0);
        programa.add(v2);
    
        // fat = (! n)
        ArrayList<Expressao> lf = new ArrayList<>();
        lf.add(n);
        Expressao fat = new Fatorial(lf);
        programa.add(fat);
    
        // a = (+ c1 v1 fat)
        ArrayList<Expressao> la = new ArrayList<>();
        la.add(c1);
        la.add(v1);
        la.add(fat);
        Expressao a = new Adicao(la);
        programa.add(a);
    
        // s = (- (+ c1 v1) v1)
        ArrayList<Expressao> ls1 = new ArrayList<>();
        ls1.add(c1);
        ls1.add(v1);
        Expressao soma = new Adicao(ls1);
    
        ArrayList<Expressao> ls = new ArrayList<>();
        ls.add(soma);
        ls.add(v1);
        Expressao s = new Subtracao(ls);
        programa.add(s);
    
        // d = (/ (- (+ c1 v1) v1) (+ c1 v1))
        ArrayList<Expressao> ld1 = new ArrayList<>();
        ld1.add(c1);
        ld1.add(v1);
        Expressao somaD = new Adicao(ld1);
    
        ArrayList<Expressao> ld2 = new ArrayList<>();
        ld2.add(somaD);
        ld2.add(v1);
        Expressao subD = new Subtracao(ld2);
    
        ArrayList<Expressao> ld = new ArrayList<>();
        ld.add(subD);
        ld.add(somaD);
        Expressao d = new Divisao(ld);
        programa.add(d);
    
        // m = (* (+ c1 v1) (- (+ c1 v1) v1))
        ArrayList<Expressao> lm1 = new ArrayList<>();
        lm1.add(c1);
        lm1.add(v1);
        Expressao somaM = new Adicao(lm1);
    
        ArrayList<Expressao> lm2 = new ArrayList<>();
        lm2.add(somaM);
        lm2.add(v1);
        Expressao subM = new Subtracao(lm2);
    
        ArrayList<Expressao> lm = new ArrayList<>();
        lm.add(somaM);
        lm.add(subM);
        Expressao m = new Multiplicacao(lm);
        programa.add(m);
    
        // Exibir as expressões e seus resultados
        for (Expressao p : programa) {
            System.out.println(p.toString() + " = " + p.resolva());
        }
    }    
    
    public static void main(String [] args){
        Teste.execute();
    }

}