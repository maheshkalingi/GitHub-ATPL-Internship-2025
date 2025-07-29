import { CanActivateFn } from '@angular/router';
import { FakeAuth } from '../fake-auth';
import { inject } from '@angular/core';
export const authGuardGuard: CanActivateFn = (route, state) => {
const isLogin=inject(FakeAuth).isLoggedIn;
  return isLogin;
};
