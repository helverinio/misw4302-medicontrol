import { Routes } from '@angular/router';
import { LoginComponent } from './pages/login/login.component';
import { RegisterComponent } from './pages/register/register.component';
import { RecoverPasswordComponent } from './pages/recover-password/recover-password.component';
import { HomeComponent } from './pages/home/home.component';

export const routes: Routes = [
    { path: '', component: LoginComponent},
    { path: 'register', component: RegisterComponent},
    { path: 'recover-password', component: RecoverPasswordComponent},
    { path: 'home', component: HomeComponent},
    { path: '**', redirectTo: '', pathMatch: 'full'}
];
