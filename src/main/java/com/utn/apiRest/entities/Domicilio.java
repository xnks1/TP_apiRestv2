package com.utn.apiRest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Domicilio extends Base {

    private String calle;
    private int numero;
    @ManyToOne(optional = false)
    @JoinColumn(name = "localidad_id")
    private Localidad localidad;
}
