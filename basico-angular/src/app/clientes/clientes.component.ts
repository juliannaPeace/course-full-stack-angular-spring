import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-clientes',
  templateUrl: './clientes.component.html',
  styleUrls: ['./clientes.component.css']
})
export class ClientesComponent implements OnInit {

  clientes: Cliente[];

  constructor() { 
    this.clientes = [new Cliente('Julianna Paz',20), new Cliente('Thiago Rabelo',23)];
  }

  ngOnInit(): void {
  }

}

class Cliente{
  constructor(public nome: string, public idade:number){

  }
}
