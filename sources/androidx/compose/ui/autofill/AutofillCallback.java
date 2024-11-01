package androidx.compose.ui.autofill;

import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import g.u;

@StabilityInferred(parameters = 1)
@RequiresApi(26)
/* loaded from: classes.dex */
public final class AutofillCallback extends AutofillManager.AutofillCallback {
    public static final int $stable = 0;
    public static final AutofillCallback INSTANCE = new AutofillCallback();

    private AutofillCallback() {
    }

    @Override // android.view.autofill.AutofillManager.AutofillCallback
    public void onAutofillEvent(View view, int i8, int i9) {
        String str;
        super.onAutofillEvent(view, i8, i9);
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    str = "Unknown status event.";
                } else {
                    str = "Autofill popup isn't shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account";
                }
            } else {
                str = "Autofill popup was hidden.";
            }
        } else {
            str = "Autofill popup was shown.";
        }
        Log.d("Autofill Status", str);
    }

    @DoNotInline
    @ExperimentalComposeUiApi
    public final void register(AndroidAutofill androidAutofill) {
        androidAutofill.getAutofillManager().registerCallback(u.a(this));
    }

    @DoNotInline
    @ExperimentalComposeUiApi
    public final void unregister(AndroidAutofill androidAutofill) {
        androidAutofill.getAutofillManager().unregisterCallback(u.a(this));
    }
}
