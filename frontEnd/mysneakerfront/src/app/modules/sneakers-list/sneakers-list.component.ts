import { Component, OnInit } from '@angular/core';
import {SneakersService} from '../../services/sneakers.service';

@Component({
  selector: 'app-sneakers-list',
  templateUrl: './sneakers-list.component.html',
  styleUrls: ['./sneakers-list.component.css']
})
export class SneakersListComponent implements OnInit {
   
   sneakers: any= [];
   model: any ;
  constructor(private sneakersService: SneakersService) { }

  ngOnInit(): void {
    
   this.sneakersService.getSneakersList().subscribe(
    res=>{
       this.model = res;
       this.sneakers = this.model.listSneaker;
       console.log(JSON.stringify(this.sneakers));
     },
      err=> console.error(err)

    );
  }

  

}
