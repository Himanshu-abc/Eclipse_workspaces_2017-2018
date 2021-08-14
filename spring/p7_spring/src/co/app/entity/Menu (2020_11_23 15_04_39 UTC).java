package co.app.entity;

import java.util.Map;

public class Menu {
	
	private Map<Integer,String> menu;

	public Map<Integer, String> getMenu() {
		return menu;
	}

	public void setMenu(Map<Integer, String> menu) {
		this.menu = menu;
	}

	@Override
	public String toString() {
		return "Menu [menu=" + menu + "]";
	}
}
