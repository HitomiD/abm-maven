package com.mycompany.abm;

import java.util.ArrayList;
import java.util.Scanner;
import com.grupo2.modelo.Documento;
import com.grupo2.modelo.Etiqueta;
import com.grupo2.modelo.Usuario;

public class ABM {

    public static ArrayList AltaDocumento(ArrayList documentos, Scanner in) {
        String nombreNuevo;
        int dia;
        int mes;
        int anio;
        String emisor;
        String descripcion;

        System.out.println("Ingrese el Nombre del Documento: ");
        nombreNuevo = in.nextLine();
        System.out.println("Ingrese el dia del Documento: ");
        dia = in.nextInt(); //ACA VA LA FECHA!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        System.out.println("Ingrese el mes del Documento: ");
        mes = in.nextInt(); //ACA VA LA FECHA!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        System.out.println("Ingrese el anio del Documento: ");
        anio = in.nextInt();
        System.out.println("Ingrese el Emisor del Documento: ");
        emisor = in.nextLine(); 
        System.out.println("Ingrese el Descripcion del Documento: ");
        descripcion = in.nextLine();
        
        Documento Nuevo = new Documento(nombreNuevo,emisor,descripcion);
        documentos.add(Nuevo);
        System.out.println("La carga se realizo con Exito");
        return documentos;
    } //Fin Alta Documento

    public static ArrayList AltaEtiqueta(ArrayList etiquetas, Scanner in) {
        Etiqueta Nuevo = new Etiqueta();
        System.out.println("Ingrese el Nombre de la Etiqueta: ");
        Nuevo.Nombre = in.next();
        System.out.println("Ingrese la Descripcion de la Etiqueta: ");
        Nuevo.Descripcion = in.next();
        etiquetas.add(Nuevo);
        System.out.println("La carga se realizo con Exito");
        return etiquetas;
    } //Fin Alta Documento

    public static ArrayList AltaUsuario(ArrayList Usuario, Scanner in) {
        Usuario Nuevo = new Usuario();
        System.out.println("Ingrese el Nombre del Usuario: ");
        Nuevo.Nombre = in.next();
        System.out.println("Ingrese el Apellido del Usuario: ");
        Nuevo.Apellido = in.next();
        System.out.println("Ingrese el Cargo del Usuario: ");
        Nuevo.Cargo = in.next();
        System.out.println("Ingrese el Email del Usuario: ");
        Nuevo.Email = in.next();
        Usuario.add(Nuevo);
        System.out.println("La carga se realizo con Exito");
        return Usuario;
    } //Fin Alta Usuario

    public static ArrayList BajaUsuario(ArrayList<Usuario> Usuario, Scanner in) {

        String respuesta;
        System.out.println("Ingrese el Email del Usuario a Eliminar: ");
        respuesta = in.next();

        for (int i = 0; i < Usuario.size(); i++) {
            if (Usuario.get(i).Nombre == respuesta) {
                Usuario.remove(i);
                System.out.println("Se ha eliminado con Exito");
            } //Fin IF
        }//Fin For
        return Usuario;
    }//Fin Baja Usuario

    public static ArrayList BajaEtiqueta(ArrayList<Etiqueta> Etiqueta, Scanner in) {

        String respuesta;
        System.out.println("Ingrese el Nombre de la Etiqueta a Eliminar: ");
        respuesta = in.next();

        for (int i = 0; i < Etiqueta.size(); i++) {
            if (Etiqueta.get(i).Nombre == respuesta) {
                Etiqueta.remove(i);
                System.out.println("Se ha eliminado con Exito");
            } //Fin IF
        }//Fin For
        return Etiqueta;
    }//Fin Baja Usuario  

    public static ArrayList BajaDocumento(ArrayList<Documento> Documento, Scanner in) {

        String respuesta;
        System.out.println("Ingrese el Nombre del Documento a Eliminar: ");
        respuesta = in.next();

        for (int i = 0; i < Documento.size(); i++) {
            if (Documento.get(i).Nombre == respuesta) {
                Documento.remove(i);
                System.out.println("Se ha eliminado con Exito");
            } //Fin IF
        }//Fin For
        return Documento;
    }//Fin Baja Usuario  

    public static ArrayList ListaDocumento(ArrayList<Documento> Documento) {
        for (int i = 0; i < Documento.size(); i++) {
            System.out.println("");
            System.out.println("Nombre: " + Documento.get(i).Nombre);
            System.out.println("Descripcion: " + Documento.get(i).Descripcion);
            System.out.println("Fecha: " + Documento.get(i).Fecha);
            System.out.println("Emisor: " + Documento.get(i).Emisor);
        }//Fin For
        return Documento;
    } //Fin Lista Documento

