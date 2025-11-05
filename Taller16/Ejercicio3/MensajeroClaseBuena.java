package Ejercicio3;

public class MensajeroClaseBuena {
     private ViaMensaje canal;

    public MensajeroClaseBuena(ViaMensaje canal) {
        this.canal = canal;
    }

    public void enviarMensaje(String destinatario, String mensaje) {
        canal.enviar(destinatario, mensaje);
    }
}


