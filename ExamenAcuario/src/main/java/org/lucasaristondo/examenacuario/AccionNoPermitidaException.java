
package org.lucasaristondo.examenacuario;

public class AccionNoPermitidaException extends Exception {
    public AccionNoPermitidaException(String mensaje) {
        super(mensaje);
    }
}