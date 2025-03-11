import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-recover-password',
  imports: [CommonModule, FormsModule],
  templateUrl: './recover-password.component.html',
  styleUrl: './recover-password.component.scss'
})
export class RecoverPasswordComponent {
  isEmailError = false;
  onSubmit() {
    const emailInput = document.getElementById('email') as HTMLInputElement;
    if (!emailInput.value) {
      this.isEmailError = true;
    } else {
      this.isEmailError = false;
    }
  }
}
