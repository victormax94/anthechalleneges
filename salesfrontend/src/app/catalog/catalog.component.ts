import { Component, OnInit,Input } from '@angular/core';
import { ListServiceService } from '../list-service.service';
import { Product } from '../model/Product';
import { Ticket } from '../model/Ticket';

@Component({
  selector: 'app-catalog',
  templateUrl: './catalog.component.html',
  styleUrls: ['./catalog.component.css']
})
export class CatalogComponent implements OnInit {

  constructor(private listService: ListServiceService) { }

  @Input()
  listSelected: any[];

  products:Product[];
  tickets: Ticket[];


  ngOnInit() {
    this.getProducts();
    this.getTickets();
  }

  getProducts() : void {
    this.listService.getProducts()
    .subscribe( prod=> this.products=prod);
  }

  getTickets() : void {
    this.listService.getTickets()
    .subscribe( tick=> this.tickets=tick);
  }

}
