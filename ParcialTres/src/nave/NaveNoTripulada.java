
public class NaveNoTripulada extends NaveEspacial {
    private String motorPropulsion;
    private String mision;
    
    public NaveNoTripulada(String nombre, double peso, double potencia, double velocidad, String propulsion, String tipo, String motorPropulsion, String mision) {
        super(nombre, peso, potencia, velocidad, propulsion, tipo);
        this.motorPropulsion = motorPropulsion;
        this.mision = mision;
    }
    
    // Getters y Setters
    
    public String getMotorPropulsion() {
        return motorPropulsion;
    }
    
    public void setMotorPropulsion(String motorPropulsion) {
        this.motorPropulsion = motorPropulsion;
    }
    
    public String getMision() {
        return mision;
    }
    
    public void setMision(String mision) {
        this.mision = mision;
    }
}