
package org.lucasaristondo.examenacuario;

public class ExamenAcuario {

    public static void main(String[] args) {
        Acuario gestion = new Acuario();

        try {
            
            Pez pez1 = new Pez("Pez1", "Acuario de agua salada", TipoAgua.SALADA, 12);
            MamiferoMarino mamifero1 = new MamiferoMarino("Mamifero1", "Oceano", TipoAgua.SALADA, 6);
            Crustaceo crustaceo1 = new Crustaceo("Crustaceo1", "Fondo Marino", TipoAgua.SALADA, 8);

           
            gestion.agregarAnimal(pez1);
            gestion.agregarAnimal(mamifero1);
            gestion.agregarAnimal(crustaceo1);

            
            System.out.println("Lista de animales");
            gestion.mostrarAnimales();

            
            System.out.println("Filtrar por tipo de agua");
            gestion.filtrarPorTipoAgua(TipoAgua.SALADA);

            
            System.out.println("Mostrar animales por tipo");
            gestion.mostrarAnimalesPorTipo("Pez");

            
            System.out.println("Acciones");
            pez1.nadar();
            pez1.buscarAlimento(); 
            mamifero1.nadar();
            mamifero1.buscarAlimento();
            crustaceo1.buscarAlimento();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
