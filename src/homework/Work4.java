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
		//1.���������ֻ���Ʒ�ƣ��Ѳ��ظ���Ʒ�ƶ�����������
		String[] brands = new String [phones.length];
		//2.����һ��ͳ��brands������ֵ
		int brandCount = 0;
		//3.���������ֻ����ҳ�Ʒ�Ʒ���brands��
		for(int i = 0; i < phones.length;i++) {
			
		}
	}
	public void phoneNumber(Phone[] phones) {
		for(int i = 0;i < phones.length;i++) {
			index++;
		}
		System.out.println("�ֻ����������ǣ�" + index);
	}
	
	public void total(Phone[] phones) {
		for(int i = 0;i < phones.length;i++) {
			for(Phone phone : phones) {
				sum += phone.price;
			}
		}
		System.out.println("�ܼ���" + sum);
	}
}
public class Work4 {
	public static void main(String[] args) {
		Phone[] phones = new Phone[]{new Phone(),new Phone(),new Phone(),new Phone(),
				new Phone(),new Phone(),new Phone(),new Phone(),new Phone(),new Phone()};
		phones[0].setPhone("����", "s6", 4500,'��');
		phones[1].setPhone("iPhone", "6s", 3800,'��');
		phones[2].setPhone("oppo", "R20", 2999,'��');
		phones[3].setPhone("С��", "5", 1599,'��');
		phones[4].setPhone("vivo", "x9Plus", 4298,'��');
		phones[5].setPhone("��Ϊ", "��ҫv10", 3299,'��');
		phones[6].setPhone("����", "s6", 2800,'��');
		phones[7].setPhone("����", "s6", 4500,'��');
		phones[8].setPhone("����", "s6", 4500,'��');
		phones[9].setPhone("ipone", "xs", 8500,'��');
		PhoneMarket h = new PhoneMarket();
		h.phoneNumber(phones);
		h.total(phones);
		
		
		
	}

}
