package androidx.appcompat.widget;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.core.graphics.drawable.WrappedDrawable;

/* loaded from: classes.dex */
class AppCompatProgressBarHelper {
    private static final int[] TINT_ATTRS = {R.attr.indeterminateDrawable, R.attr.progressDrawable};
    private Bitmap mSampleTile;
    private final ProgressBar mView;

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(23)
    /* loaded from: classes.dex */
    public static class Api23Impl {
        private Api23Impl() {
        }

        public static void transferLayerProperties(LayerDrawable layerDrawable, LayerDrawable layerDrawable2, int i8) {
            layerDrawable2.setLayerGravity(i8, layerDrawable.getLayerGravity(i8));
            layerDrawable2.setLayerWidth(i8, layerDrawable.getLayerWidth(i8));
            layerDrawable2.setLayerHeight(i8, layerDrawable.getLayerHeight(i8));
            layerDrawable2.setLayerInsetLeft(i8, layerDrawable.getLayerInsetLeft(i8));
            layerDrawable2.setLayerInsetRight(i8, layerDrawable.getLayerInsetRight(i8));
            layerDrawable2.setLayerInsetTop(i8, layerDrawable.getLayerInsetTop(i8));
            layerDrawable2.setLayerInsetBottom(i8, layerDrawable.getLayerInsetBottom(i8));
            layerDrawable2.setLayerInsetStart(i8, layerDrawable.getLayerInsetStart(i8));
            layerDrawable2.setLayerInsetEnd(i8, layerDrawable.getLayerInsetEnd(i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppCompatProgressBarHelper(ProgressBar progressBar) {
        this.mView = progressBar;
    }

    private Shape getDrawableShape() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    private Drawable tileifyIndeterminate(Drawable drawable) {
        if (drawable instanceof AnimationDrawable) {
            AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            AnimationDrawable animationDrawable2 = new AnimationDrawable();
            animationDrawable2.setOneShot(animationDrawable.isOneShot());
            for (int i8 = 0; i8 < numberOfFrames; i8++) {
                Drawable tileify = tileify(animationDrawable.getFrame(i8), true);
                tileify.setLevel(10000);
                animationDrawable2.addFrame(tileify, animationDrawable.getDuration(i8));
            }
            animationDrawable2.setLevel(10000);
            return animationDrawable2;
        }
        return drawable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bitmap getSampleTile() {
        return this.mSampleTile;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void loadFromAttributes(AttributeSet attributeSet, int i8) {
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(this.mView.getContext(), attributeSet, TINT_ATTRS, i8, 0);
        Drawable drawableIfKnown = obtainStyledAttributes.getDrawableIfKnown(0);
        if (drawableIfKnown != null) {
            this.mView.setIndeterminateDrawable(tileifyIndeterminate(drawableIfKnown));
        }
        Drawable drawableIfKnown2 = obtainStyledAttributes.getDrawableIfKnown(1);
        if (drawableIfKnown2 != null) {
            this.mView.setProgressDrawable(tileify(drawableIfKnown2, false));
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @VisibleForTesting
    Drawable tileify(Drawable drawable, boolean z8) {
        boolean z9;
        if (drawable instanceof WrappedDrawable) {
            WrappedDrawable wrappedDrawable = (WrappedDrawable) drawable;
            Drawable wrappedDrawable2 = wrappedDrawable.getWrappedDrawable();
            if (wrappedDrawable2 != null) {
                wrappedDrawable.setWrappedDrawable(tileify(wrappedDrawable2, z8));
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i8 = 0; i8 < numberOfLayers; i8++) {
                    int id = layerDrawable.getId(i8);
                    Drawable drawable2 = layerDrawable.getDrawable(i8);
                    if (id != 16908301 && id != 16908303) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    drawableArr[i8] = tileify(drawable2, z9);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i9 = 0; i9 < numberOfLayers; i9++) {
                    layerDrawable2.setId(i9, layerDrawable.getId(i9));
                    if (Build.VERSION.SDK_INT >= 23) {
                        Api23Impl.transferLayerProperties(layerDrawable, layerDrawable2, i9);
                    }
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.mSampleTile == null) {
                    this.mSampleTile = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(getDrawableShape());
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                if (z8) {
                    return new ClipDrawable(shapeDrawable, 3, 1);
                }
                return shapeDrawable;
            }
        }
        return drawable;
    }
}
