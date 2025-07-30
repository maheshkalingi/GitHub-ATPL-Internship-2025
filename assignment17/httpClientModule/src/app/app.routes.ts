import { Routes } from '@angular/router';
import { UserData } from './Task1/user-data/user-data';
import { Add } from './Task1/add/add';

export const routes: Routes = [
    {path:'user',component:UserData},
    {path:'add',component:Add}
];
