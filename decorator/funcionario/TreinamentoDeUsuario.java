package decorator.funcionario;

public class TreinamentoDeUsuario extends DecoradorDeAtividade {

    public TreinamentoDeUsuario(double nh, double vh) {
        super("Treinamento de Usuário", nh, vh);
    }

    @Override
    public double calculaSalario() {
        return (this.numeroDeHoras * this.valorHora) + this.componente.calculaSalario();
    }
}
