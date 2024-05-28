package org.example.validatesricontributors;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SRIController {
    private final SRIService SRI_SERVICE = new SRIService();

    @GetMapping(value = "/sri/request", produces = MediaType.APPLICATION_JSON_VALUE)
    public Response VerifyIfIsContributor(@RequestParam String id) {
        String idWithRuc = id + "001";
        return SRI_SERVICE.isContributor(idWithRuc);
    }
}