import java.util.Scanner;
class student
{
int usn;
String name;
void details(){
Scanner sc=new Scanner(System.in);
System.out.print("Enter usn:");
usn=sc.nextInt();
sc.nextLine(); 
System.out.print("Enter name:");
name=sc.nextLine();
}
void display(){
System.out.println("USN"+usn);
System.out.println("Name"+name);}
public static void main (String[] args){
student[] s= new student[2];
for (int i=0;i<2;i++){
s[i]=new student();
s[i].details();
}
for(int i=0;i<2;i++){
s[i].display();
}

}}