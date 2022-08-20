package com.tapple.JuegoTapple.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tapple.JuegoTapple.entity.Plato;
import com.tapple.JuegoTapple.repository.PlatoRepository;
import com.tapple.JuegoTapple.service.PlatoService;

//Indicamos que es un controlador rest
@RestController
@RequestMapping("/api")//esta sera la raiz de la url, es decir http://127.0.0.1:8080/api/
public class PlatoRestController {
	
	//Inyectamos el servicio para poder hacer uso de el
	@Autowired
	private PlatoService platoService;

	
	/*Este método se hará cuando por una petición GET (como indica la anotación) se llame a la url 
    http://127.0.0.1:8080/api/platos*/
    @GetMapping("/platos")
    public List<Plato> findAll(){
        //retornará todos los platos
        return platoService.findAll();
    }
    
    /*Este método se hará cuando por una petición GET (como indica la anotación) se llame a la url + el id de un plato
    http://127.0.0.1:8080/api/platos/1*/
    @GetMapping("/platos/{platoId}")
    public Plato getPlato(@PathVariable int platoId){
        Plato plato = platoService.findById(platoId);

        if(plato == null) {
            throw new RuntimeException("Plato no encontrado -"+ platoId);
        }
        //retornará el plato con id pasado en la url
        return plato;
    }
    
    /*Este método se hará cuando por una petición POST (como indica la anotación) se llame a la url
    http://127.0.0.1:8080/api/platos/  */
    @PostMapping("/platos")
    public Plato addPlato(@RequestBody Plato plato) {
        plato.setId(0);

        //Este metodo guardará el plato enviado
        platoService.save(plato);

        return plato;

    }
    
    /*Este método se hará cuando por una petición PUT (como indica la anotación) se llame a la url
    http://127.0.0.1:8080/api/platos/  */
    @PutMapping("/platos")
    public Plato updatePlato(@RequestBody Plato plato) {

        platoService.save(plato);

        //este metodo actualizará el plato enviado

        return plato;
    }
    
    /*Este método se hará cuando por una petición DELETE (como indica la anotación) se llame a la url + id del plato
    http://127.0.0.1:8080/api/plato/1  */
    @DeleteMapping("platos/{platoId}")
    public String detetePlato(@PathVariable int platoId) {

        Plato plato = platoService.findById(platoId);

        if(plato == null) {
            throw new RuntimeException("El plato no se encontró -"+ platoId);
        }

        platoService.deleteById(platoId);

        //Esto método, recibira el id de un plato por URL y se borrará de la bd.
        return "Deleted user id - " + platoId;
    }
    
    
}
