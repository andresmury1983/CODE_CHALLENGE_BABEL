import { Component, OnInit } from '@angular/core';
import {SneakersService} from '../../services/sneakers.service';
import { ItemCar } from '../../models/item-car';

@Component({
  selector: 'app-car',
  templateUrl: './car.component.html',
  styleUrls: ['./car.component.css']
})
export class CarComponent implements OnInit {

  sneakerCar: ItemCar[] = [] ;

  constructor(private sneakersService: SneakersService) { }

  ngOnInit(): void {
    
   
    this.sneakerCar = JSON.parse(localStorage.getItem('car')||'[]');

    
    console.log( 'carrito :::: '+JSON.stringify(localStorage.getItem('car')?localStorage.getItem('car'):[]));
  
     
    }
  

}
