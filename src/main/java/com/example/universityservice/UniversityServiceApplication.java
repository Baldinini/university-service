package com.example.universityservice;

import com.example.universityservice.model.Degree;
import com.example.universityservice.model.Department;
import com.example.universityservice.model.Lector;
import com.example.universityservice.service.DepartmentService;
import com.example.universityservice.service.LectorService;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class UniversityServiceApplication {

    public static void main(String[] args) {
        Lector assistance = new Lector();
        assistance.setName("Nina");
        assistance.setLastname("Lol");
        assistance.setSalary(12000);
        assistance.setDegree(Degree.ASSISTANT);

        Lector assProfessor = new Lector();
        assProfessor.setName("bob");
        assProfessor.setLastname("Lol");
        assProfessor.setSalary(15000);
        assProfessor.setDegree(Degree.ASSOCIATE_PROFESSOR);

        Lector professor = new Lector();
        professor.setName("Rick");
        professor.setLastname("Lol");
        professor.setSalary(20000);
        professor.setDegree(Degree.PROFESSOR);

        ConfigurableApplicationContext context =
                SpringApplication.run(UniversityServiceApplication.class, args);
        LectorService lectorService = context.getBean(LectorService.class);
        lectorService.save(assistance);
        lectorService.save(assProfessor);
        lectorService.save(professor);

        Department aviaDepartment = new Department();
        aviaDepartment.setName("Avia");
        aviaDepartment.setHeadOfDepartment(professor);
        aviaDepartment.setLectors(List.of(assistance, assProfessor, professor));

        Department carDepartment = new Department();
        carDepartment.setName("Car");
        carDepartment.setHeadOfDepartment(assistance);
        carDepartment.setLectors(List.of(assistance, professor));

        DepartmentService departmentService = context.getBean(DepartmentService.class);
        departmentService.save(aviaDepartment);
        departmentService.save(carDepartment);

        System.out.println(departmentService.getHeadOfDepartment(aviaDepartment.getName()));
        System.out.println();
        System.out.println(departmentService.countAllEmploys(aviaDepartment.getName()));
        System.out.println();
        System.out.println(departmentService
                .getAverageSalaryOfDepartment(aviaDepartment.getName()));
        System.out.println();

    }
}
