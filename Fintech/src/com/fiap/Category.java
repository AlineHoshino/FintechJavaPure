package com.fiap;
/**
 * Classe que cria categorias: Exemplo- salário, transporte, alimentação
 * @author Aline
 *
 */
public class Category {
	private int categoryId;
	private String name;
	private CategoryType categoryType;
	
	public Category( int categoryId, String name, CategoryType categoryType) {
		this.categoryId = categoryId;
		this.name = name;
		this.categoryType = categoryType;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CategoryType getCategoryType() {
		return categoryType;
	}

	public void setCategoryType(CategoryType categoryType) {
		this.categoryType = categoryType;
	}
}
