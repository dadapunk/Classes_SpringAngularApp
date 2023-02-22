import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent {
  classes: any[] = [];

  apiUrl = 'http://localhost:8080/classes/';

  constructor(private http: HttpClient) {
    this.http.get<any[]>(this.apiUrl).subscribe(classes => {
      console.log(classes);
      this.classes = classes;
    });
  }


}
