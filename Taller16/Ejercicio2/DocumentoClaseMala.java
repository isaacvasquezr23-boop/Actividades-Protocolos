/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 
package Ejercicio2;

public class DocumentoClaseMala {
    private String contenido;

    public DocumentoClaseMala(String contenido) {
        this.contenido = contenido;
    }

    public void exportarAPDF() {
        System.out.println("Exportando el documento a formato PDF...");
        System.out.println("Contenido: " + contenido);
    }
} 

 public class Main {
    public static void main(String[] args) {
        Documento doc = new Documento("Informe mensual de ventas");
        doc.exportarAPDF();
    }
}
    
   Salida esperada:
Exportando el documento a formato PDF...
Contenido: Informe mensual de ventas
*/