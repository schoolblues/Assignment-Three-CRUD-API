<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/normalize.css">
    <link rel="stylesheet" href="css/styles.css">
    <link rel="stylesheet" href="css/animalFormStyles.css">
    <title>Animal Form</title>
</head>
<body>
    <nav>
        <ul>
            <li><a href="index.html">Home</a></li>
            <li><a href="about.html">About</a></li>
            <li><a href="animalForm.html">Animal form</a></li>
            <li><a href="details.html">Details</a></li>
        </ul>
    </nav>
    <div class="formTitle">
        <h1>Add New Animal</h1>
    </div>
    <div class="form">
        <form>
            <label for="animalName">Animal Name</label><br>
            <input type="text" id="animalName" name="animalName"><br>
            <div class="space"></div>
            <label for="species">Animal Species</label><br>
            <input type="text" id="species" name="species"><br>
            <div class="space"></div>
            <label for="dob">Date Of Birth</label><br>
            <input type="text" id="dob" name="dob"><br>
            <div class="space"></div>
            <label for="animalImage">Upload Image of Animal</label><br>
            <input type="text"  id="animalImage" name="animalImage"><br>
        </form>
        <form class="description">
            <label for="description">Description</label><br>
            <input type="text"  id="description" name="description">
        </form>
    </div>
    <div class="button">
        <button>Submit</button>
    </div>
</body>
</html>