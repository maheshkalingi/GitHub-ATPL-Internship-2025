import { Routes } from '@angular/router';
import { Task1 } from './task1/task1';
import { PageNotFound } from './page-not-found/page-not-found';
import { Task2 } from './task2/task2';
import { Task3 } from './task3/task3';
import { Task4 } from './task4/task4';
import { Task5 } from './task5/task5';
import { Task6 } from './task6/task6';

export const routes: Routes = [
    {path:'',redirectTo:'task1',pathMatch:'full'},
    {path:'task1',component:Task1},
    {path:'task2',component:Task2},
    {path:'task3',component:Task3},
    {path:'task4',component:Task4},
    {path:'task5',component:Task5},
    {path:'task6',component:Task6},
    {path:'**',component:PageNotFound},
];
