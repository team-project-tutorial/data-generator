package io.stackwise.datagenerator.domain.model.category;

import io.stackwise.datagenerator.global.jpa.Auditable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@Table(name = "t_categories", schema = "products")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Category extends Auditable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	private CategoryType type;

}
