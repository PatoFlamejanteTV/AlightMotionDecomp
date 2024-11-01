package E6;

import Q5.AbstractC1407b;
import Q5.AbstractC1408c;
import Q5.C1406a;
import Q5.C1413h;
import c6.InterfaceC2073o;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC1043a f2011a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f2012b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f2013c;

    /* renamed from: d, reason: collision with root package name */
    private int f2014d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.k implements InterfaceC2073o {

        /* renamed from: a, reason: collision with root package name */
        int f2015a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f2016b;

        a(U5.d dVar) {
            super(3, dVar);
        }

        @Override // c6.InterfaceC2073o
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC1408c abstractC1408c, Q5.I i8, U5.d dVar) {
            a aVar = new a(dVar);
            aVar.f2016b = abstractC1408c;
            return aVar.invokeSuspend(Q5.I.f8786a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f2015a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                AbstractC1408c abstractC1408c = (AbstractC1408c) this.f2016b;
                byte F8 = K.this.f2011a.F();
                if (F8 == 1) {
                    return K.this.j(true);
                }
                if (F8 == 0) {
                    return K.this.j(false);
                }
                if (F8 == 6) {
                    K k8 = K.this;
                    this.f2015a = 1;
                    obj = k8.i(abstractC1408c, this);
                    if (obj == e8) {
                        return e8;
                    }
                } else {
                    if (F8 == 8) {
                        return K.this.f();
                    }
                    AbstractC1043a.x(K.this.f2011a, "Can't begin reading element, unexpected token", 0, null, 6, null);
                    throw new C1413h();
                }
            }
            return (D6.i) obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f2018a;

        /* renamed from: b, reason: collision with root package name */
        Object f2019b;

        /* renamed from: c, reason: collision with root package name */
        Object f2020c;

        /* renamed from: d, reason: collision with root package name */
        Object f2021d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f2022e;

        /* renamed from: g, reason: collision with root package name */
        int f2024g;

        b(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f2022e = obj;
            this.f2024g |= Integer.MIN_VALUE;
            return K.this.i(null, this);
        }
    }

    public K(D6.f configuration, AbstractC1043a lexer) {
        AbstractC3292y.i(configuration, "configuration");
        AbstractC3292y.i(lexer, "lexer");
        this.f2011a = lexer;
        this.f2012b = configuration.o();
        this.f2013c = configuration.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final D6.i f() {
        boolean z8;
        byte j8 = this.f2011a.j();
        if (this.f2011a.F() != 4) {
            ArrayList arrayList = new ArrayList();
            while (this.f2011a.e()) {
                arrayList.add(e());
                j8 = this.f2011a.j();
                if (j8 != 4) {
                    AbstractC1043a abstractC1043a = this.f2011a;
                    if (j8 == 9) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    int i8 = abstractC1043a.f2058a;
                    if (!z8) {
                        AbstractC1043a.x(abstractC1043a, "Expected end of the array or comma", i8, null, 4, null);
                        throw new C1413h();
                    }
                }
            }
            if (j8 == 8) {
                this.f2011a.k((byte) 9);
            } else if (j8 == 4) {
                if (this.f2013c) {
                    this.f2011a.k((byte) 9);
                } else {
                    B.g(this.f2011a, "array");
                    throw new C1413h();
                }
            }
            return new D6.b(arrayList);
        }
        AbstractC1043a.x(this.f2011a, "Unexpected leading comma", 0, null, 6, null);
        throw new C1413h();
    }

    private final D6.i g() {
        return (D6.i) AbstractC1407b.b(new C1406a(new a(null)), Q5.I.f8786a);
    }

    private final D6.i h() {
        String o8;
        byte k8 = this.f2011a.k((byte) 6);
        if (this.f2011a.F() != 4) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!this.f2011a.e()) {
                    break;
                }
                if (this.f2012b) {
                    o8 = this.f2011a.q();
                } else {
                    o8 = this.f2011a.o();
                }
                this.f2011a.k((byte) 5);
                linkedHashMap.put(o8, e());
                k8 = this.f2011a.j();
                if (k8 != 4) {
                    if (k8 != 7) {
                        AbstractC1043a.x(this.f2011a, "Expected end of the object or comma", 0, null, 6, null);
                        throw new C1413h();
                    }
                }
            }
            if (k8 == 6) {
                this.f2011a.k((byte) 7);
            } else if (k8 == 4) {
                if (this.f2013c) {
                    this.f2011a.k((byte) 7);
                } else {
                    B.h(this.f2011a, null, 1, null);
                    throw new C1413h();
                }
            }
            return new D6.v(linkedHashMap);
        }
        AbstractC1043a.x(this.f2011a, "Unexpected leading comma", 0, null, 6, null);
        throw new C1413h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0096 -> B:10:0x00a0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(Q5.AbstractC1408c r21, U5.d r22) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: E6.K.i(Q5.c, U5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final D6.x j(boolean z8) {
        String q8;
        if (!this.f2012b && z8) {
            q8 = this.f2011a.o();
        } else {
            q8 = this.f2011a.q();
        }
        String str = q8;
        if (!z8 && AbstractC3292y.d(str, "null")) {
            return D6.t.INSTANCE;
        }
        return new D6.p(str, z8, null, 4, null);
    }

    public final D6.i e() {
        D6.i h8;
        byte F8 = this.f2011a.F();
        if (F8 == 1) {
            return j(true);
        }
        if (F8 == 0) {
            return j(false);
        }
        if (F8 == 6) {
            int i8 = this.f2014d + 1;
            this.f2014d = i8;
            if (i8 == 200) {
                h8 = g();
            } else {
                h8 = h();
            }
            this.f2014d--;
            return h8;
        }
        if (F8 == 8) {
            return f();
        }
        AbstractC1043a.x(this.f2011a, "Cannot read Json element because of unexpected " + AbstractC1044b.c(F8), 0, null, 6, null);
        throw new C1413h();
    }
}
