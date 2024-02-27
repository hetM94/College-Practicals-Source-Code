<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Prac3 Calculator</title>
  </head>

  <body>
    <form method="get">
      <label for="num1">Number 1: <input type="number" name="num1" /> </label
      ><br />

      <label for="num2">Number 2: <input type="number" name="num2" /></label
      ><br />

      <label for="operator"
        >Operation: <select name="op" id="">
            <option value="add">+</option>
            <option value="sub">-</option>
            <option value="multi">*</option>
            <option value="divide">/</option>
            <option value="modul">%</option>
        </select></label
      ><br />
      <input type="submit" name="submit">
    </form>

    <?php
    if(isset($_GET["submit"])){
        $num1 = $_GET["num1"];
        $num2 = $_GET["num2"];
        $op = $_GET["op"];

        switch($op){
            case "add":
                echo "Addition: ", $num1+$num2;
                break;
            case "sub":
                echo "Subtraction: ",$num1-$num2;
                break;
            case "multi":
                echo "Multiplication: ",$num1*$num2;
                break;
            case "divide":
                echo "Division: ",$num1/$num2;
                break;
            case "modul":
                echo "Modulo: ",$num1%$num2;
                break;
            default:
                echo "Select an Operation";
                break;
        }
    }
    ?>
  </body>
</html>
