/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import java.util.List;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Pablo
 */
@Entity
public class Odontologo extends Persona implements Serializable{
    private String especialidad;
    @OneToMany(mappedBy="odonto")
    private List<Turno> listaTurno;
    @OneToOne
    private Usuario unUsuario;
    @OneToOne
    private Horario unHorario;

    public Odontologo() {
    }

    public Odontologo(String especialidad, List<Turno> listaTurno, Usuario unUsuario, Horario unHorario, int id, String cc, String nombre, String apellido, String telefono, String direccion, Date fecha_nac) {
        super(id, cc, nombre, apellido, telefono, direccion, fecha_nac);
        this.especialidad = especialidad;
        this.listaTurno = listaTurno;
        this.unUsuario = unUsuario;
        this.unHorario = unHorario;
    }
    
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<Turno> getListaTurno() {
        return listaTurno;
    }

    public void setListaTurno(List<Turno> listaTurno) {
        this.listaTurno = listaTurno;
    }

    public Usuario getUnUsuario() {
        return unUsuario;
    }

    public void setUnUsuario(Usuario unUsuario) {
        this.unUsuario = unUsuario;
    }

    public Horario getUnHorario() {
        return unHorario;
    }

    public void setUnHorario(Horario unHorario) {
        this.unHorario = unHorario;
    }
    
    
}
