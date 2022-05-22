import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  username : string ="";
  password : string ="";
  valid : boolean = false;
  constructor(private router : Router) { }

  ngOnInit(): void {
  }

  validate(data:any){
    if(data.username == "admin" && data.password == "admin"){
      alert("Successfull Login!!");
      this.valid = true;
    }
    else{
      this.valid = false;
      alert("Login failed!! Enter valid credentials");
    }
  }

  goTo(){
    if(this.valid == true){
      this.router.navigate(['employeelist']);
    }
  }
}
