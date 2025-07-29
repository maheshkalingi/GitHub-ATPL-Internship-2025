import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { DashboardComponent } from '../dashboard-component/dashboard-component';
import { WeatherService } from '../weather-service';



@NgModule({
  declarations: [],
  exports:[DashboardComponent],
  imports: [
    CommonModule,DashboardComponent
  ],
  providers:[WeatherService]
})
export class WeatherModuleModule { 

}
