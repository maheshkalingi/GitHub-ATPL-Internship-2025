import { Routes } from '@angular/router';
import { Home } from './home/home';
import { About } from './about/about';
import { Contact } from './contact/contact';
import { PageNotFound } from './page-not-found/page-not-found';
import { ProductDetails } from './Task2/product-details/product-details';
import { ProductList } from './Task2/product-list/product-list';
import { Dashboard } from './Task3/dashboard/dashboard';
import { Activity } from './Task3/activity/activity';
import { Settings } from './Task3/settings/settings';
import { Profile } from './Task3/profile/profile';
import { AdminComponent } from './task 4/admin-component/admin-component';
import { authGuardGuard } from './guards/auth-guard-guard';
import { LogIN } from './log-in/log-in';

export const routes: Routes = [
    {path:'',redirectTo:'home',pathMatch:'full'},
    {path:'home',component:Home},
    {path:'about',component:About},
    {path:'contact',component:Contact},
    {path:'products/:id',component:ProductDetails},
    {path:'productsList',component:ProductList},
    {path:'dashboard',component:Dashboard,
    children:[
        {path:'activity',component:Activity},
    {path:'settings',component:Settings},
    {path:'profile',component:Profile}
    ]
 },
 {path:'adminComponent',component:AdminComponent,canActivate:[authGuardGuard]},
    {path:'login',component:LogIN},
    {path:'**',component:PageNotFound}
];
