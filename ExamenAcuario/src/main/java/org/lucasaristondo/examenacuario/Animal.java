
package org.lucasaristondo.examenacuario;

public abstract class Animal {
    private String nombre;
    private String habitat;
    private TipoAgua tipoAgua;

    public Animal(String nombre, String habitat, TipoAgua tipoAgua) {
        this.nombre = nombre;
        this.habitat = habitat;
        this.tipoAgua = tipoAgua;
    }

    public String getNombre() {
        return nombre;
    }

    public String getHabitat() {
        return habitat;
    }

    public TipoAgua getTipoAgua() {
        return tipoAgua;
    }

    public abstract void nadar() throws AccionNoPermitidaException;

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Habitat: " + habitat + ", Tipo de agua: " + tipoAgua;
    }
}