import { CommonModule } from '@angular/common';
import { Component, inject } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { MatButtonModule } from '@angular/material/button';
import { MatInputModule } from '@angular/material/input';
import { MatSnackBar } from '@angular/material/snack-bar';

@Component({
  selector: 'app-dialog',
  imports: [ReactiveFormsModule, CommonModule, MatInputModule,MatButtonModule],
  templateUrl: './dialog.html',
  styleUrl: './dialog.css'
})
export class Dialog {
  userForm : FormGroup = new FormGroup({
    name : new FormControl('',[Validators.required]),
    email : new FormControl('',[Validators.required,Validators.email]),
    phone : new FormControl('',[Validators.required, Validators.min(1000000000)])
  })
  private snackBar = inject(MatSnackBar);
  openSnackBar(): void {
    this.snackBar.open('Form submitted ', 'Done');
    this.userForm.reset();
  }
}