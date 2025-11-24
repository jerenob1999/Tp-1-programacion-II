/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml;

/**
 *
 * @author jerem
 */
public class GeneradorQR {

    public void generar(String valor, UsuarioQR usuario) { // dependencia de creación
        CodigoQR qr = new CodigoQR(valor, usuario);
        System.out.println("QR generado!");
    }
}
