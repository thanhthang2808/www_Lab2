package vn.edu.iuh.fit;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import vn.edu.iuh.fit.models.Employee;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("thang.xml");
        Employee emp = ctx.getBean("emp1", Employee.class);

        emp.show();
    }
}