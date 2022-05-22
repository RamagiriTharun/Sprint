import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Employee } from '../Employee';
import { EmployeeService } from '../services/employee.service';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {

  public employee : Employee[] = [];

  constructor(private employeeService : EmployeeService,private router:Router) { }

  ngOnInit(): void {
    this.employeeService.employee().subscribe((data)=> {
      this.employee = data;
      console.log(data);
    });
  }

  // reloadData() {
  //   this.employeeService.employee().subscribe((data) =>{
  //     this.employee = data;
  //   });
  // }

  update(id:number){
    this.router.navigate(['update',id]);
  }


  details(id:number){
    this.router.navigate(['details',id]);
  }

  delete(Id:number){
    this.employeeService.delete(Id).subscribe((data)=>{
      console.log(data);
    },
    error => console.log(error));
    alert("Employee Successfully deleted !!");
    this.router.navigate(['employeelist']);
  }

  add(){
    this.router.navigate(['addemp']);
  }

  logout(){
    this.router.navigate(['home']);
  }

}
