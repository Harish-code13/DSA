package problemsolving;

public class reverse {
 public static void main(String[] args) {
int arr[]= {10,20,34,30,40};
int n =arr.length;

int[] b =new int[n];
int j=n-1;

for(int i=0;i<n;i++) {
	b[j]=arr[i];
	j--;
}
System.out.println("reverse:");
for(int i=0;i<n;i++) {
	System.out.print(b[i]+" ");
}
}
}

