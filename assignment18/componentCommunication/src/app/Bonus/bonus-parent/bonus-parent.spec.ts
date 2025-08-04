import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BonusParent } from './bonus-parent';

describe('BonusParent', () => {
  let component: BonusParent;
  let fixture: ComponentFixture<BonusParent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [BonusParent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BonusParent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
