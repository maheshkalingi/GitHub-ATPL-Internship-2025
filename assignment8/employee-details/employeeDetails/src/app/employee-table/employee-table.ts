import { Component ,OnInit} from '@angular/core';
import { EmployeeService } from '../employee-service';
import { Employee } from '../employee';
@Component({
  selector: 'app-employee-table',
  imports: [],
  templateUrl: './employee-table.html',
  styleUrl: './employee-table.css'
})
export class EmployeeTable implements OnInit {
constructor(private EmployeeDetailsService: EmployeeService) {}
  employeeDetails: Employee[] = [];

  ngOnInit(): void {
    this.employeeDetails = this.EmployeeDetailsService.getEmployeeData();
  }
}
