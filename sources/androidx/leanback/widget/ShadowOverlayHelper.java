package androidx.leanback.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.R;

/* loaded from: classes3.dex */
public final class ShadowOverlayHelper {
    public static final int SHADOW_DYNAMIC = 3;
    public static final int SHADOW_NONE = 1;
    public static final int SHADOW_STATIC = 2;
    float mFocusedZ;
    boolean mNeedsOverlay;
    boolean mNeedsRoundedCorner;
    boolean mNeedsShadow;
    boolean mNeedsWrapper;
    int mRoundedCornerRadius;
    int mShadowType = 1;
    float mUnfocusedZ;

    /* loaded from: classes3.dex */
    public static final class Builder {
        private boolean keepForegroundDrawable;
        private boolean needsOverlay;
        private boolean needsRoundedCorner;
        private boolean needsShadow;
        private boolean preferZOrder = true;
        private Options options = Options.DEFAULT;

        public ShadowOverlayHelper build(Context context) {
            boolean z8;
            boolean z9;
            ShadowOverlayHelper shadowOverlayHelper = new ShadowOverlayHelper();
            shadowOverlayHelper.mNeedsOverlay = this.needsOverlay;
            boolean z10 = false;
            if (this.needsRoundedCorner && ShadowOverlayHelper.supportsRoundedCorner()) {
                z8 = true;
            } else {
                z8 = false;
            }
            shadowOverlayHelper.mNeedsRoundedCorner = z8;
            if (this.needsShadow && ShadowOverlayHelper.supportsShadow()) {
                z9 = true;
            } else {
                z9 = false;
            }
            shadowOverlayHelper.mNeedsShadow = z9;
            if (shadowOverlayHelper.mNeedsRoundedCorner) {
                shadowOverlayHelper.setupRoundedCornerRadius(this.options, context);
            }
            if (shadowOverlayHelper.mNeedsShadow) {
                if (this.preferZOrder && ShadowOverlayHelper.supportsDynamicShadow()) {
                    shadowOverlayHelper.mShadowType = 3;
                    shadowOverlayHelper.setupDynamicShadowZ(this.options, context);
                    if ((!ShadowOverlayHelper.supportsForeground() || this.keepForegroundDrawable) && shadowOverlayHelper.mNeedsOverlay) {
                        z10 = true;
                    }
                    shadowOverlayHelper.mNeedsWrapper = z10;
                } else {
                    shadowOverlayHelper.mShadowType = 2;
                    shadowOverlayHelper.mNeedsWrapper = true;
                }
            } else {
                shadowOverlayHelper.mShadowType = 1;
                if ((!ShadowOverlayHelper.supportsForeground() || this.keepForegroundDrawable) && shadowOverlayHelper.mNeedsOverlay) {
                    z10 = true;
                }
                shadowOverlayHelper.mNeedsWrapper = z10;
            }
            return shadowOverlayHelper;
        }

        public Builder keepForegroundDrawable(boolean z8) {
            this.keepForegroundDrawable = z8;
            return this;
        }

        public Builder needsOverlay(boolean z8) {
            this.needsOverlay = z8;
            return this;
        }

        public Builder needsRoundedCorner(boolean z8) {
            this.needsRoundedCorner = z8;
            return this;
        }

        public Builder needsShadow(boolean z8) {
            this.needsShadow = z8;
            return this;
        }

        public Builder options(Options options) {
            this.options = options;
            return this;
        }

