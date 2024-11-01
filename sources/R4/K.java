package r4;

import R5.AbstractC1428l;
import R5.AbstractC1435t;
import androidx.compose.ui.text.input.KeyboardType;
import c6.InterfaceC2073o;
import i6.C2975c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import q6.AbstractC3815N;
import q6.InterfaceC3813L;
import q6.InterfaceC3821f;
import q6.InterfaceC3822g;

/* loaded from: classes4.dex */
public final class K implements r {

    /* renamed from: f, reason: collision with root package name */
    private static final a f38027f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f38028g = 8;

    /* renamed from: h, reason: collision with root package name */
    private static final C2975c f38029h = new C2975c('0', '9');

    /* renamed from: a, reason: collision with root package name */
    private final int f38030a;

    /* renamed from: b, reason: collision with root package name */
    private String f38031b;

    /* renamed from: c, reason: collision with root package name */
    private final int f38032c;

    /* renamed from: d, reason: collision with root package name */
    private final List f38033d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3813L f38034e;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC3821f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3821f[] f38035a;

        /* loaded from: classes4.dex */
        static final class a extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3821f[] f38036a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC3821f[] interfaceC3821fArr) {
                super(0);
                this.f38036a = interfaceC3821fArr;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object[] invoke() {
                return new String[this.f38036a.length];
            }
        }

        /* renamed from: r4.K$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0843b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2073o {

            /* renamed from: a, reason: collision with root package name */
            int f38037a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f38038b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f38039c;

            public C0843b(U5.d dVar) {
                super(3, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = V5.b.e();
                int i8 = this.f38037a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        Q5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Q5.t.b(obj);
                    InterfaceC3822g interfaceC3822g = (InterfaceC3822g) this.f38038b;
                    String w02 = AbstractC1435t.w0(AbstractC1428l.V0((Object[]) this.f38039c), "", null, null, 0, null, null, 62, null);
                    this.f38037a = 1;
                    if (interfaceC3822g.emit(w02, this) == e8) {
                        return e8;
                    }
                }
                return Q5.I.f8786a;
            }

            @Override // c6.InterfaceC2073o
            public final Object invoke(InterfaceC3822g interfaceC3822g, Object[] objArr, U5.d dVar) {
                C0843b c0843b = new C0843b(dVar);
                c0843b.f38038b = interfaceC3822g;
                c0843b.f38039c = objArr;
                return c0843b.invokeSuspend(Q5.I.f8786a);
            }
        }

        public b(InterfaceC3821f[] interfaceC3821fArr) {
            this.f38035a = interfaceC3821fArr;
        }

        @Override // q6.InterfaceC3821f
        public Object collect(InterfaceC3822g interfaceC3822g, U5.d dVar) {
            InterfaceC3821f[] interfaceC3821fArr = this.f38035a;
            Object a9 = r6.k.a(interfaceC3822g, interfaceC3821fArr, new a(interfaceC3821fArr), new C0843b(null), dVar);
            if (a9 == V5.b.e()) {
                return a9;
            }
            return Q5.I.f8786a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f38040a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List list) {
            super(0);
            this.f38040a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            List list = this.f38040a;
            ArrayList arrayList = new ArrayList(AbstractC1435t.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC3813L) it.next()).getValue());
            }
            return AbstractC1435t.w0(arrayList, "", null, null, 0, null, null, 62, null);
        }
    }

    public K(int i8) {
        InterfaceC3821f bVar;
        this.f38030a = i8;
        this.f38031b = "";
        this.f38032c = KeyboardType.Companion.m4896getNumberPasswordPjHm6EE();
        i6.i s8 = i6.m.s(0, i8);
        ArrayList arrayList = new ArrayList(AbstractC1435t.x(s8, 10));
        Iterator it = s8.iterator();
        while (it.hasNext()) {
            ((R5.N) it).nextInt();
            arrayList.add(AbstractC3815N.a(""));
        }
        this.f38033d = arrayList;
        if (arrayList.isEmpty()) {
            bVar = A4.g.n(AbstractC1435t.w0(AbstractC1435t.m(), "", null, null, 0, null, null, 62, null));
        } else {
            bVar = new b((InterfaceC3821f[]) AbstractC1435t.W0(arrayList).toArray(new InterfaceC3821f[0]));
        }
        this.f38034e = new A4.e(bVar, new c(arrayList));
    }

    private final String v(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i8 = 0; i8 < length; i8++) {
            char charAt = str.charAt(i8);
            if (f38029h.k(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "toString(...)");
        return sb2;
    }

    public final int A(int i8, String text) {
        AbstractC3292y.i(text, "text");
        if (AbstractC3292y.d(text, ((q6.w) this.f38033d.get(i8)).getValue())) {
            return 1;
        }
        if (text.length() == 0) {
            ((q6.w) this.f38033d.get(i8)).setValue("");
            return 0;
        }
        String v8 = v(text);
        int length = v8.length();
        int i9 = this.f38030a;
        if (length == i9) {
            i8 = 0;
        }
        int min = Math.min(i9, v8.length());
        Iterator it = i6.m.s(0, min).iterator();
        while (it.hasNext()) {
            int nextInt = ((R5.N) it).nextInt();
            ((q6.w) this.f38033d.get(i8 + nextInt)).setValue(String.valueOf(v8.charAt(nextInt)));
        }
        return min;
    }

    public final InterfaceC3813L j() {
        return this.f38034e;
    }

    public final List w() {
        return this.f38033d;
    }

    public final int x() {
        return this.f38032c;
    }

    public final int y() {
        return this.f38030a;
    }

    public final void z(String digit) {
        AbstractC3292y.i(digit, "digit");
        String str = this.f38031b + digit;
        this.f38031b = str;
        if (str.length() == this.f38030a) {
            A(0, this.f38031b);
            this.f38031b = "";
        }
    }

    public /* synthetic */ K(int i8, int i9, AbstractC3284p abstractC3284p) {
        this((i9 & 1) != 0 ? 6 : i8);
    }
}
