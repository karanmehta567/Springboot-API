package com.makersharks.assignment.repository;

import com.makersharks.assignment.entity.Supplier;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {
    @Query("SELECT p FROM Supplier p WHERE p.company_name LIKE CONCAT('%',coalesce(:#{#supplier.company_name},''),'%') and "
            +
            "  p.location LIKE CONCAT('%',coalesce(:#{#supplier.location},''),'%') and " +
            "  p.website LIKE CONCAT('%',coalesce(:#{#supplier.website},''),'%') and " +
            "  (:#{#supplier.nature_of_business} is null or p.nature_of_business = :#{#supplier.nature_of_business}) and"
            +
            "  (:#{#supplier.manufacturing_processes} is null or p.manufacturing_processes = :#{#supplier.manufacturing_processes})")

    List<Supplier> searchSuppliers(@Param("supplier") Supplier supplier, Pageable pageable);
}
