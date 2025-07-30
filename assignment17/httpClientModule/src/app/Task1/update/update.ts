import { Component, OnInit } from '@angular/core';
import { CrudService } from '../../crud-service';
import { ActivatedRoute, Router } from '@angular/router';
import { FormBuilder, FormGroup, ReactiveFormsModule } from '@angular/forms';

@Component({
  selector: 'app-update',
  imports: [ReactiveFormsModule],
  templateUrl: './update.html',
  styleUrl: './update.css'
})
export class Update implements OnInit{
userData:any;
  userId!: number; 
 updateUserForm:FormGroup;
  constructor(private crud:CrudService,private fb:FormBuilder,private route:ActivatedRoute,private router:Router){
    this.updateUserForm = this.fb.group({
    id:[''], 
    name:[''],
    email:['']

  })
  }

ngOnInit(): void {
  this.userId = +this.route.snapshot.params['id'];


this.crud.getDatabyId(this.userId).subscribe((res)=>{
  this.userData=res;
  this.updateUserForm.setValue({id:this.userData.id,name:this.userData.name,email:this.userData.email})
})

}
onSubmit(){
this.crud.putDatabyId(this.userId,this.updateUserForm.value).subscribe((res)=>{
  alert("data updated successfully");
  this.router.navigateByUrl('user')
})
  }


onCancel(){
  this.router.navigateByUrl('user')
}
}
