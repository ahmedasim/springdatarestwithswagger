package com.aa.springDataRest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.aa.springDataRest.entity.InventorySku;

@RepositoryRestResource(path="skus")
public interface InventorySkuRepo extends JpaRepository<InventorySku,Long> {

}
