import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RowCatalogComponent } from './row-catalog.component';

describe('RowCatalogComponent', () => {
  let component: RowCatalogComponent;
  let fixture: ComponentFixture<RowCatalogComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RowCatalogComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RowCatalogComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
