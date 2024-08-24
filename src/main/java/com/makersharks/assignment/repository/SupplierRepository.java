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
    @Query("SELECT p FROM Supplier p WHERE p.company_name LIKE CONCAT('%',:#{#supplier.company_name},'%') and " +
            " p.location LIKE CONCAT('%',:#{#supplier.location},'%') and p.website LIKE CONCAT('%',:#{#supplier.website},'%')")

    List<Supplier> searchSuppliers(@Param("supplier") Supplier supplier, Pageable pageable);

    // List<Supplier> findByCompanyNameAndWebsiteAndLocation(@Param("company_name")
    // String company_name, String website,
    // String location);
}
