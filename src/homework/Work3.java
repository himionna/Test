package homework;
class PM {
	int workingAge;
	double wages;
	boolean businessTrip;
}
class HR{
	public void interview(PM pm) {
		if(pm.workingAge >= 5 && pm.wages <= 12000 && pm.businessTrip ) {
			System.out.println("����¼��");
		}else{
			System.out.println("����¼��");
		}
	}
	
}
public class Work3 {
	public static void main(String[] args) {
		PM p = new PM();
		p.workingAge = 6;
		p.businessTrip = true;
		p.wages = 11000;
		HR hr = new HR();
	
		hr.interview(p);
	}
}
