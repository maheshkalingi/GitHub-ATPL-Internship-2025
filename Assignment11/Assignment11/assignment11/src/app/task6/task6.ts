import { Component } from '@angular/core';

@Component({
  selector: 'app-task6',
  imports: [],
  templateUrl: './task6.html',
  styleUrl: './task6.css'
})
export class Task6 {

isDisable=false;
buttonText='Click Me';

startCount(){
  let timeLeft=10;
  this.isDisable=true;
  this.buttonText=`${timeLeft}s`;


  const interval=setInterval(()=>{
    timeLeft--;
    if(timeLeft>0){
    this.buttonText=`${timeLeft}s`;
    }else{
      clearInterval(interval);
      this.isDisable=false;
      this.buttonText="Click Me";
    }
  },1000);



}


}
