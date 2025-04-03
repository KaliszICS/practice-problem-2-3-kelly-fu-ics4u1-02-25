public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void bubbleSortString(String[] strings){
		for (int i = 0; i < strings.length-1; i++){
			for (int j = 0; j<strings.length - 1 - i; j++ ){
				if (strings[j].compareToIgnoreCase(strings[j+1])>0){ //move the bigger one to the back, so([j]-[j+1]>0) bigger than 0
					String temp = strings[j];
					strings[j] = strings[j+1];
					strings[j+1] = temp;
				}
			}
		}
	}

}