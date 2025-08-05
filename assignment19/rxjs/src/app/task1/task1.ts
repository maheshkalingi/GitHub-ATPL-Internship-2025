import { Component, OnInit, OnDestroy } from '@angular/core';
import { Subject, Subscription } from 'rxjs';
import { debounceTime, distinctUntilChanged } from 'rxjs/operators';
import { NzInputModule } from 'ng-zorro-antd/input';
import { NzIconModule } from 'ng-zorro-antd/icon';
@Component({
  selector: 'app-task1',       
  imports: [NzInputModule,NzIconModule],          
  templateUrl: './task1.html',
  styleUrls: ['./task1.css']
})
export class Task1Component implements OnInit, OnDestroy {
  private searchInput = new Subject<string>();
  private searchSubscription!: Subscription;

  ngOnInit(): void {
    this.searchSubscription = this.searchInput.pipe(
      debounceTime(300),
      distinctUntilChanged()
    ).subscribe(value => {
      console.log('You typed this:', value);
    });
  }

  onSearchInput(value: string): void {
    this.searchInput.next(value);
  }

  ngOnDestroy(): void {
    this.searchSubscription.unsubscribe();
  }
}
