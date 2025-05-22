package io.stackwise.datagenerator.domain.model.productcategory;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class CategoryProductId {

	@Column(name = "product_id")
	private Long productId;

	@Column(name = "category_id")
	private Long categoryId;
}
