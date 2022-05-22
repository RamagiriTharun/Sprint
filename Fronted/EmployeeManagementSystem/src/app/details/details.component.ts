import { ThisReceiver } from '@angular/compiler';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Employee } from '../Employee';
import { EmployeeService } from '../services/employee.service';


@Component({
  selector: 'app-details',
  templateUrl: './details.component.html',
  styleUrls: ['./details.component.css']
})
export class DetailsComponent implements OnInit {

  id!: number;
  employee: any;


  constructor(private route : ActivatedRoute,private router : Router,private employeeService : EmployeeService) { }

  ngOnInit(): void {

    this.id = this.route.snapshot.params['id'];
    this.employeeService.getemp(this.id)
      .subscribe((data) => {
        console.log(data)
        this.employee = data;
      }, (error) => console.log(error));
  }


  list(){
    this.router.navigate(['employeelist']);
  }


}



