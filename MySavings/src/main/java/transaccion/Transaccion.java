package transaccion;

import java.util.Date;
import enums.tipoTransaccion;
import lombok.Setter;
import lombok.Getter;
import lombok.ToString;

@Setter
@Getter
@ToString
public abstract class Transaccion {
    private double monto;
    private Date fecha;
    private String descripcion;
    private tipoTransaccion tipo;


    public tipoTransaccion getTipo() {
        return null;
    }
}
