import { Component, EventEmitter, Output } from '@angular/core';
import { Author } from 'src/app/interfaces';
import { ManagerService } from 'src/app/services/manager.service';

@Component({
  selector: 'app-dropdown',
  templateUrl: './dropdown.component.html',
  styleUrls: ['./dropdown.component.css']
})
export class DropdownComponent {
  authorId: string = "0";
  authors!: Author[]
  @Output() event = new EventEmitter()
  constructor(private managerService: ManagerService) {
    this.authors = this.managerService.getAuthorsList()
  }

  handleClick() {
    this.event.emit(this.authorId)
  }
}
