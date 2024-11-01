package androidx.leanback.widget;

import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.util.TypedValue;
import androidx.annotation.ColorInt;
import androidx.annotation.RestrictTo;
import androidx.leanback.R;
import androidx.leanback.graphics.CompositeDrawable;
import androidx.leanback.graphics.FitWidthBitmapDrawable;
import androidx.leanback.widget.Parallax;
import androidx.leanback.widget.ParallaxTarget;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes3.dex */
public class DetailsParallaxDrawable extends CompositeDrawable {
    private Drawable mBottomDrawable;

    public DetailsParallaxDrawable(Context context, DetailsParallax detailsParallax, Drawable drawable, ParallaxTarget parallaxTarget) {
        init(context, detailsParallax, drawable, new ColorDrawable(), parallaxTarget);
    }

    private static int getDefaultBackgroundColor(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.defaultBrandColorDark, typedValue, true)) {
            return context.getResources().getColor(typedValue.resourceId);
        }
        return context.getResources().getColor(R.color.lb_default_brand_color_dark);
    }

    void connect(Context context, DetailsParallax detailsParallax, ParallaxTarget parallaxTarget) {
        Parallax.IntProperty overviewRowTop = detailsParallax.getOverviewRowTop();
        Parallax.IntProperty overviewRowBottom = detailsParallax.getOverviewRowBottom();
        detailsParallax.addEffect(overviewRowTop.atAbsolute(context.getResources().getDimensionPixelSize(R.dimen.lb_details_v2_align_pos_for_actions)), overviewRowTop.atAbsolute(context.getResources().getDimensionPixelSize(R.dimen.lb_details_v2_align_pos_for_description))).target(parallaxTarget);
        detailsParallax.addEffect(overviewRowBottom.atMax(), overviewRowBottom.atMin()).target((ParallaxEffect) getChildAt(1), (Property<ParallaxEffect, V>) CompositeDrawable.ChildDrawable.TOP_ABSOLUTE);
        detailsParallax.addEffect(overviewRowTop.atMax(), overviewRowTop.atMin()).target((ParallaxEffect) getChildAt(0), (Property<ParallaxEffect, V>) CompositeDrawable.ChildDrawable.BOTTOM_ABSOLUTE);
    }

    public Drawable getBottomDrawable() {
        return this.mBottomDrawable;
    }

    public Drawable getCoverDrawable() {
        return getChildAt(0).getDrawable();
    }

    @ColorInt
    public int getSolidColor() {
        return ((ColorDrawable) this.mBottomDrawable).getColor();
    }

    void init(Context context, DetailsParallax detailsParallax, Drawable drawable, Drawable drawable2, ParallaxTarget parallaxTarget) {
        if (drawable2 instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) drawable2;
            if (colorDrawable.getColor() == 0) {
                colorDrawable.setColor(getDefaultBackgroundColor(context));
            }
        }
        addChildDrawable(drawable);
        this.mBottomDrawable = drawable2;
        addChildDrawable(drawable2);
        connect(context, detailsParallax, parallaxTarget);
    }

    public void setSolidColor(@ColorInt int i8) {
        ((ColorDrawable) this.mBottomDrawable).setColor(i8);
    }

    public DetailsParallaxDrawable(Context context, DetailsParallax detailsParallax, Drawable drawable, Drawable drawable2, ParallaxTarget parallaxTarget) {
        init(context, detailsParallax, drawable, drawable2, parallaxTarget);
    }

    public DetailsParallaxDrawable(Context context, DetailsParallax detailsParallax) {
        int i8 = -context.getResources().getDimensionPixelSize(R.dimen.lb_details_cover_drawable_parallax_movement);
        FitWidthBitmapDrawable fitWidthBitmapDrawable = new FitWidthBitmapDrawable();
        init(context, detailsParallax, fitWidthBitmapDrawable, new ColorDrawable(), new ParallaxTarget.PropertyValuesHolderTarget(fitWidthBitmapDrawable, PropertyValuesHolder.ofInt("verticalOffset", 0, i8)));
    }
}
