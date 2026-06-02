import controllers.SortPersonaMetodos;
import modelo.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        imprimir(100000);
        imprimir(500000);
        imprimir(1000000);
    }
     public static Persona[] generarPersonas(int cantidad){
        Persona[] personas = new Persona[cantidad];
        for(int i = 0 ; i< cantidad; i++){
            String nombre = "persona"+(i+1); 


            int edad = (int) (Math.random()*101);
            personas[i]= new Persona(nombre , edad);
        }
        return personas;
       }
       public static void imprimir(int cantidad){
        Persona[] base = generarPersonas(cantidad);
        Persona[] copiaInsercion = base.clone();
        Persona[] copiaQuickSort = base.clone();
       System.out.println(base.length);

       SortPersonaMetodos im = new SortPersonaMetodos();


       long inicio = System.nanoTime();
       im.insertionSort(copiaInsercion);
       long fin = System.nanoTime();
       System.out.println("Desordenado"+ "|"+"Inserccion "+ cantidad+ " |"+ (fin-inicio)/1_000_000+"ms");





    SortPersonaMetodos j = new SortPersonaMetodos();

    long inicio2 = System.nanoTime();

    j.quickSort(copiaQuickSort, 0, copiaQuickSort.length - 1);

    long fin2 = System.nanoTime();

    System.out.println("Desordenado | QuickSort " + cantidad + " | " + (fin2 - inicio2)/1_000_000 + "ms"); }

    System.out.println("Cantidad recibida: " + cantidad);
    System.out.println("Tamaño: " + base.length);
}
