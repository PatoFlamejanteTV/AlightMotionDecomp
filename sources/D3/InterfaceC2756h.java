package d3;

import Q5.p;
import b3.C1969a;
import c3.C2023c;
import c3.C2027g;
import c3.C2028h;
import com.stripe.android.model.q;
import com.stripe.android.paymentsheet.w;
import h4.InterfaceC2949a;
import j4.H0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import p2.InterfaceC3560b;
import w3.AbstractC4155b;
import w3.C4154a;

/* renamed from: d3.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC2756h {

    /* renamed from: d3.h$b */
    /* loaded from: classes4.dex */
    public static final class b {
        public static boolean a(InterfaceC2756h interfaceC2756h, InterfaceC2750b definition, List sharedDataSpecs) {
            Object obj;
            AbstractC3292y.i(definition, "definition");
            AbstractC3292y.i(sharedDataSpecs, "sharedDataSpecs");
            if (interfaceC2756h instanceof d) {
                return true;
            }
            if (interfaceC2756h instanceof c) {
                Iterator it = sharedDataSpecs.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3292y.d(((H0) obj).getType(), definition.getType().f25773a)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                if (obj != null) {
                    return true;
                }
                return false;
            }
            throw new p();
        }

        public static List b(InterfaceC2756h interfaceC2756h, InterfaceC2750b definition, C2752d metadata, List sharedDataSpecs, a arguments) {
            Object obj;
            AbstractC3292y.i(definition, "definition");
            AbstractC3292y.i(metadata, "metadata");
            AbstractC3292y.i(sharedDataSpecs, "sharedDataSpecs");
            AbstractC3292y.i(arguments, "arguments");
            if (interfaceC2756h instanceof d) {
                return ((d) interfaceC2756h).f(metadata, arguments);
            }
            if (interfaceC2756h instanceof c) {
                Iterator it = sharedDataSpecs.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3292y.d(((H0) obj).getType(), definition.getType().f25773a)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                H0 h02 = (H0) obj;
                if (h02 == null) {
                    return null;
                }
                return ((c) interfaceC2756h).a(metadata, h02, new C2028h(arguments));
            }
            throw new p();
        }

        public static C1969a c(InterfaceC2756h interfaceC2756h, InterfaceC2750b definition, C2752d metadata, List sharedDataSpecs, boolean z8) {
            Object obj;
            AbstractC3292y.i(definition, "definition");
            AbstractC3292y.i(metadata, "metadata");
            AbstractC3292y.i(sharedDataSpecs, "sharedDataSpecs");
            if (interfaceC2756h instanceof d) {
                return ((d) interfaceC2756h).c(z8);
            }
            if (interfaceC2756h instanceof c) {
                Iterator it = sharedDataSpecs.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3292y.d(((H0) obj).getType(), definition.getType().f25773a)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                H0 h02 = (H0) obj;
                if (h02 == null) {
                    return null;
                }
                return ((c) interfaceC2756h).b(h02);
            }
            throw new p();
        }

        public static C2027g d(InterfaceC2756h interfaceC2756h, InterfaceC2750b definition, List sharedDataSpecs) {
            Object obj;
            AbstractC3292y.i(definition, "definition");
            AbstractC3292y.i(sharedDataSpecs, "sharedDataSpecs");
            if (interfaceC2756h instanceof d) {
                return ((d) interfaceC2756h).i();
            }
            if (interfaceC2756h instanceof c) {
                Iterator it = sharedDataSpecs.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3292y.d(((H0) obj).getType(), definition.getType().f25773a)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                H0 h02 = (H0) obj;
                if (h02 == null) {
                    return null;
                }
                return ((c) interfaceC2756h).h(h02);
            }
            throw new p();
        }
    }

    /* renamed from: d3.h$c */
    /* loaded from: classes4.dex */
    public interface c extends InterfaceC2756h {

        /* renamed from: d3.h$c$a */
        /* loaded from: classes4.dex */
        public static final class a {
            public static boolean a(c cVar, InterfaceC2750b definition, List sharedDataSpecs) {
                AbstractC3292y.i(definition, "definition");
                AbstractC3292y.i(sharedDataSpecs, "sharedDataSpecs");
                return b.a(cVar, definition, sharedDataSpecs);
            }

            public static List b(c cVar, C2752d metadata, H0 sharedDataSpec, C2028h transformSpecToElements) {
                AbstractC3292y.i(metadata, "metadata");
                AbstractC3292y.i(sharedDataSpec, "sharedDataSpec");
                AbstractC3292y.i(transformSpecToElements, "transformSpecToElements");
                return C2028h.b(transformSpecToElements, sharedDataSpec.b(), null, 2, null);
            }

            public static C1969a c(c cVar, H0 sharedDataSpec) {
                AbstractC3292y.i(sharedDataSpec, "sharedDataSpec");
                return cVar.h(sharedDataSpec).c();
            }

            public static List d(c cVar, InterfaceC2750b definition, C2752d metadata, List sharedDataSpecs, a arguments) {
                AbstractC3292y.i(definition, "definition");
                AbstractC3292y.i(metadata, "metadata");
                AbstractC3292y.i(sharedDataSpecs, "sharedDataSpecs");
                AbstractC3292y.i(arguments, "arguments");
                return b.b(cVar, definition, metadata, sharedDataSpecs, arguments);
            }

            public static C1969a e(c cVar, InterfaceC2750b definition, C2752d metadata, List sharedDataSpecs, boolean z8) {
                AbstractC3292y.i(definition, "definition");
                AbstractC3292y.i(metadata, "metadata");
                AbstractC3292y.i(sharedDataSpecs, "sharedDataSpecs");
                return b.c(cVar, definition, metadata, sharedDataSpecs, z8);
            }

            public static C2027g f(c cVar, InterfaceC2750b definition, List sharedDataSpecs) {
                AbstractC3292y.i(definition, "definition");
                AbstractC3292y.i(sharedDataSpecs, "sharedDataSpecs");
                return b.d(cVar, definition, sharedDataSpecs);
            }
        }

        List a(C2752d c2752d, H0 h02, C2028h c2028h);

        C1969a b(H0 h02);

        C2027g h(H0 h02);
    }

    /* renamed from: d3.h$d */
    /* loaded from: classes4.dex */
    public interface d extends InterfaceC2756h {

        /* renamed from: d3.h$d$a */
        /* loaded from: classes4.dex */
        public static final class a {
            public static boolean a(d dVar, InterfaceC2750b definition, List sharedDataSpecs) {
                AbstractC3292y.i(definition, "definition");
                AbstractC3292y.i(sharedDataSpecs, "sharedDataSpecs");
                return b.a(dVar, definition, sharedDataSpecs);
            }

            public static C1969a b(d dVar, boolean z8) {
                return dVar.i().c();
            }

            public static List c(d dVar, InterfaceC2750b definition, C2752d metadata, List sharedDataSpecs, a arguments) {
                AbstractC3292y.i(definition, "definition");
                AbstractC3292y.i(metadata, "metadata");
                AbstractC3292y.i(sharedDataSpecs, "sharedDataSpecs");
                AbstractC3292y.i(arguments, "arguments");
                return b.b(dVar, definition, metadata, sharedDataSpecs, arguments);
            }

            public static C1969a d(d dVar, InterfaceC2750b definition, C2752d metadata, List sharedDataSpecs, boolean z8) {
                AbstractC3292y.i(definition, "definition");
                AbstractC3292y.i(metadata, "metadata");
                AbstractC3292y.i(sharedDataSpecs, "sharedDataSpecs");
                return b.c(dVar, definition, metadata, sharedDataSpecs, z8);
            }

            public static C2027g e(d dVar, InterfaceC2750b definition, List sharedDataSpecs) {
                AbstractC3292y.i(definition, "definition");
                AbstractC3292y.i(sharedDataSpecs, "sharedDataSpecs");
                return b.d(dVar, definition, sharedDataSpecs);
            }
        }

        C1969a c(boolean z8);

        List f(C2752d c2752d, a aVar);

        C2027g i();
    }

    List d(InterfaceC2750b interfaceC2750b, C2752d c2752d, List list, a aVar);

    C1969a e(InterfaceC2750b interfaceC2750b, C2752d c2752d, List list, boolean z8);

    boolean g(InterfaceC2750b interfaceC2750b, List list);

    C2027g j(InterfaceC2750b interfaceC2750b, List list);

    /* renamed from: d3.h$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC3560b.a f31334a;

        /* renamed from: b, reason: collision with root package name */
        private final P2.e f31335b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f31336c;

        /* renamed from: d, reason: collision with root package name */
        private final Map f31337d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f31338e;

        /* renamed from: f, reason: collision with root package name */
        private final String f31339f;

        /* renamed from: g, reason: collision with root package name */
        private final InterfaceC2949a f31340g;

        /* renamed from: h, reason: collision with root package name */
        private final w.d f31341h;

        /* renamed from: i, reason: collision with root package name */
        private final boolean f31342i;

        /* renamed from: j, reason: collision with root package name */
        private final Function1 f31343j;

        public a(InterfaceC3560b.a cardAccountRangeRepositoryFactory, P2.e eVar, Map initialValues, Map map, boolean z8, String merchantName, InterfaceC2949a cbcEligibility, w.d billingDetailsCollectionConfiguration, boolean z9, Function1 onLinkInlineSignupStateChanged) {
            AbstractC3292y.i(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
            AbstractC3292y.i(initialValues, "initialValues");
            AbstractC3292y.i(merchantName, "merchantName");
            AbstractC3292y.i(cbcEligibility, "cbcEligibility");
            AbstractC3292y.i(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
            AbstractC3292y.i(onLinkInlineSignupStateChanged, "onLinkInlineSignupStateChanged");
            this.f31334a = cardAccountRangeRepositoryFactory;
            this.f31335b = eVar;
            this.f31336c = initialValues;
            this.f31337d = map;
            this.f31338e = z8;
            this.f31339f = merchantName;
            this.f31340g = cbcEligibility;
            this.f31341h = billingDetailsCollectionConfiguration;
            this.f31342i = z9;
            this.f31343j = onLinkInlineSignupStateChanged;
        }

        public final w.d a() {
            return this.f31341h;
        }

        public final InterfaceC3560b.a b() {
            return this.f31334a;
        }

        public final InterfaceC2949a c() {
            return this.f31340g;
        }

        public final Map d() {
            return this.f31336c;
        }

        public final P2.e e() {
            return this.f31335b;
        }

        public final String f() {
            return this.f31339f;
        }

        public final Function1 g() {
            return this.f31343j;
        }

        public final boolean h() {
            return this.f31342i;
        }

        public final boolean i() {
            return this.f31338e;
        }

        public final Map j() {
            return this.f31337d;
        }

        /* renamed from: d3.h$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public interface InterfaceC0717a {
            a a(C2752d c2752d, boolean z8);

            /* renamed from: d3.h$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0718a implements InterfaceC0717a {

                /* renamed from: a, reason: collision with root package name */
                private final InterfaceC3560b.a f31344a;

                /* renamed from: b, reason: collision with root package name */
                private final P2.e f31345b;

                /* renamed from: c, reason: collision with root package name */
                private final Function1 f31346c;

                /* renamed from: d, reason: collision with root package name */
                private final com.stripe.android.model.p f31347d;

                /* renamed from: e, reason: collision with root package name */
                private final q f31348e;

                public C0718a(InterfaceC3560b.a cardAccountRangeRepositoryFactory, P2.e eVar, Function1 onLinkInlineSignupStateChanged, com.stripe.android.model.p pVar, q qVar) {
                    AbstractC3292y.i(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
                    AbstractC3292y.i(onLinkInlineSignupStateChanged, "onLinkInlineSignupStateChanged");
                    this.f31344a = cardAccountRangeRepositoryFactory;
                    this.f31345b = eVar;
                    this.f31346c = onLinkInlineSignupStateChanged;
                    this.f31347d = pVar;
                    this.f31348e = qVar;
                }

                @Override // d3.InterfaceC2756h.a.InterfaceC0717a
                public a a(C2752d metadata, boolean z8) {
                    Map map;
                    AbstractC3292y.i(metadata, "metadata");
                    InterfaceC3560b.a aVar = this.f31344a;
                    P2.e eVar = this.f31345b;
                    String Q8 = metadata.Q();
                    InterfaceC2949a w8 = metadata.w();
                    Map a9 = C2023c.f15459a.a(metadata.x(), this.f31347d, this.f31348e);
                    C4154a q8 = metadata.q();
                    if (q8 != null) {
                        map = AbstractC4155b.b(q8, metadata.x());
                    } else {
                        map = null;
                    }
                    return new a(aVar, eVar, a9, map, false, Q8, w8, metadata.v(), z8, this.f31346c);
                }

                public /* synthetic */ C0718a(InterfaceC3560b.a aVar, P2.e eVar, Function1 function1, com.stripe.android.model.p pVar, q qVar, int i8, AbstractC3284p abstractC3284p) {
                    this(aVar, eVar, function1, (i8 & 8) != 0 ? null : pVar, (i8 & 16) != 0 ? null : qVar);
                }
            }
        }
    }
}
