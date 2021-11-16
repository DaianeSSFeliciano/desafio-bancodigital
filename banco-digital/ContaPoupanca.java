public class ContaPoupanca extends Conta{

    private static int SEQUENCIAL = 1;

    public void contaPoupanca() {

        super.agencia = Conta.AGENCIA_PADRAO;
        super.numero = SEQUENCIAL++;
    }

}
