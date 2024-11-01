package c3;

import com.stripe.android.paymentsheet.w;
import j4.P0;
import j4.Y;
import j4.w0;
import j4.y0;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import r4.D;
import r4.G;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: c3.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class EnumC2021a {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC2021a f15447a = new EnumC2021a("Name", 0) { // from class: c3.a.b
        {
            AbstractC3284p abstractC3284p = null;
        }

        @Override // c3.EnumC2021a
        public w.d.b b(w.d configuration) {
            AbstractC3292y.i(configuration, "configuration");
            return configuration.s();
        }

        @Override // c3.EnumC2021a
        public D c(Map initialValues) {
            AbstractC3292y.i(initialValues, "initialValues");
            return new w0((G) null, (P0) (0 == true ? 1 : 0), 3, (AbstractC3284p) (0 == true ? 1 : 0)).l(initialValues);
        }
    };

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC2021a f15448b = new EnumC2021a("Phone", 1) { // from class: c3.a.c
        {
            AbstractC3284p abstractC3284p = null;
        }

        @Override // c3.EnumC2021a
        public w.d.b b(w.d configuration) {
            AbstractC3292y.i(configuration, "configuration");
            return configuration.u();
        }

        @Override // c3.EnumC2021a
        public D c(Map initialValues) {
            AbstractC3292y.i(initialValues, "initialValues");
            return new y0((G) null, 1, (AbstractC3284p) (0 == true ? 1 : 0)).i(initialValues);
        }
    };

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC2021a f15449c = new EnumC2021a("Email", 2) { // from class: c3.a.a
        {
            AbstractC3284p abstractC3284p = null;
        }

        @Override // c3.EnumC2021a
        public w.d.b b(w.d configuration) {
            AbstractC3292y.i(configuration, "configuration");
            return configuration.p();
        }

        @Override // c3.EnumC2021a
        public D c(Map initialValues) {
            AbstractC3292y.i(initialValues, "initialValues");
            return new Y((G) null, 1, (AbstractC3284p) (0 == true ? 1 : 0)).i(initialValues);
        }
    };

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC2021a[] f15450d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ W5.a f15451e;

    static {
        EnumC2021a[] a9 = a();
        f15450d = a9;
        f15451e = W5.b.a(a9);
    }

    public /* synthetic */ EnumC2021a(String str, int i8, AbstractC3284p abstractC3284p) {
        this(str, i8);
    }

    private static final /* synthetic */ EnumC2021a[] a() {
        return new EnumC2021a[]{f15447a, f15448b, f15449c};
    }

    public static W5.a d() {
        return f15451e;
    }

    public static EnumC2021a valueOf(String str) {
        return (EnumC2021a) Enum.valueOf(EnumC2021a.class, str);
    }

    public static EnumC2021a[] values() {
        return (EnumC2021a[]) f15450d.clone();
    }

    public abstract w.d.b b(w.d dVar);

    public abstract D c(Map map);

    public final boolean e(w.d configuration) {
        AbstractC3292y.i(configuration, "configuration");
        if (b(configuration) != w.d.b.f27917b) {
            return true;
        }
        return false;
    }

    public final boolean f(w.d configuration) {
        AbstractC3292y.i(configuration, "configuration");
        if (b(configuration) == w.d.b.f27918c) {
            return true;
        }
        return false;
    }

    private EnumC2021a(String str, int i8) {
    }
}
