import { ComponentFixture, TestBed } from '@angular/core/testing';

import { User5 } from './user5';

describe('User5', () => {
  let component: User5;
  let fixture: ComponentFixture<User5>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [User5]
    })
    .compileComponents();

    fixture = TestBed.createComponent(User5);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
