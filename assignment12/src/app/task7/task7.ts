import { Component } from '@angular/core';
import { CustomPipePipe } from '../custom-pipe-pipe';

@Component({
  selector: 'app-task7',
  imports: [CustomPipePipe],
  templateUrl: './task7.html',
  styleUrl: './task7.css'
})
export class Task7 {
 name:any='123456789';
}
