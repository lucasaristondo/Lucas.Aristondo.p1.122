
package org.lucasaristondo.examenacuario;

public class Crustaceo extends Animal implements BuscadorAlimento {
    private int numeroPatas;

    public Crustaceo(String nombre, String habitat, TipoAgua tipoAgua, int numeroPatas) {
        super(nombre, habitat, tipoAgua);
        this.numeroPatas = numeroPatas;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    @Override
    public void nadar() throws AccionNoPermitidaException {
        throw new AccionNoPermitidaException(getNombre() + " no puede nadar, ya que el crustaceo tiene patas");
    }

    @Override
    public void buscarAlimento() {
        System.out.println(getNombre() + " está buscando alimento");
    }

    @Override
    public String toString() {
        return super.toString() + ", Número de patas: " + numeroPatas;
    }
}
