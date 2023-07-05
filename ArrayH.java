package Pack1;

public class ArrayH {
	static int Ispresent(int arr[], int key) {
		int ans = -1;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]==key) {
				ans = i;
				return ans;
			}
			else {
				ans = i -1;
				
			}
ans = ans +1;

		}
		;
		return ans;
	}
		
	




	public static void main(String[] args) {
		int arr[]= {11,12,14,20,23}; int key =15;
		System.out.println(Ispresent(arr,key));
		
		
		// TODO Auto-generated method stub

	}

	}
