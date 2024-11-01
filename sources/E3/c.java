package E3;

import E3.a;
import J3.c;
import O3.AbstractC1355c;
import O3.AbstractC1364l;
import O3.G;
import O3.H;
import O3.InterfaceC1354b;
import O3.InterfaceC1371t;
import O3.T;
import O3.U;
import O3.V;
import Q3.i;
import Q3.n;
import Q3.s;
import Q3.t;
import Q5.I;
import R5.AbstractC1435t;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import c3.C2027g;
import c6.InterfaceC2072n;
import com.stripe.android.model.o;
import java.io.Closeable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n2.AbstractC3394E;
import q6.InterfaceC3813L;
import u2.AbstractC4075b;
import v3.w;

/* loaded from: classes4.dex */
public interface c {

    /* loaded from: classes4.dex */
    public static final class a implements c, Closeable {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC1354b f1590a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC3813L f1591b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f1592c;

        /* renamed from: d, reason: collision with root package name */
        private final float f1593d;

        /* renamed from: e, reason: collision with root package name */
        private final float f1594e;

        /* renamed from: f, reason: collision with root package name */
        private final float f1595f;

        /* renamed from: g, reason: collision with root package name */
        private final EnumC0031c f1596g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f1597h;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: E3.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0029a extends AbstractC3293z implements InterfaceC2072n {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Modifier f1599b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f1600c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0029a(Modifier modifier, int i8) {
                super(2);
                this.f1599b = modifier;
                this.f1600c = i8;
            }

            @Override // c6.InterfaceC2072n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f8786a;
            }

