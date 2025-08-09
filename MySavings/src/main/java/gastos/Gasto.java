package gastos;

import enums.tipoTransaccion;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import presupuesto.Presupuesto;
import transaccion.Transaccion;

@ToString
@Getter
@Setter
public class Gasto extends Transaccion{


    @Override
    public tipoTransaccion getTipo(){
        return tipoTransaccion.EGRESO;
    }

    public void restarPresupuesto(Presupuesto presupuesto){

    }
}