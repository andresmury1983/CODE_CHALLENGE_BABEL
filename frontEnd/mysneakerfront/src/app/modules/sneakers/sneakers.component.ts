import { Component, OnInit } from '@angular/core';
import {SneakersService} from '../../services/sneakers.service';
import { ActivatedRoute, Params } from '@angular/router';
import {Sneaker} from '../../models/sneaker';
import {Size} from '../../models/size';
import { ItemCar } from '../../models/item-car';


@Component({
  selector: 'app-sneakers',
  templateUrl: './sneakers.component.html',
  styleUrls: ['./sneakers.component.css']
})


export class SneakersComponent implements OnInit {
 
  sneakers: any= [];
  sizes: any= [];
  model: any ;
  sneakerCar: ItemCar[] = [] ;
  sneakerSelected: Sneaker= new Sneaker() ;
  sizeSelected : Size = new Size();


  constructor(private sneakersService: SneakersService, private rutaActiva: ActivatedRoute) {
    
   }

  ngOnInit(): void {
    
    this.sneakersService. getSneakerInfo( this.rutaActiva.snapshot.params.id).subscribe(
      res=>{
         this.model = res;
         this.sneakers = this.model.listSneaker;
         this.sizes = this.sneakers[0].listAvailableSize;
         console.log(JSON.stringify(this.sneakers));
         console.log('tallas: '+JSON.stringify(this.sizes));
       },
        err=> console.error(err)
  
      );
     
  }

  selectForCar(sneaker: Sneaker, size : Size){    
    this.sneakerSelected = sneaker;
    this.sizeSelected = size; 
    console.log('sneakerSelected: '+JSON.stringify(this.sneakerSelected));
    console.log('sizeSelect: '+JSON.stringify(this.sizeSelected));
  }

  addCar(){
    if(this.sizeSelected.size ){      
      if(localStorage.getItem('car')){
        console.log("ya existe"); 
        this.sneakerCar.push(JSON.parse(localStorage.getItem('car')||'[{}]'));
      }
      this.sneakerSelected.size = this.sizeSelected.size;
      this.sneakerCar.push(this.sneakerSelected);
      this.sneakerSelected = new Sneaker();
      this.sizeSelected = new Size();
      localStorage.setItem('car',JSON.stringify(this.sneakerCar));
    }

    console.log('listaCarrito '+JSON.stringify(this.sneakerCar));   
  }

}
