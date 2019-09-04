import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RowTicketcompositionComponent } from './row-ticketcomposition.component';

describe('RowTicketcompositionComponent', () => {
  let component: RowTicketcompositionComponent;
  let fixture: ComponentFixture<RowTicketcompositionComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RowTicketcompositionComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RowTicketcompositionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
