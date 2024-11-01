package g3;

import android.os.Parcelable;
import g3.C2901K;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public abstract class L implements InterfaceC2900J, Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final C2901K.c f32047a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f32048b;

    public L(C2901K.c tokenType, Set attribution) {
        AbstractC3292y.i(tokenType, "tokenType");
        AbstractC3292y.i(attribution, "attribution");
        this.f32047a = tokenType;
        this.f32048b = attribution;
    }

    public final Set a() {
        return this.f32048b;
    }
}
