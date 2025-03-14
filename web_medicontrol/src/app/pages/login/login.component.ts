import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  imports: [CommonModule, FormsModule],
  templateUrl: './login.component.html',
  styleUrl: './login.component.scss'
})
export class LoginComponent {

  isEmailError = false;
  isPasswordError = false;

  constructor(private router: Router) {}

  onSubmit() {
    const emailInput = document.getElementById('email') as HTMLInputElement;
    const passwordInput = document.getElementById('password') as HTMLInputElement;

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

    if (!this.isEmailError && !this.isPasswordError) {
      // Redirigir a la página de inicio
      this.router.navigate(['/home']);
    }
  }
}
