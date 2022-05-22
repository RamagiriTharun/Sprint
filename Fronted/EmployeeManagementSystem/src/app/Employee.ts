export interface Employee{
    empId : number,
    firstName : string,
    lastName : string,
    dateOfBirth : Date,
    gender : string,
    email : string,
    phoneNumber : string,
    dateOfJoining : Date,
    designation : string,
    salary : number
}

export class Employee{
    empId!: number;
    firstName!: string;
    lastName!: string;
    dateOfBirth!: Date;
    gender!: string;
    email!: string;
    phoneNumber !: string;
    dateOfJoining !: Date;
    designation !: string;
    salary !: number;
}