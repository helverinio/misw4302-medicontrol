versión node: 22.5.1

1. Descargar el proyecto
 ```sh
   git clone https://github.com/helverinio/misw4302-medicontrol.git
```
2. Abrir el proyecto con Visual Studio Code
3. Recomendamos instalar nvm para tener múltiples versiones de node.
En caso contrario, instalar la versión 22.5.1 de node
4. Si usa nvm: 
 ```sh
   nvm install 22.5.1
   nvm use 22.5.1
```
5. Ejecutar
 ```sh
   npm install
```
6. Desde la consola, navegar a la carpeta web
 ```sh
 cd .\web_medicontrol\
```
7. Instalar paquetes
 ```sh
   npm install
```
8. Correr
 ```sh
   ng serve
```

9. Pantallas desarrolladas (suponemos que el host es [localhost:4200](http://localhost:4200/), si no cambiar según lo respectivo)
* Login (http://localhost:4200/login) -> by Helvert
* Registro (http://localhost:4200/register) -> by Helvert
* Recover Password (http://localhost:4200/recover-password) -> by Helvert
* Home - Tab Editar receta (http://localhost:4200/home) -> by Orlando
* Home - Tab Asignar pacientes (http://localhost:4200/home) -> by Orlando
* Lista de recetas (http://localhost:4200/recipe) -> by Orlando

Nota: cualquier combinación sirve para loguearse en la aplicación, sin embargo, no se pueden dejar los campos en blanco. Las anteriores pantallas se pueden navegar a través de los botones.