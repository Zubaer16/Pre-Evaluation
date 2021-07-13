import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from './user';


@Injectable({
  providedIn: 'root'
})
export class UserServiceService {

  constructor(private http : HttpClient) { }
  public doRegistration(user : User){
    return this.http.post("http://localhost:8080/api/v1/users", user, {responseType : "text" as "json"});
  }
  public getUsers(){
    return this.http.get("http://localhost:8080/api/v1/users");
  }
  public getUserByUsername(username: string){
    return this.http.get("http://localhost:8080/api/v1/user/"+username);
  }
  public removeUser(username: number){
    return this.http.get("http//localhost:8080/api/v1/users"+username);
  }
}
