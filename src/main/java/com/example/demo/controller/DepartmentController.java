package com.example.demo.controller;
import com.example.demo.model.Department;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class DepartmentController {
          static List<Department> deps = new ArrayList<Department>();

      @GetMapping ("/showDep")
      public List<Department> listOfDep(){
          return deps;
      }

      @GetMapping ("/addDep")
      public String addDep(){
        deps.add(new Department(1,"A",0));
            return "Done!!";
      }
      static void countNumOfEmp(Integer empDepid){
               for(int i=0;i<deps.size();i++)
               {
                   if(empDepid==deps.get(i).getId()) {
                       deps.get(i).setCountOfEmp(
                               deps.get(i).getCountOfEmp() + 1);
                   }
               }
    }

}
