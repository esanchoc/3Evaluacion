package clinicaveterinaria;

/**
 *
 * @author xavier
 */
public class Cerdo extends Mascota{
    //ATRIBUTOS
    private float peso;
    
    //CONSTRUCTOR
    /**
     * Constructor de la clase Cerdo que hereda de Mascota
     * @param nombre
     * @param edad
     * @param raza
     * @param duenyo
     * @param peso 
     */
    public Cerdo(String nombre, int edad, String raza, Persona duenyo, float peso) {
        super(nombre, edad, raza, duenyo);
        this.setPeso(peso);
    }

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

}
