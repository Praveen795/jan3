package jan3;



public class jan3 {
// ___________________[marge sort]____________________________________________________________________***
	void marge(char[] a,int l,int h) {
		int mid=(h+l)/2;
		
		int i=l;
		int k=l;
		int j=mid+1;
		char[] tmp=new char[a.length];
		
		while(i<=mid && j<=h) {
			if(a[i]<a[j]) {
				tmp[k++]=a[i++];
			}else {
				tmp[k++]=a[j++];
			}
		}
		while(i<=mid) {
			tmp[k++]=a[i++];
		}
		while(j<=h) {
			tmp[k++]=a[j++];
		}
		for(i=l;i<=h;i++) {
			a[i]=tmp[i];
		}
		
	}
	static void print(char[] arr) {
		int n=arr.length-1;
		for(int i=0;i<=n;i++) {
			System.out.print(arr[i]+" ");
			System.out.println();
		}
	}
	
	void sort(char[] arr,int l,int r) {
		if(l<r) {
			int mid=l+(r-l)/2;
			
			sort(arr,l,mid);
			sort(arr,mid+1,r);
			
			marge(arr,l,r);
		}
	}
	
	public static void main(String[] args) {
		
		char[] arr= {'c','a','d','h'};
		
		jan3 ob=new jan3();
		
		ob.sort(arr,0,arr.length-1);
		
		System.out.println("sorted array");
		
		print(arr);
		
	/* 
	 ______________________[2nd problem]__________________________________________________________________***
	 
	 *algoritham 
	 
	 1) choose any idex as pivet
	 
	 2) take 2 variable point left and right
	 
	 3) left point to low index and right as a high idex
	 
	 4) while value is less then pivet move right
	 
	 5) while value is greter then pivet move left
	 
	 6) if step 5 & 5 does not match swap right and left
	 
	 7) if left>=right , the point where they meet is new pivet
	 
	 
_________________________________________________________________________________________________________________***
	  
	 */
		
	}

}


















