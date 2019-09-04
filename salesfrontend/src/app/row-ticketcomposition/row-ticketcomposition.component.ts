import { Component, OnInit, Input, DoCheck } from '@angular/core';
import { Product } from '../model/Product';
import { FormControl, Validators } from '@angular/forms';
import { CreateTicket } from '../model/CreateTicket';

@Component({
  selector: 'app-row-ticketcomposition',
  templateUrl: './row-ticketcomposition.component.html',
  styleUrls: ['./row-ticketcomposition.component.css']
})
export class RowTicketcompositionComponent implements OnInit,DoCheck{


  constructor() {}

  ngOnInit() {
   this.selectedQuantities.set(this.select.id,{productId:this.select.id,quantity:1})
  }

  ngDoCheck(): void {
    
  }

  @Input()
  select:Product;

  @Input()
  selectedQuantities:Map<number,CreateTicket>;

  currentValue:number=1;



  @Input()
  selectedList:Product[]
  quantities: number[]=[1,2,3,4,5,6,7,8,9,10];
  selectFormControl = new FormControl('', Validators.required);


   selected(n:number){
      console.log("ho scelto la quantità "+n)
      this.currentValue=n;
      this.selectedQuantities.set(this.select.id,{productId:this.select.id,quantity:n})
      console.log(this.currentValue);
  }

  deleteItem(){
    this.selectedList.forEach((item,index)=> 
    {  if(item.id===this.select.id)
      this.selectedList=this.selectedList.splice(index,1)
    })
    this.selectedQuantities.delete(this.select.id)
  }

}
