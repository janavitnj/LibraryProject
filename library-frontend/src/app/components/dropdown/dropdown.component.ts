import { Component, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-dropdown',
  templateUrl: './dropdown.component.html',
  styleUrls: ['./dropdown.component.css']
})
export class DropdownComponent {
  role: string = "null";
  @Output() event = new EventEmitter()
  constructor() { }

  handleClick() {
    this.event.emit(this.role)
  }
}
