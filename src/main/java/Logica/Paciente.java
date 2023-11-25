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
public class Paciente extends Persona implements Serializable {
    private Boolean seguro;
    private String tipoSangre;
    @OneToOne
    private Responsable unResponsable;
    @OneToMany(mappedBy="pacien")
    private List<Turno> listaTurno;

    public Paciente() {
    }

    public Paciente(Boolean seguro, String tipoSangre, Responsable unResponsable, List<Turno> listaTurno, int id, String cc, String nombre, String apellido, String telefono, String direccion, Date fecha_nac) {
        super(id, cc, nombre, apellido, telefono, direccion, fecha_nac);
        this.seguro = seguro;
        this.tipoSangre = tipoSangre;
        this.unResponsable = unResponsable;
        this.listaTurno = listaTurno;
    }

    public Boolean getSeguro() {
        return seguro;
    }

    public void setSeguro(Boolean seguro) {
        this.seguro = seguro;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public Responsable getUnResponsable() {
        return unResponsable;
    }

    public void setUnResponsable(Responsable unResponsable) {
        this.unResponsable = unResponsable;
    }

    public List<Turno> getListaTurno() {
        return listaTurno;
    }

    public void setListaTurno(List<Turno> listaTurno) {
        this.listaTurno = listaTurno;
    }

}
