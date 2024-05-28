package org.example.validatesricontributors;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CedulaService {
    final String url = "https://srienlinea.sri.gob.ec/sri-catastro-sujeto-servicio-internet/rest/ConsolidadoContribuyente/existePorNumeroRuc?numeroRuc=";

    public boolean isContributor(String ruc) {
        String request = url + ruc;
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Boolean> response = restTemplate.getForEntity(request, Boolean.class);
        return response.getBody() != null? response.getBody() : false;

    }
}
