<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/normalize.css">
    <link rel="stylesheet" href="css/styles.css">
    <title>index</title>

</head>
<body>
    <div class="galleryMain">
        <nav>
            <ul>
                <li><a href="index.html">Home</a></li>
                <li><a href="about.html">About</a></li>
                <li><a href="animalForm.html">Animal form</a></li>
                <li><a href="details.html">Details</a></li>
            </ul>
        </nav>
        <div class="galleryOkapi">
            <img src="images/ConfusedGiraffeResize.jpg" alt="">
            <img src="images/OkapiTwoResize.jpg" alt="">
            <img src="images/OkapiThreeResize.jpg" alt="">
            <img src="images/OkapiFourResize.jpg" alt="">
            <img src="images/OkapiFiveResize.jpg" alt="">
            <p>
                The Okapi and Giraffe are the only living remnants of the Giraffide family.
                Okapi are an endangered species
                Okapis tend to inhabit higher altitudes, anywhere from 1,600-4,900 ft.
            </p>
        </div>
        <div class="galleryKomodo">
            <img src="images/ForbbidenPuppyResize.jpg" alt="">
            <img src="images/KomodoTwoResize.jpg" alt="">
            <img src="images/KomodoThreeResize.jpg" alt="">
            <img src="images/KomodoFourResize.jpg" alt="">
            <img src="images/KomodoFiveResize.jpg" alt="">
            <p>
                Komodo Dragons are the largest living species of lizard.
                Komodo Dragons are apex predators.
                Komodo Dragons are an endangered species.   
            </p>
        </div>
        <div class="gallerySun">
            <img src="images/ForgottenTurkeyLegResize.jpg" alt="">
            <img src="images/SunTwoResize.jpg" alt="">
            <img src="images/SunThreeResize.jpg" alt="">
            <img src="images/SunFourResize.jpg" alt="">
            <img src="images/SunFiveResize.jpg" alt="">
            <p>
                Despite their name they are not actually spiders
                They find their prey by tapping their pedipalps(mouth parts) on the ground.
                They do not breathe like other scorpions or spiders. Using a complex tracheal system consisting of holes covering the span of their bodies
            </p>
        </div>
        <div class="galleryStand">
            <img src="images/StandingFishResize.jpg" alt="">
            <img src="images/StandTwoResize.jpg" alt="">
            <img src="images/StandThreeResize.png" alt="">
            <img src="images/StandFourResize.jpg" alt="">
            <img src="images/StandFiveResize.png" alt="">
            <p>
                The Tripod Fish waits on the ocean floor for food to come to it.
                It uses its long fin rays to knock fish that could be floating by into it's mouth.
                Tripod Fish can produce both eggs, and sperm, making it capable of reproducing entirely on it's on.
            </p>
        </div>
        <div class="galleryGiant">
            <img src="images/WrinkledBeefJerkyResize.jpg" alt="">
            <img src="images/GiantTwoResize.jpg" alt="">
            <img src="images/GiantThreeResize.jpg" alt="">
            <img src="images/GiantFourResize.jpg" alt="">
            <img src="images/GiantFiveResize.jpg" alt="">
            <p>
                Giant Salamanders are the largest amphibian species
                They are fully aquatic, but lack any real swimming ability. 
                Was mistaken for a human being in 1726 by a swiss physician. He thought that the skeleton was remains from the biblical flood.
            </p>
        </div>
        <div class="gallerySpider">
            <img src="images/RainbowGuyResize.jpg" alt="">
            <img src="images/SpiderTwoResize.jpg" alt="">
            <img src="images/SpiderThreeResize.jpg" alt="">
            <img src="images/SpiderFourResize.jpg" alt="">
            <img src="images/SpiderFiveResize.jpg" alt="">
            <p>
                The Peacock Spider can see the full visible range of light, as well as the ultraviolet range.
                If the male continues to dance for an uninterested partner she will attempt to kill him.
            </p>
        </div>
    </div>

    <script>
        const slider = document.querySelector('.galleryOkapi')
        let isDown = false;
        let startX;
        let scrollLeft;

        slider.addEventListener('mousedown', (e) => {
            isDown = true;
            slider.classList.add('active');
            startX = e.pageX - slider.offsetLeft;
            scrollLeft = slider.scrollLeft;
        });

        slider.addEventListener('mouseleave',() => {
            isDown = false;
            slider.classList.remove('active');
        });

        slider.addEventListener('mouseup',   () => {
            isDown = false;
            slider.classList.remove('active');
        });

        slider.addEventListener('mousemove', (e) => {
            if(!isDown) return;
            e.preventDefault();
            const x = e.pageX - slider.offsetLeft;
            const walk = x - startX;
            slider.scrollLeft = scrollLeft - walk;
        });

    </script>

    <div class="footer">
    </div>
</body>
</html>