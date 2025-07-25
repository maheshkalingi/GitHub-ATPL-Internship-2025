import { Component } from '@angular/core';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatIconModule } from '@angular/material/icon';
import { MatButtonModule } from '@angular/material/button';
import { MatCardModule } from '@angular/material/card';
import { MatTableModule } from '@angular/material/table';
import { MatDialogModule } from '@angular/material/dialog';
import { MatSnackBarModule } from '@angular/material/snack-bar';
import { FormsModule } from '@angular/forms';
import { TemplateRef, ViewChild } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import {MatListModule} from '@angular/material/list';


@Component({
  selector: 'app-task5',
  imports: [MatToolbarModule,
    MatSidenavModule,
    MatIconModule,
    MatButtonModule,
    MatCardModule,
    MatTableModule,
    MatDialogModule,
    MatSnackBarModule,
    FormsModule,MatListModule],
  templateUrl: './task5.html',
  styleUrl: './task5.css'
})
export class Task5 {
@ViewChild('dialogTemplate') dialogTemplate!: TemplateRef<any>;
  @ViewChild('sidenav') sidenav: any;

  isDarkTheme = false;

  columns: string[] = ['position', 'name','Role','Age'];
  data = [
    { position: 1, name: 'mahesh' ,Role:'developer',age:21},
    { position: 2, name: 'naveen' ,Role:'tester',age:22},
    { position: 3, name: 'deelip'  ,Role:'HR',age:23}
  ];

  constructor(private dialog: MatDialog) {}

  openDialog() {
    this.dialog.open(this.dialogTemplate);
  }

  toggleSidenav() {
    this.sidenav.toggle();
  }
}
