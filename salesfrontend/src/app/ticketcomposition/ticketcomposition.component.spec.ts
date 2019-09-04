import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TicketcompositionComponent } from './ticketcomposition.component';

describe('TicketcompositionComponent', () => {
  let component: TicketcompositionComponent;
  let fixture: ComponentFixture<TicketcompositionComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TicketcompositionComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TicketcompositionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
