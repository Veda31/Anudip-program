public class SplitArray{

public static void main(String args[])
{
	int [] arr1 = {1,2,3,4,5,6,7,8,9,10};
	    int [] arr2 = {0,0,0,0,0};
		int [] arr3 = {0,0,0,0,0};
		int c = 0;
		int len = arr1.length;
		int len1 = arr2.length;
		
		for(int i = 0 ; i<len1 ;i++) {
			arr2[i]=arr1[c];
			c++;
		}
		for(int i = 0 ; i<len1 ;i++) {
			arr3[i]=arr1[c];
			c++;
		}
        System.out.println("Actual array");
        for(int i = 0 ; i<len ;i++) {
			System.out.println(arr1[i]);
		}
        System.out.println("FirstHalf array");
        for(int i = 0 ; i<len1 ;i++) {
			System.out.println(arr1[i]);
		}
        System.out.println("Second half array");
        for(int i = 0 ; i<len1 ;i++) {
			System.out.println(arr3[i]);
		}

}

}
