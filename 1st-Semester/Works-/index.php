<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "anket";

// Create connection
$conn = mysqli_connect($servername, $username, $password, $dbname);
// Check connection
if ($conn==false) {
  die("Connection failed: " . mysqli_connect_error());
}
//print_r($_POST);

if(@$_POST['gonder']==1){//butona basıldı mı kontrolu
	
	
	//echo "Aferin butona bastın";
	
	$ogrno=$_POST['ogrno'];
	$secenek=$_POST['secenek'];
	
	if(empty($ogrno)==false AND empty($secenek)==false){
		echo "Aferin alanlar dolu!";
				$sql = "INSERT INTO sonuc(ogrno, secenek)
		VALUES ('{$ogrno}', '$secenek')";
		
		//echo $sql;
        
		if (mysqli_query($conn, $sql)) {
		  echo "Aferin kayıt basarili!";
		} else {
		  echo "Error: " . $sql . "<br>" . mysqli_error($conn);
		}
        
		mysqli_close($conn);
	}else{
		echo "Alanları doldurmalısınız" ;
		}	
}
?>






<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="Anonoymous Contributer">
    <meta name="generator" content="Hugo 0.104.2">
    <title>Anket</title>

    <link rel="canonical" href="https://getbootstrap.com/docs/5.2/examples/navbar-static/">

    

    

<link href="assets/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }

      .b-example-divider {
        height: 3rem;
        background-color: rgba(0, 0, 0, .1);
        border: solid rgba(0, 0, 0, .15);
        border-width: 1px 0;
        box-shadow: inset 0 .5em 1.5em rgba(0, 0, 0, .1), inset 0 .125em .5em rgba(0, 0, 0, .15);
      }

      .b-example-vr {
        flex-shrink: 0;
        width: 1.5rem;
        height: 100vh;
      }

      .bi {
        vertical-align: -.125em;
        fill: currentColor;
      }

      .nav-scroller {
        position: relative;
        z-index: 2;
        height: 2.75rem;
        overflow-y: hidden;
      }

      .nav-scroller .nav {
        display: flex;
        flex-wrap: nowrap;
        padding-bottom: 1rem;
        margin-top: -1px;
        overflow-x: auto;
        text-align: center;
        white-space: nowrap;
        -webkit-overflow-scrolling: touch;
      }
    </style>

    
    <!-- Custom styles for this template -->
    <link href="assets/css/navbar-top.css" rel="stylesheet">
  </head>
  <body>
    
<nav class="navbar navbar-expand-md navbar-dark bg-dark mb-4">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Anket</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarCollapse">
      <ul class="navbar-nav me-auto mb-2 mb-md-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="index.php">Anasayfa</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="sonuc.php">Sonuclar</a>
        </li>
      </ul>
      <form class="d-flex" role="search">
        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success" type="submit">Search</button>
      </form>
    </div>
  </div>
</nav>

<main class="container">
 <form method="post">
  <div class="form-group">
    <label for="exampleFormControlInput1">Ogrenci Numarasi</label>
    <input type="Sayı" name="ogrno" class="form-control" id="exampleFormControlInput1" placeholder="maku ogrenci numarani gir">
  </div>
  <div class="form-group">
    <label for="exampleFormControlSelect1">2023 Yılında Duzenlenmesini İstediginiz Etkinlik</label>
    <select name="secenek" class="form-control" id="exampleFormControlSelect1">
      <option value="0">Seciniz</option>
      <option value="1">Antalyada Kahvaltı Etkinligi</option>
      <option value="2">Antalyada Gece Kulubü</option>
      <option value="3">Antalyada Denizi Gezin</option>
      <option value="4">Antalyada Daga Cikin</option>
    </select>
  </div>
  <button type="submit" class="btn btn-primary" name="gonder" value="1">Gonder</button>
  
  
  
</form>
 
 
 
  </main>


    <script src="assets/dist/js/bootstrap.bundle.min.js"></script>

      
  </body>
</html>