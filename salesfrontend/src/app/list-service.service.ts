import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import {Ticket} from './model/Ticket';
import { Observable } from 'rxjs';
import { Product } from './model/Product';
import { CreateTicket } from './model/CreateTicket';


@Injectable({
  providedIn: 'root'
})
export class ListServiceService {
  backendUrl="http://ec2-15-188-50-195.eu-west-3.compute.amazonaws.com:8080/salesproject/";
  getAllTickets="getAllsTickets";
  getAllProducts="getAllsProducts";
  createNewTicket="createTicket"
  httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
  };
  constructor( private http: HttpClient) { 
   
  }
  

  getTickets (): Observable<Ticket[]> {
    return this.http.get<Ticket[]>(this.backendUrl+this.getAllTickets)
  }

  getProducts (): Observable<Product[]> {
    return this.http.get<Product[]>(this.backendUrl+this.getAllProducts)
  }


  createNewTicketPost(ticketsCreate:CreateTicket[]): Observable<Ticket>{
    return this.http.post<Ticket>(this.backendUrl+this.createNewTicket,ticketsCreate);
  }
}

