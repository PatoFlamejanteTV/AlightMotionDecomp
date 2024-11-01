package androidx.leanback.widget;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillValue;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.widget.TextViewCompat;
import androidx.leanback.widget.GuidedActionAutofillSupport;
import androidx.leanback.widget.ImeKeyMonitor;

/* loaded from: classes3.dex */
public class GuidedActionEditText extends EditText implements ImeKeyMonitor, GuidedActionAutofillSupport {
    private GuidedActionAutofillSupport.OnAutofillListener mAutofillListener;
    private ImeKeyMonitor.ImeKeyListener mKeyListener;
    private final Drawable mNoPaddingDrawable;
    private final Drawable mSavedBackground;

    /* loaded from: classes3.dex */
    static final class NoPaddingDrawable extends Drawable {
        NoPaddingDrawable() {
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -2;
        }

        @Override // android.graphics.drawable.Drawable
        public boolean getPadding(Rect rect) {
            rect.set(0, 0, 0, 0);
            return true;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i8) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public GuidedActionEditText(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    public void autofill(AutofillValue autofillValue) {
        super.autofill(autofillValue);
        GuidedActionAutofillSupport.OnAutofillListener onAutofillListener = this.mAutofillListener;
        if (onAutofillListener != null) {
            onAutofillListener.onAutofill(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public int getAutofillType() {
        return 1;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z8, int i8, Rect rect) {
        super.onFocusChanged(z8, i8, rect);
        if (z8) {
            setBackground(this.mSavedBackground);
        } else {
            setBackground(this.mNoPaddingDrawable);
        }
        if (!z8) {
            setFocusable(false);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        Class cls;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (isFocused()) {
            cls = EditText.class;
        } else {
            cls = TextView.class;
        }
        accessibilityNodeInfo.setClassName(cls.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int i8, KeyEvent keyEvent) {
        boolean z8;
        ImeKeyMonitor.ImeKeyListener imeKeyListener = this.mKeyListener;
        if (imeKeyListener != null) {
            z8 = imeKeyListener.onKeyPreIme(this, i8, keyEvent);
        } else {
            z8 = false;
        }
        if (!z8) {
            return super.onKeyPreIme(i8, keyEvent);
        }
        return z8;
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.wrapCustomSelectionActionModeCallback(this, callback));
    }

    @Override // androidx.leanback.widget.ImeKeyMonitor
    public void setImeKeyListener(ImeKeyMonitor.ImeKeyListener imeKeyListener) {
        this.mKeyListener = imeKeyListener;
    }

    @Override // androidx.leanback.widget.GuidedActionAutofillSupport
    public void setOnAutofillListener(GuidedActionAutofillSupport.OnAutofillListener onAutofillListener) {
        this.mAutofillListener = onAutofillListener;
    }

    public GuidedActionEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    public GuidedActionEditText(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.mSavedBackground = getBackground();
        NoPaddingDrawable noPaddingDrawable = new NoPaddingDrawable();
        this.mNoPaddingDrawable = noPaddingDrawable;
        setBackground(noPaddingDrawable);
    }
}
