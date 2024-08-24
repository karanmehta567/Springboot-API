package com.makersharks.assignment.service.impl;

import com.makersharks.assignment.entity.Supplier;
import com.makersharks.assignment.repository.SupplierRepository;
import com.makersharks.assignment.service.SupplierService;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    public SupplierServiceImpl(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }

    @Override
    public List<Supplier> searchSuppliers(Supplier supplier, int skip, int limit) {
        if (limit == 0) {
            limit = 10;
        }

        List<Supplier> suppliers = supplierRepository.searchSuppliers(
                supplier, PageRequest.of(skip, limit));
        return suppliers;
    }

    @Override
    public Supplier createSupplier(Supplier supplier) throws BadRequestException {
        if (supplier.getCompany_name().length() == 0) {
            throw new BadRequestException();
        }
        if (supplier.getLocation().length() == 0) {
            throw new BadRequestException();
        }
        if (supplier.getWebsite().length() == 0) {
            throw new BadRequestException();
        }
        return supplierRepository.save(supplier);
    }
}
