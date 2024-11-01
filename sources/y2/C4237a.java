package y2;

import androidx.core.os.LocaleListCompat;
import java.util.Locale;

/* renamed from: y2.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4237a {
    public final Locale a() {
        LocaleListCompat adjustedDefault = LocaleListCompat.getAdjustedDefault();
        if (adjustedDefault.isEmpty()) {
            adjustedDefault = null;
        }
        if (adjustedDefault == null) {
            return null;
        }
        return adjustedDefault.get(0);
    }

    public final v2.d b(boolean z8) {
        return v2.d.f40434a.a(z8);
    }
}
