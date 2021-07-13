import { Component, OnInit } from '@angular/core';
import { User } from '../user';

import { UserServiceService } from '../user-service.service';


@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {

    user: User = new User ("","","","");
    message: any;

  constructor(private service : UserServiceService) { }

  ngOnInit(): void {
  }
  
  public registerNow(){
    let response = this.service.doRegistration(this.user);
    response.subscribe(data =>{
      this.message=data;
    })
  }
  
}
