package org.example.validatesricontributors;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class SRIService {
    private final RestTemplate _restTemplate = new RestTemplate();

    public Response isContributor(String idWithRuc) {
        ResponseEntity<Boolean> response = _restTemplate.getForEntity(GetURL(idWithRuc), Boolean.class);
        Boolean isContributor = response.getBody();
        if (isContributor == null) return null;
        return new Response(isContributor);
    }

    private String GetURL(String idWithRuc)
    {
        String urlTemplate = "https://srienlinea.sri.gob.ec/sri-catastro-sujeto-servicio-internet/rest/ConsolidadoContribuyente/existePorNumeroRuc?numeroRuc=";
        return urlTemplate + idWithRuc;
    }
}
