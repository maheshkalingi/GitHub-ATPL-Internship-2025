import { TestBed } from '@angular/core/testing';

import { Genericapi } from './genericapi';

describe('Genericapi', () => {
  let service: Genericapi;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(Genericapi);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
