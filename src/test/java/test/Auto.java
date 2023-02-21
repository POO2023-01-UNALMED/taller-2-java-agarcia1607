package test;
public class Auto {
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;
    
    public Auto(String modelo, int precio, Asiento[] asientos, String marca, Motor motor, int registro) {
        this.modelo = modelo;
        this.precio = precio;
        this.asientos = asientos;
        this.marca = marca;
        this.motor = motor;
        this.registro = registro;
    }
    
    public int cantidadAsientos() {
        int contador = 0;
        for (Asiento a : asientos) {
            if (a != null) {
                contador++;
            }
        }
        return contador;
    }
    
    public String verificarIntegridad() {
        int x = this.registro;
        if (x == this.motor.registro) {
            for (Asiento a : asientos) {
                if (a != null) {
                    if (a.registro == x) {
                        return "Auto original";
                    }
                    else {
                        return "Las piezas no son originales";
                    }
                }
            }
        }
        return "Auto original";
    }
}
