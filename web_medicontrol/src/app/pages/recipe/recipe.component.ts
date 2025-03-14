import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-recipe',
  imports: [ CommonModule ],
  templateUrl: './recipe.component.html',
  styleUrl: './recipe.component.scss'
})
export class RecipeComponent {
  recipes = [
    { image: '../../../assets/images/receta1.png', title: 'Crisis Asma', description: 'Usar con paciente en crisis asmatica', link: '/recipe' },
    { image: '../../../assets/images/receta2.png', title: 'Terapia Respiratoria', description: 'Usar con pacientes que se encuentren en terapia respiratoria', link: '/recipe' },
    { image: '../../../assets/images/receta3.png', title: 'Gripa', description: 'Pacientes con sintomas gripales', link: '/recipe' },
    { image: '../../../assets/images/receta4.png', title: 'Cefalea', description: 'Pacientes con cefalea frecuente', link: '/recipe' },
    // ...add more recipes as needed
  ];

  createNewRecipe() {
    // Logic to create a new recipe
  }
}
