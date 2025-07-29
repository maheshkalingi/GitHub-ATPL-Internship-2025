import { Injectable } from '@angular/core';
import { Employee } from './employee';
@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
   private employeeList: Employee[] = [];

  getEmployeeData(): Employee[] {
    if (localStorage.getItem('employeeList')) {
      this.employeeList = JSON.parse(
        localStorage.getItem('employeeList') || '[]'
      );
    } else {
      this.employeeList = [];
    }
    return this.employeeList;
  }

  verifyIfUserExists(id: number): boolean {
    return !!this.employeeList?.some((employee) => employee.employeeId === id);
  }

  addUserData(employee: Employee): void {
    this.employeeList.push(employee);
    localStorage.setItem('employeeList', JSON.stringify(this.employeeList));
  }
}
