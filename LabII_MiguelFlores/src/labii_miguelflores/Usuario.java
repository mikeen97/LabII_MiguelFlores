/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labii_miguelflores;

import java.util.ArrayList;

/**
 *
 * @author Miguel Flores
 */
public class Usuario {

    private String nombre;
    private int edad;
    private String lugarNacimiento;
    private String Username;
    private String Contrasena;
    private ArrayList<String> ListAmigos = new ArrayList();
    private ArrayList<Solicitudes> ListSolicitudes = new ArrayList();
    private ArrayList<Object> ListMensajesEnviados = new ArrayList();
    private ArrayList<Object> ListBuzonEntrada = new ArrayList();

    public Usuario() {
    }

    public Usuario(String nombre, int edad, String lugarNacimiento, String Username, String Contrasena) {
        this.nombre = nombre;
        this.edad = edad;
        this.lugarNacimiento = lugarNacimiento;
        this.Username = Username;
        this.Contrasena = Contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }

    public ArrayList getListAmigos() {
        return ListAmigos;
    }

    public void setListAmigos(String x) {
        ListAmigos.add(x);
    }

    public ArrayList getListSolicitudes() {
        return ListSolicitudes;
    }

    public void setListSolicitudes(Solicitudes x) {
        ListSolicitudes.add(x);
    }

    public ArrayList getListMensajesEnviados() {
        return ListMensajesEnviados;
    }

    public void setListMensajesEnviados(String x) {
        ListMensajesEnviados.add(x);
    }

    public ArrayList getListBuzonEntrada() {
        return ListBuzonEntrada;
    }

    public void setListBuzonEntrada(ArrayList ListBuzonEntrada) {
        this.ListBuzonEntrada = ListBuzonEntrada;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
