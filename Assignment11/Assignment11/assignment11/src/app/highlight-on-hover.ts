import { Directive, ElementRef, HostListener } from '@angular/core';

@Directive({
  selector: '[appHighlightOnHover]'
})
export class HighlightOnHover {

  constructor(private ele:ElementRef) {
    }
    @HostListener('mouseenter') onMouseEnter(){
      this.ele.nativeElement.style.backgroundColor="red";
    }

    @HostListener('mouseout') onMouseOut(){
      this.ele.nativeElement.style.backgroundColor="";
    }
   }

