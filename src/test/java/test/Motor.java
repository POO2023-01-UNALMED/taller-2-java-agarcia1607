package test;
public class Motor {
    int numeroCilindros;
    String tipo;
    int registro;
    
    public Motor(int numeroCilindros, String tipo, int registro) {
        this.numeroCilindros = numeroCilindros;
        this.tipo = tipo;
        this.registro = registro;
    }
    
    public void cambiarRegistro(int numero) {
        this.registro = numero;
    }
    
    public void asignarTipo(String cambio) {
        if (cambio.equals("electrico") || cambio.equals("gasolina")) {
            this.tipo = cambio;
        }
    }
}
