var mesok=new Array(12);

mesok[0]="enero";
mesok[1]="febrero";
mesok[2]="marzo";
mesok[3]="abril";
mesok[4]="mayo";
mesok[5]="junio";
mesok[6]="julio";
mesok[7]="agosto";
mesok[8]="septiembre";
mesok[9]="octubre";
mesok[10]="noviembre";
mesok[11]="diciembre";

var x = new Array(7);

x[0]="domingo";
x[1]="martes";
x[2]="miércoles";
x[3]="jueves";
x[4]="viernes";
x[5]="sábado";
x[6]="lunes";

function obtenerHora() {
	var mm=new Date();
	var hora = mm.getHours();
	var minuto = mm.getMinutes();
	var segundo = mm.getSeconds();
	
	str_segundo = new String(segundo);
	if(str_segundo.length == 1) {
		segundo = "0" + str_segundo;
	}
	str_minuto = new String(minuto);
	if(str_minuto.length == 1) {
		minuto = "0" + str_minuto;
	}
	str_hora = new String(hora);
	if(str_hora.length == 1) {
		hora = "0" + str_hora;
	}
	
	hora = x[mm.getDay()] + ", " + mm.getDate() + " de " + mesok[mm.getMonth()] + " de " + mm.getFullYear() + ", " + hora + ":" + minuto + ":" + segundo;
	document.getElementById("hora").innerHTML =  hora;
	setTimeout('obtenerHora()', 1000)
}
