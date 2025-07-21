import { Directive, ElementRef, HostListener } from '@angular/core';

@Directive({
  selector: '[appWindowResizer]'
})
export class WindowResizer {

  constructor(private ele:ElementRef) { }
@HostListener('window:resize') onWindowResize(){
  const element=this.ele.nativeElement;
  const height=element.offsetHeight;
  const width=element.offsetWidth;

  console.log(`width:${width}px,Height:${height}px`);
}
}
