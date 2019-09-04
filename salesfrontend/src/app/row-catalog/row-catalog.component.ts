import { Component, OnInit, Input, OnChanges, SimpleChanges, DoCheck, IterableDiffers } from '@angular/core';
import { Product } from '../model/Product';

@Component({
  selector: 'app-row-catalog',
  templateUrl: './row-catalog.component.html',
  styleUrls: ['./row-catalog.component.css']
})
export class RowCatalogComponent implements OnInit,OnChanges,DoCheck {
  
  
  
 
  

  constructor(differs: IterableDiffers) { 
    this.differ = differs.find([]).create(null);
  }

  differ: any;

  @Input()
  product:Product;

  @Input()
  fillList:Product[];

  
  selected: boolean=false;

  cssSelected: string="toggleButton"

  imported:string

  type:string

  ngOnInit() {
     this.imported=this.product.imported? "Yes":"No";
     this.type= this.product.type===0? "Book": this.product.type===1 ? "Food": this.product.type===2 ? "Medical": "Other";
  }

  ngOnChanges(changes: SimpleChanges): void {
  }

  ngDoCheck(): void {
    const change = this.differ.diff(this.fillList);
    this.checkIsSelected();
  }


  OnSelectProduct(){
    this.selected=!this.selected
    this.selected ? this.cssSelected="toggleButtonSelected":this.cssSelected="toggleButton";

    if(this.selected)
       this.fillList.push(this.product);

    console.log(this.product)
    console.log(this.fillList)
  }

  checkIsSelected(){

    let trovato=false;

    this.fillList.forEach((item)=>
    {
      if(item.id===this.product.id)
        trovato=trovato || true
    }
    )

    this.selected=trovato;
    this.selected ? this.cssSelected="toggleButtonSelected":this.cssSelected="toggleButton";

  }

}
