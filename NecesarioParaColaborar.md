Antes que nada, para colaborar tienes que unirte al grupo de Facebook 'Grupo de colaboradores de openCheckout' en el siguiente link https://www.facebook.com/groups/455452857810521/, y pedir acceso al programa. Una vez que te agreguen al proyecto, continúa leyendo.

Los programas necesarios para colaborar completamente en este programa son:
  * Un editor HTML (como Dreamweaver)
  * El framework ExtJS
  * Un servidor web (p. ej: XAMPP)
  * TortoiseSVN (para subir los cambios al repo)

Los pasos necesarios para instalar estos programas son:
  1. Instalar XAMPP u otro servidor web
  1. Crear una carpeta llamada 'openCheckout' dentro de la carpeta htdocs en el directorio de instalación de XAMPP
  1. Descargar ExtJS y mantenerlo en una carpeta aparte
  1. Crear un repositorio SVN dentro de la carpeta 'openCheckout' con TortoiseSVN
  1. Hacer un checkout desde la página https://opencheckout.googlecode.com/svn/trunk/ a la carpeta del repositorio

Una vez hecho todo esto, espera a recibir las instrucciones de lo que tienes que hacer, y empieza a editar los archivos con el editor HTML, una vez hecho los cambios necesarios, en la carpeta del repo, haz clic derecho, selecciona TortoiseSVN y haz clic en Import, escribe un mensaje corto sobre los cambios que hiciste, y haz clic en OK, y escribe tu correo de Google con el que colaboras y escribe la contraseña que te da Google Code para hacer commits, haz clic en el checkbox para recordar tus datos y cliquea en OK de nuevo. Espera a que los cambios se realizen y ya has hecho un commit.

Cuando se requiera de una librería extra de ExtJS, cópiala y ponla en la carpeta extjs dentro del proyecto y luego enlázala al archivo HTML que la necesita.