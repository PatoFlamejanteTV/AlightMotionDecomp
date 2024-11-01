package androidx.compose.ui.platform.coreshims;

import android.view.autofill.AutofillId;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class AutofillIdCompat {
    private final Object mWrappedObj;

    @RequiresApi(26)
    private AutofillIdCompat(@NonNull AutofillId autofillId) {
        this.mWrappedObj = autofillId;
    }

    @NonNull
    @RequiresApi(26)
    public static AutofillIdCompat toAutofillIdCompat(@NonNull AutofillId autofillId) {
        return new AutofillIdCompat(autofillId);
    }

    @NonNull
    @RequiresApi(26)
    public AutofillId toAutofillId() {
        return a.a(this.mWrappedObj);
    }
}
