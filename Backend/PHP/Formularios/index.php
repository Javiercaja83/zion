<?php
ini_set('display_errors', 1);
ini_set('display_startup_errors', 1);
error_reporting(E_ALL);

$pdo = new PDO("sqlite:usuarios.db");
$pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

$pdo->exec("
    CREATE TABLE IF NOT EXISTS usuarios (
    id INTEGER PRIMARY KEY AUTOINCREMENT, 
    nombre TEXT NOT NULL, 
    edad INTEGER NOT NULL
    )
");

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $nombre = htmlspecialchars($_POST["nombre"] ?? "");
    $edad = (int) ($_POST["edad"] ?? 0);

    if ($nombre !== "" && $edad > 0) {
        
        $stmt = $pdo->prepare(
            "INSERT INTO usuarios (nombre, edad) VALUES (?, ?)"
        );
        $stmt->execute([$nombre, $edad]);
    }
    
    echo "Usuario guardado correctamente <hr>";
    
    if ($edad >= 18) { // Cambiado a $edad
        echo "Eres mayor de edad";
    } else {
        echo "Eres menor de edad";
    }
    echo "<h2>Resultado</h2>";
    echo "Hola $nombre, tienes $edad años <br>";
    echo "<hr>"; // Corregido para imprimir la etiqueta HTML correctamente
}
?>

<h2>Formulario</h2>

<form method="post">
    Nombre: <br>
    <input type="text" name="nombre"><br><br>

    Edad:<br>
    <input type="number" name="edad"><br><br>

    <input type="submit" name="Enviar">

<h2>Usuarios registrados</h2>

<?php
$stmt = $pdo->query("SELECT * FROM usuarios");
foreach ($stmt as $fila) {
    echo "ID: {$fila['id']} - {$fila['nombre']} ({$fila['edad']} años)<br>";
}
?>
</form>