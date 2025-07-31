import { Component } from '@angular/core';
import { Genericapi } from '../genericapi';
import { Product } from '../models/product';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-user5',
  imports: [CommonModule],
  templateUrl: './user5.html',
  styleUrl: './user5.css'
})
export class User5 {
products: Product[] = [];

  constructor(private productApi: Genericapi<Product>) {
    this.productApi.setBaseUrl('https://fakestoreapi.com/products');
  }

  ngOnInit() {
    this.productApi.getAll().subscribe(data => {
      this.products = data;
    });
  }
}
