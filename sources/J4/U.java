package j4;

import C6.AbstractC1034y;
import Q5.InterfaceC1416k;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@y6.g
/* loaded from: classes4.dex */
public final class U {
    public static final b Companion;

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC1416k f34046a;

    /* renamed from: b, reason: collision with root package name */
    public static final U f34047b = new U("Country", 0);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ U[] f34048c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ W5.a f34049d;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f34050a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y6.b invoke() {
            return AbstractC1034y.a("com.stripe.android.ui.core.elements.DisplayField", U.values(), new String[]{"country"}, new Annotation[][]{null}, null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        private final /* synthetic */ y6.b a() {
            return (y6.b) U.f34046a.getValue();
        }

        public final y6.b serializer() {
            return a();
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    static {
        U[] a9 = a();
        f34048c = a9;
        f34049d = W5.b.a(a9);
        Companion = new b(null);
        f34046a = Q5.l.a(Q5.o.f8804b, a.f34050a);
    }

    private U(String str, int i8) {
    }

    private static final /* synthetic */ U[] a() {
        return new U[]{f34047b};
    }

    public static U valueOf(String str) {
        return (U) Enum.valueOf(U.class, str);
    }

    public static U[] values() {
        return (U[]) f34048c.clone();
    }
}
