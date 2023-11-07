package com.aa.springDataRest.entity;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "inv_items", indexes = {
		@Index(name = "item_id_index", columnList = "itemId"),
		@Index(name = "item_code_index", columnList = "itemCode", unique = true)
}, uniqueConstraints = {
		@UniqueConstraint(name="item_name_unique", columnNames = {"itemName"})
})
public class InventoryItemEntity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long itemId;
	private String itemCode;
    private String itemName;
    private BigDecimal quantity;

}