    public static ArrayList ListaEtiqueta(ArrayList<Etiqueta> Etiqueta) {
        for (int i = 0; i < Etiqueta.size(); i++) {
            System.out.println("");
            System.out.println("Nombre: " + Etiqueta.get(i).Nombre);
            System.out.println("Descripcion: " + Etiqueta.get(i).Descripcion);
        }//Fin For
        return Etiqueta;
    } //Fin Lista Documento

    public static ArrayList ListaUsuario(ArrayList<Usuario> Usuario) {
        for (int i = 0; i < Usuario.size(); i++) {
            System.out.println("");
            System.out.println("Nombre: " + Usuario.get(i).Nombre);
            System.out.println("Apellido: " + Usuario.get(i).Apellido);
            System.out.println("Cargo: " + Usuario.get(i).Cargo);
            System.out.println("Email: " + Usuario.get(i).Email);
        }//Fin For
        return Usuario;
    } //Fin Lista Documento

    public static ArrayList ModificarEtiqueta(ArrayList<Etiqueta> Etiqueta, Scanner in) {
        String respuesta;
        int respuesta2;

        boolean salir = false;
        System.out.println("Ingrese el Nombre de la Etiqueta: ");
        respuesta = in.next();

        for (int i = 0; i < Etiqueta.size(); i++) {
            while (salir == false) {
                if (Etiqueta.get(i).Nombre == respuesta) {
                    System.out.println("¿Que desea Modificar? \n1 -Nombre \n2 - Descripcion \n 3 - Salir ");
                    respuesta2 = in.nextInt();
                    switch (respuesta2) {
                        case 1:
                            System.out.println("Ingrese el nuevo Nombre: ");
                            Etiqueta.get(i).Nombre = in.next();
                            break;
                        case 2:
                            System.out.println("Ingese una nueva Descripcion: ");
                            Etiqueta.get(i).Descripcion = in.next();
                            break;
                        case 3:
                            salir = true;
                            break;
                    }//Fin Case
                }//Fin IF
            } //Fin While
        } //Fin For
        return Etiqueta;
    } //Fin Modifica

    public static ArrayList ModificarDocumento(ArrayList<Documento> Documento, Scanner in) {
        String respuesta;
        int respuesta2;
        boolean salir = false;
        System.out.println("Ingrese el Nombre del Documento que desea modificar: ");
        respuesta = in.next();

        for (int i = 0; i < Documento.size(); i++) {
            while (salir == false) {
                if (Documento.get(i).Nombre == respuesta) {
                    System.out.println("¿Que desea Modificar? \n1 -Nombre \n2 - Descripcion \n3 - Fecha \n4 - Emisor \n 5 - Salir ");
                    respuesta2 = in.nextInt();
                    switch (respuesta2) {
                        case 1:
                            System.out.println("Ingrese el nuevo Nombre: ");
                            Documento.get(i).Nombre = in.next();
                            break;
                        case 2:
                            System.out.println("Ingese una Descripcion: ");
                            Documento.get(i).Descripcion = in.next();
                            break;
                        case 3:
                            System.out.println("Ingrese una nueva Fecha: ");
                            Documento.get(i).Fecha = in.next();
                            break;
                        case 4:
                            System.out.println("Ingrese el nuevo Emisor: ");
                            Documento.get(i).Emisor = in.next();
                            break;
                        case 5:
                            salir = true;
                            break;
                    }//Fin Case
                }//Fin IF
            } //Fin While
        } //Fin For
        return Documento;
    } //Fin Modificar

    public static ArrayList ModificarUsuario(ArrayList<Usuario> Usuario, Scanner in) {
        String respuesta;
        int respuesta2;
        boolean salir = false;
        System.out.println("Ingrese el Correo Electronico desea Modificar: ");
        respuesta = in.next();

        for (int i = 0; i < Usuario.size(); i++) {
            while (salir == false) {
                if (Usuario.get(i).Email == respuesta) {
                    System.out.println("¿Que desea Modificar? \n1 -Nombre \n2 - Apellido \n3 - Correo electronico  \n4 - Cargo \n 5 - Salir ");
                    respuesta2 = in.nextInt();
                    switch (respuesta2) {
                        case 1:
                            System.out.println("Ingrese el nuevo Nombre: ");
                            Usuario.get(i).Nombre = in.next();
                            break;
                        case 2:
                            System.out.println("Ingese el nuevo Apellido: ");
                            Usuario.get(i).Apellido = in.next();
                            break;
                        case 3:
                            System.out.println("Ingrese una nueva direccion de correo electronico: ");
                            Usuario.get(i).Email = in.next();
                            break;
                        case 4:
                            System.out.println("Ingrese un nuevo puesto o cargo: ");
                            Usuario.get(i).Cargo = in.next();
                            break;
                        case 5:
                            salir = true;
                            break;
                    }//Fin Case
                }//Fin IF
            } //Fin While
        } //Fin For
        return Usuario;
    } //Fin Modificar

} //Fin Programa

