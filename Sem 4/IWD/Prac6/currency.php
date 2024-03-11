<?php 

$deno = array(100,50,20,10,5,2,1) ;
$change = 35;


foreach ($deno as $thisDenomination){
        $numberOfNotes = floor($change / $thisDenomination);
        $change = $change % $thisDenomination ;
        echo "Number of $thisDenomination notes: $numberOfNotes<br>";
}
?>