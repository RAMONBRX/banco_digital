package banco_digital;

public class ContaCorrente extends Conta {

    public ContaCorrente(String cliente) {
        super(cliente);
    }

    @Override
    public void verificaSaldo() {
        System.out.println("=== Saldo Conta Corrente ===");
        super.ConsultaInfoComuns();
    }
}
