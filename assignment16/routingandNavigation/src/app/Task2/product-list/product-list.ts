import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-product-list',
  imports: [CommonModule],
  templateUrl: './product-list.html',
  styleUrl: './product-list.css'
})

export class ProductList {
products=[
  {id:1,name:'Bike'},
  {id:2,name:'car'},
  {id:3,name:'Laptop'},
  {id:4,name:'Mobile'}
];


constructor(private router:Router){}

showDetails(id:number){
  this.router.navigate(['/products',id])
}

}
