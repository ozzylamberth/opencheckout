<?php

session_start();

$usuario = isset($_POST["usuario"]) ? $_POST["usuario"] : "";
$password = isset($_POST["contrasena"]) ? $_POST["contrasena"] : "";
$conexion = mysql_connect("localhost", "opencheckout", "opencheckout") or die("<strong>No se puede conectar a l servidor</strong>");
mysql_select_db("opencheckout", $conexion) or die("<strong>No se puede seleccionar la base de datos</strong>");

$query = "SELECT * FROM usuarios WHERE usuario='$usuario'";
$resultado = mysql_query($query, $conexion) or die("<strong>Error procesando la solicitud</strong>");
if (!$resultado) {
	die(mysql_error());
}
$total = mysql_num_rows($resultado);

if ($total > 0) {
	$fila = mysql_fetch_assoc($resultado);
	if ($fila['password'] == sha1($password)) {
		$_SESSION["usuario"] = $usuario;
		$_SESSION["estalogueado"] = true;
		echo "{success: true}";
	} else {
		echo "{success: false, errors: { reason: 'Contrase\u00f1a incorrecta, intenta de nuevo.' }}";
	}
} else {
	echo "{success: false, errors: { reason: 'Nombre de usuario incorrecto, intenta de nuevo.' }}";
}
?>