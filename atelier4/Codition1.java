package atelier4;

public class Codition1 {
	public static void main(String[] args) {
	int p1 = 10, p2 = 9, p3 = -1, p4 = 4, p5 = 8;
	int max;
	if(p1 > p2) {
		if(p2 > p3)
			max = p1;
		else
			max = p3;
	}
	else{
		if(p2 > p3)
			max = p2;
		else
			max = p3;
	}
	
	
	int min;
	if(p1 < p2) {
		if(p2 < p3)
			min = p1;
		else
			min = p3;
	}
	else{
		if(p2 < p3)
			min = p2;
		else
			min = p3;
	}
	
	
	int med
	if(p1 < p2) {
		if(p2 < p3)
			med = p2;
		else if(p1 < p3)
			med = p3;
		else
			med = p1;
	}
	else{
		if(p2 < p3)
			med = p2;
		else if(p1 < p3)
			med = p1;
		else
			med = p3;
	}
	
	}
	
}

