import { Component } from '@angular/core';
import { FormBuilder, FormGroup, ReactiveFormsModule } from '@angular/forms';
import { Router } from '@angular/router';
import { CrudService } from '../../crud-service';

@Component({
  selector: 'app-add',
  imports: [ReactiveFormsModule],
  templateUrl: './add.html',
  styleUrl: './add.css'
})
export class Add {
  addUserForm:FormGroup;
constructor(private router:Router,private fb:FormBuilder,private crud:CrudService){
  this.addUserForm = this.fb.group({
    id:[''], 
    name:[''],
    email:['']

  })
  
}
onSubmit(){
    const formVal=this.addUserForm.value;
    console.log(formVal);
    this.crud.postData(formVal).subscribe(()=>{
      alert("data added successfully!");
      this.router.navigateByUrl('user');
    })

  }


onCancel(){
  this.router.navigateByUrl('user')
}
}
