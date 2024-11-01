package Q2;

import Q5.InterfaceC1416k;
import Q5.l;
import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final a f8409b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f8410c = 8;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1416k f8411a;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f8412a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context) {
            super(0);
            this.f8412a = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final SharedPreferences invoke() {
            return this.f8412a.getSharedPreferences("PaymentSheet_LinkStore", 0);
        }
    }

    public d(Context context) {
        AbstractC3292y.i(context, "context");
        this.f8411a = l.b(new b(context));
    }

    private final SharedPreferences a() {
        Object value = this.f8411a.getValue();
        AbstractC3292y.h(value, "getValue(...)");
        return (SharedPreferences) value;
    }

    public final boolean b() {
        return a().getBoolean("has_used_link", false);
    }

    public final void c() {
        SharedPreferences.Editor edit = a().edit();
        edit.putBoolean("has_used_link", true);
        edit.apply();
    }
}
