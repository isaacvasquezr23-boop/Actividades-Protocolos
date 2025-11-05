package Ejercicio3;


public class ViaPush implements ViaMensaje {
     @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("🔔 Enviando notificación PUSH a: " + destinatario);
        System.out.println("Mensaje: " + mensaje);
    }
}

