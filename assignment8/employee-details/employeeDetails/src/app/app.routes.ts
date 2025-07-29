import { Routes } from '@angular/router';
import { EmployeeDashboard } from './employee-dashboard/employee-dashboard';
import { EmployeeTable } from './employee-table/employee-table';
import { EmployeeForm } from './employee-form/employee-form';
export const routes: Routes = [
    {
    path: '',
    component: EmployeeDashboard,
  },
  {
    path: 'Employees',
    component: EmployeeTable,
  },
  {
    path: 'Add-Employee',
    component: EmployeeForm,
  },
];
