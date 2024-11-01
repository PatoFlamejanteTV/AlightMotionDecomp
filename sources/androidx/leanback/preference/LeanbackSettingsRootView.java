package androidx.leanback.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class LeanbackSettingsRootView extends FrameLayout {
    private View.OnKeyListener mOnBackKeyListener;

    public LeanbackSettingsRootView(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(@NonNull KeyEvent keyEvent) {
        boolean z8;
        View.OnKeyListener onKeyListener;
        if (keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 4 && (onKeyListener = this.mOnBackKeyListener) != null) {
            z8 = onKeyListener.onKey(this, keyEvent.getKeyCode(), keyEvent);
        } else {
            z8 = false;
        }
        if (!z8 && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    public void setOnBackKeyListener(View.OnKeyListener onKeyListener) {
        this.mOnBackKeyListener = onKeyListener;
    }

    public LeanbackSettingsRootView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LeanbackSettingsRootView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
    }
}
