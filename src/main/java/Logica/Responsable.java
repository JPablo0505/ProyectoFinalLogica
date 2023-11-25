/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.Date;
import javax.persistence.Entity;

/**
 *
 * @author Pablo
 */
@Entity
public class Responsable extends Persona{
    private String tipoRes;

    public Responsable() {
    }

    public Responsable(String tipoRes, int id, String cc, String nombre, String apellido, String telefono, String direccion, Date fecha_nac) {
        super(id, cc, nombre, apellido, telefono, direccion, fecha_nac);
        this.tipoRes = tipoRes;
    }

    public String getTipoRes() {
        return tipoRes;
    }

    public void setTipoRes(String tipoRes) {
        this.tipoRes = tipoRes;
    }
    
    
}
