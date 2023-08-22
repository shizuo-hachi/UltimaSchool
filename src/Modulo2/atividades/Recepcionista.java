package Modulo2.atividades;

public class Recepcionista {
    public static void main(String[] args) {
        String entrada = args[0];
        double horaEvento = 18.5;
       boolean ehNumero = entrada.matches("\\-?\\d+(\\.\\d+)?");
       double horaCliente = -1.0;
        double horaLimiteMinimoPermitido = horaEvento - 0.4;
        double horaLimiteMaximoPermitido = horaEvento + 0.4;
        if(ehNumero){
            horaCliente = Double.parseDouble(entrada);
            if (horaCliente < 0){
                System.out.println("Entrada não permitida.");
            } else if (horaCliente == horaEvento){
                System.out.println("Entrada permitida");
            } else if (horaCliente >= horaLimiteMinimoPermitido && horaCliente <= horaLimiteMaximoPermitido){
                System.out.println("Entrada permitida");
            } else if (horaCliente > horaLimiteMaximoPermitido){
                System.out.println("Entrada não permitida");
            }  else if (horaCliente < horaLimiteMinimoPermitido){
                System.out.println("Entrada não permitida");
            }
        } else {
            System.out.println("Entrada não permitida, o valor é inválido. Valor: " + entrada);
        }
        System.out.println("horaLimiteMinimoPermitido = " + horaLimiteMinimoPermitido);
        System.out.println("horaLimiteMaximoPermitido = " + horaLimiteMaximoPermitido);
        System.out.println("Entrada do usuário: " + entrada);


    }
}
