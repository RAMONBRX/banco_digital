package banco_digital;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(String cliente) {
        super(cliente);
    }

    @Override
    public void verificaSaldo() {
        System.out.println("=== Saldo Conta Poupanca ===");
        super.ConsultaInfoComuns();
    }

}
