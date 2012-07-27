/*
 * openCheckout 0.1
 *
 * @version 0.1
 * @author Jorge Jara <jorgejarainostroza@gmail.com>
 *
 * Esta clase sirve para arrancar el sistema de 'log-eo' y a la vez inicializar
 * el programa.
 *
 * Copyright (C) 2012 Jorge Jara Inostroza.
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.

 * You should have received a copy of the GNU General Public License
 * along with ths program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package jorgejarai.javase.opencheckout;

public class Main {
    public static void main(String[] args) {
        // Genero una instancia de la ventana de login
        Login login = new Login();
        login.setLocationRelativeTo(null); // Centro el Frame
        login.setVisible(true); // Lo hago visible
    }
}