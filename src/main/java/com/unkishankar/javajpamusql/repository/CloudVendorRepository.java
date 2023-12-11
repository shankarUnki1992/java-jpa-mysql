package com.unkishankar.javajpamusql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unkishankar.javajpamusql.model.CloudVendor;

@Repository
public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {

}
