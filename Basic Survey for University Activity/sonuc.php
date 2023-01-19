<?php
require('kutuphane/baglanti.php');


$sql = "SELECT * FROM sonuc";
$result = mysqli_query($conn, $sql);

if (mysqli_num_rows($result) > 0) {
  // output data of each row
  while($row = mysqli_fetch_assoc($result)) {
	  $sonuclar[]=$row;
  }
} 

$secenekler[1]="Antalyada Kahvaltı Etkinliği";
$secenekler[2]="Pizza Etkinliği";
$secenekler[3]="Kent Ormanı Pikniği";
$secenekler[4]="Davraz Turu";
?>

<?php require('kutuphane/ust.php'); ?>

<table class="table">
  <thead>
    <tr>
      <th scope="col">Öğrenci No</th>
      <th scope="col">Seçilen Etkinlik</th>
    </tr>
  </thead>
  <tbody>
  <?php foreach($sonuclar as $sonuc) : ; ?>
    <tr>
      <td><?php echo $sonuc['ogrno']; ?></td>
      <td><?php echo $secenekler[$sonuc['secenek']]; ?></td>
    </tr>
	<?php endforeach; ?>
  </tbody>
</table>
<?php require('kutuphane/alt.php'); ?>


