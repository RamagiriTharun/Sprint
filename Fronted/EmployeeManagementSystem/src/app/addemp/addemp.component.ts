import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Employee } from '../Employee';
import { EmployeeListComponent } from '../employee-list/employee-list.component';
import { EmployeeService } from '../services/employee.service';

@Component({
  selector: 'app-addemp',
  templateUrl: './addemp.component.html',
  styleUrls: ['./addemp.component.css']
})
export class AddempComponent implements OnInit {

  employee : Employee = new Employee()

  constructor(private employeeService : EmployeeService,private router : Router) { }

  ngOnInit(): void {
  }

  addEmp(data:any){
    this.employeeService.addEmployee(data).
    subscribe(data => {
      console.log(data);
    }, error => console.log(error));
    alert("Employee Successfully Added.");
    this.router.navigate(['employeelist']);
  }

  onSubmit(data:any){
    this.addEmp(data);
  }

}
