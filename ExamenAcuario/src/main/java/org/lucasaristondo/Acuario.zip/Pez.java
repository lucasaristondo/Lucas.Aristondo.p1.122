
package org.lucasaristondo.examenacuario;

public class Pez extends Animal implements BuscadorAlimento {
    private double longitudMaxima; // en cm

    public Pez(String nombre, String habitat, TipoAgua tipoAgua, double longitudMaxima) {
        super(nombre, habitat, tipoAgua);
        this.longitudMaxima = longitudMaxima;
    }

    public double getLongitudMaxima() {
        return longitudMaxima;
    }

    @Override
    public void nadar() {
        System.out.println(getNombre() + " está nadando en el agua " + getTipoAgua().toString().toLowerCase() + ".");
    }

    @Override
    public void buscarAlimento() throws AccionNoPermitidaException {
        throw new AccionNoPermitidaException(getNombre() + " no puede buscar alimento");
    }

    @Override
    public String toString() {
        return super.toString() + ", Longitud máxima: " + longitudMaxima + " cm";
    }
}
