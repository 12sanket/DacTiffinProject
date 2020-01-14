package com.app.pojos.owner;

public class Menu {

	private Integer menuID;
	private int categoryId;
	private String menuName;
	private String menuDescription;
	private double menuPrice;
	private int menuQuantityAvailable;
	private boolean menuIsAvailable;
	
	public Menu() {
		System.out.println("Menu Pojo");
	}

	public Menu(int categoryId, String menuName, String menuDescription, double menuPrice, int menuQuantityAvailable,
			boolean menuIsAvailable) {
		super();
		this.categoryId = categoryId;
		this.menuName = menuName;
		this.menuDescription = menuDescription;
		this.menuPrice = menuPrice;
		this.menuQuantityAvailable = menuQuantityAvailable;
		this.menuIsAvailable = menuIsAvailable;
	}

	public Integer getMenuID() {
		return menuID;
	}

	public void setMenuID(Integer menuID) {
		this.menuID = menuID;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getMenuDescription() {
		return menuDescription;
	}

	public void setMenuDescription(String menuDescription) {
		this.menuDescription = menuDescription;
	}

	public double getMenuPrice() {
		return menuPrice;
	}

	public void setMenuPrice(double menuPrice) {
		this.menuPrice = menuPrice;
	}

	public int getMenuQuantityAvailable() {
		return menuQuantityAvailable;
	}

	public void setMenuQuantityAvailable(int menuQuantityAvailable) {
		this.menuQuantityAvailable = menuQuantityAvailable;
	}

	public boolean isMenuIsAvailable() {
		return menuIsAvailable;
	}

	public void setMenuIsAvailable(boolean menuIsAvailable) {
		this.menuIsAvailable = menuIsAvailable;
	}

	@Override
	public String toString() {
		return "Menu [menuID=" + menuID + ", categoryId=" + categoryId + ", menuName=" + menuName + ", menuDescription="
				+ menuDescription + ", menuPrice=" + menuPrice + ", menuQuantityAvailable=" + menuQuantityAvailable
				+ ", menuIsAvailable=" + menuIsAvailable + "]";
	}
	
	
}
