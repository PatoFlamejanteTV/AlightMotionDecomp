package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R;

/* loaded from: classes.dex */
public class Layer extends ConstraintHelper {
    private static final String TAG = "Layer";
    private boolean mApplyElevationOnAttach;
    private boolean mApplyVisibilityOnAttach;
    protected float mComputedCenterX;
    protected float mComputedCenterY;
    protected float mComputedMaxX;
    protected float mComputedMaxY;
    protected float mComputedMinX;
    protected float mComputedMinY;
    ConstraintLayout mContainer;
    private float mGroupRotateAngle;
    boolean mNeedBounds;
    private float mRotationCenterX;
    private float mRotationCenterY;
    private float mScaleX;
    private float mScaleY;
    private float mShiftX;
    private float mShiftY;
    View[] mViews;

    public Layer(Context context) {
        super(context);
        this.mRotationCenterX = Float.NaN;
        this.mRotationCenterY = Float.NaN;
        this.mGroupRotateAngle = Float.NaN;
        this.mScaleX = 1.0f;
        this.mScaleY = 1.0f;
        this.mComputedCenterX = Float.NaN;
        this.mComputedCenterY = Float.NaN;
        this.mComputedMaxX = Float.NaN;
        this.mComputedMaxY = Float.NaN;
        this.mComputedMinX = Float.NaN;
        this.mComputedMinY = Float.NaN;
        this.mNeedBounds = true;
        this.mViews = null;
        this.mShiftX = 0.0f;
        this.mShiftY = 0.0f;
    }

    private void reCacheViews() {
        int i8;
        if (this.mContainer == null || (i8 = this.mCount) == 0) {
            return;
        }
        View[] viewArr = this.mViews;
        if (viewArr == null || viewArr.length != i8) {
            this.mViews = new View[i8];
        }
        for (int i9 = 0; i9 < this.mCount; i9++) {
            this.mViews[i9] = this.mContainer.getViewById(this.mIds[i9]);
        }
    }

