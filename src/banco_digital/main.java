package banco_digital;

public class main {
    public static void main(String[] args) {

        Conta cc = new ContaCorrente("Ramon");
        cc.depositar(1000);

        Conta poupanca = new ContaPoupanca("Ramon");

        cc.transferir(100,poupanca);

       cc.verificaSaldo();
       poupanca.verificaSaldo();


    }

}
