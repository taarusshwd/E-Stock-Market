import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AngularExcelComponent } from './angular-excel.component';

describe('AngularExcelComponent', () => {
  let component: AngularExcelComponent;
  let fixture: ComponentFixture<AngularExcelComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AngularExcelComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AngularExcelComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
