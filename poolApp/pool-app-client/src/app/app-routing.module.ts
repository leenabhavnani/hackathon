import { UserpoolDetailsComponent } from './userpool-details/userpool-details.component';
import { CreateUserpoolComponent } from './create-userpool/create-userpool.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UserpoolListComponent } from './userpool-list/userpool-list.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { OpenpoolsComponent } from './openpools/openpools.component';


const routes: Routes = [
  { path: '', redirectTo: 'dashboard', pathMatch: 'full' },
  { path: 'getAllUserPools', component: UserpoolListComponent },
  { path: 'add', component: CreateUserpoolComponent },
  { path: 'details/:id', component: UserpoolDetailsComponent },
  { path: 'dashboard', component: DashboardComponent },
  { path: 'openpools', component: OpenpoolsComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
