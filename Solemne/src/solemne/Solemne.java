package solemne;
import java.util.ArrayList;
public class Solemne {

    public static void main(String[] args) {
      
        int mayor=0, menor=1000, idMenor = 0, idMayor = 0;
        ArrayList<Robot> rbs = new ArrayList<>();
        //Generador de robots y guardado en ArrayList
        while (rbs.size()<10){
           boolean n = Generador.generarBooleanAlAzar();
           if (n){
               rbs.add(new RobotBasico(Generador.generarBooleanAlAzar(),Generador.generarNumeroIntAlAzarEntreMinYMax(1, 100),0,Robot.DURACIONBATERIADELITIO));
           }
           else{
               rbs.add(new RobotAvanzado(Generador.generarBooleanAlAzar(),Generador.generarBooleanAlAzar(),Generador.generarNumeroIntAlAzarEntreMinYMax(1, 100),0,Robot.DURACIONBATERIADELITIO));
           }
        }
       //imprimir lista de robots
       System.out.println("GENERANDO ROBOTS");
       System.out.println("-----------------------------------------------------------------------------------------------------");
       for(Robot r: rbs){
           r.mostrarDatos();
       }     
       //Comienzan a moverse...
        System.out.println("MOVIENDO ROBOTS");
        System.out.println("----------------------------------------------------------------------------------------------------");
        for(Robot r: rbs){
            System.out.println("");
            while (r.nivelBateria>0){
                boolean n = Generador.generarBooleanAlAzar();
                if (n){
                    r.avanzar();
                }
                else{
                    n = Generador.generarBooleanAlAzar();
                    if (n){
                        r.girarDerecha90Grados();
                    }
                    else{
                        r.girarIzquierda90Grados();
                    }
                }
                
            System.out.println("");
            }
           
            if(r.DistanciaRecorrida> mayor){
                mayor = r.DistanciaRecorrida;
                idMayor = r.id;
            }
            if (r.DistanciaRecorrida<menor){
                menor =r.DistanciaRecorrida;
                idMenor = r.id;
            }
            
       }
        
        System.out.println("El robot con mayor distancia recorrida fue el Robot ID = "+idMayor+" con un total de "+mayor+" cm recorridos");
        System.out.println("El robot con menor distancia recorrida fue el Robot ID = "+idMenor+" con un total de "+menor+" cm recorridos");
    }
    
   
}
