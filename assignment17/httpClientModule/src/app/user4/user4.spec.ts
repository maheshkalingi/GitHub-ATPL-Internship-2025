import { ComponentFixture, TestBed } from '@angular/core/testing';

import { User4 } from './user4';

describe('User4', () => {
  let component: User4;
  let fixture: ComponentFixture<User4>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [User4]
    })
    .compileComponents();

    fixture = TestBed.createComponent(User4);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
