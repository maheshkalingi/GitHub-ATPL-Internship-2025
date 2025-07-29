import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoggerService {
  logMethod(message:string){
    console.log('loggerService:',message);
  }
}
