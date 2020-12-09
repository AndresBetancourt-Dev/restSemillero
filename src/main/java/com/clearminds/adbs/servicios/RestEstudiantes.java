package com.clearminds.adbs.servicios;

import com.clearminds.adbs.dtos.Estudiante;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/estudiantes")
public class RestEstudiantes {
	
	private ServicioEstudiante servicioEstudiante;
	
	public RestEstudiantes() {
		servicioEstudiante = new ServicioEstudiante();
	}
	
	
	@GET
	@Path("/obtener")
	@Produces(MediaType.APPLICATION_JSON)
	public String obtener(){
		return "Mensaje";
	}
	
	@POST
	@Path("/insertar")
	@Consumes(MediaType.APPLICATION_JSON)
	public void insertar(Estudiante estudiante){
		try{
			servicioEstudiante.insertarEstudiante(estudiante);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@PUT
	@Path("/actualizar")
	@Consumes(MediaType.APPLICATION_JSON)
	public void actualizar(Estudiante estudiante){
		try{
			servicioEstudiante.actualizarEstudiante(estudiante);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
