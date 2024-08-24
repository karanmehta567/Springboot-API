package com.makersharks.assignment.service;

import com.makersharks.assignment.entity.Supplier;
import org.apache.coyote.BadRequestException;

import java.util.List;

public interface SupplierService {

    List<Supplier> searchSuppliers(Supplier supplier, int skip, int limit);

    Supplier createSupplier(Supplier supplier) throws BadRequestException;
}
