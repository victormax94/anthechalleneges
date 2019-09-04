import { Component, OnInit, Input } from '@angular/core';
import { RowOfTicket } from '../model/RowOfTicket';

@Component({
  selector: 'app-rowofticket',
  templateUrl: './rowofticket.component.html',
  styleUrls: ['./rowofticket.component.css']
})
export class RowofticketComponent implements OnInit {

  constructor() { }




  @Input()
  rowTicket:RowOfTicket

  typeOfProduct:string

  isImported:string

  ngOnInit() {
  
    this.typeOfProduct=this.getTypeOfProduct();
    this.isImported= this.rowTicket.product.imported? "Yes": "No"
    console.log(this.rowTicket)
  }

  getTypeOfProduct(){
   let t= this.rowTicket.product.type
   return t===0? "Book": t===1? "Food": t===2? "Medical": "Other";
  }
}
