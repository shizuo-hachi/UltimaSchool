public class CalculaSalario {
    public static void main(String[] args) {
        int limitebonus1 = 1500;
        double bonus1 = 0.03;
        double bonus2 = 0.05;
        double salario, vendas;

        salario = Float.parseFloat(args[0]);
        vendas = Float.parseFloat(args[1]);

        if(vendas <= limitebonus1){
            salario += vendas * bonus1;
        } else {
            salario += limitebonus1 * bonus1;
            vendas -= limitebonus1;

            salario += vendas * bonus2;
        }
        System.out.println("O salário final: " + salario);
    }
}
