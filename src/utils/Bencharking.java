package utils;

import java.util.concurrent.Callable;

import modelo.Resultado;

public class Bencharking {
    public static Resultado medirTiempo(Callable<Void> funcion,
        String algoritmo,
        String escenario,
        int sample)
        
    {
        try {
            long inicio = System.nanoTime();
            funcion.call();
            long fin = System.nanoTime();

            double duracion = fin - inicio;

            return new Resultado(algoritmo, escenario,sample, duracion);

        }catch ( Exception e){
            throw new RuntimeException("error el ejecutar la funcion de ordenamiento ");
        }
    }
}
