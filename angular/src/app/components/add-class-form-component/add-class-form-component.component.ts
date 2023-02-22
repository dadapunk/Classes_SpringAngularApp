import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'app-add-class-form-component',
  templateUrl: './add-class-form-component.component.html',
  styleUrls: ['./add-class-form-component.component.css']
})
export class AddClassFormComponentComponent {
  title= '';
  description= '';
  teacher= '';
  apiUrl = 'http://localhost:8080/classes/new/';

  constructor(private http: HttpClient) { }

  onSubmit() {
    const newClass = {
      title: this.title,
      description: this.description,
      teacher: this.teacher
    };
    this.http.post(this.apiUrl, newClass).subscribe(() => {
      console.log('Class added successfully.');
    });
  }
}