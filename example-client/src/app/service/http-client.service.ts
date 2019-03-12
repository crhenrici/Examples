import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class HttpClientService {

  constructor( private http: HttpClient) {   }

  getEmployees(): Observable<any> {
    return this.http.get('//localhost:8080/employees');
  }
}
