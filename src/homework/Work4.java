package homework;


class Phone {
	String brand;
	String type;
	double price;
	char color;
	public void setPhone(String b,String t,double p,char c) {
		brand = b;
		type = t;
		price = p;
		color = c;
		
	}
}
class PhoneMarket {
	int index = 0;
	int sum = 0;
	public void statistics (Phone[] phones) {
		//1.便利所有手机的品牌，把不重复的品牌都放在数组里
		String[] brands = new String [phones.length];
		//2.创建一个统计brands个数的值
		int brandCount = 0;
		//3.遍历所有手机，找出品牌放入brands里
		for(int i = 0; i < phones.length;i++) {
			
		}
	}
	public void phoneNumber(Phone[] phones) {
		for(int i = 0;i < phones.length;i++) {
			index++;
		}
		System.out.println("手机的总数量是：" + index);
	}
	
	public void total(Phone[] phones) {
		for(int i = 0;i < phones.length;i++) {
			for(Phone phone : phones) {
				sum += phone.price;
			}
		}
		System.out.println("总价是" + sum);
	}
}
public class Work4 {
	public static void main(String[] args) {
		Phone[] phones = new Phone[]{new Phone(),new Phone(),new Phone(),new Phone(),
				new Phone(),new Phone(),new Phone(),new Phone(),new Phone(),new Phone()};
		phones[0].setPhone("三星", "s6", 4500,'黑');
		phones[1].setPhone("iPhone", "6s", 3800,'粉');
		phones[2].setPhone("oppo", "R20", 2999,'银');
		phones[3].setPhone("小米", "5", 1599,'金');
		phones[4].setPhone("vivo", "x9Plus", 4298,'白');
		phones[5].setPhone("华为", "荣耀v10", 3299,'蓝');
		phones[6].setPhone("乐视", "s6", 2800,'红');
		phones[7].setPhone("三星", "s6", 4500,'黑');
		phones[8].setPhone("三星", "s6", 4500,'黑');
		phones[9].setPhone("ipone", "xs", 8500,'黑');
		PhoneMarket h = new PhoneMarket();
		h.phoneNumber(phones);
		h.total(phones);
		
		
		
	}

}
