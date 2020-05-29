package clinicaveterinaria;

/**
 *
 * @author xavier
 */
public class Gato extends Mascota {
    //ATRIBUTOS

    private float gradosalvaje;

    //CONSTRUCTOR
    /**
     * Constructor de la clase Gato que hereda de Mascota
     *
     * @param nombre
     * @param edad
     * @param raza
     * @param duenyo
     * @param gradosalvaje
     */
    public Gato(String nombre, int edad, String raza, Persona duenyo, float gradosalvaje) {
        super(nombre, edad, raza, duenyo);
        this.gradosalvaje = gradosalvaje;
    }

    //MÉTODOS SETTER & GETTER - PARA HACER (P.E. UTILIZANDO LA REFACTORIZACIÓN DEL ATRIBUTO)

}
