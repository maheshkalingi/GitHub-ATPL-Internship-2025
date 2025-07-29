import { Component } from '@angular/core';
import { FormsModule, NgForm } from '@angular/forms';
import { Employee } from '../employee';
import { RouterLink } from '@angular/router';
import { EmployeeService } from '../employee-service';
@Component({
  selector: 'app-employee-form',
  imports: [FormsModule, RouterLink],
  templateUrl: './employee-form.html',
  styleUrl: './employee-form.css'
})
export class EmployeeForm {
employeeInitialData: Employee = {
    employeeId: 0,
    email: '',
    employeeName: '',
    department: '',
  };
  employeeDetails: Employee = this.employeeInitialData;
  constructor(private employeeDetailsService: EmployeeService) {}

  onSubmit(formData: NgForm) {
    console.log('Form submitted:', formData.value);
    if (
      this.employeeDetailsService.verifyIfUserExists(formData.value.employeeId)
    ) {
      alert('Employee with this ID already exists!');
      return;
    } else {
      this.employeeDetailsService.addUserData(formData.value);
      alert('Employee added successfully!');

      formData.resetForm();
      this.employeeDetails = this.employeeInitialData;
    }
  }
}
