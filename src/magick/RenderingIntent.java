package magick;

/**
 * Corresponds to the ImageMagick enumerated type of the same name.
 *
 * Important! Constant values should correspond to:
 * http://trac.imagemagick.org/browser/ImageMagick/branches/ImageMagick-6.7.7/magick/profile.h
 *
 * @author Eric Yeo
 */
public interface RenderingIntent {

    public final int UndefinedIntent = 0;
    public final int SaturationIntent = 1;
    public final int PerceptualIntent = 2;
    public final int AbsoluteIntent = 3;
    public final int RelativeIntent = 4;

}
