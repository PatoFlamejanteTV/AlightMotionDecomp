package f4;

import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: f4.r, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2866r {

    /* renamed from: a, reason: collision with root package name */
    private final FragmentActivity f31917a;

    public C2866r(FragmentActivity activity) {
        AbstractC3292y.i(activity, "activity");
        this.f31917a = activity;
    }

    public final void a() {
        IBinder iBinder;
        InputMethodManager inputMethodManager = (InputMethodManager) ContextCompat.getSystemService(this.f31917a, InputMethodManager.class);
        if (inputMethodManager != null && inputMethodManager.isAcceptingText()) {
            View currentFocus = this.f31917a.getCurrentFocus();
            if (currentFocus != null) {
                iBinder = currentFocus.getWindowToken();
            } else {
                iBinder = null;
            }
            inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
        }
    }
}
