import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'customPipe'
})
export class CustomPipePipe implements PipeTransform {

  transform(value:any):any {
    let reverse="";
    for(let i=value.length-1;i>=0;i--){
      reverse+=value[i];
    }
    return reverse ;
  }

}
