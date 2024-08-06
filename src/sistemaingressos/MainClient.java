package sistemaingressos;

import sistemaingressos.Model.Evento;
import sistemaingressos.Model.Ingresso;
import sistemaingressos.Model.Local;
import sistemaingressos.Model.Portador;

public class MainClient {
    public static void main(String[] args) {
        Portador portador = new Portador("123.123.123.02", "Felipe", "(28)9998312899");
        Local local = new Local("São paulo", "SP", "Avenida Paulista, 1230", "4º andar Shopping Cidade SUC");
        Ingresso ingresso = new Ingresso("12", 15.00F, true, 3.0F, portador);
        Evento evento = new Evento(2, "Cinema", "Noturno", 100, local, new Ingresso[]{ingresso});


        System.out.println(evento);
        System.out.println(local);
        System.out.println(portador);

        System.out.println("Valor do ingresso é: " + ingresso.calculaValorIngresso());
    }
}
