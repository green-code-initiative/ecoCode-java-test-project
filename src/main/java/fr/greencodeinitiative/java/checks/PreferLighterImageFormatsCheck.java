package fr.greencodeinitiative.java.checks;

import java.util.logging.Logger;

class PreferLighterImageFormatsCheck {

    private static final Logger LOGGER = Logger.getLogger(PreferLighterImageFormatsCheck.class.getName());

    public void logImagePaths() {
        // Test strings with heavy image formats
        String imagePath1 = "images/photo.jpg";
        String imagePath2 = "images/graphic.png";

        // Compliant string with a lighter image format
        String imagePath3 = "images/photo.webp"; // Compliant

        // Another compliant string with a lighter image format
        String imagePath4 = "images/graphic.avif"; // Compliant

        LOGGER.info("Image path 1: " + imagePath1);
        LOGGER.info("Image path 2: " + imagePath2);
        LOGGER.info("Image path 3: " + imagePath3);
        LOGGER.info("Image path 4: " + imagePath4);
    }

    public void printImagePaths() {
        String[] images = {
                "assets/image1.jpg", // Noncompliant {{Consider using lighter image formats like .webp or .avif instead of .jpg or .png}}
                "assets/image2.jpeg", // Noncompliant {{Consider using lighter image formats like .webp or .avif instead of .jpg or .png}}
                "assets/image3.png", // Noncompliant {{Consider using lighter image formats like .webp or .avif instead of .jpg or .png}}
                "assets/image4.webp", // Compliant
                "assets/image5.avif" // Compliant
        };

        for (String image : images) {
            LOGGER.info("Image path: " + image);
        }
    }
}
