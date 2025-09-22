
package solemne;

/**
 *
 * @author benja
 */
public class RobotAvanzado extends Robot{
    private boolean tieneSensorInfrarrojoDelantero;
    private boolean esProgramableEnC; 
    public RobotAvanzado(boolean tieneSensorInfrarrojoDelantero, boolean esProgramableEnC, int id, int DistanciaRecorrida, int nivelBateria) {
        super(id, DistanciaRecorrida, nivelBateria);
        this.tieneSensorInfrarrojoDelantero = tieneSensorInfrarrojoDelantero;
        this.esProgramableEnC = esProgramableEnC;
    }
    
    @Override
    public void avanzar() {
        if (nivelBateria>=1){
            DistanciaRecorrida +=2;
            nivelBateria --;
            System.out.println("Robot ID = "+id+" TIPO = RobotAvanzada, Avanzando en 1 CM..., totalAvanzadoHastaElMomentoEnCM = "+DistanciaRecorrida+" BateriaRestante = "+nivelBateria);
        }
        else{
            System.out.println("El robot ID = "+id+" se quedo sin bateria su distancia recorrida final fue =  "+DistanciaRecorrida);
        }
    }

    @Override
    public void girarDerecha90Grados() {
        if (nivelBateria >=1){
            nivelBateria--;
            System.out.println("Robot ID = "+id+" TIPO = Basico, Girando a la derecha 90 grados, Bateria Restante = "+nivelBateria);
        }
        else{
            System.out.println("El robot ID = "+id+" se quedo sin bateria su distancia recorrida final fue =  "+DistanciaRecorrida);
        }
    }

    @Override
    public void girarIzquierda90Grados() {
        if (nivelBateria >=1){
            nivelBateria--;
            System.out.println("Robot ID = "+id+" TIPO = Basico, Girando a la izquierda 90 grados, Bateria Restante = "+nivelBateria);
        }
        else{
            System.out.println("El robot ID = "+id+" se quedo sin bateria su distancia recorrida final fue =  "+DistanciaRecorrida);
        }
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Robot ID = "+id+" distanciaRecorrida = "+DistanciaRecorrida+" nivelBateria = "+nivelBateria+" RobotAvanzado(sensor infrarrojo = "+tieneSensorInfrarrojoDelantero+" EsProgramable en C = "+esProgramableEnC+")\n");
        
        
    }
    
}
