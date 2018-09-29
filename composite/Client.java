package composite;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager manager = new Manager();
		Dish dish = manager.createDish();
		manager.presentDish(dish);
	}

}
