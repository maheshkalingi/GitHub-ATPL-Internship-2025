import { DialogModule } from '@angular/cdk/dialog';
import { Component, inject } from '@angular/core';
import {MatButtonModule} from '@angular/material/button';
import {MatDialog, MatDialogModule} from '@angular/material/dialog';
@Component({
  selector: 'app-task4',
  imports: [MatButtonModule,MatDialogModule],
  templateUrl: './task4.html',
  styleUrl: './task4.css'
})
export class Task4 {
readonly dialog = inject(MatDialog);
openDialog():void{
  this.dialog.open(MatDialogModule);
}
}
