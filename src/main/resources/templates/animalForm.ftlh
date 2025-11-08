<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/css/normalize.css">
    <link rel="stylesheet" href="/css/styles.css">
    <link rel="stylesheet" href="/css/animalFormStyles.css">
    <title>Animal Form</title>
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
    <div class="formTitle">
        <h1>${title}</h1>
    </div>
    <div class="form">
        <form id="newAnimal" action="/animals" method="post" enctype="multipart/form-data">
            <label for="animalName">Animal Name</label><br>
            <input type="text" id="animalName" name="animalName"><br>
            <label for="animalWeight">Animal Weight</label><br>
            <input type="text" id="animalWeight" name="animalWeight"><br>
            <label for="animalAge">Animal Age</label><br>
            <input type="text" id="animalAge" name="animalAge"><br>
            <label for="animalGender">Animal Gender</label><br>
            <input type="text" id="animalGender" name="animalGender"><br>
            <label for="animalImage">Upload Image of Animal</label><br>
            <input type="file" id="picture" name="picture" required/>
            <button type="submit" class="btn btn-primary">Save</button>
        </form>
    </div>
</body>
</html>