package homework;

import java.util.Random;

class Husband {
	public boolean mahjong() {
		Random rand = new Random();
		System.out.println("老婆我打完麻将回来了，开门！");
		return rand.nextBoolean();
	}
}
class Wife {
	public void openDoor(Husband husband) {
		boolean result = husband.mahjong();
		System.out.println("打麻将赢了没？");
		System.out.println(result ? "赢了":"输了");
		if(result) {
			System.out.println("进来吧");
		}else {
			System.out.println("今晚就在外面待着吧，别回来了！");
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
