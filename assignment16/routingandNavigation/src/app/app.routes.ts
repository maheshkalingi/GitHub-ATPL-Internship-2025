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

export const routes: Routes = [
    {path:'',redirectTo:'home',pathMatch:'full'},
    {path:'home',component:Home},
    {path:'about',component:About},
    {path:'contact',component:Contact},
    {path:'products/:id',component:ProductDetails},
    {path:'productsList',component:ProductList},
    {path:'dashboard',component:Dashboard},
    {path:'dashboard/activity',component:Activity},
    {path:'dashboard/settings',component:Settings},
    {path:'dashboard/profile',component:Profile},
    {path:'**',component:PageNotFound}
];
