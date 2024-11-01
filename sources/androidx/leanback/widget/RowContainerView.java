package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.ColorInt;
import androidx.leanback.R;

/* loaded from: classes3.dex */
final class RowContainerView extends LinearLayout {
    private Drawable mForeground;
    private boolean mForegroundBoundsChanged;
    private ViewGroup mHeaderDock;

    public RowContainerView(Context context) {
        this(context, null, 0);
    }

    public void addHeaderView(View view) {
        if (this.mHeaderDock.indexOfChild(view) < 0) {
            this.mHeaderDock.addView(view, 0);
        }
    }

    public void addRowView(View view) {
        addView(view);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.mForeground;
        if (drawable != null) {
            if (this.mForegroundBoundsChanged) {
                this.mForegroundBoundsChanged = false;
                drawable.setBounds(0, 0, getWidth(), getHeight());
            }
            this.mForeground.draw(canvas);
        }
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.mForeground;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i8, int i9, int i10, int i11) {
        super.onSizeChanged(i8, i9, i10, i11);
        this.mForegroundBoundsChanged = true;
    }

    public void removeHeaderView(View view) {
        if (this.mHeaderDock.indexOfChild(view) >= 0) {
            this.mHeaderDock.removeView(view);
        }
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        boolean z8;
        this.mForeground = drawable;
        if (drawable == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        setWillNotDraw(z8);
        invalidate();
    }

    public void setForegroundColor(@ColorInt int i8) {
        Drawable drawable = this.mForeground;
        if (drawable instanceof ColorDrawable) {
            ((ColorDrawable) drawable.mutate()).setColor(i8);
            invalidate();
        } else {
            setForeground(new ColorDrawable(i8));
        }
    }

    public void showHeader(boolean z8) {
        int i8;
        ViewGroup viewGroup = this.mHeaderDock;
        if (z8) {
            i8 = 0;
        } else {
            i8 = 8;
        }
        viewGroup.setVisibility(i8);
    }

    public RowContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RowContainerView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.mForegroundBoundsChanged = true;
        setOrientation(1);
        LayoutInflater.from(context).inflate(R.layout.lb_row_container, this);
        this.mHeaderDock = (ViewGroup) findViewById(R.id.lb_row_container_header_dock);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
    }
}
