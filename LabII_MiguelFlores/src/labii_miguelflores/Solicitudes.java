/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labii_miguelflores;

/**
 *
 * @author Miguel Flores
 */
public class Solicitudes {

    private String receptor;
    private String emisor;

    public Solicitudes(String receptor, String emisor) {
        this.receptor = receptor;
        this.emisor = emisor;
    }

    public Solicitudes() {
    }

    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    @Override
    public String toString() {
        return "Solicitudes{" + "" + receptor + " Desea ser amigo de: " + emisor + '}';
    }

}
