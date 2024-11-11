package interpretador.prefixada;

import java.util.ArrayList;

public class Fatorial extends Operador {

    public Fatorial(ArrayList<Expressao> elemento) {
        super(elemento);
    }

    @Override
    public char simbolo() {
        return '!';
    }

    @Override
    public double resolva() {
        if (this.elemento.size() != 1) {
            throw new IllegalArgumentException("Fatorial requer exatamente um operando");
        }
        double valor = this.elemento.get(0).resolva();
        if (valor < 0 || valor != Math.floor(valor)) {
            throw new IllegalArgumentException("Fatorial é definido apenas para inteiros não negativos");
        }
        return fatorial((int) valor);
    }

    private double fatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }
}
