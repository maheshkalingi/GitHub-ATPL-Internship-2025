import { Component, signal } from '@angular/core';
import { RouterModule, RouterOutlet } from '@angular/router';
import { Task1 } from './task1/task1';
import { ProductList } from './Task2/product-list/product-list';
import { ProductDetails } from './Task2/product-details/product-details';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet,Task1,RouterModule],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('routingandNavigation');
}
