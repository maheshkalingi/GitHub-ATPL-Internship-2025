import { Routes } from '@angular/router';
import { EmployeeDashboard } from './employee-dashboard/employee-dashboard';
import { EmployeeForm } from './employee-form/employee-form';
import { EmployeeTable } from './employee-table/employee-table';

export const routes: Routes = [
{ path:'',component:EmployeeDashboard},
{ path:'add-employee',component:EmployeeForm},
{ path:'view-employees',component:EmployeeTable},
];
