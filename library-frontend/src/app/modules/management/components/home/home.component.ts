import { Component, OnInit } from '@angular/core';
import { Author } from 'src/app/interfaces';
import { ManagerService } from 'src/app/services/manager.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  authors!: Author[]
  constructor(private managerService: ManagerService) {
    this.managerService.getAllAuthors().subscribe((authors) => {
      this.authors = authors
      this.managerService.setAuthorList(authors)
    })

  }
  ngOnInit(): void {

  }



}
