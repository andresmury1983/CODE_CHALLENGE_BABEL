import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class SneakersService {

  API_URI='http://localhost:8080/api/mysneakers';
  constructor( private http:HttpClient) { 

  }

  getSneakersList(){
     return this.http.get(`${this.API_URI}/listSneakers`) ;  
  }

  getSneakerInfo(id: String){
    return this.http.get(`${this.API_URI}/sneakerInfo/${id}`) ;
 }
}
