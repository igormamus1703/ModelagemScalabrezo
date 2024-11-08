package state;

public class TesteState {
	public static void main(String[] args) {
        // Cria um novo pedido, começando no estado "Solicitado"
        Pedido p1 = new Pedido();

        // Solicita o pedido (retorna "Solicitado")
        String str = p1.solicita();
        System.out.println("p1-Estado : " + str); // Mostra "p1-Estado : Solicitado"

        // Cotação do pedido (transita para "Cotado")
        str = p1.cotacao();
        System.out.println("p1-Estado : " + str); // Mostra "p1-Estado : Cotado"

        // Realiza a encomenda (transita para "Encomendado")
        str = p1.encomenda();
        System.out.println("p1-Estado : " + str); // Mostra "p1-Estado : Encomendado"

        // Realiza a entrega (transita para "Faturado")
        str = p1.entrega();
        System.out.println("p1-Estado : " + str); // Mostra "p1-Estado : Faturado"

        // Realiza o pagamento (transita para "Pago")
        str = p1.paga();
        System.out.println("p1-Estado : " + str); // Mostra "p1-Estado : Pago"

        // Arquiva o pedido (transita para "FIM")
        str = p1.arquiva();
        System.out.println("p1-Estado : " + str); // Mostra "p1-Estado : FIM"
    }
}
