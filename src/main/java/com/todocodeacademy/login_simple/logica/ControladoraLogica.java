
package com.todocodeacademy.login_simple.logica;

import com.todocodeacademy.login_simple.persistencia.ControladoraPersistencia;
import java.util.List;


public class ControladoraLogica {
    
    ControladoraPersistencia controlPersis;

    public ControladoraLogica() {
    controlPersis = new ControladoraPersistencia();
    
    }
        
    public String validarUsuario(String usuario, String contrasenia) {
        
        String mensaje="";
        List<Usuario> listaUsuarios = controlPersis.traerUsuarios();
        
        for(Usuario usu: listaUsuarios){
             if(usu.getNombreUsuario().equals(usuario)){
                if(usu.getContrasenia().equals(contrasenia)){
                mensaje = "Usuario y contraseña correctos";
                return mensaje;
                
               }
                else{mensaje="Contraseña incorrecta";
                     return mensaje;}
            }
            else {mensaje = "Usuario no encontrado";}
                  
        }
        
        return mensaje;
        
    }
    
}
