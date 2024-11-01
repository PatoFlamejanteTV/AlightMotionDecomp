package androidx.core.os;

import android.os.PersistableBundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(22)
/* loaded from: classes3.dex */
final class PersistableBundleApi22ImplKt {
    public static final PersistableBundleApi22ImplKt INSTANCE = new PersistableBundleApi22ImplKt();

    private PersistableBundleApi22ImplKt() {
    }

    @DoNotInline
    public static final void putBoolean(PersistableBundle persistableBundle, String str, boolean z8) {
        persistableBundle.putBoolean(str, z8);
    }

    @DoNotInline
    public static final void putBooleanArray(PersistableBundle persistableBundle, String str, boolean[] zArr) {
        persistableBundle.putBooleanArray(str, zArr);
    }
}
