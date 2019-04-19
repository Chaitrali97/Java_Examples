class Array_to_method1{
static void max(int arr[])
{
int max=arr[0];
for(int i=1;i<arr.length;i++)
if(max<arr[i])
max=arr[i];
System.out.println(max); 
}

public static void main(String args[])
{
int a[]={4,9,3,7};
max(a);
}
}
