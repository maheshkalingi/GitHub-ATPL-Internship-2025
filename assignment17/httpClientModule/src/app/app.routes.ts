import { Routes } from '@angular/router';
import { UserData } from './Task1/user-data/user-data';
import { Add } from './Task1/add/add';
import { Update } from './Task1/update/update';

export const routes: Routes = [
    {path:'user',component:UserData},
    {path:'add',component:Add},
    {path:'update/:id',component:Update},
];
