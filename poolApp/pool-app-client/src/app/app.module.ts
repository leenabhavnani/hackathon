import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CreateUserpoolComponent } from './create-userpool/create-userpool.component';
import { UserpoolDetailsComponent } from './userpool-details/userpool-details.component';
import { UserpoolListComponent } from './userpool-list/userpool-list.component';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    CreateUserpoolComponent,
    UserpoolDetailsComponent,
    UserpoolListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
