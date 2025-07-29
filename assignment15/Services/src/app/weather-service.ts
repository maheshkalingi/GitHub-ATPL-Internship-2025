import { Injectable } from '@angular/core';
import { Observable,of,throwError } from 'rxjs';
import { LoggerService } from './logger-service';

@Injectable()
export class WeatherService {
  weather={
    city:'vizag',
    temparature:'28',
    description:'Partly cloudy'
  }
  constructor(private logger:LoggerService){}
  getWeather():Observable<any>{
  this.logger.logMethod("getWeather() method was called");
     return of(this.weather);
  }
  getWeatherWithError():Observable<any>{
     return throwError(()=>new Error('Failed to fetch Weather Data'))
  }
}
