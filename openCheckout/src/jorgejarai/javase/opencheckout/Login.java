/*
 * openCheckout 0.1
 *
 * @version 0.1
 * @author Jorge Jara <jorgejarainostroza@gmail.com>
 *
 * Esta clase es para el sistema de log-in del programa, el cual sólo requiere
 * presionar un botón (¿que tonto cierto?)
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
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package jorgejarai.javase.opencheckout;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Login extends JFrame {

    // Componentes Swing necesarios para ejecucción
    JLabel bienvenida = new JLabel("Bienvenido a openCheckout 0.1");
    JLabel peticion = new JLabel("Ingrese su contraseña para acceder:");
    JLabel contrasena = new JLabel("Contraseña:");
    JPasswordField contrasena_tbox = new JPasswordField(15);
    JButton aceptar = new JButton("Aceptar");

    public Login() {
        // Ahora cambiamos el Layout a GridBagLayout
        this.getContentPane().setLayout(new GridBagLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        inicializar(); //Inicializamos la GUI
    }

    // Inicialización de la GUI
    @SuppressWarnings("static-access")
    public final void inicializar() {
        // Generamos la variable que contendrá los parámetros de cada objeto
        // en el Layout
        GridBagConstraints constraints = new GridBagConstraints();

        this.setSize(300, 135); // Ajustamos el tamaño del frame
        this.setResizable(false); // El frame se hace no reajustable
        
        // POSICIONAMIENTO DE LOS COMPONENTES

        // Etiqueta de bienvenida
        // Definición de constantes de layout
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        constraints.weighty = 1.0;
        // Definimos la etiqueta con un tamaño de texto más grande
        bienvenida.setFont(new Font("DejaVu Sans", Font.PLAIN, 18));
        // Añadimos la etiqueta al frame
        this.getContentPane().add(bienvenida, constraints);
        constraints.weighty = 0.0; // Se 'resetea' el estiramiento de la fila.

        // Etiqueta de ingresar contraseña
        // Definición de constantes de layout
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        constraints.weighty = 1.0;
        // Añadimos la etiqueta al frame
        this.getContentPane().add(peticion, constraints);
        constraints.weighty = 0.0; // Se 'resetea el estiramiento de la fila.

        // Etiqueta de contraseña y cuadro de contraseña
        // Definición de constantes de layout
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weighty = 1.0;
        constraints.anchor = constraints.EAST;
        // Añadimos la etiqueta al frame
        this.getContentPane().add(contrasena, constraints);
        constraints.weighty = 0.0; // Se 'resetea el estiramiento de la fila.

        // Definición de constantes de layout
        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weighty = 1.0;
        constraints.anchor = constraints.WEST;
        // Añadimos la etiqueta al frame
        this.getContentPane().add(contrasena_tbox, constraints);
        constraints.weighty = 0.0; // Se 'resetea' el estiramiento de la fila.

        // Botón Aceptar
        // Definición de constantes de layout
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        constraints.anchor = constraints.CENTER;
        // Añadimos un ActionListener
        this.aceptar.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        // TODO: Enlazar a la ventana de caja
                    }
                }
        );
        // Añadimos el botón al frame
        this.getContentPane().add(aceptar, constraints);
    }
}