#include<stdio.h>
#include<conio.h>
int main()
{
int max,min,n,i,a[15];
scanf("%d",&n);
printf("Enter the array elements");
for(i=0;i<n;i++)
{
scanf("%d",&a[i]);
}
max=a[0];
min=a[0];
for(i=1;i<=n;i++)
{
if(a[i]>max)
{
max=a[i];
}
else if(a[i]<min)
{
min=a[i];
}
}
printf("maximum number is %d",max);
printf("minimum number is %d",min);
}
