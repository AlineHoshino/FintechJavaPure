package com.fiap;
/**
 * Classe que cria tipos de categoria, ou seja, se é despesa ou se é renda
 * @author Aline
 *
 */
public class CategoryType {
	private int typeId;
	private String typeName;
	
	public CategoryType(int typeId, String typeName) {
		this.typeId = typeId;
		this.typeName = typeName;
	}

	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
}
