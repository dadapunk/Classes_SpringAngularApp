import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddClassFormComponentComponent } from './add-class-form-component.component';

describe('AddClassFormComponentComponent', () => {
  let component: AddClassFormComponentComponent;
  let fixture: ComponentFixture<AddClassFormComponentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddClassFormComponentComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AddClassFormComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
