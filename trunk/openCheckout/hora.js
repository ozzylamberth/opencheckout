var mm=new Date();
var m2 = mm.getMonth() + 1;
var mesok = (m2 < 10) ? '0' + m2 : m2;
var mesok=new Array(12);

mesok[0]="Enero";
mesok[1]="Febrero";
mesok[2]="Marzo";
mesok[3]="Abril";
mesok[4]="Mayo";
mesok[5]="Junio";
mesok[6]="Julio";
mesok[7]="Agosto";
mesok[8]="Septiembre";
mesok[9]="Octubre";
mesok[10]="Noviembre";
mesok[11]="Diciembre";

var dia, x, s;
var x = new Array(7);

x[0]="lunes";
x[1]="martes";
x[2]="miércoles";
x[3]="jueves";
x[4]="viernes";
x[5]="sábado";
x[6]="domingo";

function obtenerHora() {
	document.write(x[mm.getDay()] + ", " + mm.getDate() + " de " + mesok[mm.getMonth()] + " de " + mm.getYear() + ", " + mm.getHours() + ":" + mm.getMinutes + ":" + mm.getSeconds);
	t=setTimeout('obtenerHora()', 500);
}
