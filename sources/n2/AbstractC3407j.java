package n2;

import j3.C3153d;
import java.util.Calendar;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* renamed from: n2.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3407j {

    /* renamed from: a, reason: collision with root package name */
    private static final Function0 f35347a;

    /* renamed from: b, reason: collision with root package name */
    private static final h3.r f35348b;

    /* renamed from: n2.j$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f35349a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return Long.valueOf(Calendar.getInstance().getTimeInMillis());
        }
    }

    static {
        a aVar = a.f35349a;
        f35347a = aVar;
        f35348b = new h3.r(aVar);
    }

    public static final /* synthetic */ C3153d a(B2.H h8) {
        return c(h8);
    }

    public static final /* synthetic */ Function0 b() {
        return f35347a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3153d c(B2.H h8) {
        if (!h8.f()) {
            h8 = null;
        }
        if (h8 == null) {
            return null;
        }
        return f35348b.a(B2.A.a(h8));
    }
}
