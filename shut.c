#include<stdio.h>
#include<conio.h>
int main()
{
char ch;
printf("Do you want to turnoff your system(y/n)");
scanf("%d",&ch);
if(ch=='y'||ch=='Y')
{
system("C:\\windows\\system32\\shutdown/s");
return 0;
}
}