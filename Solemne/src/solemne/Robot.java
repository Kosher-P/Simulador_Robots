
package solemne;

/**
 *
 * @author benja
 */
public abstract class Robot implements Movilizable, Girable{
    protected int id;
    protected int DistanciaRecorrida;
    protected int nivelBateria;

    public Robot(int id, int DistanciaRecorrida, int nivelBateria) {
        this.id = id;
        this.DistanciaRecorrida = 0;
        this.nivelBateria = DURACIONBATERIADELITIO;
    }
    
    public abstract void avanzar();
    public abstract void mostrarDatos();
    
}
interface Movilizable{
    public int DESPLAZAMIENTOROBOTBASICO = 1;
    public int DESPLAZAMIENTOROBOTAVANZADO = 2;
    public int DURACIONBATERIADELITIO = 5;
}
interface Girable{
    public void girarDerecha90Grados();
    public void girarIzquierda90Grados();
} 