class TestArrays {
	public static void main (String [] args) {
		int y = 0;
		String [] islands = new String[4];
		islands[0] = "Bermudi";
		islands[1] = "Fidzhi";
		islands[2] = "Azorskie ostrova";
		islands[3] = "Kosumel";
		int [] index = new int[4];
		index[0] = 1;
		index[1] = 3;
		index[2] = 0;
		index[3] = 2;
		int ref; 
		while (y < 4) {
			ref = index[y];
			System.out.println(islands[ref]);
			y = y + 1;
		}
	}
}