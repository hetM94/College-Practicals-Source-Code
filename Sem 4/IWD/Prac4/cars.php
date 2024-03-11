<html>
  <head>
    <title>Practical 6</title>
  </head>
  <body>
    <form>
      <label for="car"
        >Car:
        <select name="car">
          <option value="safari">Safari</option>
          <option value="nexon">Nexon</option>
          <option value="tigor">Tigor :</option>
          <option value="tiago">Tiago</option>
          <option value="xuv700">XUV700</option>
          <option value="xuv300">XUV300</option>
          <option value="bolero">Bolero</option>
          <option value="i20">I-20</option>
          <option value="verna">Verna</option>
          <option value="nevue">Nevue</option>
          <option value="creta">Creta</option>
          <option value="swift">Swift</option>
          <option value="alto">Alto</option>
          <option value="baleno">Baleno</option>
          <option value="brezza">Brezza</option>
        </select>
      </label>
      <input type="submit" value="Submit" name="submit" />
</form>

    <?php
    if(isset($_GET["submit"]))
    {
    $car = $_GET["car"];

    switch($car){
        case "safari": 
        case "nexon": 
        case "tigor": 
        case "tiago":
            echo "Tata ki gadi";
            break;
        case "xuv700" : 
        case "xuv300" : 
        case "bolero":
            echo "Mahindra ki gadi";
            break;
        case "i20" :
        case "verna":
        case "nevue" :
        case "creta" :
            echo "Hyundai ki gadi";
            break;
        case "swift": 
        case "alto": 
        case "baleno": 
        case "brezza":
            echo "Suzuki ki gadi";
            break;
        default:
            echo "Kuch to gadbad hai ";
            break;
    }
    }
    ?>
  </body>
</html>
