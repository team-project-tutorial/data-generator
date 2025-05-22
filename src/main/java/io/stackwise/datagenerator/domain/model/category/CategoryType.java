package io.stackwise.datagenerator.domain.model.category;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CategoryType {

	TOP("상의"),
	BOTTOM("하의"),
	OUTER("아우터"),
	SHOES("신발"),
	ACCESSORY("악세사리"),
	;

	private final String name;
}
