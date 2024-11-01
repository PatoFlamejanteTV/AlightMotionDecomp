package androidx.browser.customtabs;

import android.os.Bundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(33)
/* loaded from: classes.dex */
class Api33Impl {
    private Api33Impl() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @DoNotInline
    public static <T> T getParcelable(@NonNull Bundle bundle, @Nullable String str, @NonNull Class<T> cls) {
        return (T) bundle.getParcelable(str, cls);
    }
}
