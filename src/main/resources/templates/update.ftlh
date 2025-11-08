<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/css/normalize.css">
    <link rel="stylesheet" href="/css/styles.css">
</head>

<body>

  <!-- Begin Nav Bar -->
  <nav class="navbar navbar-expand-lg  navbar-dark" style="background-color: #799351;">
    <a class="navbar-brand" href="/animals" style="margin: 10px;">
      <img src="/logo.jpg" alt="" width="80" height="60">
    </a>
    <ul class="nav justify-content-end">
      <li class="nav-item">
        <a class="nav-link active" aria-current="page" href="/animals">Home</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Second</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Third</a>
      </li>
    </ul>
  </nav>

  <div class="container" style="margin-top: 15px;">
    <h1>${title}</h1>
    <img src="/profile-pictures/${(animal.profilePicturePath)!'avatar.png'}" class="card-img-top"
      style="height: 100px; width: 100px;" alt="profile picture">
    <form id="new-animal" action="/animals/update/${animal.animalId?c}" method="post" enctype="multipart/form-data">
      <input type="text" id="animalId" name="animalId" value="${animal.animalId?c}" readonly />
      <input type="text" id="name" name="name" value="${animal.name}" placeholder="Name" />
      <input type="email" id="email" name="email" value="${animal.email}" placeholder="example@domain.edu" />
      <input type="text" id="major" name="major" value="${animal.major}" placeholder="Major" />
      <input type="number" id="gpa" name="gpa" step="0.01" value="${animal.gpa}" placeholder="GPA" /><br>
      <label for="profilePicturePath" class="form-label">Current Picture</label>
      <input type="text" id="profilePicturePath" name="profilePicturePath" value="${(animal.profilePicturePath)}" readonly />
      <input type="file" id="picture" name="picture" />
      <button type="submit" class="btn btn-primary">Save</button>
      <a href="/animals/${animal.animalId?c}" class="btn btn-outline-danger">Cancel</a>
    </form>

  </div>
</body>

</html>