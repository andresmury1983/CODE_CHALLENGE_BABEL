import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SneakersComponent } from './modules/sneakers/sneakers.component';
import { NavigationComponent } from './modules/navigation/navigation.component';
import { SneakersListComponent } from './modules/sneakers-list/sneakers-list.component';
import {SneakersService} from './services/sneakers.service';
import { CarComponent } from './modules/car/car.component';

@NgModule({
  declarations: [
    AppComponent,
    SneakersComponent,
    NavigationComponent,
    SneakersListComponent,
    CarComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [
    SneakersService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
