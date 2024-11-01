package j4;

import C6.AbstractC1034y;
import Q5.InterfaceC1416k;
import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@y6.g
/* renamed from: j4.n0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC3195n0 {
    public static final b Companion;

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC1416k f34206a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC3195n0 f34207b = new EnumC3195n0("Text", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC3195n0 f34208c = new EnumC3195n0("Ascii", 1);

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC3195n0 f34209d = new EnumC3195n0("Number", 2);

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC3195n0 f34210e = new EnumC3195n0("Phone", 3);

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC3195n0 f34211f = new EnumC3195n0("Uri", 4);

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC3195n0 f34212g = new EnumC3195n0("Email", 5);

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC3195n0 f34213h = new EnumC3195n0("Password", 6);

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC3195n0 f34214i = new EnumC3195n0("NumberPassword", 7);

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ EnumC3195n0[] f34215j;

    /* renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ W5.a f34216k;

    /* renamed from: j4.n0$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f34217a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y6.b invoke() {
            return AbstractC1034y.a("com.stripe.android.ui.core.elements.KeyboardType", EnumC3195n0.values(), new String[]{MimeTypes.BASE_TYPE_TEXT, "ascii", "number", HintConstants.AUTOFILL_HINT_PHONE, "uri", NotificationCompat.CATEGORY_EMAIL, HintConstants.AUTOFILL_HINT_PASSWORD, "number_password"}, new Annotation[][]{null, null, null, null, null, null, null, null}, null);
        }
    }

    /* renamed from: j4.n0$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        private final /* synthetic */ y6.b a() {
            return (y6.b) EnumC3195n0.f34206a.getValue();
        }

        public final y6.b serializer() {
            return a();
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    static {
        EnumC3195n0[] a9 = a();
        f34215j = a9;
        f34216k = W5.b.a(a9);
        Companion = new b(null);
        f34206a = Q5.l.a(Q5.o.f8804b, a.f34217a);
    }

    private EnumC3195n0(String str, int i8) {
    }

    private static final /* synthetic */ EnumC3195n0[] a() {
        return new EnumC3195n0[]{f34207b, f34208c, f34209d, f34210e, f34211f, f34212g, f34213h, f34214i};
    }

    public static EnumC3195n0 valueOf(String str) {
        return (EnumC3195n0) Enum.valueOf(EnumC3195n0.class, str);
    }

    public static EnumC3195n0[] values() {
        return (EnumC3195n0[]) f34215j.clone();
    }
}
