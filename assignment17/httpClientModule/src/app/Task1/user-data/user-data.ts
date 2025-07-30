import { Component, OnInit } from '@angular/core';
import { CrudService } from '../../crud-service';
import { Iuser } from '../../iuser';
import { CommonModule } from '@angular/common';
import { Router } from '@angular/router';

@Component({
  selector: 'app-user-data',
  imports: [CommonModule],
  templateUrl: './user-data.html',
  styleUrl: './user-data.css'
})
export class UserData implements OnInit{
constructor(private crud:CrudService,private router:Router){}
api_data:Iuser[]=[];

ngOnInit(): void {
  this.getAllData();
}
getAllData(){
 this.crud.getData().subscribe(res=>{
  this.api_data=res;
 })
}
addNewUser(){
this.router.navigateByUrl('add');
}
onDelete(id:number){
this.crud.dataDelete(id).subscribe(()=>{
  alert('user data deleted successfully!');
  this.getAllData();
});
}

onUpdate(id:number){
  this.router.navigate(['update',id]);
}
}
