import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {SneakersListComponent} from './modules/sneakers-list/sneakers-list.component';
import {SneakersComponent} from './modules/sneakers/sneakers.component';
import {CarComponent} from './modules/car/car.component';

const routes: Routes = [
{
  path: '',
  redirectTo: '/sneakers',
  pathMatch:'full'
},
{
  path:'sneakers',
  component : SneakersListComponent
},
{
  path:'detail/:id',
  component : SneakersComponent
},
{
  path:'car',
  component : CarComponent
}


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
