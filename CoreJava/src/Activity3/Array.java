package Activity3;

public class Array {
	void printArray(int arr[]) {
		for(int i : arr) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		int numArr[] = new int[20];
		int evenArr[] = new int[5];
		int oddArr[] = new int[5];
		
		for(int i=0; i<20; i++) {
			numArr[i] = i+1;
		}
		
        int evenIndex = 0;
        int oddIndex = 0;

        for(int i=0; i<numArr.length; i++) {
            if(numArr[i] % 2 == 0 && evenIndex < evenArr.length) {
                evenArr[evenIndex] = numArr[i];
                evenIndex++;
            } else if(numArr[i] % 2 != 0 && oddIndex < oddArr.length) {
                oddArr[oddIndex] = numArr[i];
                oddIndex++;
            }
        }

        Array obj = new Array();
        
        System.out.println("Original numbers:");
        obj.printArray(numArr);
        
        System.out.println("Even numbers:");
        obj.printArray(evenArr);

        System.out.println("Odd numbers:");
        obj.printArray(oddArr);
	}	

}
