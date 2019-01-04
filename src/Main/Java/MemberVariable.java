import java.util.Scanner;

public class MemberVariable {
    public static void main(String args[]){
        Member member = new Member();
        System.out.println("Enter the name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        member.setName(name);
        System.out.println("Enter the age: ");
        int age = sc.nextInt();
        member.setAge(age);
        System.out.println("Enter the salary: ");
        double salary = sc.nextDouble();
        member.setSalary(salary);
        System.out.println("Name: " + member.getName());
        System.out.println("Age: "+member.getAge());
        System.out.println("Salary: "+member.getSalary());
    }
}
