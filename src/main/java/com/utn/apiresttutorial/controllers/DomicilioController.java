package com.utn.apiresttutorial.controllers;

import com.utn.apiresttutorial.entities.Domicilio;
import com.utn.apiresttutorial.services.DomicilioServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/domicilios")
@CrossOrigin("*")
public class DomicilioController extends BaseControllerImpl<Domicilio, DomicilioServiceImpl> {
}
