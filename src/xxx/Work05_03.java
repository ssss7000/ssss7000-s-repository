package xxx;

public class Work05_03 {

	int maxElement(int x[][]) {
		int maxnum = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] > maxnum) {
					maxnum = x[i][j];
				}
			}
		}
		return maxnum;
	}

	double maxElement(double x[][]) {
		double maxnum = 0.0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] > maxnum) {
					maxnum = x[i][j];
				}
			}
		}
		return maxnum;
	}
}
