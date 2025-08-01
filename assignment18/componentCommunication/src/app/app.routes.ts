import { Routes } from '@angular/router';
import { Parent } from './Task1/parent/parent';
import { Child } from './Task1/child/child';
import { LocalStorage } from './task2/local-storage/local-storage';
import { SessionStorage } from './Task3/session-storage/session-storage';

export const routes: Routes = [
    // {path:'',redirectTo:'parent',pathMatch:'full'},
    {path:'parent',component:Parent},
    {path:'child',component:Child},
    {path:'localStorage',component:LocalStorage},
    {path:'sessionStorage',component:SessionStorage},
];
