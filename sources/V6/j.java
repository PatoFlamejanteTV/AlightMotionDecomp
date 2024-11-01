package V6;

import Q5.I;
import Q5.x;
import R5.AbstractC1435t;
import U6.AbstractC1453i;
import U6.AbstractC1455k;
import U6.C1454j;
import U6.InterfaceC1451g;
import U6.L;
import U6.Q;
import U6.b0;
import a6.AbstractC1677b;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import c6.InterfaceC2072n;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.S;
import kotlin.jvm.internal.T;
import l6.AbstractC3335a;
import l6.n;

/* loaded from: classes5.dex */
public abstract class j {

    /* loaded from: classes5.dex */
    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return T5.a.a(((i) obj).a(), ((i) obj2).a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ O f10694a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f10695b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ S f10696c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC1451g f10697d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ S f10698e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ S f10699f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(O o8, long j8, S s8, InterfaceC1451g interfaceC1451g, S s9, S s10) {
            super(2);
            this.f10694a = o8;
            this.f10695b = j8;
            this.f10696c = s8;
            this.f10697d = interfaceC1451g;
            this.f10698e = s9;
            this.f10699f = s10;
        }

        public final void a(int i8, long j8) {
            long j9;
            if (i8 == 1) {
                O o8 = this.f10694a;
                if (!o8.f34569a) {
                    o8.f34569a = true;
                    if (j8 >= this.f10695b) {
                        S s8 = this.f10696c;
                        long j10 = s8.f34572a;
                        if (j10 == 4294967295L) {
                            j10 = this.f10697d.readLongLe();
                        }
                        s8.f34572a = j10;
                        S s9 = this.f10698e;
                        long j11 = 0;
                        if (s9.f34572a == 4294967295L) {
                            j9 = this.f10697d.readLongLe();
                        } else {
                            j9 = 0;
                        }
                        s9.f34572a = j9;
                        S s10 = this.f10699f;
                        if (s10.f34572a == 4294967295L) {
                            j11 = this.f10697d.readLongLe();
                        }
                        s10.f34572a = j11;
                        return;
                    }
                    throw new IOException("bad zip: zip64 extra too short");
                }
                throw new IOException("bad zip: zip64 extra repeated");
            }
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a(((Number) obj).intValue(), ((Number) obj2).longValue());
            return I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1451g f10700a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ T f10701b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ T f10702c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ T f10703d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC1451g interfaceC1451g, T t8, T t9, T t10) {
            super(2);
            this.f10700a = interfaceC1451g;
            this.f10701b = t8;
            this.f10702c = t9;
            this.f10703d = t10;
        }

        public final void a(int i8, long j8) {
            boolean z8;
            boolean z9;
            if (i8 == 21589) {
                long j9 = 1;
                if (j8 >= 1) {
                    byte readByte = this.f10700a.readByte();
                    boolean z10 = false;
                    if ((readByte & 1) == 1) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if ((readByte & 2) == 2) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if ((readByte & 4) == 4) {
                        z10 = true;
                    }
                    InterfaceC1451g interfaceC1451g = this.f10700a;
                    if (z8) {
                        j9 = 5;
                    }
                    if (z9) {
                        j9 += 4;
                    }
                    if (z10) {
                        j9 += 4;
                    }
                    if (j8 >= j9) {
                        if (z8) {
                            this.f10701b.f34573a = Long.valueOf(interfaceC1451g.readIntLe() * 1000);
                        }
                        if (z9) {
                            this.f10702c.f34573a = Long.valueOf(this.f10700a.readIntLe() * 1000);
                        }
                        if (z10) {
                            this.f10703d.f34573a = Long.valueOf(this.f10700a.readIntLe() * 1000);
                            return;
                        }
                        return;
                    }
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
                throw new IOException("bad zip: extended timestamp extra too short");
            }
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a(((Number) obj).intValue(), ((Number) obj2).longValue());
            return I.f8786a;
        }
    }

    private static final Map a(List list) {
        Q e8 = Q.a.e(Q.f10156b, "/", false, 1, null);
        Map m8 = R5.Q.m(x.a(e8, new i(e8, true, null, 0L, 0L, 0L, 0, null, 0L, TypedValues.PositionType.TYPE_CURVE_FIT, null)));
        for (i iVar : AbstractC1435t.P0(list, new a())) {
            if (((i) m8.put(iVar.a(), iVar)) == null) {
                while (true) {
                    Q i8 = iVar.a().i();
                    if (i8 != null) {
                        i iVar2 = (i) m8.get(i8);
                        if (iVar2 != null) {
                            iVar2.b().add(iVar.a());
                            break;
                        }
                        i iVar3 = new i(i8, true, null, 0L, 0L, 0L, 0, null, 0L, TypedValues.PositionType.TYPE_CURVE_FIT, null);
                        m8.put(i8, iVar3);
                        iVar3.b().add(iVar.a());
                        iVar = iVar3;
                    }
                }
            }
        }
        return m8;
    }

    private static final Long b(int i8, int i9) {
        if (i9 == -1) {
            return null;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(14, 0);
        gregorianCalendar.set(((i8 >> 9) & ModuleDescriptor.MODULE_VERSION) + 1980, ((i8 >> 5) & 15) - 1, i8 & 31, (i9 >> 11) & 31, (i9 >> 5) & 63, (i9 & 31) << 1);
        return Long.valueOf(gregorianCalendar.getTime().getTime());
    }

    private static final String c(int i8) {
        StringBuilder sb = new StringBuilder();
        sb.append("0x");
        String num = Integer.toString(i8, AbstractC3335a.a(16));
        AbstractC3292y.h(num, "toString(this, checkRadix(radix))");
        sb.append(num);
        return sb.toString();
    }

    /* JADX WARN: Finally extract failed */
    public static final b0 d(Q zipPath, AbstractC1455k fileSystem, Function1 predicate) {
        InterfaceC1451g d8;
        AbstractC3292y.i(zipPath, "zipPath");
        AbstractC3292y.i(fileSystem, "fileSystem");
        AbstractC3292y.i(predicate, "predicate");
        AbstractC1453i i8 = fileSystem.i(zipPath);
        try {
            long B8 = i8.B() - 22;
            if (B8 >= 0) {
                long max = Math.max(B8 - 65536, 0L);
                do {
                    InterfaceC1451g d9 = L.d(i8.E(B8));
                    try {
                        if (d9.readIntLe() == 101010256) {
                            f f8 = f(d9);
                            String readUtf8 = d9.readUtf8(f8.b());
                            d9.close();
                            long j8 = B8 - 20;
                            if (j8 > 0) {
                                InterfaceC1451g d10 = L.d(i8.E(j8));
                                try {
                                    if (d10.readIntLe() == 117853008) {
                                        int readIntLe = d10.readIntLe();
                                        long readLongLe = d10.readLongLe();
                                        if (d10.readIntLe() == 1 && readIntLe == 0) {
                                            d8 = L.d(i8.E(readLongLe));
                                            try {
                                                int readIntLe2 = d8.readIntLe();
                                                if (readIntLe2 == 101075792) {
                                                    f8 = j(d8, f8);
                                                    I i9 = I.f8786a;
                                                    AbstractC1677b.a(d8, null);
                                                } else {
                                                    throw new IOException("bad zip: expected " + c(101075792) + " but was " + c(readIntLe2));
                                                }
                                            } finally {
                                            }
                                        } else {
                                            throw new IOException("unsupported zip: spanned");
                                        }
                                    }
                                    I i10 = I.f8786a;
                                    AbstractC1677b.a(d10, null);
                                } finally {
                                }
                            }
                            ArrayList arrayList = new ArrayList();
                            d8 = L.d(i8.E(f8.a()));
                            try {
                                long c8 = f8.c();
                                for (long j9 = 0; j9 < c8; j9++) {
                                    i e8 = e(d8);
                                    if (e8.f() < f8.a()) {
                                        if (((Boolean) predicate.invoke(e8)).booleanValue()) {
                                            arrayList.add(e8);
                                        }
                                    } else {
                                        throw new IOException("bad zip: local file header offset >= central directory offset");
                                    }
                                }
                                I i11 = I.f8786a;
                                AbstractC1677b.a(d8, null);
                                b0 b0Var = new b0(zipPath, fileSystem, a(arrayList), readUtf8);
                                AbstractC1677b.a(i8, null);
                                return b0Var;
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } finally {
                                    AbstractC1677b.a(d8, th);
                                }
                            }
                        }
                        d9.close();
                        B8--;
                    } finally {
                        d9.close();
                    }
                } while (B8 >= max);
                throw new IOException("not a zip: end of central directory signature not found");
            }
            throw new IOException("not a zip: size=" + i8.B());
        } finally {
        }
    }

    public static final i e(InterfaceC1451g interfaceC1451g) {
        long j8;
        long j9;
        AbstractC3292y.i(interfaceC1451g, "<this>");
        int readIntLe = interfaceC1451g.readIntLe();
        if (readIntLe == 33639248) {
            interfaceC1451g.skip(4L);
            short readShortLe = interfaceC1451g.readShortLe();
            int i8 = readShortLe & 65535;
            if ((readShortLe & 1) == 0) {
                int readShortLe2 = interfaceC1451g.readShortLe() & 65535;
                Long b9 = b(interfaceC1451g.readShortLe() & 65535, interfaceC1451g.readShortLe() & 65535);
                long readIntLe2 = interfaceC1451g.readIntLe() & 4294967295L;
                S s8 = new S();
                s8.f34572a = interfaceC1451g.readIntLe() & 4294967295L;
                S s9 = new S();
                s9.f34572a = interfaceC1451g.readIntLe() & 4294967295L;
                int readShortLe3 = interfaceC1451g.readShortLe() & 65535;
                int readShortLe4 = interfaceC1451g.readShortLe() & 65535;
                int readShortLe5 = interfaceC1451g.readShortLe() & 65535;
                interfaceC1451g.skip(8L);
                S s10 = new S();
                s10.f34572a = interfaceC1451g.readIntLe() & 4294967295L;
                String readUtf8 = interfaceC1451g.readUtf8(readShortLe3);
                if (!n.F(readUtf8, (char) 0, false, 2, null)) {
                    if (s9.f34572a == 4294967295L) {
                        j8 = 8;
                    } else {
                        j8 = 0;
                    }
                    if (s8.f34572a == 4294967295L) {
                        j9 = j8 + 8;
                    } else {
                        j9 = j8;
                    }
                    if (s10.f34572a == 4294967295L) {
                        j9 += 8;
                    }
                    long j10 = j9;
                    O o8 = new O();
                    g(interfaceC1451g, readShortLe4, new b(o8, j10, s9, interfaceC1451g, s8, s10));
                    if (j10 > 0 && !o8.f34569a) {
                        throw new IOException("bad zip: zip64 extra required but absent");
                    }
                    return new i(Q.a.e(Q.f10156b, "/", false, 1, null).l(readUtf8), n.r(readUtf8, "/", false, 2, null), interfaceC1451g.readUtf8(readShortLe5), readIntLe2, s8.f34572a, s9.f34572a, readShortLe2, b9, s10.f34572a);
                }
                throw new IOException("bad zip: filename contains 0x00");
            }
            throw new IOException("unsupported zip: general purpose bit flag=" + c(i8));
        }
        throw new IOException("bad zip: expected " + c(33639248) + " but was " + c(readIntLe));
    }

    private static final f f(InterfaceC1451g interfaceC1451g) {
        int readShortLe = interfaceC1451g.readShortLe() & 65535;
        int readShortLe2 = interfaceC1451g.readShortLe() & 65535;
        long readShortLe3 = interfaceC1451g.readShortLe() & 65535;
        if (readShortLe3 == (interfaceC1451g.readShortLe() & 65535) && readShortLe == 0 && readShortLe2 == 0) {
            interfaceC1451g.skip(4L);
            return new f(readShortLe3, 4294967295L & interfaceC1451g.readIntLe(), interfaceC1451g.readShortLe() & 65535);
        }
        throw new IOException("unsupported zip: spanned");
    }

    private static final void g(InterfaceC1451g interfaceC1451g, int i8, InterfaceC2072n interfaceC2072n) {
        long j8 = i8;
        while (j8 != 0) {
            if (j8 >= 4) {
                int readShortLe = interfaceC1451g.readShortLe() & 65535;
                long readShortLe2 = interfaceC1451g.readShortLe() & 65535;
                long j9 = j8 - 4;
                if (j9 >= readShortLe2) {
                    interfaceC1451g.require(readShortLe2);
                    long E8 = interfaceC1451g.l().E();
                    interfaceC2072n.invoke(Integer.valueOf(readShortLe), Long.valueOf(readShortLe2));
                    long E9 = (interfaceC1451g.l().E() + readShortLe2) - E8;
                    if (E9 >= 0) {
                        if (E9 > 0) {
                            interfaceC1451g.l().skip(E9);
                        }
                        j8 = j9 - readShortLe2;
                    } else {
                        throw new IOException("unsupported zip: too many bytes processed for " + readShortLe);
                    }
                } else {
                    throw new IOException("bad zip: truncated value in extra field");
                }
            } else {
                throw new IOException("bad zip: truncated header in extra field");
            }
        }
    }

    public static final C1454j h(InterfaceC1451g interfaceC1451g, C1454j basicMetadata) {
        AbstractC3292y.i(interfaceC1451g, "<this>");
        AbstractC3292y.i(basicMetadata, "basicMetadata");
        C1454j i8 = i(interfaceC1451g, basicMetadata);
        AbstractC3292y.f(i8);
        return i8;
    }

    private static final C1454j i(InterfaceC1451g interfaceC1451g, C1454j c1454j) {
        Long l8;
        T t8 = new T();
        if (c1454j != null) {
            l8 = c1454j.a();
        } else {
            l8 = null;
        }
        t8.f34573a = l8;
        T t9 = new T();
        T t10 = new T();
        int readIntLe = interfaceC1451g.readIntLe();
        if (readIntLe == 67324752) {
            interfaceC1451g.skip(2L);
            short readShortLe = interfaceC1451g.readShortLe();
            int i8 = readShortLe & 65535;
            if ((readShortLe & 1) == 0) {
                interfaceC1451g.skip(18L);
                int readShortLe2 = interfaceC1451g.readShortLe() & 65535;
                interfaceC1451g.skip(interfaceC1451g.readShortLe() & 65535);
                if (c1454j == null) {
                    interfaceC1451g.skip(readShortLe2);
                    return null;
                }
                g(interfaceC1451g, readShortLe2, new c(interfaceC1451g, t8, t9, t10));
                return new C1454j(c1454j.d(), c1454j.c(), null, c1454j.b(), (Long) t10.f34573a, (Long) t8.f34573a, (Long) t9.f34573a, null, 128, null);
            }
            throw new IOException("unsupported zip: general purpose bit flag=" + c(i8));
        }
        throw new IOException("bad zip: expected " + c(67324752) + " but was " + c(readIntLe));
    }

    private static final f j(InterfaceC1451g interfaceC1451g, f fVar) {
        interfaceC1451g.skip(12L);
        int readIntLe = interfaceC1451g.readIntLe();
        int readIntLe2 = interfaceC1451g.readIntLe();
        long readLongLe = interfaceC1451g.readLongLe();
        if (readLongLe == interfaceC1451g.readLongLe() && readIntLe == 0 && readIntLe2 == 0) {
            interfaceC1451g.skip(8L);
            return new f(readLongLe, interfaceC1451g.readLongLe(), fVar.b());
        }
        throw new IOException("unsupported zip: spanned");
    }

    public static final void k(InterfaceC1451g interfaceC1451g) {
        AbstractC3292y.i(interfaceC1451g, "<this>");
        i(interfaceC1451g, null);
    }
}
