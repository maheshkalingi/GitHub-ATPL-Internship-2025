import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add',
  imports: [],
  templateUrl: './add.html',
  styleUrl: './add.css'
})
export class Add {
constructor(private router:Router){}

onCancel(){
  this.router.navigateByUrl('user')
}
}
