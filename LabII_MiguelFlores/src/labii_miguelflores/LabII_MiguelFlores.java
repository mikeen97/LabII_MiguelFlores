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
                                    ListSolicitudes.add(new Solicitudes(t1.getNombre(), nombreDelUsuario));
                                    JOptionPane.showMessageDialog(null, "Se envio solicitud exitosamente!");
                                }
                                contador++;
                            }
                            /*
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
                                    ListSolicitudes.add(new Solicitudes(t1.getNombre(), nombreDelUsuario));
                                }
                                contador++;
                            }
                             */
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
                            /*
                            String p1 = "";
                            int contador_solucitudes = 0;
                            for (Solicitudes t1 : ListSolicitudes) {
                                if (t1 instanceof Solicitudes) {
                                    if (t1.getReceptor().equalsIgnoreCase(nombreDelUsuario)) {
                                        p1 += ListSolicitudes.indexOf(t1) + " " + ((Solicitudes) t1) + "\n";
                                        contador_solucitudes++;
                                    }
                                }
                            }
                            JOptionPane.showMessageDialog(null, p1);
                            int posicion_solicitud = Integer.parseInt(
                                    JOptionPane.showInputDialog("Ingrese la posicion de la solicitud que desea aceptar o rechazar."));
                            int aceptar = Integer.parseInt(
                                    JOptionPane.showInputDialog("Si desea aceptar la solicitud presione 1, para rechazar precione 0."));
                            int contador_aceptarOrechazar = 0;
                            for (Solicitudes t1 : ListSolicitudes) {
                                String emisor = t1.getEmisor();
                                String receptor = t1.getReceptor();
                                if (posicion_solicitud == contador_solucitudes) {
                                    if (aceptar == 1) {
                                        for (Usuario m : ListUsuarios) {
                                            if (m.getNombre().equals(emisor)) {
                                                m.setListAmigos(receptor);
                                                ListSolicitudes.remove(posicion_solicitud);
                                                JOptionPane.showMessageDialog(null, "Se acepto la solicitud de amistad");
                                            }
                                            if (m.getNombre().equals(receptor)) {
                                                m.setListAmigos(emisor);
                                                ListSolicitudes.remove(posicion_solicitud);
                                                JOptionPane.showMessageDialog(null, "Se rechazo la solicitud de amistad");
                                            }
                                        }
                                    }
                                    if (aceptar == 0) {
                                        ListSolicitudes.remove(posicion_solicitud);
                                    }
                                }
                            }   
                             */
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
