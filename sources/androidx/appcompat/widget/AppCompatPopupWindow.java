package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.R;
import androidx.core.widget.PopupWindowCompat;

/* loaded from: classes.dex */
class AppCompatPopupWindow extends PopupWindow {
    private static final boolean COMPAT_OVERLAP_ANCHOR = false;
    private boolean mOverlapAnchor;

    public AppCompatPopupWindow(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i8) {
        super(context, attributeSet, i8);
        init(context, attributeSet, i8, 0);
    }

    private void init(Context context, AttributeSet attributeSet, int i8, int i9) {
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, R.styleable.PopupWindow, i8, i9);
        int i10 = R.styleable.PopupWindow_overlapAnchor;
        if (obtainStyledAttributes.hasValue(i10)) {
            setSupportOverlapAnchor(obtainStyledAttributes.getBoolean(i10, false));
        }
        setBackgroundDrawable(obtainStyledAttributes.getDrawable(R.styleable.PopupWindow_android_popupBackground));
        obtainStyledAttributes.recycle();
    }

    private void setSupportOverlapAnchor(boolean z8) {
        if (COMPAT_OVERLAP_ANCHOR) {
            this.mOverlapAnchor = z8;
        } else {
            PopupWindowCompat.setOverlapAnchor(this, z8);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i8, int i9) {
        if (COMPAT_OVERLAP_ANCHOR && this.mOverlapAnchor) {
            i9 -= view.getHeight();
        }
        super.showAsDropDown(view, i8, i9);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i8, int i9, int i10, int i11) {
        if (COMPAT_OVERLAP_ANCHOR && this.mOverlapAnchor) {
            i9 -= view.getHeight();
        }
        super.update(view, i8, i9, i10, i11);
    }

    public AppCompatPopupWindow(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i8, @StyleRes int i9) {
        super(context, attributeSet, i8, i9);
        init(context, attributeSet, i8, i9);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i8, int i9, int i10) {
        if (COMPAT_OVERLAP_ANCHOR && this.mOverlapAnchor) {
            i9 -= view.getHeight();
        }
        super.showAsDropDown(view, i8, i9, i10);
    }
}
