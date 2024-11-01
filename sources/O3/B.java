package O3;

import com.stripe.android.model.o;
import g3.EnumC2906e;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public abstract class B {

    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7145a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f7146b;

        static {
            int[] iArr = new int[o.p.values().length];
            try {
                iArr[o.p.f25755i.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.p.f25759m.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o.p.f25745O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f7145a = iArr;
            int[] iArr2 = new int[EnumC2906e.values().length];
            try {
                iArr2[EnumC2906e.f32117o.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC2906e.f32119q.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC2906e.f32120r.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EnumC2906e.f32121s.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EnumC2906e.f32122t.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[EnumC2906e.f32118p.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[EnumC2906e.f32123u.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[EnumC2906e.f32124v.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[EnumC2906e.f32125w.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            f7146b = iArr2;
        }
    }

    public static final C2.c a(String str) {
        if (str == null) {
            return null;
        }
        return C2.d.g(v3.w.f40597U, new Object[]{str}, null, 4, null);
    }

    public static final int b(EnumC2906e enumC2906e) {
        AbstractC3292y.i(enumC2906e, "<this>");
        switch (a.f7146b[enumC2906e.ordinal()]) {
            case 1:
                return v3.t.f40562q;
            case 2:
                return v3.t.f40554i;
            case 3:
                return v3.t.f40557l;
            case 4:
                return v3.t.f40558m;
            case 5:
                return v3.t.f40556k;
            case 6:
                return v3.t.f40559n;
            case 7:
                return v3.t.f40560o;
            case 8:
                return v3.t.f40555j;
            case 9:
                return v3.t.f40561p;
            default:
                throw new Q5.p();
        }
    }

    public static final int c(EnumC2906e enumC2906e) {
        AbstractC3292y.i(enumC2906e, "<this>");
        switch (a.f7146b[enumC2906e.ordinal()]) {
            case 1:
                return D4.a.f1339t;
            case 2:
                return D4.a.f1321b;
            case 3:
                return D4.a.f1329j;
            case 4:
                return D4.a.f1332m;
            case 5:
                return D4.a.f1327h;
            case 6:
                return D4.a.f1334o;
            case 7:
                return D4.a.f1336q;
            case 8:
                return D4.a.f1323d;
            case 9:
                return v3.t.f40561p;
            default:
                throw new Q5.p();
        }
    }

    public static final C2.c d(com.stripe.android.model.o oVar) {
        int i8;
        String str;
        String str2;
        AbstractC3292y.i(oVar, "<this>");
        o.p pVar = oVar.f25635e;
        if (pVar == null) {
            i8 = -1;
        } else {
            i8 = a.f7145a[pVar.ordinal()];
        }
        String str3 = null;
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    return null;
                }
                int i9 = v3.w.f40597U;
                o.r rVar = oVar.f25648r;
                if (rVar != null) {
                    str2 = rVar.f25783e;
                } else {
                    str2 = null;
                }
                return C2.d.g(i9, new Object[]{str2}, null, 4, null);
            }
            int i10 = v3.w.f40597U;
            o.n nVar = oVar.f25642l;
            if (nVar != null) {
                str = nVar.f25729e;
            } else {
                str = null;
            }
            return C2.d.g(i10, new Object[]{str}, null, 4, null);
        }
        o.g gVar = oVar.f25638h;
        if (gVar != null) {
            str3 = gVar.f25705h;
        }
        return a(str3);
    }

    public static final Integer e(com.stripe.android.model.o oVar) {
        int i8;
        AbstractC3292y.i(oVar, "<this>");
        o.p pVar = oVar.f25635e;
        if (pVar == null) {
            i8 = -1;
        } else {
            i8 = a.f7145a[pVar.ordinal()];
        }
        if (i8 == 3) {
            return Integer.valueOf(v3.t.f40553h);
        }
        return null;
    }

    public static final int f(com.stripe.android.model.o oVar, boolean z8) {
        int i8;
        String str;
        int b9;
        o.r rVar;
        String str2;
        AbstractC3292y.i(oVar, "<this>");
        o.p pVar = oVar.f25635e;
        if (pVar == null) {
            i8 = -1;
        } else {
            i8 = a.f7145a[pVar.ordinal()];
        }
        Integer num = null;
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3 && (rVar = oVar.f25648r) != null && (str2 = rVar.f25781c) != null) {
                    num = Integer.valueOf(G3.b.f2829a.a(str2));
                }
            } else {
                num = Integer.valueOf(v3.t.f40569x);
            }
        } else {
            EnumC2906e.a aVar = EnumC2906e.f32115m;
            o.g gVar = oVar.f25638h;
            if (gVar != null) {
                str = gVar.f25709l;
            } else {
                str = null;
            }
            EnumC2906e b10 = aVar.b(str);
            if (b10 == EnumC2906e.f32125w) {
                b10 = null;
            }
            if (b10 == null) {
                o.g gVar2 = oVar.f25638h;
                if (gVar2 != null) {
                    b10 = gVar2.f25698a;
                } else {
                    b10 = null;
                }
            }
            if (z8) {
                if (b10 != null) {
                    b9 = c(b10);
                    num = Integer.valueOf(b9);
                }
            } else if (b10 != null) {
                b9 = b(b10);
                num = Integer.valueOf(b9);
            }
        }
        if (num != null) {
            return num.intValue();
        }
        return v3.t.f40561p;
    }

    public static /* synthetic */ int g(com.stripe.android.model.o oVar, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        return f(oVar, z8);
    }
}
