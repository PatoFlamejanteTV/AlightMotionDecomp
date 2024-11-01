package androidx.leanback.widget;

import android.view.View;

/* loaded from: classes3.dex */
public interface GuidedActionAutofillSupport {

    /* loaded from: classes3.dex */
    public interface OnAutofillListener {
        void onAutofill(View view);
    }

    void setOnAutofillListener(OnAutofillListener onAutofillListener);
}
