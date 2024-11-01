package j3;

import android.content.Context;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: j3.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3152c implements InterfaceC3156g {

    /* renamed from: a, reason: collision with root package name */
    private final C3157h f33674a;

    public C3152c(C3157h fraudDetectionDataRequestParamsFactory) {
        AbstractC3292y.i(fraudDetectionDataRequestParamsFactory, "fraudDetectionDataRequestParamsFactory");
        this.f33674a = fraudDetectionDataRequestParamsFactory;
    }

    @Override // j3.InterfaceC3156g
    public C3155f a(C3153d c3153d) {
        String str;
        Map b9 = this.f33674a.b(c3153d);
        if (c3153d != null) {
            str = c3153d.a();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        return new C3155f(b9, str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3152c(Context context) {
        this(new C3157h(context));
        AbstractC3292y.i(context, "context");
    }
}
