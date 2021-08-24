import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'todo-app';

  nombre: string = "Atreus";
  nombreGuardado: string = "";
  edad: number = 16;
  casado: boolean = false;
  listaNombres: Array<string> = ["Alejandro", "Cristian", "Rogger", "Sergio"];
  persona = {
    name: "alejandro",
    age: 24,
    married: false
  }
  //listaNombres: string[] = [];

  guardar() {
    this.nombreGuardado = this.nombre;
    this.listaNombres.push(this.nombre);
  }

}


// Creacion de componentes y modelos
// Enrutamiento
