import { Component, OnInit } from '@angular/core';
import { Book } from 'src/app/interfaces';
import { ManagerService } from 'src/app/services/manager.service';

@Component({
  selector: 'app-add-book',
  templateUrl: './add-book.component.html',
  styleUrls: ['./add-book.component.css']
})
export class AddBookComponent implements OnInit {
  bookName: string = ""
  plagiarism!: number
  authorId: string = "0"
  formError = false
  constructor(private managerService: ManagerService) {
  }
  ngOnInit(): void {

  }

  handleInput() {
    this.formError = false
  }

  receiveAuthor(authorId: string) {
    this.authorId = authorId
  }

  handleSubmit() {
    const book: Book = {
      bookName: this.bookName,
      authorId: parseInt(this.authorId),
      plagPer: this.plagiarism,
      bookId: 0,
      managerId: 0
    }
    this.managerService.addBook(book).subscribe((res) => console.log(res)
    )
  }
}
