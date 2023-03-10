public class Recepcionista {
    public static void main(String[] args) {
        String entrada = args[0];
        double horaEvento = 18.5;
        double horaCliente = Double.parseDouble(entrada);

        double horaLimiteMinimoPermitido = horaEvento - 0.4;
        double horaLimiteMaximoPermitido = horaEvento + 0.4;

        if (horaCliente < 0){
            System.out.println("Endtrada não permitida.");
        } else if (horaCliente == horaEvento){
            System.out.println("Entrada permitida");
        } else if (horaCliente >= horaLimiteMinimoPermitido && horaCliente <= horaLimiteMaximoPermitido){
            System.out.println("Entrada permitida");
        } else if (horaCliente > horaLimiteMaximoPermitido){
            System.out.println();
        }


    }
}
