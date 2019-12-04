import { OnInit, Component } from '@angular/core';

/**
 * @description La clase PrimerComponenteComponent permite mostrar mi nombre y ciudad
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
   * Constructor de la clase
   */
    constructor() {

    }

    ngOnInit(): void {

    }

}