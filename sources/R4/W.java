package r4;

import C6.AbstractC1034y;
import Q5.InterfaceC1416k;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@y6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class W {
    public static final b Companion;

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC1416k f38206a;

    /* renamed from: b, reason: collision with root package name */
    public static final W f38207b = new W("HIDDEN", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final W f38208c = new W("OPTIONAL", 1);

    /* renamed from: d, reason: collision with root package name */
    public static final W f38209d = new W("REQUIRED", 2);

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ W[] f38210e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ W5.a f38211f;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f38212a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y6.b invoke() {
            return AbstractC1034y.a("com.stripe.android.uicore.elements.PhoneNumberState", W.values(), new String[]{"hidden", "optional", "required"}, new Annotation[][]{null, null, null}, null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        private final /* synthetic */ y6.b a() {
            return (y6.b) W.f38206a.getValue();
        }

        public final y6.b serializer() {
            return a();
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    static {
        W[] a9 = a();
        f38210e = a9;
        f38211f = W5.b.a(a9);
        Companion = new b(null);
        f38206a = Q5.l.a(Q5.o.f8804b, a.f38212a);
    }

    private W(String str, int i8) {
    }

    private static final /* synthetic */ W[] a() {
        return new W[]{f38207b, f38208c, f38209d};
    }

    public static W valueOf(String str) {
        return (W) Enum.valueOf(W.class, str);
    }

    public static W[] values() {
        return (W[]) f38210e.clone();
    }
}
