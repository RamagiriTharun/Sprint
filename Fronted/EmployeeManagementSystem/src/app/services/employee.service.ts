import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  constructor(private http:HttpClient) { }

  employee() : Observable<any >{
    return this.http.get("http://localhost:8080/getallemp");
  }

  getemp(id : number) : Observable<any>{
    const url = "http://localhost:8080/getempid/" + id;
    return  this.http.get(url);
  }

  delete(Id : number) {
    const del = "http://localhost:8080/deletebyid/" + Id;
    return this.http.delete(del);
  } 

  updateEmployee(value: any): Observable<Object> {
    const url = "http://localhost:8080/updateemp";
    return this.http.put(url, value);
  }

  addEmployee(value : any): Observable<Object> {
    return this.http.post("http://localhost:8080/addemp",value);
  }
}
