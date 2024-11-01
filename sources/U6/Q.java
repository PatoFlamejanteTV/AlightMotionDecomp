package U6;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class Q implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final a f10156b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final String f10157c;

    /* renamed from: a, reason: collision with root package name */
    private final C1452h f10158a;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public static /* synthetic */ Q d(a aVar, File file, boolean z8, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                z8 = false;
            }
            return aVar.a(file, z8);
        }

        public static /* synthetic */ Q e(a aVar, String str, boolean z8, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                z8 = false;
            }
            return aVar.b(str, z8);
        }

        public static /* synthetic */ Q f(a aVar, Path path, boolean z8, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                z8 = false;
            }
            return aVar.c(path, z8);
        }

        public final Q a(File file, boolean z8) {
            AbstractC3292y.i(file, "<this>");
            String file2 = file.toString();
            AbstractC3292y.h(file2, "toString()");
            return b(file2, z8);
        }

        public final Q b(String str, boolean z8) {
            AbstractC3292y.i(str, "<this>");
            return V6.d.k(str, z8);
        }

        public final Q c(Path path, boolean z8) {
            AbstractC3292y.i(path, "<this>");
            return b(path.toString(), z8);
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    static {
        String separator = File.separator;
        AbstractC3292y.h(separator, "separator");
        f10157c = separator;
    }

    public Q(C1452h bytes) {
        AbstractC3292y.i(bytes, "bytes");
        this.f10158a = bytes;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(Q other) {
        AbstractC3292y.i(other, "other");
        return b().compareTo(other.b());
    }

    public final C1452h b() {
        return this.f10158a;
    }

    public final Q c() {
        int o8;
        o8 = V6.d.o(this);
        if (o8 == -1) {
            return null;
        }
        return new Q(b().L(0, o8));
    }

    public final List d() {
        int o8;
        ArrayList arrayList = new ArrayList();
        o8 = V6.d.o(this);
        if (o8 == -1) {
            o8 = 0;
        } else if (o8 < b().J() && b().h(o8) == 92) {
            o8++;
        }
        int J8 = b().J();
        int i8 = o8;
        while (o8 < J8) {
            if (b().h(o8) == 47 || b().h(o8) == 92) {
                arrayList.add(b().L(i8, o8));
                i8 = o8 + 1;
            }
            o8++;
        }
        if (i8 < b().J()) {
            arrayList.add(b().L(i8, b().J()));
        }
        return arrayList;
    }

    public final boolean e() {
        int o8;
        o8 = V6.d.o(this);
        if (o8 != -1) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof Q) && AbstractC3292y.d(((Q) obj).b(), b())) {
            return true;
        }
        return false;
    }

    public final String f() {
        return g().P();
    }

    public final C1452h g() {
        int l8;
        l8 = V6.d.l(this);
        if (l8 != -1) {
            return C1452h.M(b(), l8 + 1, 0, 2, null);
        }
        if (o() != null && b().J() == 2) {
            return C1452h.f10222e;
        }
        return b();
    }

    public final Q h() {
        return f10156b.b(toString(), true);
    }

    public int hashCode() {
        return b().hashCode();
    }

    public final Q i() {
        C1452h c1452h;
        C1452h c1452h2;
        C1452h c1452h3;
        boolean n8;
        int l8;
        Q q8;
        C1452h c1452h4;
        C1452h c1452h5;
        C1452h b9 = b();
        c1452h = V6.d.f10671d;
        if (AbstractC3292y.d(b9, c1452h)) {
            return null;
        }
        C1452h b10 = b();
        c1452h2 = V6.d.f10668a;
        if (AbstractC3292y.d(b10, c1452h2)) {
            return null;
        }
        C1452h b11 = b();
        c1452h3 = V6.d.f10669b;
        if (!AbstractC3292y.d(b11, c1452h3)) {
            n8 = V6.d.n(this);
            if (!n8) {
                l8 = V6.d.l(this);
                if (l8 == 2 && o() != null) {
                    if (b().J() == 3) {
                        return null;
                    }
                    q8 = new Q(C1452h.M(b(), 0, 3, 1, null));
                } else {
                    if (l8 == 1) {
                        C1452h b12 = b();
                        c1452h5 = V6.d.f10669b;
                        if (b12.K(c1452h5)) {
                            return null;
                        }
                    }
                    if (l8 == -1 && o() != null) {
                        if (b().J() == 2) {
                            return null;
                        }
                        q8 = new Q(C1452h.M(b(), 0, 2, 1, null));
                    } else {
                        if (l8 == -1) {
                            c1452h4 = V6.d.f10671d;
                            return new Q(c1452h4);
                        }
                        if (l8 == 0) {
                            q8 = new Q(C1452h.M(b(), 0, 1, 1, null));
                        } else {
                            return new Q(C1452h.M(b(), 0, l8, 1, null));
                        }
                    }
                }
                return q8;
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007b, code lost:            r9 = V6.d.m(r8);     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final U6.Q j(U6.Q r9) {
        /*
            r8 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.AbstractC3292y.i(r9, r0)
            U6.Q r0 = r8.c()
            U6.Q r1 = r9.c()
            boolean r0 = kotlin.jvm.internal.AbstractC3292y.d(r0, r1)
            java.lang.String r1 = " and "
            if (r0 == 0) goto Ld6
            java.util.List r0 = r8.d()
            java.util.List r2 = r9.d()
            int r3 = r0.size()
            int r4 = r2.size()
            int r3 = java.lang.Math.min(r3, r4)
            r4 = 0
            r5 = 0
        L2b:
            if (r5 >= r3) goto L3e
            java.lang.Object r6 = r0.get(r5)
            java.lang.Object r7 = r2.get(r5)
            boolean r6 = kotlin.jvm.internal.AbstractC3292y.d(r6, r7)
            if (r6 == 0) goto L3e
            int r5 = r5 + 1
            goto L2b
        L3e:
            if (r5 != r3) goto L5d
            U6.h r3 = r8.b()
            int r3 = r3.J()
            U6.h r6 = r9.b()
            int r6 = r6.J()
            if (r3 != r6) goto L5d
            U6.Q$a r9 = U6.Q.f10156b
            java.lang.String r0 = "."
            r1 = 0
            r2 = 1
            U6.Q r9 = U6.Q.a.e(r9, r0, r4, r2, r1)
            goto Lb4
        L5d:
            int r3 = r2.size()
            java.util.List r3 = r2.subList(r5, r3)
            U6.h r6 = V6.d.c()
            int r3 = r3.indexOf(r6)
            r6 = -1
            if (r3 != r6) goto Lb5
            U6.e r1 = new U6.e
            r1.<init>()
            U6.h r9 = V6.d.f(r9)
            if (r9 != 0) goto L87
            U6.h r9 = V6.d.f(r8)
            if (r9 != 0) goto L87
            java.lang.String r9 = U6.Q.f10157c
            U6.h r9 = V6.d.i(r9)
        L87:
            int r2 = r2.size()
            r3 = r5
        L8c:
            if (r3 >= r2) goto L9b
            U6.h r6 = V6.d.c()
            r1.I(r6)
            r1.I(r9)
            int r3 = r3 + 1
            goto L8c
        L9b:
            int r2 = r0.size()
        L9f:
            if (r5 >= r2) goto Lb0
            java.lang.Object r3 = r0.get(r5)
            U6.h r3 = (U6.C1452h) r3
            r1.I(r3)
            r1.I(r9)
            int r5 = r5 + 1
            goto L9f
        Lb0:
            U6.Q r9 = V6.d.q(r1, r4)
        Lb4:
            return r9
        Lb5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Impossible relative path to resolve: "
            r0.append(r2)
            r0.append(r8)
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r0.<init>(r9)
            throw r0
        Ld6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Paths of different roots cannot be relative to each other: "
            r0.append(r2)
            r0.append(r8)
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r0.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: U6.Q.j(U6.Q):U6.Q");
    }

    public final Q k(Q child, boolean z8) {
        AbstractC3292y.i(child, "child");
        return V6.d.j(this, child, z8);
    }

    public final Q l(String child) {
        AbstractC3292y.i(child, "child");
        return V6.d.j(this, V6.d.q(new C1449e().writeUtf8(child), false), false);
    }

    public final File m() {
        return new File(toString());
    }

    public final Path n() {
        Path path;
        path = Paths.get(toString(), new String[0]);
        AbstractC3292y.h(path, "get(toString())");
        return path;
    }

    public final Character o() {
        C1452h c1452h;
        C1452h b9 = b();
        c1452h = V6.d.f10668a;
        if (C1452h.q(b9, c1452h, 0, 2, null) != -1 || b().J() < 2 || b().h(1) != 58) {
            return null;
        }
        char h8 = (char) b().h(0);
        if (('a' > h8 || h8 >= '{') && ('A' > h8 || h8 >= '[')) {
            return null;
        }
        return Character.valueOf(h8);
    }

    public String toString() {
        return b().P();
    }
}
