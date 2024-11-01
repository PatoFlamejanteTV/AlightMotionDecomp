package l6;

import c6.InterfaceC2072n;
import d6.InterfaceC2767a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import k6.InterfaceC3255g;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: l6.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3339e implements InterfaceC3255g {

    /* renamed from: a, reason: collision with root package name */
    private final CharSequence f34761a;

    /* renamed from: b, reason: collision with root package name */
    private final int f34762b;

    /* renamed from: c, reason: collision with root package name */
    private final int f34763c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC2072n f34764d;

    /* renamed from: l6.e$a */
    /* loaded from: classes5.dex */
    public static final class a implements Iterator, InterfaceC2767a {

        /* renamed from: a, reason: collision with root package name */
        private int f34765a = -1;

        /* renamed from: b, reason: collision with root package name */
        private int f34766b;

        /* renamed from: c, reason: collision with root package name */
        private int f34767c;

        /* renamed from: d, reason: collision with root package name */
        private i6.i f34768d;

        /* renamed from: e, reason: collision with root package name */
        private int f34769e;

        a() {
            int k8 = i6.m.k(C3339e.this.f34762b, 0, C3339e.this.f34761a.length());
            this.f34766b = k8;
            this.f34767c = k8;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:            if (r0 < r6.f34770f.f34763c) goto L9;     */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void a() {
            /*
                r6 = this;
                int r0 = r6.f34767c
                r1 = 0
                if (r0 >= 0) goto Lc
                r6.f34765a = r1
                r0 = 0
                r6.f34768d = r0
                goto L9e
            Lc:
                l6.e r0 = l6.C3339e.this
                int r0 = l6.C3339e.d(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L23
                int r0 = r6.f34769e
                int r0 = r0 + r3
                r6.f34769e = r0
                l6.e r4 = l6.C3339e.this
                int r4 = l6.C3339e.d(r4)
                if (r0 >= r4) goto L31
            L23:
                int r0 = r6.f34767c
                l6.e r4 = l6.C3339e.this
                java.lang.CharSequence r4 = l6.C3339e.c(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L47
            L31:
                i6.i r0 = new i6.i
                int r1 = r6.f34766b
                l6.e r4 = l6.C3339e.this
                java.lang.CharSequence r4 = l6.C3339e.c(r4)
                int r4 = l6.n.L(r4)
                r0.<init>(r1, r4)
                r6.f34768d = r0
                r6.f34767c = r2
                goto L9c
            L47:
                l6.e r0 = l6.C3339e.this
                c6.n r0 = l6.C3339e.b(r0)
                l6.e r4 = l6.C3339e.this
                java.lang.CharSequence r4 = l6.C3339e.c(r4)
                int r5 = r6.f34767c
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                Q5.r r0 = (Q5.r) r0
                if (r0 != 0) goto L77
                i6.i r0 = new i6.i
                int r1 = r6.f34766b
                l6.e r4 = l6.C3339e.this
                java.lang.CharSequence r4 = l6.C3339e.c(r4)
                int r4 = l6.n.L(r4)
                r0.<init>(r1, r4)
                r6.f34768d = r0
                r6.f34767c = r2
                goto L9c
            L77:
                java.lang.Object r2 = r0.a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f34766b
                i6.i r4 = i6.m.s(r4, r2)
                r6.f34768d = r4
                int r2 = r2 + r0
                r6.f34766b = r2
                if (r0 != 0) goto L99
                r1 = 1
            L99:
                int r2 = r2 + r1
                r6.f34767c = r2
            L9c:
                r6.f34765a = r3
            L9e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: l6.C3339e.a.a():void");
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i6.i next() {
            if (this.f34765a == -1) {
                a();
            }
            if (this.f34765a != 0) {
                i6.i iVar = this.f34768d;
                AbstractC3292y.g(iVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f34768d = null;
                this.f34765a = -1;
                return iVar;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f34765a == -1) {
                a();
            }
            if (this.f34765a == 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C3339e(CharSequence input, int i8, int i9, InterfaceC2072n getNextMatch) {
        AbstractC3292y.i(input, "input");
        AbstractC3292y.i(getNextMatch, "getNextMatch");
        this.f34761a = input;
        this.f34762b = i8;
        this.f34763c = i9;
        this.f34764d = getNextMatch;
    }

    @Override // k6.InterfaceC3255g
    public Iterator iterator() {
        return new a();
    }
}
