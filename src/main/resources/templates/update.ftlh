<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/css/normalize.css">
    <link rel="stylesheet" href="/css/styles.css">
    <link rel="stylesheet" href="/css/animalFormStyles.css">
</head>

<body>

  <!-- Begin Nav Bar -->
  <nav>
        <ul>
            <li><a href="/animals">Home</a></li>
            <li><a href="about.html">About</a></li>
            <li><a href="/animals/createForm">Animal form</a></li>
            <li><a href="details.html">Details</a></li>
            <li><a href="/animals/updateForm">Update Animal</a></li>
        </ul>
    </nav>

  <div class="container" style="padding-top: 90px">
    <h1>${title}</h1>
    <img src="/profile-pictures/${(animal.profilePicturePath)!'avatar.png'}" class="card-img-top"
      style="height: 100px; width: 100px;" alt="profile picture">
    <div class="form">
      <form id="new-animal" action="/animals/update/${animal.animalId?c}" method="post" enctype="multipart/form-data">
        <label for="animalName">Animal Name</label><br>
        <input type="text" id="animalName" name="animalName" value="${animal.name}" placeholder="Name" /><br>
        <label for="animalAge">Animal Age</label><br>
        <input type="text" id="animalAge" name="animalAge" value="${animal.age}" readonly /><br>
        <label for="animalWeight">Animal Weight</label><br>
        <input type="text" id="animalWeight" name="animalWeight" value="${animal.weight}" readonly /><br>
        <label for="animalGender">Animal Gender</label><br>
        <input type="text" id="animalGender" name="animalGender" value="${animal.gender}" readonly /><br>
        <label for="profilePicturePath" class="form-label">Current Picture</label><br>
        <input type="text" id="profilePicturePath" name="profilePicturePath" value="${(animal.profilePicturePath)}" readonly /><br>
        <input type="file" id="picture" name="picture" /><br>
        <button type="submit" class="btn btn-primary">Save</button>
        <a href="/animals/${animal.animalId?c}" class="btn btn-outline-danger">Cancel</a>
      </form>
  </div>
  </div>
</body>

</html>