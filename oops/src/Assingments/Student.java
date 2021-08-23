package Assingments;


public class Student {
	
String name;
int age;
char section;
char gender;
int sub1,sub2,sub3,sum;
float percent;

 Student(String n1,int x,char a,char g,int s1,int s2,int s3)
{
	name=n1;
	age=x;
	section=a;
	gender=g;
	sub1=s1;
	sub2=s2;
	sub3=s3;
}
 Student(String n2,int a,char s,char g,int s2,int s3)
{
	name=n2;
	age=a;
	section=s;
	gender=g;
	sub2=s2;
	sub3=s3;
}
public void  calculate()
{
	sum=sub1+sub2+sub3;
	percent=(sum*100)/300;
	System.out.println("total marks of student : "+sum);
	System.out.println("percentage: "+percent);


}
	public static void main(String[] args) {
       int s1,s2,s3;
Student stu1 =new Student("radha",21,'A','M',56,70,95);
Student stu2 =new Student("motuu",16,'B','M',65,70);
Student stu3 =new Student("hero",2,'C','F',80,91);
Student stu4 =new Student("richer",22,'D','F',56,60);
stu1.calculate();
stu2.calculate();
stu3.calculate();
stu4.calculate();


	}

}