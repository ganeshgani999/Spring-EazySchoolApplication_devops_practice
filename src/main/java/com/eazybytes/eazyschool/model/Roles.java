
package com.eazybytes.eazyschool.model;

import lombok.Data;

import jakarta.persistence.*;

@Data
@Entity
public class Roles extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Use IDENTITY for auto-increment

    private int roleId;

    private String roleName;

}