    private void transform() {
        double radians;
        if (this.mContainer == null) {
            return;
        }
        if (this.mViews == null) {
            reCacheViews();
        }
        calcCenters();
        if (Float.isNaN(this.mGroupRotateAngle)) {
            radians = 0.0d;
        } else {
            radians = Math.toRadians(this.mGroupRotateAngle);
        }
        float sin = (float) Math.sin(radians);
        float cos = (float) Math.cos(radians);
        float f8 = this.mScaleX;
        float f9 = f8 * cos;
        float f10 = this.mScaleY;
        float f11 = (-f10) * sin;
        float f12 = f8 * sin;
        float f13 = f10 * cos;
        for (int i8 = 0; i8 < this.mCount; i8++) {
            View view = this.mViews[i8];
            int left = (view.getLeft() + view.getRight()) / 2;
            int top = (view.getTop() + view.getBottom()) / 2;
            float f14 = left - this.mComputedCenterX;
            float f15 = top - this.mComputedCenterY;
            float f16 = (((f9 * f14) + (f11 * f15)) - f14) + this.mShiftX;
            float f17 = (((f14 * f12) + (f13 * f15)) - f15) + this.mShiftY;
            view.setTranslationX(f16);
            view.setTranslationY(f17);
            view.setScaleY(this.mScaleY);
            view.setScaleX(this.mScaleX);
            if (!Float.isNaN(this.mGroupRotateAngle)) {
                view.setRotation(this.mGroupRotateAngle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void applyLayoutFeaturesInConstraintSet(ConstraintLayout constraintLayout) {
        applyLayoutFeatures(constraintLayout);
    }

    protected void calcCenters() {
        if (this.mContainer == null) {
            return;
        }
        if (!this.mNeedBounds && !Float.isNaN(this.mComputedCenterX) && !Float.isNaN(this.mComputedCenterY)) {
            return;
        }
        if (!Float.isNaN(this.mRotationCenterX) && !Float.isNaN(this.mRotationCenterY)) {
            this.mComputedCenterY = this.mRotationCenterY;
            this.mComputedCenterX = this.mRotationCenterX;
            return;
        }
        View[] views = getViews(this.mContainer);
        int left = views[0].getLeft();
        int top = views[0].getTop();
        int right = views[0].getRight();
        int bottom = views[0].getBottom();
        for (int i8 = 0; i8 < this.mCount; i8++) {
            View view = views[i8];
            left = Math.min(left, view.getLeft());
            top = Math.min(top, view.getTop());
            right = Math.max(right, view.getRight());
            bottom = Math.max(bottom, view.getBottom());
        }
        this.mComputedMaxX = right;
        this.mComputedMaxY = bottom;
        this.mComputedMinX = left;
        this.mComputedMinY = top;
        if (Float.isNaN(this.mRotationCenterX)) {
            this.mComputedCenterX = (left + right) / 2;
        } else {
            this.mComputedCenterX = this.mRotationCenterX;
        }
        if (Float.isNaN(this.mRotationCenterY)) {
            this.mComputedCenterY = (top + bottom) / 2;
        } else {
            this.mComputedCenterY = this.mRotationCenterY;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void init(AttributeSet attributeSet) {
        super.init(attributeSet);
        this.mUseViewMeasure = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = obtainStyledAttributes.getIndex(i8);
                if (index == R.styleable.ConstraintLayout_Layout_android_visibility) {
                    this.mApplyVisibilityOnAttach = true;
                } else if (index == R.styleable.ConstraintLayout_Layout_android_elevation) {
                    this.mApplyElevationOnAttach = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mContainer = (ConstraintLayout) getParent();
        if (this.mApplyVisibilityOnAttach || this.mApplyElevationOnAttach) {
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i8 = 0; i8 < this.mCount; i8++) {
                View viewById = this.mContainer.getViewById(this.mIds[i8]);
                if (viewById != null) {
                    if (this.mApplyVisibilityOnAttach) {
                        viewById.setVisibility(visibility);
                    }
                    if (this.mApplyElevationOnAttach && elevation > 0.0f) {
                        viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f8) {
        super.setElevation(f8);
        applyLayoutFeatures();
    }

    @Override // android.view.View
    public void setPivotX(float f8) {
        this.mRotationCenterX = f8;
        transform();
    }

    @Override // android.view.View
    public void setPivotY(float f8) {
        this.mRotationCenterY = f8;
        transform();
    }

    @Override // android.view.View
    public void setRotation(float f8) {
        this.mGroupRotateAngle = f8;
        transform();
    }

    @Override // android.view.View
    public void setScaleX(float f8) {
        this.mScaleX = f8;
        transform();
    }

    @Override // android.view.View
    public void setScaleY(float f8) {
        this.mScaleY = f8;
        transform();
    }

    @Override // android.view.View
    public void setTranslationX(float f8) {
        this.mShiftX = f8;
        transform();
    }

    @Override // android.view.View
    public void setTranslationY(float f8) {
        this.mShiftY = f8;
        transform();
    }

    @Override // android.view.View
    public void setVisibility(int i8) {
        super.setVisibility(i8);
        applyLayoutFeatures();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void updatePostLayout(ConstraintLayout constraintLayout) {
        reCacheViews();
        this.mComputedCenterX = Float.NaN;
        this.mComputedCenterY = Float.NaN;
        ConstraintWidget constraintWidget = ((ConstraintLayout.LayoutParams) getLayoutParams()).getConstraintWidget();
        constraintWidget.setWidth(0);
        constraintWidget.setHeight(0);
        calcCenters();
        layout(((int) this.mComputedMinX) - getPaddingLeft(), ((int) this.mComputedMinY) - getPaddingTop(), ((int) this.mComputedMaxX) + getPaddingRight(), ((int) this.mComputedMaxY) + getPaddingBottom());
        transform();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void updatePreDraw(ConstraintLayout constraintLayout) {
        this.mContainer = constraintLayout;
        float rotation = getRotation();
        if (rotation == 0.0f) {
            if (!Float.isNaN(this.mGroupRotateAngle)) {
                this.mGroupRotateAngle = rotation;
                return;
            }
            return;
        }
        this.mGroupRotateAngle = rotation;
    }

    public Layer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mRotationCenterX = Float.NaN;
        this.mRotationCenterY = Float.NaN;
        this.mGroupRotateAngle = Float.NaN;
        this.mScaleX = 1.0f;
        this.mScaleY = 1.0f;
        this.mComputedCenterX = Float.NaN;
        this.mComputedCenterY = Float.NaN;
        this.mComputedMaxX = Float.NaN;
        this.mComputedMaxY = Float.NaN;
        this.mComputedMinX = Float.NaN;
        this.mComputedMinY = Float.NaN;
        this.mNeedBounds = true;
        this.mViews = null;
        this.mShiftX = 0.0f;
        this.mShiftY = 0.0f;
    }

    public Layer(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.mRotationCenterX = Float.NaN;
        this.mRotationCenterY = Float.NaN;
        this.mGroupRotateAngle = Float.NaN;
        this.mScaleX = 1.0f;
        this.mScaleY = 1.0f;
        this.mComputedCenterX = Float.NaN;
        this.mComputedCenterY = Float.NaN;
        this.mComputedMaxX = Float.NaN;
        this.mComputedMaxY = Float.NaN;
        this.mComputedMinX = Float.NaN;
        this.mComputedMinY = Float.NaN;
        this.mNeedBounds = true;
        this.mViews = null;
        this.mShiftX = 0.0f;
        this.mShiftY = 0.0f;
    }
}
