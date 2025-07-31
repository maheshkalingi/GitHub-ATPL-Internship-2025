import { HttpInterceptorFn } from '@angular/common/http';
import { HttpResponse } from '@angular/common/http';
import { tap } from 'rxjs/operators';

export const loggingInterceptor: HttpInterceptorFn = (req, next) => {
  
 console.log("outgoinng Request");
 console.log('Method:', req.method);
  console.log('URL:', req.urlWithParams);
  console.log('Headers:', req.headers);
  console.log('Body:', req.body);
  return next(req).pipe(
    tap({
      next:(res)=>{
        if(res instanceof HttpResponse){
        console.log(' Incoming Response');
        console.log('Status Code:', res.status);
        console.log('Response Body:', res.body);
      }
      },
      error: (error) => {
        console.error(' Request Failed');
        console.error('Status:', error.status);
        console.error('Message:', error.message);
      }
    })
  );
};
