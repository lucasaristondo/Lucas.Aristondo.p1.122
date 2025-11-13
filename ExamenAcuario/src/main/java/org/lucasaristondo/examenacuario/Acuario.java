
package org.lucasaristondo.examenacuario;

import java.util.ArrayList;
import java.util.List;

public class Acuario {
    private List<Animal> animales;

    public Acuario() {
        animales = new ArrayList<>();
    }

    public void agregarAnimal(Animal animal) throws AnimalDuplicadoException {
        for (Animal a : animales) {
            if (a.getNombre().equalsIgnoreCase(animal.getNombre()) &&
                a.getHabitat().equalsIgnoreCase(animal.getHabitat())) {
                throw new AnimalDuplicadoException("Ya existe un animal con ese nombre y habitat en el acuario.");
            }
        }
        animales.add(animal);
        System.out.println(animal.getNombre() + " fue agregado correctamente al acuario.");
    }

    public void mostrarAnimales() {
        if (animales.isEmpty()) {
            System.out.println("No hay animales registrados en el acuario");
        } else {
            for (Animal a : animales) {
                System.out.println(a);
            }
        }
    }

    public void filtrarPorTipoAgua(TipoAgua tipo) {
        System.out.println("Animales que viven en agua " + tipo + ":");
        for (Animal a : animales) {
            if (a.getTipoAgua() == tipo) {
                System.out.println(a);
            }
        }
    }

    public void mostrarAnimalesPorTipo(String tipoAnimal) {
        System.out.println("Animales del tipo " + tipoAnimal + ":");
        for (Animal a : animales) {
            if (a.getClass().getSimpleName().equalsIgnoreCase(tipoAnimal)) {
                System.out.println(a);
            }
        }
    }
}
