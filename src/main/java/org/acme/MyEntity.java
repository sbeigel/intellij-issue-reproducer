package org.acme;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class MyEntity extends PanacheEntity {
    public String foo;
    public String bar;
}
