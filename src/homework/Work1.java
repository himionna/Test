package homework;

//一个厨师做菜
class Vegetable {
	String name;
	double price;
}

class Cooker{
	String name;
	public void cookVegetable(Vegetable v) {
		System.out.println(name +"花了" +v.price +"块钱，买了"+ v.name + "做菜。");
	}
}

public class Work1 {
	public static void main(String[] args) {
		Vegetable v = new Vegetable();
		v.name = "西红柿和鸡蛋";
		v.price = 13.5;
		
		Cooker chef = new Cooker();
		chef.name = "大明";
		chef.cookVegetable(v);
		
	}

}
