package com.filippatos.qualco.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "region_areas")
@Getter
@Setter
public class RegionArea {
    @Id
    @Column(name = "region_name", nullable = false, length = 100)
    private String id;

    @Column(name = "region_area", nullable = false, precision = 15, scale = 2)
    private BigDecimal regionArea;

}