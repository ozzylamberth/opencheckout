<?php

session_start();

if(@$_SESSION["estalogueado"]) {
	header("Location: pos.php");
}

?>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>openCheckout</title>
	<link rel="stylesheet" type="text/css" href="extjs/resources/css/ext-all.css">
	<script type="text/javascript" src="extjs/ext-all.js"></script>
	<script type="text/javascript" src="login.js"></script>
</head>

<body>
	<div id='contenedor'></div>
</body>
</html>
