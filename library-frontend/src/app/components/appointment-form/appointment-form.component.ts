import { Component, OnInit } from '@angular/core';
import { Author } from 'src/app/interfaces';
import { ManagerService } from 'src/app/services/manager.service';
import { StudentService } from 'src/app/services/student.service';

@Component({
  selector: 'app-appointment-form',
  templateUrl: './appointment-form.component.html',
  styleUrls: ['./appointment-form.component.css'],
})
export class AppointmentFormComponent implements OnInit {
  date: string = '';
  email: string = '';
  name: string = '';
  authorId: string = '0';
  formError: string = '';
  authors!: Author[];
  stuentId!: number
  registered = false
  constructor(private managerService: ManagerService, private studentService: StudentService) {
    managerService.getAllAuthors().subscribe((authors) => {
      this.authors = authors;
    });
  }

  ngOnInit(): void { }

  handleInput() {
    this.formError = '';
  }

  onSubmit() {
    if (this.date === '' || this.email === '' || this.name === '') {
      this.formError = 'All fields are required!';
      return;
    }
    const
      student = {
        id: 0,
        name: this.name,
        appointmentDate: this.date,
        email: this.email,
      }
    console.log(student)
    this.studentService.registerStudent(student).subscribe((res: any) => {
      if (res.status !== "ACCEPTED") {
        this.formError = "Invalid Credentials";
        return
      }

      this.stuentId = res.student.id
      this.registered = true;
    })
  }

  onConfirm() {
    if (this.authorId === "0") {
      this.formError = "Select Author!!"
      return
    }
    this.studentService.fixAppointment(parseInt(this.authorId), this.stuentId).subscribe((res: any) => {
      if (res.status !== "ACCEPTED") {
        this.registered = false;
        this.formError = "Appointment failed!!"
      }
      this.registered = false;
    })
  }
}
