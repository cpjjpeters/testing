package be.ipeters.persistence.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/* carlpeters created on 07/07/2023 inside the package - be.ipeters.persistence.jpa.entity */
@Entity
public class EntityOne {
    @Id
    private Long id;

    private String name;
}
