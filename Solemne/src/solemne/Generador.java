package solemne;
import java.util.concurrent.ThreadLocalRandom;
/**
 *
 * @author benja
 */
public class Generador {
    
public static int generarNumeroIntAlAzarEntreMinYMax(int min, int max)
{
return ThreadLocalRandom.current().nextInt(min, max);
}
public static boolean generarBooleanAlAzar()
{
return generarNumeroIntAlAzarEntreMinYMax(0,10000)<5000;
}
}
