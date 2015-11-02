package buffnerdapps.com.interactivestory.model;

/**
 * Created by k.love on 9/18/2015.
 */
public class Page {
    private int mImageId;
    private String mText;
    private Choice mChoice1;
    private Choice mChoice2;
    private boolean mIsFinal = false;

    public Page(int imageId, String text, Choice choice1, Choice choice2) {
        mText = text;
        mImageId = imageId;
        mChoice1 = choice1;
        mChoice2 = choice2;
    }

    public boolean isFinal() {
        return mIsFinal;
    }

    public void setIsFinal(boolean isFinal) {
        mIsFinal = isFinal;
    }

    public Page(int imageId,  String text) {
        mImageId = imageId;
        mText = text;
        mChoice1 = null;
        mChoice2 = null;
        mIsFinal = true;


    }
   

    public int getmImageId() {
        return mImageId;
    }
    public void setmImageId(int id) {
        mImageId = id;
    }

    public void setText(String text) {
        mText = text;
    }

    public void setChoice2(Choice choice2) {
        mChoice2 = choice2;
    }

    public void setChoice1(Choice choice1) {
        mChoice1 = choice1;
    }

    public Choice getChoice1() {
        return mChoice1;
    }

    public Choice getChoice2() {return mChoice2;}

    public int getImageId() {
        return mImageId;
    }

    public String getText() {
        return mText;
    }
}
