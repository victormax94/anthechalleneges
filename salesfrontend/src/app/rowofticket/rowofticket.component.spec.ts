import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RowofticketComponent } from './rowofticket.component';

describe('RowofticketComponent', () => {
  let component: RowofticketComponent;
  let fixture: ComponentFixture<RowofticketComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RowofticketComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RowofticketComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
