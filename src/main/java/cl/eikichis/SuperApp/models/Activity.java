package cl.eikichis.SuperApp.models;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class Activity {
    @Id
    private String id;
    private String userId;
    private Date fecha;
    private String tipoActividad;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTipoActividad() {
        return tipoActividad;
    }

    public void setTipoActividad(String tipoActividad) {
        this.tipoActividad = tipoActividad;
    }
}
