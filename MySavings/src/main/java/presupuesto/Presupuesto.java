package presupuesto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Presupuesto {
    private double totalPresupuesto;
    private double porcentajeAhorro;
    private double porcentajeGastoObligatorio;
    private static Presupuesto instance;

    private Presupuesto(double totalPresupuesto, double porcentajeAhorro, double porcentajeGastoObligatorio) {
        this.totalPresupuesto = totalPresupuesto;
        this.porcentajeAhorro = porcentajeAhorro;
        this.porcentajeGastoObligatorio = porcentajeGastoObligatorio;
    }

    public void asignarPorcentajeAhorro(){}

    public void asignarPorcentajeGastoObligatorio(){}

    //Singleton
    public static Presupuesto getInstance(double totalPresupuesto, double porcentajeAhorro, double porcentajeGastoObligatorio){
        if(instance == null) instance = new Presupuesto(totalPresupuesto, porcentajeAhorro, porcentajeGastoObligatorio);
        return instance;
    }
}
