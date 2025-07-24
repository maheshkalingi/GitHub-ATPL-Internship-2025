import { Component } from '@angular/core';
import {MatIconModule} from '@angular/material/icon';
import {MatButtonModule} from '@angular/material/button';
import {MatToolbarModule} from '@angular/material/toolbar';
import {MatSidenavModule} from '@angular/material/sidenav';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatSelectModule} from '@angular/material/select';
import { RouterOutlet } from '@angular/router';
import {MatListModule} from '@angular/material/list';


@Component({
  selector: 'app-task3',
  imports: [MatIconModule ,MatListModule,MatButtonModule, MatToolbarModule, MatSidenavModule, MatFormFieldModule, MatSelectModule, RouterOutlet],
  templateUrl: './task3.html',
  styleUrl: './task3.css'
})
export class Task3 {

}
