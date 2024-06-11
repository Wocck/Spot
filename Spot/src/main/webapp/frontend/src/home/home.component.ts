import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent implements OnInit {
  name: string = 'User';
  email: string = 'user@example.com';

  constructor() { }

  ngOnInit(): void {
  }
}
