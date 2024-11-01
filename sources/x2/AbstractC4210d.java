package x2;

import androidx.core.os.EnvironmentCompat;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: x2.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4210d {
    public static final String a(Throwable th) {
        AbstractC3292y.i(th, "<this>");
        if (th instanceof k) {
            return ((k) th).a();
        }
        if (th instanceof IOException) {
            return "ioException";
        }
        return EnvironmentCompat.MEDIA_UNKNOWN;
    }
}
