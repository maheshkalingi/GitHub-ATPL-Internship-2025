import { Injectable } from '@angular/core';

@Injectable({ providedIn: 'root' })
export class Auth {
  private readonly TOKEN_KEY = 'token';

  login(username: string, password: string): boolean {
    if (username && password) {
      const fakeToken = 'abcdefghijk'; 
      localStorage.setItem(this.TOKEN_KEY, fakeToken);
      return true;
    }
    return false;
  }

  logout(): void {
    localStorage.removeItem(this.TOKEN_KEY);
  }

  getToken(): string | null {
    return localStorage.getItem(this.TOKEN_KEY);
  }

  isLoggedIn(): boolean {
    return !!this.getToken();
  }
}
