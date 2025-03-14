import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

interface User {
  name: string;
  email: string;
  image: string;
  selected: boolean;
}

@Component({
  selector: 'app-home',
  imports: [ CommonModule, FormsModule],
  templateUrl: './home.component.html',
  styleUrl: './home.component.scss'
})
export class HomeComponent {
  activeTabIndex = 1;
  isNameError = false;
  isDescripcionError = false;
  isMedicamentoError = false;
  isfrecError = false;
  isTimeError = false;
  isDosisError = false;

  users: User[] = [
    { name: 'John Doe', email: 'john.doe@example.com', image: '../../../assets/images/avatar.png', selected: false  },
    { name: 'Jane Smith', email: 'jane.smith@example.com', image: '../../../assets/images/avatar2.png', selected: false },
    { name: 'Alice Johnson', email: 'alice.johnson@example.com', image: '../../../assets/images/avatar3.png', selected: false  }
  ];
  medicamentos: string[] = [
    'Paracetamol',
    'Ibuprofeno',
    'Amoxicilina',
    'Metformina'
  ];


  setActiveTab(tabIndex: number) {
    this.activeTabIndex = tabIndex;
  }

  toggleAll(event: Event) {
    const isChecked = (event.target as HTMLInputElement).checked;
    this.users.forEach(user => user.selected = isChecked);
  }

  onSubmit() {
  }
}
