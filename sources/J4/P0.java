package j4;

import C6.AbstractC1034y;
import Q5.InterfaceC1416k;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3293z;
import n2.AbstractC3394E;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@y6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes4.dex */
public final class P0 {
    public static final b Companion;

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC1416k f33922b;

    /* renamed from: c, reason: collision with root package name */
    public static final P0 f33923c = new P0("IdealBank", 0, g4.n.f32432v);

    /* renamed from: d, reason: collision with root package name */
    public static final P0 f33924d = new P0("P24Bank", 1, g4.n.f32368E);

    /* renamed from: e, reason: collision with root package name */
    public static final P0 f33925e = new P0("EpsBank", 2, g4.n.f32420p);

    /* renamed from: f, reason: collision with root package name */
    public static final P0 f33926f = new P0("FpxBank", 3, g4.n.f32422q);

    /* renamed from: g, reason: collision with root package name */
    public static final P0 f33927g = new P0("AddressName", 4, v2.e.f40442e);

    /* renamed from: h, reason: collision with root package name */
    public static final P0 f33928h = new P0("AuBecsAccountName", 5, AbstractC3394E.f35200K);

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ P0[] f33929i;

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ W5.a f33930j;

    /* renamed from: a, reason: collision with root package name */
    private final int f33931a;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f33932a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y6.b invoke() {
            return AbstractC1034y.a("com.stripe.android.ui.core.elements.TranslationId", P0.values(), new String[]{"upe.labels.ideal.bank", "upe.labels.p24.bank", "upe.labels.eps.bank", "upe.labels.fpx.bank", "address.label.name", "upe.labels.name.onAccount"}, new Annotation[][]{null, null, null, null, null, null}, null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        private final /* synthetic */ y6.b a() {
            return (y6.b) P0.f33922b.getValue();
        }

        public final y6.b serializer() {
            return a();
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    static {
        P0[] a9 = a();
        f33929i = a9;
        f33930j = W5.b.a(a9);
        Companion = new b(null);
        f33922b = Q5.l.a(Q5.o.f8804b, a.f33932a);
    }

    private P0(String str, int i8, int i9) {
        this.f33931a = i9;
    }

    private static final /* synthetic */ P0[] a() {
        return new P0[]{f33923c, f33924d, f33925e, f33926f, f33927g, f33928h};
    }

    public static P0 valueOf(String str) {
        return (P0) Enum.valueOf(P0.class, str);
    }

    public static P0[] values() {
        return (P0[]) f33929i.clone();
    }

    public final int c() {
        return this.f33931a;
    }
}
