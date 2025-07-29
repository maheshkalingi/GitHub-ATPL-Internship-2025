import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
// import { MyComponent } from './my-component/my-component';
// import { UserGreeting } from './user-greeting/user-greeting';
// import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet,
    // MyComponent
  // UserGreeting,FormsModule
  ],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('my-first-project');
}
