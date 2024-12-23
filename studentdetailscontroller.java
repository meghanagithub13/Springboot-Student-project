
package com.studentdetails.student;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/details")
public class studentdetailscontroller {
    //studentdetails det;
    studentservice service;
    public studentdetailscontroller(studentservice service) {
      this.service = service;
   }
   @GetMapping("{id}")
    public studentdetails getdetails(@PathVariable("id") String id){
            return service.getdetails(id);
       //return new details("s1","elakkiya","xxxx","yyyy"); 
    }
    @PostMapping
    public String createstudentdetails(@RequestBody studentdetails det){
        //this.det=det;
        service.createstudentdetails(det);
        return "created successfully";
    }
    @PutMapping
     public String updatestudentdetails(@RequestBody studentdetails det){
        //this.det=det;
        service.updatestudentdetails(det);
        return "updated successfully";
     }
    @DeleteMapping("{id}")
         public String deletestudentdetails(@PathVariable("id")String id){
        //this.det=det;
        service.deletestudentdetails("id");
        return "deleted successfully";
     }
     @GetMapping()
     public List<studentdetails> getalldetails(){
      return service.getalldetails();
      
     }
}
