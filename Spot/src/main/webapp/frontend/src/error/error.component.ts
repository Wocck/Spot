import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-error',
  standalone: true,
  imports: [],
  templateUrl: './error.component.html',
  styleUrl: './error.component.css'
})
export class ErrorComponent implements OnInit {
  errorCode: string = '404';
  errorMessage: string = 'Page not found';

  constructor() { }

  ngOnInit(): void {
  }
}
