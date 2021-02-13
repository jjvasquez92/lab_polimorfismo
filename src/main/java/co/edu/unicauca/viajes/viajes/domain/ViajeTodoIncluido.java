/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.viajes.viajes.domain;

import java.util.Date;

/**
 *
 * @author Juan Jose Vasquez
 */
public class ViajeTodoIncluido extends Viaje{
	// Constructor
    

	public ViajeTodoIncluido(){
	}

    public ViajeTodoIncluido(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
    }
        

    @Override
    public String descripcion() {
        return "Disfruta tu viaje todo incluido";
    }
    //no se sobreescribe cualquierMetodo2()
}
