package org.example.validatesricontributors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CedulaController {

    final private CedulaService cedulaService;

    public CedulaController(CedulaService cedulaService) {
        this.cedulaService = cedulaService;
    }

    @GetMapping("/cedula")
    public boolean getCedula(@RequestParam String cedula) {
        String ruc = cedula + "001";
        return cedulaService.isContributor(ruc);
    }
}