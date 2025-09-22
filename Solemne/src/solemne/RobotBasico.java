package solemne;


public class RobotBasico extends Robot {
    private boolean tarjetaExpansible;
    public RobotBasico(boolean tarjetaExpansible, int id, int DistanciaRecorrida, int nivelBateria) {
        super(id, DistanciaRecorrida, nivelBateria);
        this.tarjetaExpansible = tarjetaExpansible;
    }
 
    @Override
    public void avanzar() {
        if (nivelBateria>=1){
            DistanciaRecorrida ++;
            nivelBateria --;
            System.out.println("Robot ID = "+id+" TIPO = RobotBasico, Avanzando en 1 CM..., totalAvanzadoHastaElMomentoEnCM = "+DistanciaRecorrida+" BateriaRestante = "+nivelBateria);
        }
        else{
            System.out.println("El robot ID = "+id+" se quedo sin bateria su distancia recorrida final fue =  "+DistanciaRecorrida);
        }
    }
    @Override
    public void girarDerecha90Grados() {
        if (nivelBateria>=1){
            nivelBateria--;
            System.out.println("Robot ID = "+id+" TIPO = Basico, Girando a la derecha 90 grados, Bateria Restante = "+nivelBateria);
        }
        else{
            System.out.println("El robot ID = "+id+" se quedo sin bateria su distancia recorrida final fue =  "+DistanciaRecorrida);
        }
    }

    @Override
    public void girarIzquierda90Grados() {
        if (nivelBateria>=1){
        nivelBateria--;
        System.out.println("Robot ID = "+id+" TIPO = Basico, Girando a la izquierda 90 grados, Bateria Restante = "+nivelBateria);
        }
        else{
            System.out.println("El robot ID = "+id+" se quedo sin bateria su distancia recorrida final fue =  "+DistanciaRecorrida);
        }
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Robot ID = "+id+" distanciaRecorrida = "+DistanciaRecorrida+" nivelBateria = "+nivelBateria+" RobotBasico (tarjetaExpansible = "+tarjetaExpansible+")\n");

    }
        
}
