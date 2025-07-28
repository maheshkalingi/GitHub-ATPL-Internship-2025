import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Task1 } from './task1/task1';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet,Task1],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('routingandNavigation');
}
