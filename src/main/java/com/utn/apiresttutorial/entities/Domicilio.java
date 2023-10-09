package com.utn.apiresttutorial.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "domicilio")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Domicilio extends BaseEntity{

    @Column(name = "calle")
    private String calle;

    @Column
    private int numero;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_localidad")
    private Localidad localidad;
}
