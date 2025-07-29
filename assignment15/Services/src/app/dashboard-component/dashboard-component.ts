import { Component, OnInit } from '@angular/core';
import { WeatherService } from '../weather-service';
import { catchError, of } from 'rxjs';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-dashboard-component',
  imports: [CommonModule],
  templateUrl: './dashboard-component.html',
  styleUrl: './dashboard-component.css'
})
export class DashboardComponent  implements OnInit{
constructor(private weatherDasboard:WeatherService){}

weather:any;
errorMessage:string='';
ngOnInit(): void {
  this.weatherDasboard.getWeather()
  .pipe(
    catchError((error)=>{
       this.errorMessage="failed to fetch data";
       return of(null);
    })
  )
  .subscribe(dat=>{
    this.weather=dat;
  });
}
}
