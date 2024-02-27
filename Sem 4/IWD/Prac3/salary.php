<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Salary Cal</title>
</head>

<body>
    <form method="POST">
        <label for="basic">Basic Salary: <input type="number" name="basic" /></label>
        <input type="submit" name="submit">
    </form>
    <br />

    <?php
    if (isset($_POST["submit"])) {
        $basic = $_POST["basic"];

        $da = $basic * 0.5;
        $hra = $basic * 0.1;
        $medical = $basic * 0.04;

        $gross = $basic + $da + $hra + $medical;

        $ins = $gross * 0.07;
        $pf = $gross * 0.05;

        $deduc = $ins + $pf;
        $net = $gross- $deduc;
        echo "<strong>Your Salary Script: <br>";
        echo "<hr>";
        echo "Basic: ", $basic, "</strong><br><br>";

        echo "Gross: " . $gross, "<br>";
        echo "DA: ", $da, "<br>";
        echo "HRA: ", $hra, "<br>";
        echo "Medical: ", $medical, "<br>";
        echo "<hr>";
        echo "Gross: ", $gross, "<br>";
        echo "Insurance: ", $ins, "<br>";
        echo "PF: ", $pf, "<br>";
        echo "Decudtions are: $deduc";
        echo "<hr >";
        echo "<strong>Net: ", $net,"</strong>";

    }

    ?>
</body>

</html>