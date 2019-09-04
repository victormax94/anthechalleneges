import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CatalogComponent } from './catalog/catalog.component';
import { TicketcompositionComponent } from './ticketcomposition/ticketcomposition.component';
import { RowCatalogComponent } from './row-catalog/row-catalog.component';
import {MaterialModule} from './material-module';
import {MatNativeDateModule} from '@angular/material/core';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { RowTicketcompositionComponent } from './row-ticketcomposition/row-ticketcomposition.component';
import {RowofticketComponent} from './rowofticket/rowofticket.component'

@NgModule({
  declarations: [
    AppComponent,
    CatalogComponent,
    TicketcompositionComponent,
    RowCatalogComponent,
    RowTicketcompositionComponent,
    RowofticketComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    MaterialModule,
    MatNativeDateModule,
    FormsModule, 
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
