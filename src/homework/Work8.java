package homework;

import java.util.Random;

class Group {
	int goalNum;
	String name;
}
class SuperRace{
	public void race(Group t1,Group t2) {
		Random r = new Random();
		for(int i = 0;i < 30;i++) {
			//����һ��0-9�������
			int result = r.nextInt(10);
			//�����1������÷����Ķ������������
			if(1 == result) {
				t1.goalNum++;
			}else if(2 == result) {
				t2.goalNum++;
			}
		}
		System.out.println(t1.name + "\t:" + t2.name);
		System.out.println(t1.goalNum + "\t:" + t2.goalNum);
	}
}
public class Work8 {
public static void main(String[] args) {
		
		Group t1 = new Group();
		t1.name = "����һ��";
		Group t2 = new Group();
		t2.name = "���ݺ��";
		SuperRace m = new SuperRace();
		m.race(t1, t2);
	}
}
