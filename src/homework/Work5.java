package homework;

class Boy1 {
	int wages;
	boolean handsome;
}
class Girl1 {
	String education;
	double height;
}
class Program {
	public void Marry(Boy1 boy,Girl1 girl) {
		if(boy.wages > 10000 && boy.handsome && girl.height > 1.6 && girl.education.equals("本科")) {
			System.out.println("成功");
		}else {
			System.out.println("失败");
		}
	}
}

public class Work5 {
	public static void main(String[] args) {
		Boy1 b = new Boy1();
		b.wages = 12000;
		b.handsome = true;
		Girl1 g = new Girl1();
		g.education = "本科";
		g.height = 1.63;
		Program m = new Program();
		m.Marry(b, g);
		
		
		
	}
}
