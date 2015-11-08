package ambientes.treasuregame.datos;

/**
 * Created by 1144074669 on 07/11/2015.
 */

/**
 * Pista
 */
public class Pista {

    /**
     * Id de una pista.
     */
    private int id;

    /**
     * Descripción de la pista.
     */
    private String descripcion;

    /**
     * Describe si la pista ha sido encontrada o no.
     */
    private boolean encontrada;

    /**
     * Pista que debe ser encontrada antes de esta.
     */
    private Pista anterior;

    /**
     * Constructor.
     * @param id id de la pista.
     */
    public Pista(int id){
        this.setId(id);
    }

    /**
     * Constructor
     * @param id id de la pista
     * @param encontrada si ha sido encontrada o no la pista
     */
    public Pista(int id, boolean encontrada){
        this.id = id;
        this.encontrada = encontrada;
    }

    /**
     * Constructor
     * @param id id de la pista.
     * @param descripcion descripción de la pista.
     * @param encontrada si ha sido encontrada o no la pista.
     */
    public Pista(int id, String descripcion, boolean encontrada){
        this.setId(id);
        this.setDescripcion(descripcion);
        this.setEncontrada(encontrada);
    }

    /**
     * Retorna el id de la pista.
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Cambia el id de la pista
     * @param id nuevo id.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Retorna la descripción de la pista.
     * @return descripcion.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Cambia la descripción de la pista.
     * @param descripcion nueva descripción.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Retorna si la pista ha sido encontrada o no.
     * @return encontrada.
     */
    public boolean isEncontrada() {
        return encontrada;
    }

    /**
     * Cambia si la pista ha sido encontrada o no.
     * @param encontrada nueva encontrada.
     */
    public void setEncontrada(boolean encontrada) {
        this.encontrada = encontrada;
    }

    /**
     * Retorna la pista anterior a esta.
     * @return pista anterior.
     */
    public Pista getAnterior() {
        return anterior;
    }

    /**
     * Cambia la pista anterior a esta.
     * @param anterior nueva pista anterior.
     */
    public void setAnterior(Pista anterior) {
        this.anterior = anterior;
    }
}

