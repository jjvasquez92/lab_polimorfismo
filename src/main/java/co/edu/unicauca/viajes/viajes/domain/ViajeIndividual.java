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
public class ViajeIndividual extends Viaje{
    
	// Constructor
    

	public ViajeIndividual(){
	}

    public ViajeIndividual(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
    }
        

    @Override
    public String descripcion() {
        return "Disfruta tu viaje individual";
    }
    //no se sobreescribe cualquierMetodo2()
}
