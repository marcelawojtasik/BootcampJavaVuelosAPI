package CodoaCodo.VuelosAPI.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@NoArgsConstructor
//@AllArgsConstructor
@Data

@Entity //Le indica a hibernate que haga una tabla a partir de esta clase
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String origen;
    private String destino;
    private String FechaHoraSalida;
    private String FechaHoraLlegada;
    private double precio;
    private String frecuencia;

    public Flight(Long id, String origen, String destino, String fechaHoraSalida, String fechaHoraLlegada, double precio, String frecuencia) {
        this.id = id;
        this.origen = origen;
        this.destino = destino;
        FechaHoraSalida = fechaHoraSalida;
        FechaHoraLlegada = fechaHoraLlegada;
        this.precio = precio;
        this.frecuencia = frecuencia;
    }

    public Flight(String origen, String destino, String fechaHoraSalida, String fechaHoraLlegada, double precio, String frecuencia) {
        this.origen = origen;
        this.destino = destino;
        FechaHoraSalida = fechaHoraSalida;
        FechaHoraLlegada = fechaHoraLlegada;
        this.precio = precio;
        this.frecuencia = frecuencia;
    }

    public Long getId() {
        return id;
    }

    public String getOrigen() {
        return origen;
    }

    public double getPrecio() {
        return precio;
    }
}


