import { Routes } from '@angular/router';
import { Task1 } from './task1/task1';

export const routes: Routes = [
    {path:'',redirectTo:'task1',pathMatch:'full'},
    {path:'task1',component:Task1}
];
