package ambientes.treasuregame.datos;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * Created by 1144074669 on 07/11/2015.
 */

/**
 * Cuestionario. Define el cuestionario que debe seguir el usuario.
 */
public class Cuestionario{

    /**
     * Nombre del cuestionario.
     */
    private String nombre;

    /**
     * Lista de pistas que componen el cuestionario.
     */
    private ArrayList<Pista> pistas;

    /**
     * Constructor.
     */
    public Cuestionario(){

    }

    /**
     * Constructor.
     * @param nombre Nombre del cuestionario.
     */
    public Cuestionario(String nombre){
        this.nombre = nombre;
    }

    /**
     * Constructor.
     * @param nombre Nombre del cuestionario.
     * @param pistas Lista de pistas que componen el cuestionario.
     */
    public Cuestionario(String nombre, ArrayList<Pista> pistas){
        this.setNombre(nombre);
        this.setPistas(pistas);
    }

    /**
     * Retorna el nombre del cuestionario.
     * @return nombre.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Cambia el nombre del cuestionario.
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Retorna la lista de pistas del cuestionario.
     * @return pistas.
     */
    public ArrayList<Pista> getPistas() {
        return pistas;
    }

    /**
     * Cambia la lista de pistas del cuestionario.
     * @param pistas pistas.
     */
    public void setPistas(ArrayList<Pista> pistas) {
        this.pistas = pistas;
    }


}
