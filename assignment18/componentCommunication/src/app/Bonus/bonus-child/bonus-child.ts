import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-bonus-child',
  imports: [],
  templateUrl: './bonus-child.html',
  styleUrl: './bonus-child.css'
})
export class BonusChild {
@Input() childMessage:string='';
@Output() msgToParent=new EventEmitter();
onClick(){
  this.msgToParent.emit("WoW it s Click Event From Child");
}
}
