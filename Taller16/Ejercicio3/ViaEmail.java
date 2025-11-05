package Ejercicio3;

public class ViaEmail implements ViaMensaje {
    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("Enviando EMAIL a: " + destinatario);
        System.out.println("Mensaje: " + mensaje);
    }
}

