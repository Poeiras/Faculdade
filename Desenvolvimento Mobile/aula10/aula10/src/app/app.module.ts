import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { PaiComponent } from './components/pai/pai.component';
import { FilhoComponent } from './components/filho/filho.component';
import { ItemaddComponent } from './components/itemadd/itemadd.component';
import { ItemListaComponent } from './components/item-lista/item-lista.component';
import { DatepickerComponent } from './components/datepicker/datepicker.component';

@NgModule({
  declarations: [
    AppComponent,
    PaiComponent,
    FilhoComponent,
    ItemaddComponent,
    ItemListaComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    DatepickerComponent
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
