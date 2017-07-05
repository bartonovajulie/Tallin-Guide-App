package com.example.android.tallinnguideapp;

/**
 * {@link Place} represents a place of Tallinn with its name and short description.
 */
public class Place {

    /**
     * Name of place
     */
    private String mNameOfPlace;

    /**
     * Description of place
     */
    private String mDescriptionOfPlace;

    /**
     * Image resource ID for a place
     **/
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Static final means that a variable is a constant which is written with uppercase.
     **/
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Constructor
     *
     * @param nameOfPlace        is a name of place
     * @param descriptionOfPlace is a short description of place
     * @param imageResourceId    is the drawable resource ID for the image asset
     */
    public Place(String nameOfPlace, String descriptionOfPlace, int imageResourceId) {
        mNameOfPlace = nameOfPlace;
        mDescriptionOfPlace = descriptionOfPlace;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get a name of place
     */
    public String getNameOfPlace() {
        return mNameOfPlace;
    }

    /**
     * Get a short description of place
     */
    public String getDescriptionOfPlace() {
        return mDescriptionOfPlace;
    }

    /**
     * Return an image resource ID of a place
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there si an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
