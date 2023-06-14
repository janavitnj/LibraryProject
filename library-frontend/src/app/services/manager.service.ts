import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Author, Book } from '../interfaces';

@Injectable({
  providedIn: 'root'
})
export class ManagerService {

  private apiUrl: string = "http://localhost:8081"
  private managerId!: number
  private authors!: Author[]

  constructor(private httpClient: HttpClient) { }

  authenticateUser(credentials: any): Observable<any> {
    return this.httpClient.post<any>(`${this.apiUrl}/managements/login`, credentials)
  }

  setManagerId(managerId: number) {
    console.log("manager: ", managerId)
    this.managerId = managerId
  }

  setAuthorList(authors: Author[]) {
    this.authors = authors
  }

  getAllAuthors(): Observable<Author[]> {
    return this.httpClient.get<Author[]>(`${this.apiUrl}/author`)
  }

  getAuthorsList() {
    return this.authors
  }

  addBook(book: Book): Observable<any> {
    book.managerId = this.managerId;
    console.log(book)
    return this.httpClient.post<any>(`${this.apiUrl}/books`, book)
  }
}
