package org.example.validatesricontributors;


import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Response {
    public Boolean isContributor;

    public Response(Boolean isContributor) {
        this.isContributor = isContributor;
    }
}
