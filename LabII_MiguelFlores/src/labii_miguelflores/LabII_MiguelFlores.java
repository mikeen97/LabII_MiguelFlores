/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labii_miguelflores;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel Flores
 */
public class LabII_MiguelFlores {

    public static void main(String[] args) {
        ArrayList<Usuario> ListUsuarios = new ArrayList();
        ArrayList<Solicitudes> ListSolicitudes = new ArrayList();
        String estado = "";
        String opcion = "";
        while (!opcion.equalsIgnoreCase("f")) {
            opcion = JOptionPane.showInputDialog("Menu\n"
                    + "a- Agregar Usuario \n"
                    + "b- Eliminar Usuario\n"
                    + "c- Listar Usuario\n"
                    + "d- Modificar Usuario\n"
                    + "e- Entrar a cuenta personal\n"
                    + "f- Salir \n");
            if (opcion.equals("a")) {
                String nombre = "", lugarNacimiento = "", username = "", contrasena = "";
                int edad = 0;
                nombre = JOptionPane.showInputDialog("Ingrese el nombre del usuario");
                edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad del usuario"));
                lugarNacimiento = JOptionPane.showInputDialog("Ingrese lugar de nacimiento del usuario");
                username = JOptionPane.showInputDialog("Ingrese el usuario de la persona");
                contrasena = JOptionPane.showInputDialog("Ingrese el contraseña de la persona");
                ListUsuarios.add(new Usuario(nombre, edad, lugarNacimiento, username, contrasena));
            }
            if (opcion.equals("b")) {
                int p = Integer.parseInt(
                        JOptionPane.showInputDialog("Posicion de Usuarioa Eliminar"));
                ListUsuarios.remove(p);
            }
            if (opcion.equals("c")) {
                String p1 = "";
                for (Usuario t1 : ListUsuarios) {
                    if (t1 instanceof Usuario) {
                        p1 += ListUsuarios.indexOf(t1) + " " + ((Usuario) t1) + "\n";
                    }
                }
                JOptionPane.showMessageDialog(null, p1);
            }
            if (opcion.equals("d")) {
                int pos = Integer.parseInt(
                        JOptionPane.showInputDialog("Ingrese la Posicion del Soldado a modificar: "));
                String nombre = "", lugarNacimiento = "", username = "", contrasena = "";
                int edad = 0;
                nombre = JOptionPane.showInputDialog("Ingrese el nombre del usuario");
                edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad del usuario"));
                lugarNacimiento = JOptionPane.showInputDialog("Ingrese lugar de nacimiento del usuario");
                username = JOptionPane.showInputDialog("Ingrese el usuario de la persona");
                contrasena = JOptionPane.showInputDialog("Ingrese el contraseña de la persona");
                ListUsuarios.get(pos).setNombre(nombre);
                ListUsuarios.get(pos).setEdad(edad);
                ListUsuarios.get(pos).setLugarNacimiento(lugarNacimiento);
                ListUsuarios.get(pos).setUsername(username);
                ListUsuarios.get(pos).setContrasena(contrasena);
            }
            if (opcion.equals("e")) {
                String user = JOptionPane.showInputDialog("Ingrese su usuario: ");
                String contra = JOptionPane.showInputDialog("Ingrese su contrasena: ");
                String nombreDelUsuario = "";
                boolean confirmacion = false;
                for (Usuario t1 : ListUsuarios) {
                    if (t1.getUsername().equalsIgnoreCase(user) && t1.getContrasena().equalsIgnoreCase(contra)) {
                        confirmacion = true;
                        nombreDelUsuario = t1.getNombre();
                        break;
                    }
                }
                if (confirmacion == true) {
                    String opcion2 = "";
                    while (!opcion2.equalsIgnoreCase("e")) {
                        opcion2 = JOptionPane.showInputDialog("Menu\n"
                                + "a- Agregar Amigo \n"
                                + "b- Solicitud de amistades recibidas\n"
                                + "c- Enviar Mensaje\n"
                                + "d- Buzon de entrada \n"
                                + "e- Salir a MENU PRINCIPAL\n");
                        if (opcion2.equals("a")) {
                            String p1 = "";
                            for (Usuario t1 : ListUsuarios) {
                                if (t1 instanceof Usuario) {
                                    p1 += ListUsuarios.indexOf(t1) + " " + ((Usuario) t1) + "\n";
                                }
                            }
                            JOptionPane.showMessageDialog(null, p1);
                            int posicion_solicitud = Integer.parseInt(
                                    JOptionPane.showInputDialog("Ingrese la posicion del usuario al que le desea enviar la solicitud"));
                            int contador = 0;
                            for (Usuario t1 : ListUsuarios) {
                                if (contador == posicion_solicitud) {
                                    t1.setListSolicitudes(new Solicitudes(t1.getNombre(), nombreDelUsuario));
                                    JOptionPane.showMessageDialog(null, "Se envio solicitud exitosamente!");
                                }
                                contador++;
                            }

                        }
                        if (opcion2.equals("b")) {
                            for (Usuario t1 : ListUsuarios) {
                                String p1 = "";
                                if (t1.getUsername().equalsIgnoreCase(user)) {
                                    for (Object m : t1.getListSolicitudes()) {
                                        if (t1 instanceof Usuario) {
                                            p1 += ListSolicitudes.indexOf(m) + " " + ((Solicitudes) m) + "\n";
                                        }
                                    }
                                    JOptionPane.showMessageDialog(null, p1);
                                }
                            }
                            int pos_solicitud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion de la solicitud"));
                            int confirmar = Integer.parseInt(JOptionPane.showInputDialog("Si desea aceptarla ingrese 1, de lo contrario ingrese 0"));
                            int contador = 0;
                            for (Usuario t1 : ListUsuarios) {
                                if (t1.equals(user)) {
                                    for (Object m : t1.getListSolicitudes()) {
                                        String amigo = ((Solicitudes) m).getEmisor();
                                        if (confirmar == 1) {
                                            ListSolicitudes.remove(confirmar);
                                            t1.setListAmigos(amigo);
                                            JOptionPane.showMessageDialog(null, "Se agrego la solicitud exitosamente!");
                                        }
                                        if (confirmar == 0) {
                                            ListSolicitudes.remove(confirmar);
                                            JOptionPane.showMessageDialog(null, "Se rechazo la solicitud exitosamente!");
                                        }
                                        contador++;
                                    }
                                }
                            }
                        }
                        if (opcion2.equals("c")) {

                        }
                        if (opcion2.equals("d")) {

                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contrasena incorrecta. INTENTE DE NUEVO");
                }
            }
        }
    }
}
