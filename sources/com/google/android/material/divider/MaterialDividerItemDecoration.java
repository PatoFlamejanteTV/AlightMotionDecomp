package com.google.android.material.divider;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;

/* loaded from: classes3.dex */
public class MaterialDividerItemDecoration extends RecyclerView.ItemDecoration {
    private static final int DEF_STYLE_RES = R.style.Widget_MaterialComponents_MaterialDivider;
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;

    @ColorInt
    private int color;

    @NonNull
    private Drawable dividerDrawable;
    private int insetEnd;
    private int insetStart;
    private boolean lastItemDecorated;
    private int orientation;
    private final Rect tempRect;
    private int thickness;

    public MaterialDividerItemDecoration(@NonNull Context context, int i8) {
        this(context, null, i8);
    }

    private void drawForHorizontalOrientation(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        int height;
        int i8;
        int i9;
        int i10;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i8 = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i8, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            i8 = 0;
        }
        int i11 = i8 + this.insetStart;
        int i12 = height - this.insetEnd;
        boolean isLayoutRtl = ViewUtils.isLayoutRtl(recyclerView);
        int childCount = recyclerView.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = recyclerView.getChildAt(i13);
            if (shouldDrawDivider(recyclerView, childAt)) {
                recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.tempRect);
                int round = Math.round(childAt.getTranslationX());
                if (isLayoutRtl) {
                    i10 = this.tempRect.left + round;
                    i9 = this.thickness + i10;
                } else {
                    i9 = round + this.tempRect.right;
                    i10 = i9 - this.thickness;
                }
                this.dividerDrawable.setBounds(i10, i11, i9, i12);
                this.dividerDrawable.setAlpha(Math.round(childAt.getAlpha() * 255.0f));
                this.dividerDrawable.draw(canvas);
            }
        }
        canvas.restore();
    }

    private void drawForVerticalOrientation(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        int width;
        int i8;
        int i9;
        int i10;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i8 = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i8, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            i8 = 0;
        }
        boolean isLayoutRtl = ViewUtils.isLayoutRtl(recyclerView);
        if (isLayoutRtl) {
            i9 = this.insetEnd;
        } else {
            i9 = this.insetStart;
        }
        int i11 = i8 + i9;
        if (isLayoutRtl) {
            i10 = this.insetStart;
        } else {
            i10 = this.insetEnd;
        }
        int i12 = width - i10;
        int childCount = recyclerView.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = recyclerView.getChildAt(i13);
            if (shouldDrawDivider(recyclerView, childAt)) {
                recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.tempRect);
                int round = this.tempRect.bottom + Math.round(childAt.getTranslationY());
                this.dividerDrawable.setBounds(i11, round - this.thickness, i12, round);
                this.dividerDrawable.setAlpha(Math.round(childAt.getAlpha() * 255.0f));
                this.dividerDrawable.draw(canvas);
            }
        }
        canvas.restore();
    }

    @ColorInt
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

    @Px
    public int getDividerThickness() {
        return this.thickness;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        rect.set(0, 0, 0, 0);
        if (shouldDrawDivider(recyclerView, view)) {
            if (this.orientation == 1) {
                rect.bottom = this.thickness;
            } else if (ViewUtils.isLayoutRtl(recyclerView)) {
                rect.left = this.thickness;
            } else {
                rect.right = this.thickness;
            }
        }
    }

    public int getOrientation() {
        return this.orientation;
    }

    public boolean isLastItemDecorated() {
        return this.lastItemDecorated;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        if (this.orientation == 1) {
            drawForVerticalOrientation(canvas, recyclerView);
        } else {
            drawForHorizontalOrientation(canvas, recyclerView);
        }
    }

    public void setDividerColor(@ColorInt int i8) {
        this.color = i8;
        Drawable wrap = DrawableCompat.wrap(this.dividerDrawable);
        this.dividerDrawable = wrap;
        DrawableCompat.setTint(wrap, i8);
    }

    public void setDividerColorResource(@NonNull Context context, @ColorRes int i8) {
        setDividerColor(ContextCompat.getColor(context, i8));
    }

    public void setDividerInsetEnd(@Px int i8) {
        this.insetEnd = i8;
    }

    public void setDividerInsetEndResource(@NonNull Context context, @DimenRes int i8) {
        setDividerInsetEnd(context.getResources().getDimensionPixelOffset(i8));
    }

    public void setDividerInsetStart(@Px int i8) {
        this.insetStart = i8;
    }

    public void setDividerInsetStartResource(@NonNull Context context, @DimenRes int i8) {
        setDividerInsetStart(context.getResources().getDimensionPixelOffset(i8));
    }

    public void setDividerThickness(@Px int i8) {
        this.thickness = i8;
    }

    public void setDividerThicknessResource(@NonNull Context context, @DimenRes int i8) {
        setDividerThickness(context.getResources().getDimensionPixelSize(i8));
    }

    public void setLastItemDecorated(boolean z8) {
        this.lastItemDecorated = z8;
    }

    public void setOrientation(int i8) {
        if (i8 != 0 && i8 != 1) {
            throw new IllegalArgumentException("Invalid orientation: " + i8 + ". It should be either HORIZONTAL or VERTICAL");
        }
        this.orientation = i8;
    }

    protected boolean shouldDrawDivider(int i8, @Nullable RecyclerView.Adapter<?> adapter) {
        return true;
    }

    public MaterialDividerItemDecoration(@NonNull Context context, @Nullable AttributeSet attributeSet, int i8) {
        this(context, attributeSet, R.attr.materialDividerStyle, i8);
    }

    private boolean shouldDrawDivider(@NonNull RecyclerView recyclerView, @NonNull View view) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        boolean z8 = adapter != null && childAdapterPosition == adapter.getItemCount() - 1;
        if (childAdapterPosition != -1) {
            return (!z8 || this.lastItemDecorated) && shouldDrawDivider(childAdapterPosition, (RecyclerView.Adapter<?>) adapter);
        }
        return false;
    }

    public MaterialDividerItemDecoration(@NonNull Context context, @Nullable AttributeSet attributeSet, int i8, int i9) {
        this.tempRect = new Rect();
        TypedArray obtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, R.styleable.MaterialDivider, i8, DEF_STYLE_RES, new int[0]);
        this.color = MaterialResources.getColorStateList(context, obtainStyledAttributes, R.styleable.MaterialDivider_dividerColor).getDefaultColor();
        this.thickness = obtainStyledAttributes.getDimensionPixelSize(R.styleable.MaterialDivider_dividerThickness, context.getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.insetStart = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialDivider_dividerInsetStart, 0);
        this.insetEnd = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialDivider_dividerInsetEnd, 0);
        this.lastItemDecorated = obtainStyledAttributes.getBoolean(R.styleable.MaterialDivider_lastItemDecorated, true);
        obtainStyledAttributes.recycle();
        this.dividerDrawable = new ShapeDrawable();
        setDividerColor(this.color);
        setOrientation(i9);
    }
}
