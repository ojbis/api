package com.olivier.api;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.olivier.model.Personne;

@Controller
public class PersonnesApiController implements PersonnesApi {

	private static final Logger log = LoggerFactory.getLogger(PersonnesApiController.class);
	
	private final HttpServletRequest request;
	
	@org.springframework.beans.factory.annotation.Autowired
    public PersonnesApiController(HttpServletRequest request) {
        this.request = request;
    }
	
	public ResponseEntity<List<Personne>> personnesGet(Double nbPersonnes) {
		String accept = request.getHeader("Accept");
		log.info("Requete recue 1 !!");
        if (accept != null && accept.contains("application/json")) {
	        	Personne p1 = new Personne();
	        	Personne p2 = new Personne();
	            p1.setNom("Jimenez");
	            p1.setPrenom("Olivier");
	            p2.setNom("Meillan");
	            p2.setPrenom("Nathalie");
	            
	            
	            ArrayList<Personne> personnes = new ArrayList<>();
	            personnes.add(p1);
	            personnes.add(p2);
	            
	            log.info("Requete recue avec header !!");
	            
                return new ResponseEntity<List<Personne>>(personnes,HttpStatus.OK);

        }

        return new ResponseEntity<List<Personne>>(HttpStatus.NOT_IMPLEMENTED);
	}

}
