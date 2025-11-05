package Ejercicio2;

public class Documento {
   private String contenido;
    private ExportadorDocumento exportador;

    public Documento(String contenido, ExportadorDocumento exportador) {
        this.contenido = contenido;
        this.exportador = exportador;
    }

    public void exportar() {
        exportador.exportar(contenido);
    }
}

