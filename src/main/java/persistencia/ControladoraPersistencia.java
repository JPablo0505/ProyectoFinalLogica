/*
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import Logica.Usuario;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author Pablo
 */

public class ControladoraPersistencia {
    HorarioJpaController horaJPA;
    OdontologoJpaController odontoJPA;
    PacienteJpaController pacJPA;
    PersonaJpaController persJPA;
    ResponsableJpaController respJPA;
    SecretarioJpaController secreJPA;
    TurnoJpaController turnJPA;
    UsuarioJpaController usuJPA;

    public ControladoraPersistencia() {
        usuJPA = new UsuarioJpaController();
        horaJPA = new HorarioJpaController();
        odontoJPA = new OdontologoJpaController();
        pacJPA = new PacienteJpaController();
        persJPA = new PersonaJpaController();
        respJPA = new ResponsableJpaController();
        secreJPA = new SecretarioJpaController();
        turnJPA = new TurnoJpaController();
    }

    
    public void crearUsuario(Usuario usu) {
        usuJPA.create(usu);
    }

    public List<Usuario> getUsarios() {
        return usuJPA.findUsuarioEntities();
    }

    public void borrarUsuario(int id) {
        try {
            usuJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Usuario traerUsuario(int id) {
        return usuJPA.findUsuario(id);
    }

    public void editUsuario(Usuario usu) {
        try {
            usuJPA.edit(usu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

