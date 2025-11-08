<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/css/normalize.css">
    <link rel="stylesheet" href="/css/styles.css">
    <link rel="stylesheet" href="/css/detailsStyles.css">
    <title>Details</title>
</head>
<body>
    <nav>
        <ul>
            <li><a href="/animals">Home</a></li>
            <li><a href="about.html">About</a></li>
            <li><a href="/animals/createForm">Animal form</a></li>
            <li><a href="/animals/{id}">Details</a></li>
            <li><a href="/animals/updateForm">Update Animal</a></li>
        </ul>
    </nav>
    <div class="detailsMain">
        <p>${animal.name}</p>
        <img src="/profile-pictures/${(animal.profilePicturePath)!'avatar.png'}" class="card-img-top"
        style="height: 100px; width: 100px;" alt="profile picture">
    </div>
    <div class="description">
        <h2>Age</h2>
        <p>${animal.age}</p>
        <h2>Weight</h2>
        <p>${animal.weight}</p>
        <h2>Gender</h2>
        <p>${animal.gender}</p>
        <span style="float:right"> <a href="/animals/updateForm/${animal.animalId?c}" class="btn btn-primary">Edit Animal</a></span>
        <a href="/animals/delete/${animal.animalId?c}" class="btn btn-danger">Delete Animal</a>
    </div>
</body>
</html>