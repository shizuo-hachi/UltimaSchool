package Modulo2.Banco;

public class TestaBanco {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("André", 123465 ,"professor");

        System.out.println("Cliente 1 criado: \n" + cliente1);

        System.out.println("Testa setters: ");
        cliente1.setNome("Daniel");
        cliente1.setCpf(987654);
        cliente1.setProfissao("Geógrafo");

        System.out.println("Setters: ok");

        System.out.println("Testa getters: ");

        System.out.println(cliente1.getNome()+ ", "+ cliente1.getCpf()+", " + cliente1.getProfissao());

        System.out.println("Testa Conta: ");

        Conta conta1 = new Conta(100, 1234, 5555, cliente1);
        System.out.println(conta1);

    }
}
