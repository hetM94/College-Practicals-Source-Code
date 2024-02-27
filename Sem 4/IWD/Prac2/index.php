<!DOCTYPE html>
<html lang="en">
  <head>
    <title>Prac2</title>
  </head>
  <style>
    label,
    input {
      margin-top: 5px;
    }
  </style>
  <body>
    <form method="POST">
      <label for="Name">Name: <input type="text" name="name" /></label><br />
      <label for="Email">Email: <input type="email" name="email" /></label
      ><br />
      <label for="address">Address: <input type="address" name="address"></label><br />
      <label for="number"
        >Phone Number: <input type="number" name="p-number"
      /></label>

      <br /><input type="submit" name="submit" id="submit" value="Submit" />
      <br>

      <?php
if(isset($_POST["submit"]))
{
  $name = $_POST["name"];
  $email = $_POST["email"];
  $phone = $_POST["p-number"];
  $address = $_POST["address"];
  echo $name,"<br>";
  echo $email,"<br>";
  echo $address,"<br>";
  echo $phone,"<br>";
}
    ?> 
    </form>
  </body>
</html>
