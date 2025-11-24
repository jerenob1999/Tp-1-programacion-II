/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml;

/**
 *
 * @author jerem
 */
public class FirmaDigital {
    private String codigoHash;
    private String fecha;
    private UsuarioDocumento usuario; // agregación

    public FirmaDigital(String codigoHash, String fecha, UsuarioDocumento usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }
}
