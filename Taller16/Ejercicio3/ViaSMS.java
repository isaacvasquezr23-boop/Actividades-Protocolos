package Ejercicio3;

public class ViaSMS implements ViaMensaje {
    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("Enviando SMS a: " + destinatario);
        System.out.println("Mensaje: " + mensaje);
    }
}

