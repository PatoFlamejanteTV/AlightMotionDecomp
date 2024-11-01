package androidx.leanback.widget;

import android.view.KeyEvent;
import android.widget.EditText;

/* loaded from: classes3.dex */
public interface ImeKeyMonitor {

    /* loaded from: classes3.dex */
    public interface ImeKeyListener {
        boolean onKeyPreIme(EditText editText, int i8, KeyEvent keyEvent);
    }

    void setImeKeyListener(ImeKeyListener imeKeyListener);
}
