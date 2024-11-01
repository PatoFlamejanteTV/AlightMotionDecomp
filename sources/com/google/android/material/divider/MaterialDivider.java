package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.shape.MaterialShapeDrawable;

/* loaded from: classes3.dex */
public class MaterialDivider extends View {
    private static final int DEF_STYLE_RES = R.style.Widget_MaterialComponents_MaterialDivider;

    @ColorInt
    private int color;

    @NonNull
    private final MaterialShapeDrawable dividerDrawable;
    private int insetEnd;
    private int insetStart;
    private int thickness;

    public MaterialDivider(@NonNull Context context) {
        this(context, null);
    }

    public int getDividerColor() {
        return this.color;
    }

    @Px
    public int getDividerInsetEnd() {
        return this.insetEnd;
    }

    @Px
    public int getDividerInsetStart() {
        return this.insetStart;
    }

    public int getDividerThickness() {
        return this.thickness;
    }

    @Override // android.view.View
    protected void onDraw(@NonNull Canvas canvas) {
        int i8;
        int width;
        int i9;
        super.onDraw(canvas);
        boolean z8 = true;
        if (ViewCompat.getLayoutDirection(this) != 1) {
            z8 = false;
        }
        if (z8) {
            i8 = this.insetEnd;
        } else {
            i8 = this.insetStart;
        }
        if (z8) {
            width = getWidth();
            i9 = this.insetStart;
        } else {
            width = getWidth();
            i9 = this.insetEnd;
        }
        this.dividerDrawable.setBounds(i8, 0, width - i9, getBottom() - getTop());
        this.dividerDrawable.draw(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        super.onMeasure(i8, i9);
        int mode = View.MeasureSpec.getMode(i9);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i10 = this.thickness;
            if (i10 > 0 && measuredHeight != i10) {
                measuredHeight = i10;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(@ColorInt int i8) {
        if (this.color != i8) {
            this.color = i8;
            this.dividerDrawable.setFillColor(ColorStateList.valueOf(i8));
            invalidate();
        }
    }

    public void setDividerColorResource(@ColorRes int i8) {
        setDividerColor(ContextCompat.getColor(getContext(), i8));
    }

    public void setDividerInsetEnd(@Px int i8) {
        this.insetEnd = i8;
    }

    public void setDividerInsetEndResource(@DimenRes int i8) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i8));
    }

    public void setDividerInsetStart(@Px int i8) {
        this.insetStart = i8;
    }

    public void setDividerInsetStartResource(@DimenRes int i8) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i8));
    }

    public void setDividerThickness(@Px int i8) {
        if (this.thickness != i8) {
            this.thickness = i8;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(@DimenRes int i8) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i8));
    }

    public MaterialDivider(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialDividerStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialDivider(@androidx.annotation.NonNull android.content.Context r8, @androidx.annotation.Nullable android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = com.google.android.material.divider.MaterialDivider.DEF_STYLE_RES
            android.content.Context r8 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            com.google.android.material.shape.MaterialShapeDrawable r0 = new com.google.android.material.shape.MaterialShapeDrawable
            r0.<init>()
            r7.dividerDrawable = r0
            int[] r2 = com.google.android.material.R.styleable.MaterialDivider
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r0, r1, r2, r3, r4, r5)
            int r10 = com.google.android.material.R.styleable.MaterialDivider_dividerThickness
            android.content.res.Resources r0 = r7.getResources()
            int r1 = com.google.android.material.R.dimen.material_divider_thickness
            int r0 = r0.getDimensionPixelSize(r1)
            int r10 = r9.getDimensionPixelSize(r10, r0)
            r7.thickness = r10
            int r10 = com.google.android.material.R.styleable.MaterialDivider_dividerInsetStart
            int r10 = r9.getDimensionPixelOffset(r10, r6)
            r7.insetStart = r10
            int r10 = com.google.android.material.R.styleable.MaterialDivider_dividerInsetEnd
            int r10 = r9.getDimensionPixelOffset(r10, r6)
            r7.insetEnd = r10
            int r10 = com.google.android.material.R.styleable.MaterialDivider_dividerColor
            android.content.res.ColorStateList r8 = com.google.android.material.resources.MaterialResources.getColorStateList(r8, r9, r10)
            int r8 = r8.getDefaultColor()
            r7.setDividerColor(r8)
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.divider.MaterialDivider.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
