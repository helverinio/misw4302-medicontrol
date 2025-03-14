# misw4302-medicontrol

## Pantallas implementadas


- **Autenticación de usuario**: Orlando Arnedo
- **Olvidó su contraseña**: Orlando Arnedo
- **Registro de usuario**: Orlando Arnedo
- **Home - Recetas activas**: Helvert Wiesner
- **Detalle Receta**: Helvert Wiesner
- **Iniciar por voz**: Helvert Wiesner

## Requisitos previos

Para ejecutar la aplicación MediControl en tu dispositivo, necesitarás:

### Para Desarrollo

- **Android Studio**: Versión Flamingo (2022.2.1) o superior
- **JDK**: Java Development Kit 11 o superior
- **Android SDK**: Nivel de API 34 (Android 14.0) o superior
- **Gradle**: Compatible con la configuración del proyecto (ver `gradle-wrapper.properties`)

### Para Instalación (Usuarios Finales)

- **Dispositivo Android**: Compatible con Android 7.0 (API nivel 24) o superior
- **Espacio de almacenamiento**: Al menos 50MB de espacio libre
- **Permisos**: La aplicación requiere permisos para notificaciones

## Instalación

### Opción 1: Instalar desde APK

1. Descarga el archivo APK
2. En tu dispositivo Android, ve a **Configuración > Seguridad**.
3. Habilita **Orígenes desconocidos** (esta opción puede estar en diferentes ubicaciones según el dispositivo).
4. Utilizando un administrador de archivos, navega hasta el archivo APK descargado.
5. Toca el archivo APK para instalarlo.
6. Sigue las instrucciones en pantalla para completar la instalación.

### Opción 2: Compilar desde el código fuente

1. Desde el codigo fuente del repositorio.
2. Clonar el repositorio: `git clone https://github.com/helverinio/misw4302-medicontrol.git`
3. Abrir Android Studio.
4. Seleccionar la opción "Open an existing project".
5. Navegar hasta la carpeta donde clonaste el repositorio y seleccionarla.
6. Esperar a que Android Studio complete la indexación y sincronización del proyecto con Gradle.
7. Conectar un dispositivo Android físico o iniciar un emulador desde AVD Manager.
8. Hacer clic en el botón "Run" (triángulo verde) en la barra de herramientas o presionar Shift+F10.
9. Seleccionar el dispositivo donde deseas ejecutar la aplicación.
10. Esperar a que la aplicación se compile e instale en el dispositivo seleccionado.
