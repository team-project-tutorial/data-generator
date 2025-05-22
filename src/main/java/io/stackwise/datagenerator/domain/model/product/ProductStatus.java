package io.stackwise.datagenerator.domain.model.product;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ProductStatus {
	SELLING("판매 중"),
	HIDDEN("숨김"),
	DELETED("삭제"),
	SOLD_OUT("품절"),
	;

	private final String description;
}
