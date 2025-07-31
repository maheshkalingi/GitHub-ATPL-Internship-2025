import { Routes } from '@angular/router';
import { UserData } from './Task1/user-data/user-data';
import { Add } from './Task1/add/add';
import { Update } from './Task1/update/update';
import { Interceptor } from './task2/interceptor/interceptor';
import { Profile } from './task3/profile/profile';
import { Error } from './task3/error/error';
import { User4 } from './user4/user4';
import { User5 } from './user5/user5';
import { Login } from './login/login';


export const routes: Routes = [
    {path:' ',redirectTo:'user',pathMatch:'full'},
    {path:'user',component:UserData},
    {path:'add',component:Add},
    {path:'update/:id',component:Update},
    {path:'inter',component:Interceptor},
    {path:'profile',component:Profile},
    {path:'error',component:Error},
    {path:'user4',component:User4},
    {path:'user5',component:User5},
    {path:'login',component:Login},
    
];
