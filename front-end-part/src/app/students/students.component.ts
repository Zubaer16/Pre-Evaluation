import { Component, OnInit } from '@angular/core';
import { UserServiceService } from '../user-service.service';


@Component({
  selector: 'app-students',
  templateUrl: './students.component.html',
  styleUrls: ['./students.component.css']
})
export class StudentsComponent implements OnInit {

  users : any;

  constructor(private service : UserServiceService) { }

  ngOnInit(): void{
    let response = this.service.getUsers();
    response.subscribe(data => this.users = data)
  }
  public removeUser(username : number){
    let response = this.service.removeUser(username);
    response.subscribe((data: any) => this.users =data);
  }
}

