package homework;

import java.util.Random;

class Husband {
	public boolean mahjong() {
		Random rand = new Random();
		System.out.println("�����Ҵ����齫�����ˣ����ţ�");
		return rand.nextBoolean();
	}
}
class Wife {
	public void openDoor(Husband husband) {
		boolean result = husband.mahjong();
		System.out.println("���齫Ӯ��û��");
		System.out.println(result ? "Ӯ��":"����");
		if(result) {
			System.out.println("������");
		}else {
			System.out.println("�������������Űɣ�������ˣ�");
		}
	}
}

public class Work2 {
	public static void main(String[] args) {
		Husband h = new Husband();
		Wife w = new Wife();
		w.openDoor(h);
		
	}

}
