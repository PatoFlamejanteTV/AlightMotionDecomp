package d3;

import R5.AbstractC1435t;
import R5.a0;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.n;
import com.stripe.android.model.o;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: d3.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class EnumC2749a {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC2749a f31298a = new EnumC2749a("Unsupported", 0) { // from class: d3.a.e
        {
            AbstractC3284p abstractC3284p = null;
        }

        @Override // d3.EnumC2749a
        public boolean b(C2752d metadata) {
            AbstractC3292y.i(metadata, "metadata");
            return false;
        }
    };

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC2749a f31299b = new EnumC2749a("UnsupportedForSetup", 1) { // from class: d3.a.f
        {
            AbstractC3284p abstractC3284p = null;
        }

        @Override // d3.EnumC2749a
        public boolean b(C2752d metadata) {
            AbstractC3292y.i(metadata, "metadata");
            return !metadata.Y();
        }
    };

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC2749a f31300c = new EnumC2749a("ShippingAddress", 2) { // from class: d3.a.d
        {
            AbstractC3284p abstractC3284p = null;
        }

        @Override // d3.EnumC2749a
        public boolean b(C2752d metadata) {
            n nVar;
            n.h hVar;
            AbstractC3292y.i(metadata, "metadata");
            if (metadata.u()) {
                return true;
            }
            StripeIntent W8 = metadata.W();
            String str = null;
            if (W8 instanceof n) {
                nVar = (n) W8;
            } else {
                nVar = null;
            }
            if (nVar != null) {
                hVar = nVar.p();
            } else {
                hVar = null;
            }
            if (hVar != null) {
                str = hVar.b();
            }
            if (str != null && hVar.a().f() != null && hVar.a().b() != null && hVar.a().i() != null) {
                return true;
            }
            return false;
        }
    };

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC2749a f31301d = new EnumC2749a("MerchantSupportsDelayedPaymentMethods", 3) { // from class: d3.a.c
        {
            AbstractC3284p abstractC3284p = null;
        }

        @Override // d3.EnumC2749a
        public boolean b(C2752d metadata) {
            AbstractC3292y.i(metadata, "metadata");
            return metadata.s();
        }
    };

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC2749a f31302e = new EnumC2749a("FinancialConnectionsSdk", 4) { // from class: d3.a.a
        {
            AbstractC3284p abstractC3284p = null;
        }

        @Override // d3.EnumC2749a
        public boolean b(C2752d metadata) {
            AbstractC3292y.i(metadata, "metadata");
            return metadata.y();
        }
    };

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC2749a f31303f = new EnumC2749a("ValidUsBankVerificationMethod", 5) { // from class: d3.a.g
        {
            AbstractC3284p abstractC3284p = null;
        }

        @Override // d3.EnumC2749a
        public boolean b(C2752d metadata) {
            Map map;
            Object obj;
            boolean z8;
            AbstractC3292y.i(metadata, "metadata");
            Object obj2 = metadata.W().N().get(o.p.f25745O.f25773a);
            String str = null;
            if (obj2 instanceof Map) {
                map = (Map) obj2;
            } else {
                map = null;
            }
            if (map != null) {
                obj = map.get("verification_method");
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                str = (String) obj;
            }
            boolean d02 = AbstractC1435t.d0(a0.i("instant", "automatic"), str);
            if (metadata.W().d() == null) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (!d02 && !z8) {
                return false;
            }
            return true;
        }
    };

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC2749a f31304g = new EnumC2749a("InstantDebits", 6) { // from class: d3.a.b
        {
            AbstractC3284p abstractC3284p = null;
        }

        @Override // d3.EnumC2749a
        public boolean b(C2752d metadata) {
            boolean z8;
            AbstractC3292y.i(metadata, "metadata");
            boolean z9 = !metadata.W().e().contains(o.p.f25745O.f25773a);
            boolean contains = metadata.W().J().contains("bank_account");
            if (metadata.W().d() == null) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z9 && contains && !z8) {
                return true;
            }
            return false;
        }
    };

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ EnumC2749a[] f31305h;

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ W5.a f31306i;

    static {
        EnumC2749a[] a9 = a();
        f31305h = a9;
        f31306i = W5.b.a(a9);
    }

    public /* synthetic */ EnumC2749a(String str, int i8, AbstractC3284p abstractC3284p) {
        this(str, i8);
    }

    private static final /* synthetic */ EnumC2749a[] a() {
        return new EnumC2749a[]{f31298a, f31299b, f31300c, f31301d, f31302e, f31303f, f31304g};
    }

    public static EnumC2749a valueOf(String str) {
        return (EnumC2749a) Enum.valueOf(EnumC2749a.class, str);
    }

    public static EnumC2749a[] values() {
        return (EnumC2749a[]) f31305h.clone();
    }

    public abstract boolean b(C2752d c2752d);

    private EnumC2749a(String str, int i8) {
    }
}
