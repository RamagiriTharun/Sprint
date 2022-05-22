import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { EmployeeService } from '../services/employee.service';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit {

  id!: number;
  employee: any;

  constructor(private route : ActivatedRoute,private router : Router,private employeeservice : EmployeeService) { }

  ngOnInit(): void {

    this.id = this.route.snapshot.params['id'];
    
    this.employeeservice.getemp(this.id)
      .subscribe(data => {
        console.log(data)
        this.employee = data;
      }, error => console.log(error));
  }

  updateEmployee() {
    this.employeeservice.updateEmployee(this.employee)
      .subscribe(data => {
        console.log(data);
      }, error => console.log(error));
      alert("Employee Successfully Updated.");
      this.gotoList();
  }

  onSubmit() {
    this.updateEmployee();    
  }

  gotoList() {
    this.router.navigate(['employeelist']);
  }

}
