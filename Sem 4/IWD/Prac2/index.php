<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Prac2</title>
  </head>
  <style>
    label,
    input {
      margin-top: 6px;
    }
  </style>
  <body>
    <div class="form-container">
      <form method="get">
        <!-- <label for="Name"
          >First-Name: <input type="text" name="name" id="name" /></label
        ><br /> -->
        <label for="Name"
          >Last-ame: <input type="text" name="name" id="name" /></label
        ><br />

        <label for="Email"
          >Email: <input type="email" name="email" id="email" /></label
        ><br />
        <label for="Password"
          >Password:
          <input type="password" name="password" id="password" /></label
        ><label for="c-password"
          >Confirm Password:
          <input type="password" name="c-password" id="c-password" /></label
        ><br />

        <label for="gander">Male<input type="radio" name="gender" id="male"></label>
        <label for="gander">Female<input type="radio" name="gender" id="Female"></label>

        <br><input type="submit" name="submit" id="submit" value="Submit">
      </form>
    </div>

    <?php
    $name = $_GET.["Name"];
    echo "$name";
    ?>
  </body>
</html>
