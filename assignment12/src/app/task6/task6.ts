import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-task6',
  imports: [CommonModule],
  templateUrl: './task6.html',
  styleUrl: './task6.css'
})
export class Task6 {
headlines: string[] = [
    'India wins the cricket match in a thrilling finish at the last over!',
    'Government announces new education policy reforms for 2025.',
    'Scientists discover a new exoplanet that may support life.',
    'Massive storm causes power outages across multiple states.',
    'Technology companies show strong earnings this quarter.'
  ];
}
