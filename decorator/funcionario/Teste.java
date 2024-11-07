
package decorator.funcionario;

public class Teste
{
    public static void execute()
    {
        Componente pedroMes11 = new Funcionario("Pedro", "Silva");
        Componente a1, a2, a3, a4, a5;
        try{
            a1 = new AnalistaDeSistema(80f, 40f);
            a1.aponta( pedroMes11 );
            a2 = new ArquitetoDeSoftware(20F, 50F);
            a2.aponta( a1 );
            a3 = new AnalistaDeSistema(40F, 40F);
            a3.aponta( a2 );
            a4 = new ArquitetoDeSoftware(20F, 50F);
            a4.aponta( a3 );
            a5 = new TestadorDeSoftware(20F, 30F);
            a5.aponta( a4 );
            
            double salario = a5.calculaSalario();
            System.out.println(a5.toString());
            System.out.println("Salario: "+a5.calculaSalario());
   
            /*     
            Funcionario: Pedro Silva
            :- Atividade executada: Analista de sistema
              [Numero de horas = 80.0, Valor hora = 40.0] = 3200.0
            :- Atividade executada: Arquiteto de software
              [Numero de horas = 20.0, Valor hora = 50.0] = 1000.0
            :- Atividade executada: Analista de sistema
               [Numero de horas = 40.0, Valor hora = 40.0] = 1600.0
            :- Atividade executada: Arquiteto de software
               [Numero de horas = 20.0, Valor hora = 50.0] = 1000.0
            :- Atividade executada: Testador de Software
               [Numero de horas = 20.0, Valor hora = 30.0] = 600.0
            Salario: 7400.00
            */           
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("\n--------------------------------\n");

        // Cenário 1: João
        Componente joao = new Funcionario("João", "Silva");
        Componente b1, b2, b3;
        try{
            b1 = new Programador(80f, 20f);
            b1.aponta( joao );
            b2 = new Implantador(40f, 40f);
            b2.aponta( b1 );
            b3 = new TreinamentoDeUsuario(60f, 40f);
            b3.aponta( b2 );

            double salarioJoao = b3.calculaSalario();
            System.out.println("Detalhes das atividades de João:");
            System.out.println(b3.toString());
            System.out.println("Salário de João: R$ " + salarioJoao);

        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("\n--------------------------------\n");

        // Cenário 2: Maria
        Componente maria = new Funcionario("Maria", "Oliveira");
        Componente c1, c2, c3;
        try{
            c1 = new AnalistaDeSistema(90f, 30f);
            c1.aponta( maria );
            c2 = new TestadorDeSoftware(20f, 40f);
            c2.aponta( c1 );
            c3 = new Programador(70f, 20f);
            c3.aponta( c2 );

            double salarioMaria = c3.calculaSalario();
            System.out.println("Detalhes das atividades de Maria:");
            System.out.println(c3.toString());
            System.out.println("Salário de Maria: R$ " + salarioMaria);

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void main(String [] args){
        
        Teste.execute();
        
    }
}