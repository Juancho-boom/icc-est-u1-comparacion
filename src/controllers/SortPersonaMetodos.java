package controllers;

import modelo.Persona;

public class SortPersonaMetodos {
    public void insertionSort(Persona[] personas){
        for(int i = 0; i < personas.length; i ++){
            Persona aux = personas[i];
            int j = i;
            while(j > 0 && personas[j-1].getEdad()> aux.getEdad()){
                personas[j ]= personas[j-1];
                j--;
            }
            personas[j]= aux;
        }
    }
    public void quickSort(Persona[] personas , int inicio, int fin){
        if (inicio < fin) {
            int indicePivote = particionar(personas,inicio,fin);
            quickSort(personas, inicio, indicePivote-1);
            quickSort(personas, indicePivote+1, fin);
        }
    }

    public int particionar(Persona[] persona , int inicio, int fin){
        Persona pivote = persona[fin];
        int i = inicio-1;
        for(int j = inicio ; j< fin;j++){
            if(persona[j].getCriterioOrdenamiento()<= pivote.getCriterioOrdenamiento()){
                i++;
            intercambiar(persona,i,j);
            }
            

        }
        intercambiar(persona,i+1,fin);
        return i+1;


    }
    private void intercambiar(Persona[] personas , int i , int j ){
        Persona aux = personas[i];
        personas[i]= personas[j];
        personas[j]= aux ;

    }
}
