package com.makersharks.assignment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "suppliers")
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long supplier_id;
    private String company_name;
    private String website;
    private String location;

    private BusinessNature nature_of_business;
    private ManufacturingProcessType manufacturing_processes;
}

enum BusinessNature {
    BUSINESS_NATURE_SMALL_SCALE,
    BUSINESS_NATURE_MEDIUM_SCALE,
    BUSINESS_NATURE_LARGE_SCALE
};

enum ManufacturingProcessType {
    MANUFACTuRING_PROCESS_TYPE_MOULDING,
    MANUFACTuRING_PROCESS_TYPE_3D_PRINTING,
    MANUFACTuRING_PROCESS_TYPE_CASTING,
    MANUFACTuRING_PROCESS_TYPE_COATING
};
