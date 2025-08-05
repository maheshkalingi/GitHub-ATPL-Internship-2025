import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NzModalModule } from 'ng-zorro-antd/modal';
import { NzButtonModule } from 'ng-zorro-antd/button';
import { Subject } from 'rxjs';

@Component({
  selector: 'app-task5',
  standalone: true,
  imports: [CommonModule, NzModalModule, NzButtonModule],
  templateUrl: './task5.html',
  styleUrls: ['./task5.css']
})
export class Task5{
  isModalVisible = false;
  modalEvents$ = new Subject<'open' | 'close'>();

  constructor() {
    this.modalEvents$.subscribe(event => {
      console.log(`Modal event: ${event}`);
    });
  }

  openModal(): void {
    this.isModalVisible = true;
  }

  closeModal(): void {
    this.isModalVisible = false;
  }

  onModalOpen(): void {
    this.modalEvents$.next('open');
  }

  onModalClose(): void {
    this.modalEvents$.next('close');
  }

  onAfterClose(): void {
    console.log('Modal fully closed');
  }
}
