package com.makersharks.assignment.controller;

import com.makersharks.assignment.entity.Supplier;
import com.makersharks.assignment.service.SupplierService;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    public SupplierController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    @PostMapping("/query")
    public ResponseEntity<List<Supplier>> searchSuppliers(@RequestBody Supplier supplier,
            @RequestParam(value = "skip", defaultValue = "0") int skip,
            @RequestParam(value = "limit", defaultValue = "10") int limit) {
        return ResponseEntity.ok(supplierService.searchSuppliers(supplier, skip, limit));
    }

    @PostMapping("")
    public Supplier createSuppliers(@RequestBody Supplier supplier) throws BadRequestException {
        return supplierService.createSupplier(supplier);
    }
}
