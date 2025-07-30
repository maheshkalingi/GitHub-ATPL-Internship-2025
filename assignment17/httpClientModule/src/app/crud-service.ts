import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Iuser } from './iuser';

@Injectable({
  providedIn: 'root'
})
export class CrudService {

  base_url:string=" http://localhost:3000/User";
  constructor(private http:HttpClient){}

  getData(){
     return this.http.get<Iuser[]>(this.base_url);
  }
  dataDelete(id:number){
   return this.http.delete(`${this.base_url}/${id}`);
  }

  postData(data:Iuser){
    return this.http.post(this.base_url,data)
  }
  getDatabyId(id: number) {
    return this.http.get<Iuser>(`${this.base_url}/${id}`);
  }
putDatabyId(id:number,data:Iuser){
  return this.http.put(`${this.base_url}/${id}`,data);
}

  
}
