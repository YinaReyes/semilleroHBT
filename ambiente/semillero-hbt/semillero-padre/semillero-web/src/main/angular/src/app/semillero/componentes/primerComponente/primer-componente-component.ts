import { OnInit, Component } from '@angular/core';
import { Comic2DTO } from '../../dto/comic2.dto';

/**
 * @description La clase PrimerComponenteComponent permite mostrar mi nombre y ciudad
 * Ademas, mostrar un array con 5 objetos, insertar y eliminar un elemento del array
 * @author Yina Paola Reyes Polo
 */
@Component({
    selector: 'primer-componente',
    templateUrl: './primer-componente-component.html'
})

export class PrimerComponenteComponent implements OnInit {

    /**
     * @description creacion de la variable nombres para imprimir en el html
     */

    nombres: string = "Yina Paola Reyes Polo - Montería";

    /**
     * @description creacion de una variable de tipo array para almacenar un objeto de tipo Comic2DTO
     */
    public lista: Array<Comic2DTO>;
    /**
     * @description variable que permite almacenar la conversion del array a string
     */
    public listaJSON: string;
    /**
     * @description variable que permite almacenar el mensaje del comic eliminado
     */
    public mensaje: string;
    /**
     * @description variable que permite segun su valor mostrar el mensaje del comic eliminado
     */
    public mostrarMensaje : boolean;
    /**
     * @description variable que permite segun su valor mostrar mensaje de posibles errores al eliminar
     * el comic
     */
    public mostrarMensajeError : boolean;

    
    /**
   * Constructor de la clase
   */
    constructor() {

    }

    ngOnInit(): void {
        //variable que contiene los 5 elementos del array de tipo comic2DTO con sus atributos y valores 
        this.lista= [
            {
            id: 1,
            nombre: "Superman",
            editorial: "DC",
            tematica: "superheroe",
            numeroPaginas: 50,
            precio: 2.500 ,
            autores: "Juan Perez",
            aColor: true,
            fechaVenta: new Date(2019,10,10) ,
            estado: "activo"
            },
            {
                id: 2,
                nombre: "Flash",
                editorial: "DC",
                tematica: "superheroe",
                numeroPaginas: 25,
                precio: 10.000 ,
                autores: "Camilo Parra",
                aColor: false,
                fechaVenta: new Date(2018,9,10),
                estado: "activo"
            },
            {
                id: 3,
                nombre: "Spiderman",
                editorial: "Marvel",
                tematica: "superheroe",
                numeroPaginas: 40,
                precio: 7.500 ,
                autores: "Stan Lee",
                aColor: true,
                fechaVenta: new Date(2017,2,10),
                estado: "activo"
            },
            {
                id: 4,
                nombre: "X-men",
                editorial: "Marvel",
                tematica: "superheroe",
                numeroPaginas: 30,
                precio: 9.500 ,
                autores: "Stan Lee",
                aColor: false,
                fechaVenta: new Date(2015,8,10),
                estado: "inactivo"
            },
            {
                id: 5,
                nombre: "Black Panter",
                editorial: "Marvel",
                tematica: "superheroe",
                numeroPaginas: 20,
                precio: 15.200,
                autores: "Stan Lee",
                aColor: true,
                fechaVenta: new Date(2015,10,5),
                estado: "activo"
            }
        ]
 
        //conversion del array a un string
        this.listaJSON = JSON.stringify(this.lista, null, 1);

        
    }

    //metodo que permite eliminar un comic segun una posicion por parametro
    public eliminarComic(posicion: number) :void {

            let comicdelete = this.lista.splice(posicion-1,1);
            this.mensaje= "Se ha eliminado el comic " + comicdelete[0].nombre;
            this.mostrarMensaje = true;
    }
}