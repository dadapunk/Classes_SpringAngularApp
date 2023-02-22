import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';


import { AppComponent } from './app.component';
import { ListComponent } from './components/list/list.component';
import { AddClassFormComponentComponent } from './components/add-class-form-component/add-class-form-component.component';

@NgModule({
  declarations: [
    AppComponent,
    ListComponent,
    AddClassFormComponentComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
