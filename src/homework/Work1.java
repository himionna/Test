package homework;

//һ����ʦ����
class Vegetable {
	String name;
	double price;
}

class Cooker{
	String name;
	public void cookVegetable(Vegetable v) {
		System.out.println(name +"����" +v.price +"��Ǯ������"+ v.name + "���ˡ�");
	}
}

public class Work1 {
	public static void main(String[] args) {
		Vegetable v = new Vegetable();
		v.name = "�������ͼ���";
		v.price = 13.5;
		
		Cooker chef = new Cooker();
		chef.name = "����";
		chef.cookVegetable(v);
		
	}

}
