<?php
require('kutuphane/baglanti.php');

//print_r($_POST);

if(@$_POST['gonder']==1) { // butona basıldı mı kontrolü
  //echo "Aferin butona bastın";
  $ogrno=$_POST['ogrno'];
  $secenek=$_POST['secenek'];

  if(empty($ogrno)==false AND empty($secenek)==false) {
    //echo "Aferin alanlar dolu!";

    $sql = "INSERT INTO sonuc (ogrno,secenek)
    VALUES ('{$ogrno}', '{$secenek}')";

    //echo $sql;
    
    if (mysqli_query($conn, $sql)) {
      echo "Aferin kayıt başarılı!";
    } else {
      echo "Error: " . $sql . "<br>" . mysqli_error($conn);
    }
    
    mysqli_close($conn);


  }else {
    echo "Alanları doldurmalısınız";
  }


}

?>

<?php require('kutuphane/ust.php'); ?>
<form method="post">
  <div class="form-group">
    <label for="exampleFormControlInput1">Öğrenci Numarası</label>
    <input type="number" name="ogrno" class="form-control" id="exampleFormControlInput1" placeholder="makü öğr. no giriniz">
  </div>
  <div class="form-group">
    <label for="exampleFormControlSelect1">2023 yılında düzenlenmesini istediğiniz etkinlik</label>
    <select name="secenek" class="form-control" id="exampleFormControlSelect1">
      <option value="0">Seçiniz</option>
      <option value="1">Antalyada kahvaltı etkinliği</option>
      <option value="2">Pizza Etkinliği</option>
      <option value="3">Kent Ormanı Pikniği</option>
      <option value="4">Davraz Turu</option>
    </select>

  
  </div>
  <button type="submit" class="btn btn-primary" name="gonder" value="1">Gönder</button>
</form>

<?php require('kutuphane/alt.php'); ?>


