package io.stackwise.datagenerator.domain.model.productcategory;

import io.stackwise.datagenerator.domain.model.category.Category;
import io.stackwise.datagenerator.domain.model.product.Product;
import io.stackwise.datagenerator.global.jpa.Auditable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@Table(name = "t_category_products", schema = "products")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CategoryProduct extends Auditable {

	@EmbeddedId
	private CategoryProductId id;

	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("productId")
	@JoinColumn(
		name = "product_id",
		nullable = false
	)
	private Product product;

	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("categoryId")
	@JoinColumn(
		name = "category_id",
		nullable = false
	)
	private Category category;
}
