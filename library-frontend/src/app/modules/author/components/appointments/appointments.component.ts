import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Router } from 'express';
import { Appointment, Student } from 'src/app/interfaces';
import { AuthorService } from 'src/app/services/author.service';

@Component({
  selector: 'app-appointments',
  templateUrl: './appointments.component.html',
  styleUrls: ['./appointments.component.css']
})
export class AppointmentsComponent implements OnInit {
  students !: Student[]
  constructor(private authorService: AuthorService) {
    this.students = this.authorService.getAppointements()
  }

  ngOnInit(): void { }

}
