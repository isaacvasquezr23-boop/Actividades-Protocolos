package Ejercicio3;

public class Prueba {
    public static void main(String[] args) {
        MensajeroClaseBuena email = new MensajeroClaseBuena(new ViaEmail());
        MensajeroClaseBuena sms = new MensajeroClaseBuena(new ViaSMS());
        MensajeroClaseBuena push = new MensajeroClaseBuena(new ViaPush());

        email.enviarMensaje("isaac@example.com", "Tu pedido fue enviado");
        sms.enviarMensaje("+57 3201234567", "Tu código de verificación es 8429");
        push.enviarMensaje("Isaac Vásquez", "Tienes una nueva notificación");
    }
}