            public final void invoke(Composer composer, int i8) {
                a.this.h(this.f1599b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f1600c | 1));
            }
        }

        /* loaded from: classes4.dex */
        static final class b extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f1601a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f1602b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(boolean z8, boolean z9) {
                super(1);
                this.f1601a = z8;
                this.f1602b = z9;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C2.c invoke(InterfaceC1354b.a state) {
                AbstractC3292y.i(state, "state");
                String str = null;
                if (this.f1601a || this.f1602b) {
                    return null;
                }
                C2027g c2027g = (C2027g) AbstractC1435t.M0(state.g());
                if (c2027g != null) {
                    str = c2027g.d();
                }
                if (AbstractC3292y.d(str, o.p.f25755i.f25773a)) {
                    return C2.d.a(AbstractC3394E.f35195H0);
                }
                return C2.d.a(w.f40580D);
            }
        }

        public a(InterfaceC1354b interactor) {
            AbstractC3292y.i(interactor, "interactor");
            this.f1590a = interactor;
            this.f1591b = A4.g.n(new E3.a(true, null, 2, null));
            this.f1592c = true;
            this.f1593d = Dp.m5155constructorimpl(0);
            this.f1594e = E3.d.a();
            this.f1595f = E3.d.b();
            this.f1596g = EnumC0031c.f1615a;
            this.f1597h = true;
        }

        @Override // E3.c
        public InterfaceC3813L a() {
            return this.f1591b;
        }

        @Override // E3.c
        public EnumC0031c b() {
            return this.f1596g;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f1590a.close();
        }

        @Override // E3.c
        public boolean g() {
            return this.f1592c;
        }

        @Override // E3.c
        public void h(Modifier modifier, Composer composer, int i8) {
            AbstractC3292y.i(modifier, "modifier");
            Composer startRestartGroup = composer.startRestartGroup(-992403751);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-992403751, i8, -1, "com.stripe.android.paymentsheet.navigation.PaymentSheetScreen.AddAnotherPaymentMethod.Content (PaymentSheetScreen.kt:224)");
            }
            AbstractC1355c.a(this.f1590a, modifier, startRestartGroup, (i8 << 3) & 112, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new C0029a(modifier, i8));
            }
        }

        @Override // E3.c
        public boolean i() {
            return this.f1597h;
        }

        @Override // E3.c
        public InterfaceC3813L j(boolean z8, boolean z9) {
            return A4.g.m(this.f1590a.getState(), new b(z9, z8));
        }

        @Override // E3.c
        public float k() {
            return this.f1594e;
        }

        @Override // E3.c
        public InterfaceC3813L p() {
            return A4.g.n(H.f7207a.a(true, this.f1590a.c(), G.a.b.f7206a));
        }

        @Override // E3.c
        public float q() {
            return this.f1593d;
        }

        @Override // E3.c
        public float r() {
            return this.f1595f;
        }

        @Override // E3.c
        public InterfaceC3813L t(boolean z8) {
            return A4.g.n(Boolean.valueOf(z8));
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements c, Closeable {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC1354b f1603a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC3813L f1604b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f1605c;

        /* renamed from: d, reason: collision with root package name */
        private final float f1606d;

        /* renamed from: e, reason: collision with root package name */
        private final float f1607e;

        /* renamed from: f, reason: collision with root package name */
        private final float f1608f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f1609g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3293z implements InterfaceC2072n {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Modifier f1611b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f1612c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Modifier modifier, int i8) {
                super(2);
                this.f1611b = modifier;
                this.f1612c = i8;
            }

            @Override // c6.InterfaceC2072n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f8786a;
            }

            public final void invoke(Composer composer, int i8) {
                b.this.h(this.f1611b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f1612c | 1));
            }
        }

        /* renamed from: E3.c$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0030b extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f1613a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f1614b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0030b(boolean z8, boolean z9) {
                super(1);
                this.f1613a = z8;
                this.f1614b = z9;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C2.c invoke(InterfaceC1354b.a state) {
                AbstractC3292y.i(state, "state");
                String str = null;
                if (this.f1613a) {
                    return null;
                }
                if (this.f1614b) {
                    return C2.d.a(w.f40627m);
                }
                C2027g c2027g = (C2027g) AbstractC1435t.M0(state.g());
                if (c2027g != null) {
                    str = c2027g.d();
                }
                if (AbstractC3292y.d(str, o.p.f25755i.f25773a)) {
                    return C2.d.a(AbstractC3394E.f35195H0);
                }
                return C2.d.a(w.f40580D);
            }
        }

        public b(InterfaceC1354b interactor) {
            AbstractC3292y.i(interactor, "interactor");
            this.f1603a = interactor;
            this.f1604b = A4.g.n(new E3.a(true, null, 2, null));
            this.f1605c = true;
            this.f1606d = Dp.m5155constructorimpl(0);
            this.f1607e = E3.d.a();
            this.f1608f = E3.d.b();
            this.f1609g = true;
        }

        @Override // E3.c
        public InterfaceC3813L a() {
            return this.f1604b;
        }

        @Override // E3.c
        public EnumC0031c b() {
            return e.a(this);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f1603a.close();
        }

        @Override // E3.c
        public boolean g() {
            return this.f1605c;
        }

        @Override // E3.c
        public void h(Modifier modifier, Composer composer, int i8) {
            AbstractC3292y.i(modifier, "modifier");
            Composer startRestartGroup = composer.startRestartGroup(1504163590);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1504163590, i8, -1, "com.stripe.android.paymentsheet.navigation.PaymentSheetScreen.AddFirstPaymentMethod.Content (PaymentSheetScreen.kt:277)");
            }
            AbstractC1355c.a(this.f1603a, modifier, startRestartGroup, (i8 << 3) & 112, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new a(modifier, i8));
            }
        }

        @Override // E3.c
        public boolean i() {
            return this.f1609g;
        }

        @Override // E3.c
        public InterfaceC3813L j(boolean z8, boolean z9) {
            return A4.g.m(this.f1603a.getState(), new C0030b(z9, z8));
        }

        @Override // E3.c
        public float k() {
            return this.f1607e;
        }

        @Override // E3.c
        public InterfaceC3813L p() {
            return A4.g.n(H.f7207a.a(false, this.f1603a.c(), G.a.b.f7206a));
        }

        @Override // E3.c
        public float q() {
            return this.f1606d;
        }

        @Override // E3.c
        public float r() {
            return this.f1608f;
        }

        @Override // E3.c
        public InterfaceC3813L t(boolean z8) {
            return A4.g.n(Boolean.TRUE);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: E3.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class EnumC0031c {

        /* renamed from: a, reason: collision with root package name */
        public static final EnumC0031c f1615a = new EnumC0031c("PrimaryButtonAnchored", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final EnumC0031c f1616b = new EnumC0031c("FullPage", 1);

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ EnumC0031c[] f1617c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ W5.a f1618d;

        static {
            EnumC0031c[] a9 = a();
            f1617c = a9;
            f1618d = W5.b.a(a9);
        }

        private EnumC0031c(String str, int i8) {
        }

        private static final /* synthetic */ EnumC0031c[] a() {
            return new EnumC0031c[]{f1615a, f1616b};
        }

        public static EnumC0031c valueOf(String str) {
            return (EnumC0031c) Enum.valueOf(EnumC0031c.class, str);
        }

        public static EnumC0031c[] values() {
            return (EnumC0031c[]) f1617c.clone();
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements c {

        /* renamed from: a, reason: collision with root package name */
        private final J3.e f1619a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC3813L f1620b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f1621c;

        /* renamed from: d, reason: collision with root package name */
        private final float f1622d;

        /* renamed from: e, reason: collision with root package name */
        private final float f1623e;

        /* renamed from: f, reason: collision with root package name */
        private final float f1624f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f1625g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3293z implements InterfaceC2072n {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Modifier f1627b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f1628c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Modifier modifier, int i8) {
                super(2);
                this.f1627b = modifier;
                this.f1628c = i8;
            }

            @Override // c6.InterfaceC2072n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f8786a;
            }

            public final void invoke(Composer composer, int i8) {
                d.this.h(this.f1627b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f1628c | 1));
            }
        }

        /* loaded from: classes4.dex */
        static final class b extends AbstractC3293z implements Function1 {

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes4.dex */
            public static final class a extends AbstractC3293z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                public static final a f1630a = new a();

                a() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m2invoke();
                    return I.f8786a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m2invoke() {
                }
            }

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final G invoke(J3.c complete) {
                AbstractC3292y.i(complete, "complete");
                return H.f7207a.a(false, !((J3.f) d.this.f1619a.a().getValue()).f(), new G.a.C0136a(complete instanceof c.b, false, a.f1630a));
            }
        }

        public d(J3.e interactor) {
            AbstractC3292y.i(interactor, "interactor");
            this.f1619a = interactor;
            this.f1620b = A4.g.n(new E3.a(true, new a.C0027a(C2.d.g(w.f40582F, new Object[0], null, 4, null), false)));
            this.f1622d = Dp.m5155constructorimpl(0);
            this.f1623e = E3.d.c();
            this.f1624f = E3.d.d();
        }

        @Override // E3.c
        public InterfaceC3813L a() {
            return this.f1620b;
        }

        @Override // E3.c
        public EnumC0031c b() {
            return e.a(this);
        }

        @Override // E3.c
        public boolean g() {
            return this.f1621c;
        }

        @Override // E3.c
        public void h(Modifier modifier, Composer composer, int i8) {
            AbstractC3292y.i(modifier, "modifier");
            Composer startRestartGroup = composer.startRestartGroup(-521548963);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-521548963, i8, -1, "com.stripe.android.paymentsheet.navigation.PaymentSheetScreen.CvcRecollection.Content (PaymentSheetScreen.kt:532)");
            }
            com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.b.c(this.f1619a, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new a(modifier, i8));
            }
        }

        @Override // E3.c
        public boolean i() {
            return this.f1625g;
        }

        @Override // E3.c
        public InterfaceC3813L j(boolean z8, boolean z9) {
            return A4.g.n(null);
        }

        @Override // E3.c
        public float k() {
            return this.f1623e;
        }

        @Override // E3.c
        public InterfaceC3813L p() {
            return A4.g.m(this.f1619a.c(), new b());
        }

        @Override // E3.c
        public float q() {
            return this.f1622d;
        }

        @Override // E3.c
        public float r() {
            return this.f1624f;
        }

        @Override // E3.c
        public InterfaceC3813L t(boolean z8) {
            return A4.g.n(Boolean.FALSE);
        }
    }

    /* loaded from: classes4.dex */
    public static final class e {
        public static EnumC0031c a(c cVar) {
            return EnumC0031c.f1616b;
        }
    }

    /* loaded from: classes4.dex */
    public static final class f implements c, Closeable {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC1371t f1631a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC3813L f1632b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f1633c;

        /* renamed from: d, reason: collision with root package name */
        private final float f1634d;

        /* renamed from: e, reason: collision with root package name */
        private final float f1635e;

        /* renamed from: f, reason: collision with root package name */
        private final float f1636f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f1637g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3293z implements InterfaceC2072n {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Modifier f1639b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f1640c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Modifier modifier, int i8) {
                super(2);
                this.f1639b = modifier;
                this.f1640c = i8;
            }

            @Override // c6.InterfaceC2072n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f8786a;
            }

            public final void invoke(Composer composer, int i8) {
                f.this.h(this.f1639b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f1640c | 1));
            }
        }

        public f(InterfaceC1371t interactor) {
            AbstractC3292y.i(interactor, "interactor");
            this.f1631a = interactor;
            this.f1632b = A4.g.n(new E3.a(false, null, 2, null));
            float f8 = 0;
            this.f1634d = Dp.m5155constructorimpl(f8);
            this.f1635e = Dp.m5155constructorimpl(f8);
            this.f1636f = E3.d.b();
        }

        @Override // E3.c
        public InterfaceC3813L a() {
            return this.f1632b;
        }

        @Override // E3.c
        public EnumC0031c b() {
            return e.a(this);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f1631a.close();
        }

        @Override // E3.c
        public boolean g() {
            return this.f1633c;
        }

        @Override // E3.c
        public void h(Modifier modifier, Composer composer, int i8) {
            AbstractC3292y.i(modifier, "modifier");
            Composer startRestartGroup = composer.startRestartGroup(-1252883967);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1252883967, i8, -1, "com.stripe.android.paymentsheet.navigation.PaymentSheetScreen.EditPaymentMethod.Content (PaymentSheetScreen.kt:318)");
            }
            AbstractC1364l.d(this.f1631a, modifier, startRestartGroup, (i8 << 3) & 112, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new a(modifier, i8));
            }
        }

        @Override // E3.c
        public boolean i() {
            return this.f1637g;
        }

        @Override // E3.c
        public InterfaceC3813L j(boolean z8, boolean z9) {
            return A4.g.n(C2.d.a(AbstractC3394E.f35203L0));
        }

        @Override // E3.c
        public float k() {
            return this.f1635e;
        }

        @Override // E3.c
        public InterfaceC3813L p() {
            return A4.g.n(H.f7207a.a(true, this.f1631a.c(), G.a.b.f7206a));
        }

        @Override // E3.c
        public float q() {
            return this.f1634d;
        }

        @Override // E3.c
        public float r() {
            return this.f1636f;
        }

        @Override // E3.c
        public InterfaceC3813L t(boolean z8) {
            return A4.g.n(Boolean.FALSE);
        }
    }

    /* loaded from: classes4.dex */
    public static final class g implements c {

        /* renamed from: c, reason: collision with root package name */
        private static final boolean f1643c = false;

        /* renamed from: d, reason: collision with root package name */
        private static final float f1644d;

        /* renamed from: e, reason: collision with root package name */
        private static final float f1645e;

        /* renamed from: g, reason: collision with root package name */
        private static final boolean f1647g = false;

        /* renamed from: a, reason: collision with root package name */
        public static final g f1641a = new g();

        /* renamed from: b, reason: collision with root package name */
        private static final InterfaceC3813L f1642b = A4.g.n(new E3.a(false, null, 2, null));

        /* renamed from: f, reason: collision with root package name */
        private static final float f1646f = E3.d.b();

        /* renamed from: h, reason: collision with root package name */
        public static final int f1648h = 8;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3293z implements InterfaceC2072n {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Modifier f1650b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f1651c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Modifier modifier, int i8) {
                super(2);
                this.f1650b = modifier;
                this.f1651c = i8;
            }

            @Override // c6.InterfaceC2072n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f8786a;
            }

            public final void invoke(Composer composer, int i8) {
                g.this.h(this.f1650b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f1651c | 1));
            }
        }

        static {
            float f8 = 0;
            f1644d = Dp.m5155constructorimpl(f8);
            f1645e = Dp.m5155constructorimpl(f8);
        }

        private g() {
        }

        @Override // E3.c
        public InterfaceC3813L a() {
            return f1642b;
        }

        @Override // E3.c
        public EnumC0031c b() {
            return e.a(this);
        }

        @Override // E3.c
        public boolean g() {
            return f1643c;
        }

        @Override // E3.c
        public void h(Modifier modifier, Composer composer, int i8) {
            int i9;
            int i10;
            AbstractC3292y.i(modifier, "modifier");
            Composer startRestartGroup = composer.startRestartGroup(1798980290);
            if ((i8 & 14) == 0) {
                if (startRestartGroup.changed(modifier)) {
                    i10 = 4;
                } else {
                    i10 = 2;
                }
                i9 = i10 | i8;
            } else {
                i9 = i8;
            }
            if ((i9 & 11) == 2 && startRestartGroup.getSkipping()) {
                startRestartGroup.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1798980290, i9, -1, "com.stripe.android.paymentsheet.navigation.PaymentSheetScreen.Loading.Content (PaymentSheetScreen.kt:112)");
                }
                AbstractC4075b.a(modifier, startRestartGroup, i9 & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new a(modifier, i8));
            }
        }

        @Override // E3.c
        public boolean i() {
            return f1647g;
        }

        @Override // E3.c
        public InterfaceC3813L j(boolean z8, boolean z9) {
            return A4.g.n(null);
        }

        @Override // E3.c
        public float k() {
            return f1645e;
        }

        @Override // E3.c
        public InterfaceC3813L p() {
            return A4.g.n(null);
        }

        @Override // E3.c
        public float q() {
            return f1644d;
        }

        @Override // E3.c
        public float r() {
            return f1646f;
        }

        @Override // E3.c
        public InterfaceC3813L t(boolean z8) {
            return A4.g.n(Boolean.FALSE);
        }
    }

    /* loaded from: classes4.dex */
    public static final class h implements c {

        /* renamed from: a, reason: collision with root package name */
        private final Q3.f f1652a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC3813L f1653b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f1654c;

        /* renamed from: d, reason: collision with root package name */
        private final float f1655d;

        /* renamed from: e, reason: collision with root package name */
        private final float f1656e;

        /* renamed from: f, reason: collision with root package name */
        private final float f1657f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f1658g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3293z implements InterfaceC2072n {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Modifier f1660b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f1661c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Modifier modifier, int i8) {
                super(2);
                this.f1660b = modifier;
                this.f1661c = i8;
            }

            @Override // c6.InterfaceC2072n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f8786a;
            }

            public final void invoke(Composer composer, int i8) {
                h.this.h(this.f1660b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f1661c | 1));
            }
        }

        public h(Q3.f interactor) {
            AbstractC3292y.i(interactor, "interactor");
            this.f1652a = interactor;
            this.f1653b = A4.g.n(new E3.a(false, null, 2, null));
            float f8 = 0;
            this.f1655d = Dp.m5155constructorimpl(f8);
            this.f1656e = Dp.m5155constructorimpl(f8);
            this.f1657f = E3.d.d();
        }

        @Override // E3.c
        public InterfaceC3813L a() {
            return this.f1653b;
        }

        @Override // E3.c
        public EnumC0031c b() {
            return e.a(this);
        }

        @Override // E3.c
        public boolean g() {
            return this.f1654c;
        }

        @Override // E3.c
        public void h(Modifier modifier, Composer composer, int i8) {
            AbstractC3292y.i(modifier, "modifier");
            Composer startRestartGroup = composer.startRestartGroup(1539421821);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1539421821, i8, -1, "com.stripe.android.paymentsheet.navigation.PaymentSheetScreen.ManageOneSavedPaymentMethod.Content (PaymentSheetScreen.kt:492)");
            }
            Q3.g.a(this.f1652a, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new a(modifier, i8));
            }
        }

        @Override // E3.c
        public boolean i() {
            return this.f1658g;
        }

        @Override // E3.c
        public InterfaceC3813L j(boolean z8, boolean z9) {
            return A4.g.n(C2.d.a(w.f40602Z));
        }

        @Override // E3.c
        public float k() {
            return this.f1656e;
        }

        @Override // E3.c
        public InterfaceC3813L p() {
            return A4.g.n(H.f7207a.a(true, this.f1652a.getState().b(), G.a.b.f7206a));
        }

        @Override // E3.c
        public float q() {
            return this.f1655d;
        }

        @Override // E3.c
        public float r() {
            return this.f1657f;
        }

        @Override // E3.c
        public InterfaceC3813L t(boolean z8) {
            return A4.g.n(Boolean.FALSE);
        }
    }

    /* loaded from: classes4.dex */
    public static final class i implements c, Closeable {

        /* renamed from: a, reason: collision with root package name */
        private final Q3.i f1662a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC3813L f1663b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f1664c;

        /* renamed from: d, reason: collision with root package name */
        private final float f1665d;

        /* renamed from: e, reason: collision with root package name */
        private final float f1666e;

        /* renamed from: f, reason: collision with root package name */
        private final float f1667f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f1668g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3293z implements InterfaceC2072n {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Modifier f1670b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f1671c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Modifier modifier, int i8) {
                super(2);
                this.f1670b = modifier;
                this.f1671c = i8;
            }

            @Override // c6.InterfaceC2072n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f8786a;
            }

            public final void invoke(Composer composer, int i8) {
                i.this.h(this.f1670b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f1671c | 1));
            }
        }

        /* loaded from: classes4.dex */
        static final class b extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final b f1672a = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C2.c invoke(i.a state) {
                int i8;
                AbstractC3292y.i(state, "state");
                if (state.e()) {
                    i8 = w.f40585I;
                } else {
                    i8 = w.f40614f0;
                }
                return C2.d.a(i8);
            }
        }

        /* renamed from: E3.c$i$c, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0032c extends AbstractC3293z implements Function1 {

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: E3.c$i$c$a */
            /* loaded from: classes4.dex */
            public static final class a extends AbstractC3293z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ i f1674a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(i iVar) {
                    super(0);
                    this.f1674a = iVar;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m3invoke();
                    return I.f8786a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m3invoke() {
                    this.f1674a.f1662a.a(i.b.d.f8564a);
                }
            }

            C0032c() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final G invoke(i.a state) {
                AbstractC3292y.i(state, "state");
                return H.f7207a.a(true, i.this.f1662a.c(), new G.a.C0136a(state.e(), state.a(), new a(i.this)));
            }
        }

        public i(Q3.i interactor) {
            AbstractC3292y.i(interactor, "interactor");
            this.f1662a = interactor;
            this.f1663b = A4.g.n(new E3.a(false, null, 2, null));
            float f8 = 0;
            this.f1665d = Dp.m5155constructorimpl(f8);
            this.f1666e = Dp.m5155constructorimpl(f8);
            this.f1667f = E3.d.d();
        }

        @Override // E3.c
        public InterfaceC3813L a() {
            return this.f1663b;
        }

        @Override // E3.c
        public EnumC0031c b() {
            return e.a(this);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f1662a.close();
        }

        @Override // E3.c
        public boolean g() {
            return this.f1664c;
        }

        @Override // E3.c
        public void h(Modifier modifier, Composer composer, int i8) {
            AbstractC3292y.i(modifier, "modifier");
            Composer startRestartGroup = composer.startRestartGroup(-449464720);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-449464720, i8, -1, "com.stripe.android.paymentsheet.navigation.PaymentSheetScreen.ManageSavedPaymentMethods.Content (PaymentSheetScreen.kt:454)");
            }
            Q3.j.a(this.f1662a, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new a(modifier, i8));
            }
        }

        @Override // E3.c
        public boolean i() {
            return this.f1668g;
        }

        @Override // E3.c
        public InterfaceC3813L j(boolean z8, boolean z9) {
            return A4.g.m(this.f1662a.getState(), b.f1672a);
        }

        @Override // E3.c
        public float k() {
            return this.f1666e;
        }

        @Override // E3.c
        public InterfaceC3813L p() {
            return A4.g.m(this.f1662a.getState(), new C0032c());
        }

        @Override // E3.c
        public float q() {
            return this.f1665d;
        }

        @Override // E3.c
        public float r() {
            return this.f1667f;
        }

        @Override // E3.c
        public InterfaceC3813L t(boolean z8) {
            return A4.g.n(Boolean.FALSE);
        }
    }

    /* loaded from: classes4.dex */
    public static final class k implements c {

        /* renamed from: a, reason: collision with root package name */
        private final n f1691a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC3813L f1692b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f1693c;

        /* renamed from: d, reason: collision with root package name */
        private final float f1694d;

        /* renamed from: e, reason: collision with root package name */
        private final float f1695e;

        /* renamed from: f, reason: collision with root package name */
        private final float f1696f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f1697g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3293z implements InterfaceC2072n {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Modifier f1699b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f1700c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Modifier modifier, int i8) {
                super(2);
                this.f1699b = modifier;
                this.f1700c = i8;
            }

            @Override // c6.InterfaceC2072n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f8786a;
            }

            public final void invoke(Composer composer, int i8) {
                k.this.h(this.f1699b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f1700c | 1));
            }
        }

        public k(n interactor) {
            AbstractC3292y.i(interactor, "interactor");
            this.f1691a = interactor;
            this.f1692b = A4.g.n(new E3.a(true, null, 2, null));
            this.f1693c = true;
            this.f1694d = Dp.m5155constructorimpl(0);
            this.f1695e = E3.d.c();
            this.f1696f = E3.d.d();
            this.f1697g = true;
        }

        @Override // E3.c
        public InterfaceC3813L a() {
            return this.f1692b;
        }

        @Override // E3.c
        public EnumC0031c b() {
            return e.a(this);
        }

        @Override // E3.c
        public boolean g() {
            return this.f1693c;
        }

        @Override // E3.c
        public void h(Modifier modifier, Composer composer, int i8) {
            AbstractC3292y.i(modifier, "modifier");
            Composer startRestartGroup = composer.startRestartGroup(-1185148305);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1185148305, i8, -1, "com.stripe.android.paymentsheet.navigation.PaymentSheetScreen.VerticalMode.Content (PaymentSheetScreen.kt:365)");
            }
            Q3.o.b(this.f1691a, modifier, startRestartGroup, (i8 << 3) & 112, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new a(modifier, i8));
            }
        }

        @Override // E3.c
        public boolean i() {
            return this.f1697g;
        }

        @Override // E3.c
        public InterfaceC3813L j(boolean z8, boolean z9) {
            C2.c a9;
            if (z9) {
                a9 = null;
            } else if (z8) {
                a9 = C2.d.a(w.f40612e0);
            } else {
                a9 = C2.d.a(w.f40580D);
            }
            return A4.g.n(a9);
        }

        @Override // E3.c
        public float k() {
            return this.f1695e;
        }

        @Override // E3.c
        public InterfaceC3813L p() {
            return A4.g.n(H.f7207a.a(false, this.f1691a.c(), G.a.b.f7206a));
        }

        @Override // E3.c
        public float q() {
            return this.f1694d;
        }

        @Override // E3.c
        public float r() {
            return this.f1696f;
        }

        @Override // E3.c
        public InterfaceC3813L t(boolean z8) {
            return this.f1691a.b();
        }
    }

    InterfaceC3813L a();

    EnumC0031c b();

    boolean g();

    void h(Modifier modifier, Composer composer, int i8);

    boolean i();

    InterfaceC3813L j(boolean z8, boolean z9);

    float k();

    InterfaceC3813L p();

    float q();

    float r();

    InterfaceC3813L t(boolean z8);

    /* loaded from: classes4.dex */
    public static final class j implements c, Closeable {

        /* renamed from: a, reason: collision with root package name */
        private final V f1675a;

        /* renamed from: b, reason: collision with root package name */
        private final b f1676b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC3813L f1677c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f1678d;

        /* renamed from: e, reason: collision with root package name */
        private final float f1679e;

        /* renamed from: f, reason: collision with root package name */
        private final float f1680f;

        /* renamed from: g, reason: collision with root package name */
        private final float f1681g;

        /* renamed from: h, reason: collision with root package name */
        private final EnumC0031c f1682h;

        /* renamed from: i, reason: collision with root package name */
        private final boolean f1683i;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3293z implements InterfaceC2072n {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Modifier f1685b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f1686c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Modifier modifier, int i8) {
                super(2);
                this.f1685b = modifier;
                this.f1686c = i8;
            }

            @Override // c6.InterfaceC2072n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f8786a;
            }

            public final void invoke(Composer composer, int i8) {
                j.this.h(this.f1685b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f1686c | 1));
            }
        }

        /* loaded from: classes4.dex */
        public interface b {

            /* loaded from: classes4.dex */
            public static final class a implements b {

                /* renamed from: a, reason: collision with root package name */
                public static final a f1687a = new a();

                private a() {
                }

                public boolean equals(Object obj) {
                    if (this == obj || (obj instanceof a)) {
                        return true;
                    }
                    return false;
                }

                public int hashCode() {
                    return 689265788;
                }

                public String toString() {
                    return "NotRequired";
                }
            }

            /* renamed from: E3.c$j$b$b, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0033b implements b {

                /* renamed from: a, reason: collision with root package name */
                private final InterfaceC3813L f1688a;

                public C0033b(InterfaceC3813L cvcControllerFlow) {
                    AbstractC3292y.i(cvcControllerFlow, "cvcControllerFlow");
                    this.f1688a = cvcControllerFlow;
                }

                public final InterfaceC3813L a() {
                    return this.f1688a;
                }
            }
        }

        /* renamed from: E3.c$j$c, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0034c extends AbstractC3293z implements Function1 {

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: E3.c$j$c$a */
            /* loaded from: classes4.dex */
            public static final class a extends AbstractC3293z implements Function0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ j f1690a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(j jVar) {
                    super(0);
                    this.f1690a = jVar;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m4invoke();
                    return I.f8786a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m4invoke() {
                    this.f1690a.f1675a.a(V.b.e.f7506a);
                }
            }

            C0034c() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final G invoke(V.a state) {
                AbstractC3292y.i(state, "state");
                return H.f7207a.a(false, j.this.f1675a.c(), new G.a.C0136a(state.f(), state.c(), new a(j.this)));
            }
        }

        public j(V interactor, b cvcRecollectionState) {
            AbstractC3292y.i(interactor, "interactor");
            AbstractC3292y.i(cvcRecollectionState, "cvcRecollectionState");
            this.f1675a = interactor;
            this.f1676b = cvcRecollectionState;
            this.f1677c = A4.g.n(new E3.a(true, null, 2, null));
            this.f1679e = T.j();
            this.f1680f = Dp.m5155constructorimpl(0);
            this.f1681g = E3.d.b();
            this.f1682h = EnumC0031c.f1615a;
            this.f1683i = true;
        }

        @Override // E3.c
        public InterfaceC3813L a() {
            return this.f1677c;
        }

        @Override // E3.c
        public EnumC0031c b() {
            return this.f1682h;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f1675a.close();
        }

        @Override // E3.c
        public boolean g() {
            return this.f1678d;
        }

        @Override // E3.c
        public void h(Modifier modifier, Composer composer, int i8) {
            AbstractC3292y.i(modifier, "modifier");
            Composer startRestartGroup = composer.startRestartGroup(-289202489);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-289202489, i8, -1, "com.stripe.android.paymentsheet.navigation.PaymentSheetScreen.SelectSavedPaymentMethods.Content (PaymentSheetScreen.kt:168)");
            }
            U.j(this.f1675a, this.f1676b, modifier, startRestartGroup, (i8 << 6) & 896);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new a(modifier, i8));
            }
        }

        @Override // E3.c
        public boolean i() {
            return this.f1683i;
        }

        @Override // E3.c
        public InterfaceC3813L j(boolean z8, boolean z9) {
            C2.c a9;
            if (z8 && z9) {
                a9 = null;
            } else {
                a9 = C2.d.a(w.f40614f0);
            }
            return A4.g.n(a9);
        }

        @Override // E3.c
        public float k() {
            return this.f1680f;
        }

        @Override // E3.c
        public InterfaceC3813L p() {
            return A4.g.m(this.f1675a.getState(), new C0034c());
        }

        @Override // E3.c
        public float q() {
            return this.f1679e;
        }

        @Override // E3.c
        public float r() {
            return this.f1681g;
        }

        @Override // E3.c
        public InterfaceC3813L t(boolean z8) {
            return A4.g.n(Boolean.valueOf(z8));
        }

        public final b v() {
            return this.f1676b;
        }

        public /* synthetic */ j(V v8, b bVar, int i8, AbstractC3284p abstractC3284p) {
            this(v8, (i8 & 2) != 0 ? b.a.f1687a : bVar);
        }
    }

    /* loaded from: classes4.dex */
    public static final class l implements c, Closeable {

        /* renamed from: a, reason: collision with root package name */
        private final s f1701a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f1702b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC3813L f1703c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f1704d;

        /* renamed from: e, reason: collision with root package name */
        private final float f1705e;

        /* renamed from: f, reason: collision with root package name */
        private final float f1706f;

        /* renamed from: g, reason: collision with root package name */
        private final float f1707g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f1708h;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3293z implements InterfaceC2072n {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Modifier f1710b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f1711c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Modifier modifier, int i8) {
                super(2);
                this.f1710b = modifier;
                this.f1711c = i8;
            }

            @Override // c6.InterfaceC2072n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return I.f8786a;
            }

            public final void invoke(Composer composer, int i8) {
                l.this.h(this.f1710b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f1711c | 1));
            }
        }

        public l(s interactor, boolean z8) {
            AbstractC3292y.i(interactor, "interactor");
            this.f1701a = interactor;
            this.f1702b = z8;
            this.f1703c = A4.g.n(new E3.a(true, null, 2, null));
            this.f1704d = true;
            this.f1705e = Dp.m5155constructorimpl(0);
            this.f1706f = E3.d.c();
            this.f1707g = E3.d.d();
            this.f1708h = true;
        }

        @Override // E3.c
        public InterfaceC3813L a() {
            return this.f1703c;
        }

        @Override // E3.c
        public EnumC0031c b() {
            return e.a(this);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f1701a.close();
        }

        @Override // E3.c
        public boolean g() {
            return this.f1704d;
        }

        @Override // E3.c
        public void h(Modifier modifier, Composer composer, int i8) {
            AbstractC3292y.i(modifier, "modifier");
            Composer startRestartGroup = composer.startRestartGroup(1422248203);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1422248203, i8, -1, "com.stripe.android.paymentsheet.navigation.PaymentSheetScreen.VerticalModeForm.Content (PaymentSheetScreen.kt:403)");
            }
            t.b(this.f1701a, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new a(modifier, i8));
            }
        }

        @Override // E3.c
        public boolean i() {
            return this.f1708h;
        }

        @Override // E3.c
        public InterfaceC3813L j(boolean z8, boolean z9) {
            return A4.g.n(null);
        }

        @Override // E3.c
        public float k() {
            return this.f1706f;
        }

        @Override // E3.c
        public InterfaceC3813L p() {
            return A4.g.n(H.f7207a.a(this.f1701a.a(), this.f1701a.c(), G.a.b.f7206a));
        }

        @Override // E3.c
        public float q() {
            return this.f1705e;
        }

        @Override // E3.c
        public float r() {
            return this.f1707g;
        }

        @Override // E3.c
        public InterfaceC3813L t(boolean z8) {
            return A4.g.n(Boolean.valueOf(this.f1702b));
        }

        public /* synthetic */ l(s sVar, boolean z8, int i8, AbstractC3284p abstractC3284p) {
            this(sVar, (i8 & 2) != 0 ? false : z8);
        }
    }
}
