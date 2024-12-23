package com.studentdetails.student;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class studentserviceimple implements studentservice {
   studentrepo repo;

public studentserviceimple(studentrepo repo) {
    this.repo = repo;
}

@Override
public String createstudentdetails(studentdetails det) {
    // TODO Auto-generated method stub
    //throw new UnsupportedOperationException("Unimplemented method 'createstudentdetails'");
     repo.save(det);
     return "success";
}

@Override
public String updatestudentdetails(studentdetails det) {
    // TODO Auto-generated method stub
    //throw new UnsupportedOperationException("Unimplemented method 'updatestudentdetails'");
     repo.save(det);
     return "updated";
}

@Override
public String deletestudentdetails(String id) {
    // TODO Auto-generated method stub
    //throw new UnsupportedOperationException("Unimplemented method 'deletestudentdetails'");
     repo.deleteById(id);
     return "deleted";
}

@Override
public studentdetails getdetails(String id) {
    // TODO Auto-generated method stub
    //throw new UnsupportedOperationException("Unimplemented method 'getstudentdetails'");
    return repo.findById(id).get();
}

@Override
public List<studentdetails> getalldetails() {
    // TODO Auto-generated method stub
    //throw new UnsupportedOperationException("Unimplemented method 'getalldetails'");
return repo.findAll();

}
   
}
