package x2;

import androidx.core.os.EnvironmentCompat;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: x2.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4211e extends k {

    /* renamed from: f, reason: collision with root package name */
    private final String f40945f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4211e(Throwable cause, String str) {
        super(null, null, 0, cause, cause.getMessage(), 7, null);
        AbstractC3292y.i(cause, "cause");
        this.f40945f = str;
    }

    @Override // x2.k
    public String a() {
        String str = this.f40945f;
        if (str == null) {
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
        return str;
    }
}
