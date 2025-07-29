import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { WeatherModuleModule } from './weather-module/weather-module-module';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet,WeatherModuleModule],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('Services');
}
