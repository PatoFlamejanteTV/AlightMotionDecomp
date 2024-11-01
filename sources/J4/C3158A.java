package j4;

import R5.AbstractC1435t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import p4.EnumC3581f;
import q6.InterfaceC3813L;
import r4.AbstractC3910i;
import r4.C3901b;
import r4.C3925y;

/* renamed from: j4.A, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3158A extends C3901b {

    /* renamed from: t, reason: collision with root package name */
    private final g4.c f33710t;

    /* renamed from: u, reason: collision with root package name */
    private final InterfaceC3813L f33711u;

    /* renamed from: j4.A$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements Function1 {

        /* renamed from: j4.A$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C0774a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ W5.a f33713a = W5.b.a(EnumC3581f.values());
        }

        /* renamed from: j4.A$a$b */
        /* loaded from: classes4.dex */
        public /* synthetic */ class b {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f33714a;

            static {
                int[] iArr = new int[g4.c.values().length];
                try {
                    iArr[g4.c.f32286b.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[g4.c.f32287c.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[g4.c.f32285a.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f33714a = iArr;
            }
        }

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set invoke(String str) {
            int hashCode;
            int i8 = b.f33714a[C3158A.this.f33710t.ordinal()];
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 == 3) {
                        if (str != null && ((hashCode = str.hashCode()) == 2142 ? str.equals("CA") : !(hashCode == 2267 ? !str.equals("GB") : !(hashCode == 2718 && str.equals("US"))))) {
                            W5.a aVar = C0774a.f33713a;
                            ArrayList arrayList = new ArrayList();
                            for (Object obj : aVar) {
                                EnumC3581f enumC3581f = (EnumC3581f) obj;
                                if (enumC3581f != EnumC3581f.f36281i && enumC3581f != EnumC3581f.f36284l) {
                                    arrayList.add(obj);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(AbstractC1435t.x(arrayList, 10));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(((EnumC3581f) it.next()).e());
                            }
                            return AbstractC1435t.b1(arrayList2);
                        }
                        W5.a aVar2 = C0774a.f33713a;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj2 : aVar2) {
                            if (((EnumC3581f) obj2) != EnumC3581f.f36284l) {
                                arrayList3.add(obj2);
                            }
                        }
                        ArrayList arrayList4 = new ArrayList(AbstractC1435t.x(arrayList3, 10));
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            arrayList4.add(((EnumC3581f) it2.next()).e());
                        }
                        return AbstractC1435t.b1(arrayList4);
                    }
                    throw new Q5.p();
                }
                return R5.a0.f();
            }
            W5.a aVar3 = C0774a.f33713a;
            ArrayList arrayList5 = new ArrayList(AbstractC1435t.x(aVar3, 10));
            Iterator<E> it3 = aVar3.iterator();
            while (it3.hasNext()) {
                arrayList5.add(((EnumC3581f) it3.next()).e());
            }
            return AbstractC1435t.b1(arrayList5);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C3158A(r4.G r14, java.util.Map r15, java.util.Set r16, r4.C3925y r17, r4.e0 r18, java.util.Map r19, g4.c r20, int r21, kotlin.jvm.internal.AbstractC3284p r22) {
        /*
            r13 = this;
            r0 = r21 & 2
            if (r0 == 0) goto La
            java.util.Map r0 = R5.Q.h()
            r3 = r0
            goto Lb
        La:
            r3 = r15
        Lb:
            r0 = r21 & 4
            if (r0 == 0) goto L14
            java.util.Set r0 = R5.a0.f()
            goto L16
        L14:
            r0 = r16
        L16:
            r1 = r21 & 8
            if (r1 == 0) goto L3c
            r4.y r1 = new r4.y
            r4.t r2 = new r4.t
            r11 = 62
            r12 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r4 = r2
            r5 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r4.G$b r4 = r4.G.Companion
            r4.G r4 = r4.l()
            java.lang.Object r4 = r3.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            r1.<init>(r2, r4)
            r5 = r1
            goto L3e
        L3c:
            r5 = r17
        L3e:
            r1 = r21 & 64
            if (r1 == 0) goto L46
            g4.c r1 = g4.c.f32285a
            r8 = r1
            goto L48
        L46:
            r8 = r20
        L48:
            r1 = r13
            r2 = r14
            r4 = r0
            r6 = r18
            r7 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.C3158A.<init>(r4.G, java.util.Map, java.util.Set, r4.y, r4.e0, java.util.Map, g4.c, int, kotlin.jvm.internal.p):void");
    }

    public final InterfaceC3813L w() {
        return this.f33711u;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3158A(r4.G identifier, Map rawValuesMap, Set countryCodes, C3925y countryDropdownFieldController, r4.e0 e0Var, Map map, g4.c collectionMode) {
        super(identifier, rawValuesMap, new AbstractC3910i.a(null, 1, null), countryCodes, countryDropdownFieldController, e0Var, map, null, false, 384, null);
        AbstractC3292y.i(identifier, "identifier");
        AbstractC3292y.i(rawValuesMap, "rawValuesMap");
        AbstractC3292y.i(countryCodes, "countryCodes");
        AbstractC3292y.i(countryDropdownFieldController, "countryDropdownFieldController");
        AbstractC3292y.i(collectionMode, "collectionMode");
        this.f33710t = collectionMode;
        this.f33711u = A4.g.m(countryDropdownFieldController.y(), new a());
    }
}