        public Builder preferZOrder(boolean z8) {
            this.preferZOrder = z8;
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public static final class Options {
        public static final Options DEFAULT = new Options();
        private int roundedCornerRadius = 0;
        private float dynamicShadowUnfocusedZ = -1.0f;
        private float dynamicShadowFocusedZ = -1.0f;

        public Options dynamicShadowZ(float f8, float f9) {
            this.dynamicShadowUnfocusedZ = f8;
            this.dynamicShadowFocusedZ = f9;
            return this;
        }

        public final float getDynamicShadowFocusedZ() {
            return this.dynamicShadowFocusedZ;
        }

        public final float getDynamicShadowUnfocusedZ() {
            return this.dynamicShadowUnfocusedZ;
        }

        public final int getRoundedCornerRadius() {
            return this.roundedCornerRadius;
        }

        public Options roundedCornerRadius(int i8) {
            this.roundedCornerRadius = i8;
            return this;
        }
    }

    ShadowOverlayHelper() {
    }

    static Object getNoneWrapperDynamicShadowImpl(View view) {
        return view.getTag(R.id.lb_shadow_impl);
    }

    public static void setNoneWrapperOverlayColor(View view, int i8) {
        Drawable foreground = ForegroundHelper.getForeground(view);
        if (foreground instanceof ColorDrawable) {
            ((ColorDrawable) foreground).setColor(i8);
        } else {
            ForegroundHelper.setForeground(view, new ColorDrawable(i8));
        }
    }

    public static void setNoneWrapperShadowFocusLevel(View view, float f8) {
        setShadowFocusLevel(getNoneWrapperDynamicShadowImpl(view), 3, f8);
    }

    public static boolean supportsDynamicShadow() {
        return ShadowHelper.supportsDynamicShadow();
    }

    public static boolean supportsForeground() {
        return ForegroundHelper.supportsForeground();
    }

    public static boolean supportsRoundedCorner() {
        return RoundedRectHelper.supportsRoundedCorner();
    }

    public static boolean supportsShadow() {
        return StaticShadowHelper.supportsShadow();
    }

    public ShadowOverlayContainer createShadowOverlayContainer(Context context) {
        if (needsWrapper()) {
            return new ShadowOverlayContainer(context, this.mShadowType, this.mNeedsOverlay, this.mUnfocusedZ, this.mFocusedZ, this.mRoundedCornerRadius);
        }
        throw new IllegalArgumentException();
    }

    public int getShadowType() {
        return this.mShadowType;
    }

    public boolean needsOverlay() {
        return this.mNeedsOverlay;
    }

    public boolean needsRoundedCorner() {
        return this.mNeedsRoundedCorner;
    }

    public boolean needsWrapper() {
        return this.mNeedsWrapper;
    }

    public void onViewCreated(View view) {
        if (!needsWrapper()) {
            if (!this.mNeedsShadow) {
                if (this.mNeedsRoundedCorner) {
                    RoundedRectHelper.setClipToRoundedOutline(view, true, this.mRoundedCornerRadius);
                }
            } else if (this.mShadowType == 3) {
                view.setTag(R.id.lb_shadow_impl, ShadowHelper.addDynamicShadow(view, this.mUnfocusedZ, this.mFocusedZ, this.mRoundedCornerRadius));
            } else if (this.mNeedsRoundedCorner) {
                RoundedRectHelper.setClipToRoundedOutline(view, true, this.mRoundedCornerRadius);
            }
        }
    }

    public void prepareParentForShadow(ViewGroup viewGroup) {
        if (this.mShadowType == 2) {
            StaticShadowHelper.prepareParent(viewGroup);
        }
    }

    public void setOverlayColor(View view, int i8) {
        if (needsWrapper()) {
            ((ShadowOverlayContainer) view).setOverlayColor(i8);
        } else {
            setNoneWrapperOverlayColor(view, i8);
        }
    }

    public void setShadowFocusLevel(View view, float f8) {
        if (needsWrapper()) {
            ((ShadowOverlayContainer) view).setShadowFocusLevel(f8);
        } else {
            setShadowFocusLevel(getNoneWrapperDynamicShadowImpl(view), 3, f8);
        }
    }

    void setupDynamicShadowZ(Options options, Context context) {
        if (options.getDynamicShadowUnfocusedZ() < 0.0f) {
            Resources resources = context.getResources();
            this.mFocusedZ = resources.getDimension(R.dimen.lb_material_shadow_focused_z);
            this.mUnfocusedZ = resources.getDimension(R.dimen.lb_material_shadow_normal_z);
        } else {
            this.mFocusedZ = options.getDynamicShadowFocusedZ();
            this.mUnfocusedZ = options.getDynamicShadowUnfocusedZ();
        }
    }

    void setupRoundedCornerRadius(Options options, Context context) {
        if (options.getRoundedCornerRadius() == 0) {
            this.mRoundedCornerRadius = context.getResources().getDimensionPixelSize(R.dimen.lb_rounded_rect_corner_radius);
        } else {
            this.mRoundedCornerRadius = options.getRoundedCornerRadius();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setShadowFocusLevel(Object obj, int i8, float f8) {
        if (obj != null) {
            if (f8 < 0.0f) {
                f8 = 0.0f;
            } else if (f8 > 1.0f) {
                f8 = 1.0f;
            }
            if (i8 == 2) {
                StaticShadowHelper.setShadowFocusLevel(obj, f8);
            } else {
                if (i8 != 3) {
                    return;
                }
                ShadowHelper.setShadowFocusLevel(obj, f8);
            }
        }
    }
}
