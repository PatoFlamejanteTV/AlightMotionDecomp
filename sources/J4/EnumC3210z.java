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
/* renamed from: j4.z, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC3210z {
    public static final b Companion;

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC1416k f34328a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC3210z f34329b = new EnumC3210z("None", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC3210z f34330c = new EnumC3210z("Characters", 1);

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC3210z f34331d = new EnumC3210z("Words", 2);

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC3210z f34332e = new EnumC3210z("Sentences", 3);

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumC3210z[] f34333f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ W5.a f34334g;

    /* renamed from: j4.z$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f34335a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y6.b invoke() {
            return AbstractC1034y.a("com.stripe.android.ui.core.elements.Capitalization", EnumC3210z.values(), new String[]{"none", "characters", "words", "sentences"}, new Annotation[][]{null, null, null, null}, null);
        }
    }

    /* renamed from: j4.z$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        private final /* synthetic */ y6.b a() {
            return (y6.b) EnumC3210z.f34328a.getValue();
        }

        public final y6.b serializer() {
            return a();
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    static {
        EnumC3210z[] a9 = a();
        f34333f = a9;
        f34334g = W5.b.a(a9);
        Companion = new b(null);
        f34328a = Q5.l.a(Q5.o.f8804b, a.f34335a);
    }

    private EnumC3210z(String str, int i8) {
    }

    private static final /* synthetic */ EnumC3210z[] a() {
        return new EnumC3210z[]{f34329b, f34330c, f34331d, f34332e};
    }

    public static EnumC3210z valueOf(String str) {
        return (EnumC3210z) Enum.valueOf(EnumC3210z.class, str);
    }

    public static EnumC3210z[] values() {
        return (EnumC3210z[]) f34333f.clone();
    }
}
