package composite;

public class Manager {
	
	public Dish createDish(){
	
			IIngredients ingr11 = new LeafIngredient("ingr11");
			IIngredients ingr12 = new LeafIngredient("ingr12");
			IIngredients ingr13= new LeafIngredient("ingr13");
			
			IIngredients ingr21 = new LeafIngredient("ingr21");
			IIngredients ingr22 = new LeafIngredient("ingr22");
			
			IIngredients ingr31 = new LeafIngredient("ingr31");
			IIngredients ingr32 = new LeafIngredient("ingr32");
			
			Dish ingr1 = new Dish("ingr1");
			Dish ingr2 = new Dish("ingr2");
			Dish ingr3 = new Dish("ingr3");
			
			Dish ingr = new Dish("Main Dish");
			
			
			ingr1.addIngredients(ingr11);	
			ingr1.addIngredients(ingr12);
			ingr1.addIngredients(ingr13);
			
			ingr2.addIngredients(ingr21);
			ingr2.addIngredients(ingr22);
			
			ingr3.addIngredients(ingr31);
			ingr3.addIngredients(ingr32);	
			
			ingr.addIngredients(ingr1);
			ingr.addIngredients(ingr2);
			ingr.addIngredients(ingr3);
			
			return ingr;
	}
	
	public void presentDish(Dish dish){
		
		System.out.println("Main Dish - ");
		for(IIngredients leaf: dish.comprised){
			
			leaf.ingredientName();
			
		}
		
	}
}
