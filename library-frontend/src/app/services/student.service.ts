import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Student } from '../interfaces';

@Injectable({
  providedIn: 'root'
})
export class StudentService {
  private apiUrl: string = "http://localhost:8081"
  constructor(private httpClient: HttpClient) { }

  fixAppointment(authorId: number, studentId: number) {
    return this.httpClient.post(`${this.apiUrl}/students/${studentId}/authors/${authorId}/add`, {})
  }

  registerStudent(studentDetails: Student) {
    return this.httpClient.post(`${this.apiUrl}/students`, studentDetails)
  }
}
