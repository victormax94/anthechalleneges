import { Component, OnInit, Input, DoCheck } from '@angular/core';
import { Product } from '../model/Product';
import { ListServiceService } from '../list-service.service';
import { Ticket } from '../model/Ticket';
import { CreateTicket } from '../model/CreateTicket';

@Component({
  selector: 'app-ticketcomposition',
  templateUrl: './ticketcomposition.component.html',
  styleUrls: ['./ticketcomposition.component.css']
})
export class TicketcompositionComponent implements OnInit,DoCheck{
  

  constructor(private listService: ListServiceService) { }

  ngOnInit() {
  }

  ngDoCheck(): void {
    this.inputList.length===0? this.ticketCreated=undefined:this.ticketCreated
  }

  @Input()
  inputList: Product[];

  isLoading:boolean=false;

  createTicketArray =new Map<number,CreateTicket>();
   
  ticketCreated:Ticket;

  createTicket(){
    this.isLoading=true
    this.listService.createNewTicketPost(Array.from(this.createTicketArray.values()))
    .subscribe(tick=>
      {
        this.ticketCreated=tick
        console.log(this.ticketCreated)
        this.isLoading=false
      }
      )
    
   ;
  }



  
}
