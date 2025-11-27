package com.arrays;

class bublesort
{
public static void sortdown(int[]a)
{
int n=a.length;
for (int i=0;i<n-1 ;i++ )
{
for (int j=0;j<n-1 ;j++ )
{
if(a[j]>a[j+1])
{
int temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}
}
public static void main(String[] args)
{
int []a={5,8,1,6,9,2};
sortdown(a);
for (int x: a )
{
System.out.println(x);
}
}
}
