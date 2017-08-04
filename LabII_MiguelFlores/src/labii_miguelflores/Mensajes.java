/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labii_miguelflores;

import java.util.Date;

/**
 *
 * @author Miguel Flores
 */
public class Mensajes {
    private String emisor;
    private String receptor;
    private Date fecha;
    private String mensaje;

    public Mensajes(String emisor, String receptor, Date fecha, String mensaje) {
        this.emisor = emisor;
        this.receptor = receptor;
        this.fecha = fecha;
        this.mensaje = mensaje;
    }

    public Mensajes() {
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "Mensajes{" + "Enviado por: " + emisor + "  mensaje: " + mensaje + '}';
    }
    
    

}
