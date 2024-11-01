package p4;

import C6.AbstractC1034y;
import Q5.InterfaceC1416k;
import Q5.l;
import Q5.o;
import androidx.annotation.RestrictTo;
import androidx.autofill.HintConstants;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3293z;
import o4.AbstractC3533g;
import r4.G;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@y6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: p4.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class EnumC3581f {
    public static final b Companion;

    /* renamed from: d, reason: collision with root package name */
    private static final InterfaceC1416k f36276d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC3581f f36277e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC3581f f36278f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC3581f f36279g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC3581f f36280h;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC3581f f36281i;

    /* renamed from: j, reason: collision with root package name */
    public static final EnumC3581f f36282j;

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC3581f f36283k;

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC3581f f36284l;

    /* renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ EnumC3581f[] f36285m;

    /* renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ W5.a f36286n;

    /* renamed from: a, reason: collision with root package name */
    private final String f36287a;

    /* renamed from: b, reason: collision with root package name */
    private final G f36288b;

    /* renamed from: c, reason: collision with root package name */
    private final int f36289c;

    /* renamed from: p4.f$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f36290a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y6.b invoke() {
            return AbstractC1034y.a("com.stripe.android.uicore.address.FieldType", EnumC3581f.values(), new String[]{"addressLine1", "addressLine2", "locality", "dependentLocality", HintConstants.AUTOFILL_HINT_POSTAL_CODE, "sortingCode", "administrativeArea", "name"}, new Annotation[][]{null, null, null, null, null, null, null, null}, null);
        }
    }

    /* renamed from: p4.f$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        private final /* synthetic */ y6.b a() {
            return (y6.b) EnumC3581f.f36276d.getValue();
        }

        public final y6.b serializer() {
            return a();
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    static {
        G.b bVar = G.Companion;
        f36277e = new EnumC3581f("AddressLine1", 0, "addressLine1", bVar.p(), v2.e.f40438a);
        f36278f = new EnumC3581f("AddressLine2", 1, "addressLine2", bVar.q(), AbstractC3533g.f35958b);
        G k8 = bVar.k();
        int i8 = v2.e.f40439b;
        f36279g = new EnumC3581f("Locality", 2, "locality", k8, i8);
        f36280h = new EnumC3581f("DependentLocality", 3, "dependentLocality", bVar.m(), i8);
        f36281i = new EnumC3581f("PostalCode", 4) { // from class: p4.f.c
            {
                G u8 = G.Companion.u();
                int i9 = v2.e.f40444g;
                AbstractC3284p abstractC3284p = null;
                String str = HintConstants.AUTOFILL_HINT_POSTAL_CODE;
            }

            @Override // p4.EnumC3581f
            public int c() {
                return KeyboardCapitalization.Companion.m4873getNoneIUNYP9k();
            }
        };
        f36282j = new EnumC3581f("SortingCode", 5) { // from class: p4.f.d
            {
                G y8 = G.Companion.y();
                int i9 = v2.e.f40444g;
                AbstractC3284p abstractC3284p = null;
                String str = "sortingCode";
            }

            @Override // p4.EnumC3581f
            public int c() {
                return KeyboardCapitalization.Companion.m4873getNoneIUNYP9k();
            }
        };
        f36283k = new EnumC3581f("AdministrativeArea", 6, "administrativeArea", bVar.z(), EnumC3582g.f36314v.c());
        f36284l = new EnumC3581f("Name", 7, "name", bVar.r(), v2.e.f40442e);
        EnumC3581f[] a9 = a();
        f36285m = a9;
        f36286n = W5.b.a(a9);
        Companion = new b(null);
        f36276d = l.a(o.f8804b, a.f36290a);
    }

    public /* synthetic */ EnumC3581f(String str, int i8, String str2, G g8, int i9, AbstractC3284p abstractC3284p) {
        this(str, i8, str2, g8, i9);
    }

    private static final /* synthetic */ EnumC3581f[] a() {
        return new EnumC3581f[]{f36277e, f36278f, f36279g, f36280h, f36281i, f36282j, f36283k, f36284l};
    }

    public static EnumC3581f valueOf(String str) {
        return (EnumC3581f) Enum.valueOf(EnumC3581f.class, str);
    }

    public static EnumC3581f[] values() {
        return (EnumC3581f[]) f36285m.clone();
    }

    public int c() {
        return KeyboardCapitalization.Companion.m4875getWordsIUNYP9k();
    }

    public final int d() {
        return this.f36289c;
    }

    public final G e() {
        return this.f36288b;
    }

    private EnumC3581f(String str, int i8, String str2, G g8, int i9) {
        this.f36287a = str2;
        this.f36288b = g8;
        this.f36289c = i9;
    }
}
