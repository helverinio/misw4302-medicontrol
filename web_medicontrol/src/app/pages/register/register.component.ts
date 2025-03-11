import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-register',
  imports: [ CommonModule, FormsModule],
  templateUrl: './register.component.html',
  styleUrl: './register.component.scss'
})
export class RegisterComponent {

  isNameError = false;
  isLastNameError = false;
  isEmailError = false;
  isPasswordError = false;

  onSubmit() {
    const nameInput = document.getElementById('name') as HTMLInputElement;
    const lastNameInput = document.getElementById('lastname') as HTMLInputElement;
    const emailInput = document.getElementById('email') as HTMLInputElement;
    const passwordInput = document.getElementById('password') as HTMLInputElement;

    if (!nameInput.value) {
      this.isNameError = true;
    } else {
      this.isNameError = false;
    }

    if (!lastNameInput.value) {
      this.isLastNameError = true;
    } else {
      this.isLastNameError = false;
    }

    if (!emailInput.value) {
      this.isEmailError = true;
    } else {
      this.isEmailError = false;
    }

    if (!passwordInput.value) {
      this.isPasswordError = true;
    } else {
      this.isPasswordError = false;
    }
  }
}
