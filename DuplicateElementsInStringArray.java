package ESGProject;

public class DuplicateElementsInStringArray {

	public static void main(String[] args) {
		String arr[] = { "Ram", "Sham", "Lalu", "Pappu", "Kartik", "Shivtej", "Ram" ,"pappu","Ram"};
		//boolean flag=false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) { // 1 ;1<9 ;2 //2 <9; 3
				if (arr[i] == arr[j]) { // 1 == 2,2
					System.out.println(arr[i]);
					//flag=true;
				}
			}

		}
		//if(flag==false) {
			
		
		//System.out.println("Duplicate Elements are Not Found");
		}
	}
