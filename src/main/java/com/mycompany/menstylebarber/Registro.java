
package com.mycompany.menstylebarber;

import java.util.*;
public class Registro {
    //Se crea el atributo para desplegar las opciones de registro.
    int opc;
    List<Persona> Registros = new ArrayList<>();
    opc = JOptionPane.showInputDialog("¿Cómo desea registrarse? \n 1.Cliente \n 2.Barbero");
    switch (opc){
        case 1:
            registrarCliente();
        case 2:
            registrarBarbero();   
    }
    public void registrarBarbero(Barbero barbero){
        
    }
    public void registrarUsuario(Cliente cliente){
        
    }
}
