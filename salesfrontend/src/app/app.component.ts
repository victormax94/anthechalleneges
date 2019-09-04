import { Component, Input } from '@angular/core';
import { Product } from './model/Product';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})




export class AppComponent {
  title = 'sales-anthea';

  selectedProducts: Product[]=[];
}
