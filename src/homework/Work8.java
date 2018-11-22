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
			//产生一个0-9的随机数
			int result = r.nextInt(10);
			//结果是1，则调用方法的队伍进球数自增
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
		t1.name = "大连一方";
		Group t2 = new Group();
		t2.name = "广州恒大";
		SuperRace m = new SuperRace();
		m.race(t1, t2);
	}
}
