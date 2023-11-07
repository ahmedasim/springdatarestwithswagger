package com.aa.springDataRest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aa.springDataRest.entity.InventoryItemEntity;

public interface InventoryItemRepo extends JpaRepository<InventoryItemEntity,Long> {

}
