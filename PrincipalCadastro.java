public class PrincipalCadastro {
    public static void main(String[] args) {

        CadastroPagamento cadastro = new CadastroPagamento(10);

        cadastro.adicionar(new Pix("Ana", 150.00, "ana@pix"));
        cadastro.adicionar(new Boleto("Carlos", 200.00, "34191.12345.67890"));
        cadastro.adicionar(new CartaoCredito("João", 100.00, 3)); // 3 parcelas

        System.out.println("=== PAGAMENTOS CADASTRADOS ===");
        cadastro.imprimirPagamentos();

        System.out.println("\nTOTAL GERAL: R$ " + cadastro.calcularTotal());
    }
}
