package com.olivier.api;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.olivier.model.Personne;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(value = "personnes")
public interface PersonnesApi {

	@ApiOperation(value = "", nickname = "personnesGet", notes = "Retourne des Personnes de la base (nb spécifié en paramètre de la req) ", response = Personne.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = Personne.class, responseContainer = "List") })
    @RequestMapping(value = "/personnes",
        method = RequestMethod.GET)
    ResponseEntity<List<Personne>> personnesGet(@NotNull @ApiParam(value = "Nombre de personne à retourner", required = true) @Valid @RequestParam(value = "nbPersonnes", required = false) Double nbPersonnes);

	
}
