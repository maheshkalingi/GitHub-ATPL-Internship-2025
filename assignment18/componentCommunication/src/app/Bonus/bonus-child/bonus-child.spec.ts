import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BonusChild } from './bonus-child';

describe('BonusChild', () => {
  let component: BonusChild;
  let fixture: ComponentFixture<BonusChild>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [BonusChild]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BonusChild);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
