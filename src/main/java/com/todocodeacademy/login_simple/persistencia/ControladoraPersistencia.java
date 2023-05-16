
package com.todocodeacademy.login_simple.persistencia;

import com.todocodeacademy.login_simple.logica.Usuario;
import java.util.List;


public class ControladoraPersistencia {
    
    UsuarioJpaController usuJpa = new UsuarioJpaController();

    public List<Usuario> traerUsuarios() {
        return usuJpa.findUsuarioEntities();
        //SELECT * FROM USUARIOS
    }
    
    
    
    
    
    
}
