import { UserpoolDetailsComponent } from './userpool-details/userpool-details.component';
import { CreateUserpoolComponent } from './create-userpool/create-userpool.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UserpoolListComponent } from './userpool-list/userpool-list.component';
import { DashboardComponent } from './dashboard/dashboard.component';


const routes: Routes = [
  { path: '', redirectTo: 'userpool', pathMatch: 'full' },
  { path: 'getAllUserPools', component: UserpoolListComponent },
  { path: 'add', component: CreateUserpoolComponent },
  { path: 'details/:id', component: UserpoolDetailsComponent },
  { path:'dashboard', component: DashboardComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
