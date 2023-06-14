import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthorService } from 'src/app/services/author.service';
import { DropdownModule } from 'primeng/dropdown';
import { ManagerService } from 'src/app/services/manager.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  email: string = ""
  password: string = ""
  authorId!: number
  selectedRole: string = "null"
  formError!: string
  constructor(private authorService: AuthorService, private router: Router, private managerService: ManagerService) { }

  ngOnInit(): void {

  }

  handleInput() {
    this.formError = ""
  }

  onSubmit() {
    if (this.selectedRole === "null") {
      this.formError = "Select your role!!"
      return
    }
    if (this.email === '' || this.password === '') {
      this.formError = "Email or Password missing!!"
      return
    }
    const credentials = {
      email: this.email,
      password: this.password
    }
    if (this.selectedRole === "author") {
      this.callAuthorLogin(credentials);
    } else {
      this.callManagerLogin(credentials)
    }
  }

  callAuthorLogin(credentials: any) {

    this.authorService.authenticateUser(credentials).subscribe((response) => {
      if (response.Id === null) {
        alert("Invalid credentails");
        return;
      }
      this.authorService.setAuthorId(response.Id);
      this.router.navigateByUrl("/author/home")
    });
  }

  callManagerLogin(credentials: any) {
    this.managerService.authenticateUser(credentials).subscribe((response) => {
      if (response.Id === null) {
        alert("Invalid credentails");
        return;
      }
      this.managerService.setManagerId(response.Id);
      this.router.navigateByUrl("/manager/home")
    });
  }

  receiveRole(role: string) {
    this.selectedRole = role;
  }

}
