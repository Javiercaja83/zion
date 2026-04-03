<<?php
$hora = date("H");

if ($hora > 14) {
    echo "Buenass tardes";
} else if ($hora > 20) {
    echo "Buenoas noches";
} else {
    echo "Buenos dias";
}
