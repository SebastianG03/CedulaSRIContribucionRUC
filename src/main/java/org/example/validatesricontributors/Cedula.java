package org.example.validatesricontributors;


import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Cedula {
    @Size(min = 10, max = 10, message = "La cédula debe tener 10 dígitos")
    @Pattern(regexp = "[0-9]+", message="La cédula solo puede contener números")
    private String cedula;

    public Cedula(String cedula) {
        this.cedula = cedula;
    }
}
