
package org.lucasaristondo.examenacuario;

public class MamiferoMarino extends Animal implements BuscadorAlimento {
    private int frecuenciaRespiracion;

    public MamiferoMarino(String nombre, String habitat, TipoAgua tipoAgua, int frecuenciaRespiracion) {
        super(nombre, habitat, tipoAgua);
        this.frecuenciaRespiracion = frecuenciaRespiracion;
    }

    public int getFrecuenciaRespiracion() {
        return frecuenciaRespiracion;
    }

    @Override
    public void nadar() {
        System.out.println(getNombre() + " esta nadando y necesita salir a respirar cada " + frecuenciaRespiracion + " segundos");
    }

    @Override
    public void buscarAlimento() {
        System.out.println(getNombre() + " esta buscando alimento en el agua " + getTipoAgua().toString().toLowerCase() + ".");
    }

    @Override
    public String toString() {
        return super.toString() + ", Frecuencia de respiracion: " + frecuenciaRespiracion + " s";
    }
}
