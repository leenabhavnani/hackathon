import { UserpoolDetailsComponent } from './userpool-details/userpool-details.component';
import { CreateUserpoolComponent } from './create-userpool/create-userpool.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UserpoolListComponent } from './userpool-list/userpool-list.component';

const routes: Routes = [
  { path: '', redirectTo: 'userpool', pathMatch: 'full' },
  { path: 'getAllUserPools', component: UserpoolListComponent },
  { path: 'add', component: CreateUserpoolComponent },
  { path: 'details/:id', component: UserpoolDetailsComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
