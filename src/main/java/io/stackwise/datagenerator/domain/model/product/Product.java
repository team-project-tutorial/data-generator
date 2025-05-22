package io.stackwise.datagenerator.domain.model.product;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import io.stackwise.datagenerator.global.jpa.Auditable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@Table(name = "p_products", schema = "products")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Product extends Auditable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String description;
	private BigDecimal price;
	private Integer inventory;
	private ProductStatus status;

	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;

	@Builder
	private Product(String name, BigDecimal price, Integer inventory) {
		this.name = name;
		this.price = price;
		this.inventory = inventory;
	}
}
