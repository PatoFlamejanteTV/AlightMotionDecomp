package y7;

import W6.C1488n;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;
import y7.g;
import y7.i;
import y7.j;

/* renamed from: y7.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4250a implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private transient k f41182a;

    /* renamed from: b, reason: collision with root package name */
    private final int f41183b;

    /* renamed from: c, reason: collision with root package name */
    private final List f41184c;

    /* renamed from: d, reason: collision with root package name */
    private int f41185d;

    /* renamed from: e, reason: collision with root package name */
    private u f41186e;

    /* renamed from: f, reason: collision with root package name */
    private List f41187f;

    /* renamed from: g, reason: collision with root package name */
    private Map f41188g;

    /* renamed from: h, reason: collision with root package name */
    private Stack f41189h;

    /* renamed from: i, reason: collision with root package name */
    private Map f41190i;

    /* renamed from: j, reason: collision with root package name */
    private int f41191j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f41192k;

    /* renamed from: l, reason: collision with root package name */
    private transient int f41193l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4250a(C4250a c4250a) {
        this.f41182a = new k(c4250a.f41182a.d());
        this.f41183b = c4250a.f41183b;
        this.f41185d = c4250a.f41185d;
        this.f41186e = c4250a.f41186e;
        ArrayList arrayList = new ArrayList();
        this.f41187f = arrayList;
        arrayList.addAll(c4250a.f41187f);
        this.f41188g = new TreeMap();
        for (Integer num : c4250a.f41188g.keySet()) {
            this.f41188g.put(num, (LinkedList) ((LinkedList) c4250a.f41188g.get(num)).clone());
        }
        Stack stack = new Stack();
        this.f41189h = stack;
        stack.addAll(c4250a.f41189h);
        this.f41184c = new ArrayList();
        Iterator it = c4250a.f41184c.iterator();
        while (it.hasNext()) {
            this.f41184c.add(((C4252c) it.next()).clone());
        }
        this.f41190i = new TreeMap(c4250a.f41190i);
        this.f41191j = c4250a.f41191j;
        this.f41193l = c4250a.f41193l;
        this.f41192k = c4250a.f41192k;
    }

    private C4252c a() {
        C4252c c4252c = null;
        for (C4252c c4252c2 : this.f41184c) {
            if (!c4252c2.f() && c4252c2.g() && (c4252c == null || c4252c2.b() < c4252c.b() || (c4252c2.b() == c4252c.b() && c4252c2.c() < c4252c.c()))) {
                c4252c = c4252c2;
            }
        }
        return c4252c;
    }

    private void e(byte[] bArr, byte[] bArr2, j jVar) {
        if (jVar != null) {
            i iVar = (i) ((i.b) ((i.b) new i.b().g(jVar.b())).h(jVar.c())).l();
            g gVar = (g) ((g.b) ((g.b) new g.b().g(jVar.b())).h(jVar.c())).k();
            for (int i8 = 0; i8 < (1 << this.f41183b); i8++) {
                jVar = (j) ((j.b) ((j.b) ((j.b) new j.b().g(jVar.b())).h(jVar.c())).p(i8).n(jVar.e()).o(jVar.f()).f(jVar.a())).l();
                k kVar = this.f41182a;
                kVar.h(kVar.g(bArr2, jVar), bArr);
                n e8 = this.f41182a.e(jVar);
                iVar = (i) ((i.b) ((i.b) ((i.b) new i.b().g(iVar.b())).h(iVar.c())).n(i8).o(iVar.f()).p(iVar.g()).f(iVar.a())).l();
                u a9 = v.a(this.f41182a, e8, iVar);
                gVar = (g) ((g.b) ((g.b) ((g.b) new g.b().g(gVar.b())).h(gVar.c())).n(i8).f(gVar.a())).k();
                while (!this.f41189h.isEmpty() && ((u) this.f41189h.peek()).a() == a9.a()) {
                    int a10 = i8 / (1 << a9.a());
                    if (a10 == 1) {
                        this.f41187f.add(a9);
                    }
                    if (a10 == 3 && a9.a() < this.f41183b - this.f41185d) {
                        ((C4252c) this.f41184c.get(a9.a())).h(a9);
                    }
                    if (a10 >= 3 && (a10 & 1) == 1 && a9.a() >= this.f41183b - this.f41185d && a9.a() <= this.f41183b - 2) {
                        if (this.f41188g.get(Integer.valueOf(a9.a())) == null) {
                            LinkedList linkedList = new LinkedList();
                            linkedList.add(a9);
                            this.f41188g.put(Integer.valueOf(a9.a()), linkedList);
                        } else {
                            ((LinkedList) this.f41188g.get(Integer.valueOf(a9.a()))).add(a9);
                        }
                    }
                    g gVar2 = (g) ((g.b) ((g.b) ((g.b) new g.b().g(gVar.b())).h(gVar.c())).m(gVar.e()).n((gVar.f() - 1) / 2).f(gVar.a())).k();
                    u b9 = v.b(this.f41182a, (u) this.f41189h.pop(), a9, gVar2);
                    u uVar = new u(b9.a() + 1, b9.b());
                    gVar = (g) ((g.b) ((g.b) ((g.b) new g.b().g(gVar2.b())).h(gVar2.c())).m(gVar2.e() + 1).n(gVar2.f()).f(gVar2.a())).k();
                    a9 = uVar;
                }
                this.f41189h.push(a9);
            }
            this.f41186e = (u) this.f41189h.pop();
            return;
        }
        throw new NullPointerException("otsHashAddress == null");
    }

    private void f(byte[] bArr, byte[] bArr2, j jVar) {
        List list;
        Object removeFirst;
        if (jVar != null) {
            if (!this.f41192k) {
                int i8 = this.f41191j;
                if (i8 <= this.f41193l - 1) {
                    int b9 = AbstractC4249A.b(i8, this.f41183b);
                    if (((this.f41191j >> (b9 + 1)) & 1) == 0 && b9 < this.f41183b - 1) {
                        this.f41190i.put(Integer.valueOf(b9), this.f41187f.get(b9));
                    }
                    i iVar = (i) ((i.b) ((i.b) new i.b().g(jVar.b())).h(jVar.c())).l();
                    g gVar = (g) ((g.b) ((g.b) new g.b().g(jVar.b())).h(jVar.c())).k();
                    if (b9 == 0) {
                        jVar = (j) ((j.b) ((j.b) ((j.b) new j.b().g(jVar.b())).h(jVar.c())).p(this.f41191j).n(jVar.e()).o(jVar.f()).f(jVar.a())).l();
                        k kVar = this.f41182a;
                        kVar.h(kVar.g(bArr2, jVar), bArr);
                        this.f41187f.set(0, v.a(this.f41182a, this.f41182a.e(jVar), (i) ((i.b) ((i.b) ((i.b) new i.b().g(iVar.b())).h(iVar.c())).n(this.f41191j).o(iVar.f()).p(iVar.g()).f(iVar.a())).l()));
                    } else {
                        int i9 = b9 - 1;
                        g gVar2 = (g) ((g.b) ((g.b) ((g.b) new g.b().g(gVar.b())).h(gVar.c())).m(i9).n(this.f41191j >> b9).f(gVar.a())).k();
                        k kVar2 = this.f41182a;
                        kVar2.h(kVar2.g(bArr2, jVar), bArr);
                        u b10 = v.b(this.f41182a, (u) this.f41187f.get(i9), (u) this.f41190i.get(Integer.valueOf(i9)), gVar2);
                        this.f41187f.set(b9, new u(b10.a() + 1, b10.b()));
                        this.f41190i.remove(Integer.valueOf(i9));
                        for (int i10 = 0; i10 < b9; i10++) {
                            if (i10 < this.f41183b - this.f41185d) {
                                list = this.f41187f;
                                removeFirst = ((C4252c) this.f41184c.get(i10)).d();
                            } else {
                                list = this.f41187f;
                                removeFirst = ((LinkedList) this.f41188g.get(Integer.valueOf(i10))).removeFirst();
                            }
                            list.set(i10, removeFirst);
                        }
                        int min = Math.min(b9, this.f41183b - this.f41185d);
                        for (int i11 = 0; i11 < min; i11++) {
                            int i12 = this.f41191j + 1 + ((1 << i11) * 3);
                            if (i12 < (1 << this.f41183b)) {
                                ((C4252c) this.f41184c.get(i11)).e(i12);
                            }
                        }
                    }
                    for (int i13 = 0; i13 < ((this.f41183b - this.f41185d) >> 1); i13++) {
                        C4252c a9 = a();
                        if (a9 != null) {
                            a9.i(this.f41189h, this.f41182a, bArr, bArr2, jVar);
                        }
                    }
                    this.f41191j++;
                    return;
                }
                throw new IllegalStateException("index out of bounds");
            }
            throw new IllegalStateException("index already used");
        }
        throw new NullPointerException("otsHashAddress == null");
    }

    private void g() {
        if (this.f41187f != null) {
            if (this.f41188g != null) {
                if (this.f41189h != null) {
                    if (this.f41184c != null) {
                        if (this.f41190i != null) {
                            if (AbstractC4249A.l(this.f41183b, this.f41191j)) {
                                return;
                            } else {
                                throw new IllegalStateException("index in BDS state out of bounds");
                            }
                        }
                        throw new IllegalStateException("keep == null");
                    }
                    throw new IllegalStateException("treeHashInstances == null");
                }
                throw new IllegalStateException("stack == null");
            }
            throw new IllegalStateException("retain == null");
        }
        throw new IllegalStateException("authenticationPath == null");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int b() {
        return this.f41191j;
    }

    public int c() {
        return this.f41193l;
    }

    public C4250a d(byte[] bArr, byte[] bArr2, j jVar) {
        return new C4250a(this, bArr, bArr2, jVar);
    }

    public C4250a h(C1488n c1488n) {
        return new C4250a(this, c1488n);
    }

    private C4250a(C4250a c4250a, C1488n c1488n) {
        this.f41182a = new k(new m(c1488n));
        this.f41183b = c4250a.f41183b;
        this.f41185d = c4250a.f41185d;
        this.f41186e = c4250a.f41186e;
        ArrayList arrayList = new ArrayList();
        this.f41187f = arrayList;
        arrayList.addAll(c4250a.f41187f);
        this.f41188g = new TreeMap();
        for (Integer num : c4250a.f41188g.keySet()) {
            this.f41188g.put(num, (LinkedList) ((LinkedList) c4250a.f41188g.get(num)).clone());
        }
        Stack stack = new Stack();
        this.f41189h = stack;
        stack.addAll(c4250a.f41189h);
        this.f41184c = new ArrayList();
        Iterator it = c4250a.f41184c.iterator();
        while (it.hasNext()) {
            this.f41184c.add(((C4252c) it.next()).clone());
        }
        this.f41190i = new TreeMap(c4250a.f41190i);
        this.f41191j = c4250a.f41191j;
        this.f41193l = c4250a.f41193l;
        this.f41192k = c4250a.f41192k;
        g();
    }

    private C4250a(C4250a c4250a, byte[] bArr, byte[] bArr2, j jVar) {
        this.f41182a = new k(c4250a.f41182a.d());
        this.f41183b = c4250a.f41183b;
        this.f41185d = c4250a.f41185d;
        this.f41186e = c4250a.f41186e;
        ArrayList arrayList = new ArrayList();
        this.f41187f = arrayList;
        arrayList.addAll(c4250a.f41187f);
        this.f41188g = new TreeMap();
        for (Integer num : c4250a.f41188g.keySet()) {
            this.f41188g.put(num, (LinkedList) ((LinkedList) c4250a.f41188g.get(num)).clone());
        }
        Stack stack = new Stack();
        this.f41189h = stack;
        stack.addAll(c4250a.f41189h);
        this.f41184c = new ArrayList();
        Iterator it = c4250a.f41184c.iterator();
        while (it.hasNext()) {
            this.f41184c.add(((C4252c) it.next()).clone());
        }
        this.f41190i = new TreeMap(c4250a.f41190i);
        this.f41191j = c4250a.f41191j;
        this.f41193l = c4250a.f41193l;
        this.f41192k = false;
        f(bArr, bArr2, jVar);
    }

    private C4250a(k kVar, int i8, int i9, int i10) {
        this.f41182a = kVar;
        this.f41183b = i8;
        this.f41193l = i10;
        this.f41185d = i9;
        if (i9 <= i8 && i9 >= 2) {
            int i11 = i8 - i9;
            if (i11 % 2 == 0) {
                this.f41187f = new ArrayList();
                this.f41188g = new TreeMap();
                this.f41189h = new Stack();
                this.f41184c = new ArrayList();
                for (int i12 = 0; i12 < i11; i12++) {
                    this.f41184c.add(new C4252c(i12));
                }
                this.f41190i = new TreeMap();
                this.f41191j = 0;
                this.f41192k = false;
                return;
            }
        }
        throw new IllegalArgumentException("illegal value for BDS parameter k");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4250a(x xVar, int i8, int i9) {
        this(xVar.i(), xVar.b(), xVar.c(), i9);
        this.f41193l = i8;
        this.f41191j = i9;
        this.f41192k = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4250a(x xVar, byte[] bArr, byte[] bArr2, j jVar) {
        this(xVar.i(), xVar.b(), xVar.c(), (1 << xVar.b()) - 1);
        e(bArr, bArr2, jVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4250a(x xVar, byte[] bArr, byte[] bArr2, j jVar, int i8) {
        this(xVar.i(), xVar.b(), xVar.c(), (1 << xVar.b()) - 1);
        e(bArr, bArr2, jVar);
        while (this.f41191j < i8) {
            f(bArr, bArr2, jVar);
            this.f41192k = false;
        }
    }
}
