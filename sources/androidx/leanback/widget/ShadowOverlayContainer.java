package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.leanback.R;

/* loaded from: classes3.dex */
public class ShadowOverlayContainer extends FrameLayout {
    public static final int SHADOW_DYNAMIC = 3;
    public static final int SHADOW_NONE = 1;
    public static final int SHADOW_STATIC = 2;
    private static final Rect sTempRect = new Rect();
    private float mFocusedZ;
    private boolean mInitialized;
    int mOverlayColor;
    private Paint mOverlayPaint;
    private int mRoundedCornerRadius;
    private boolean mRoundedCorners;
    private Object mShadowImpl;
    private int mShadowType;
    private float mUnfocusedZ;
    private View mWrappedView;

    public ShadowOverlayContainer(Context context) {
        this(context, null, 0);
    }

    public static void prepareParentForShadow(ViewGroup viewGroup) {
        StaticShadowHelper.prepareParent(viewGroup);
    }

    public static boolean supportsDynamicShadow() {
        return ShadowHelper.supportsDynamicShadow();
    }

    public static boolean supportsShadow() {
        return StaticShadowHelper.supportsShadow();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.mOverlayPaint != null && this.mOverlayColor != 0) {
            canvas.drawRect(this.mWrappedView.getLeft(), this.mWrappedView.getTop(), this.mWrappedView.getRight(), this.mWrappedView.getBottom(), this.mOverlayPaint);
        }
    }

    public int getShadowType() {
        return this.mShadowType;
    }

    public View getWrappedView() {
        return this.mWrappedView;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Deprecated
    public void initialize(boolean z8, boolean z9) {
        initialize(z8, z9, true);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        View view;
        super.onLayout(z8, i8, i9, i10, i11);
        if (z8 && (view = this.mWrappedView) != null) {
            Rect rect = sTempRect;
            rect.left = (int) view.getPivotX();
            rect.top = (int) this.mWrappedView.getPivotY();
            offsetDescendantRectToMyCoords(this.mWrappedView, rect);
            setPivotX(rect.left);
            setPivotY(rect.top);
        }
    }

    public void setOverlayColor(@ColorInt int i8) {
        Paint paint = this.mOverlayPaint;
        if (paint != null && i8 != this.mOverlayColor) {
            this.mOverlayColor = i8;
            paint.setColor(i8);
            invalidate();
        }
    }

    public void setShadowFocusLevel(float f8) {
        Object obj = this.mShadowImpl;
        if (obj != null) {
            ShadowOverlayHelper.setShadowFocusLevel(obj, this.mShadowType, f8);
        }
    }

    public void useDynamicShadow() {
        useDynamicShadow(getResources().getDimension(R.dimen.lb_material_shadow_normal_z), getResources().getDimension(R.dimen.lb_material_shadow_focused_z));
    }

    public void useStaticShadow() {
        if (!this.mInitialized) {
            if (supportsShadow()) {
                this.mShadowType = 2;
                return;
            }
            return;
        }
        throw new IllegalStateException("Already initialized");
    }

    public void wrap(View view) {
        int i8;
        if (this.mInitialized && this.mWrappedView == null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams.width, layoutParams.height);
                int i9 = -2;
                if (layoutParams.width == -1) {
                    i8 = -1;
                } else {
                    i8 = -2;
                }
                layoutParams.width = i8;
                if (layoutParams.height == -1) {
                    i9 = -1;
                }
                layoutParams.height = i9;
                setLayoutParams(layoutParams);
                addView(view, layoutParams2);
            } else {
                addView(view);
            }
            if (this.mRoundedCorners && this.mShadowType != 3) {
                RoundedRectHelper.setClipToRoundedOutline(this, true);
            }
            this.mWrappedView = view;
            return;
        }
        throw new IllegalStateException();
    }

    public ShadowOverlayContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Deprecated
    public void initialize(boolean z8, boolean z9, boolean z10) {
        initialize(!z8 ? 1 : this.mShadowType, z9, z10 ? getContext().getResources().getDimensionPixelSize(R.dimen.lb_rounded_rect_corner_radius) : 0);
    }

    public ShadowOverlayContainer(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.mShadowType = 1;
        useStaticShadow();
        useDynamicShadow();
    }

    public void useDynamicShadow(float f8, float f9) {
        if (!this.mInitialized) {
            if (supportsDynamicShadow()) {
                this.mShadowType = 3;
                this.mUnfocusedZ = f8;
                this.mFocusedZ = f9;
                return;
            }
            return;
        }
        throw new IllegalStateException("Already initialized");
    }

    void initialize(int i8, boolean z8, int i9) {
        if (!this.mInitialized) {
            this.mInitialized = true;
            this.mRoundedCornerRadius = i9;
            this.mRoundedCorners = i9 > 0;
            this.mShadowType = i8;
            if (i8 == 2) {
                this.mShadowImpl = StaticShadowHelper.addStaticShadow(this);
            } else if (i8 == 3) {
                this.mShadowImpl = ShadowHelper.addDynamicShadow(this, this.mUnfocusedZ, this.mFocusedZ, i9);
            }
            if (z8) {
                setWillNotDraw(false);
                this.mOverlayColor = 0;
                Paint paint = new Paint();
                this.mOverlayPaint = paint;
                paint.setColor(this.mOverlayColor);
                this.mOverlayPaint.setStyle(Paint.Style.FILL);
                return;
            }
            setWillNotDraw(true);
            this.mOverlayPaint = null;
            return;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ShadowOverlayContainer(Context context, int i8, boolean z8, float f8, float f9, int i9) {
        super(context);
        this.mShadowType = 1;
        this.mUnfocusedZ = f8;
        this.mFocusedZ = f9;
        initialize(i8, z8, i9);
    }
}
