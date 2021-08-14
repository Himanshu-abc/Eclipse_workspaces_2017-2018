package co.app.entity;

public class Restaurant implements RestaurantInterface{

	private Menu menu;

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	
	@Override
	public void greetCustomer() {
		System.out.println("welcome customer");
	}

	@Override
	public void showMenu() {
		System.out.println("restaurant has folowing menu "+menu);
	}

	@Override
	public String toString() {
		return "Restaurant [menu=" + menu + "]";
	}
}
