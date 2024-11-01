package y7;

import java.io.Serializable;
import java.util.Stack;
import y7.g;
import y7.i;
import y7.j;

/* renamed from: y7.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
class C4252c implements Serializable, Cloneable {

    /* renamed from: a, reason: collision with root package name */
    private u f41196a;

    /* renamed from: b, reason: collision with root package name */
    private final int f41197b;

    /* renamed from: c, reason: collision with root package name */
    private int f41198c;

    /* renamed from: d, reason: collision with root package name */
    private int f41199d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f41200e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f41201f = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4252c(int i8) {
        this.f41197b = i8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4252c clone() {
        C4252c c4252c = new C4252c(this.f41197b);
        c4252c.f41196a = this.f41196a;
        c4252c.f41198c = this.f41198c;
        c4252c.f41199d = this.f41199d;
        c4252c.f41200e = this.f41200e;
        c4252c.f41201f = this.f41201f;
        return c4252c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        if (this.f41200e && !this.f41201f) {
            return this.f41198c;
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.f41199d;
    }

    public u d() {
        return this.f41196a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(int i8) {
        this.f41196a = null;
        this.f41198c = this.f41197b;
        this.f41199d = i8;
        this.f41200e = true;
        this.f41201f = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f() {
        return this.f41201f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g() {
        return this.f41200e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(u uVar) {
        this.f41196a = uVar;
        int a9 = uVar.a();
        this.f41198c = a9;
        if (a9 == this.f41197b) {
            this.f41201f = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(Stack stack, k kVar, byte[] bArr, byte[] bArr2, j jVar) {
        if (jVar != null) {
            if (!this.f41201f && this.f41200e) {
                j jVar2 = (j) ((j.b) ((j.b) ((j.b) new j.b().g(jVar.b())).h(jVar.c())).p(this.f41199d).n(jVar.e()).o(jVar.f()).f(jVar.a())).l();
                i iVar = (i) ((i.b) ((i.b) new i.b().g(jVar2.b())).h(jVar2.c())).n(this.f41199d).l();
                g gVar = (g) ((g.b) ((g.b) new g.b().g(jVar2.b())).h(jVar2.c())).n(this.f41199d).k();
                kVar.h(kVar.g(bArr2, jVar2), bArr);
                u a9 = v.a(kVar, kVar.e(jVar2), iVar);
                while (!stack.isEmpty() && ((u) stack.peek()).a() == a9.a() && ((u) stack.peek()).a() != this.f41197b) {
                    g gVar2 = (g) ((g.b) ((g.b) ((g.b) new g.b().g(gVar.b())).h(gVar.c())).m(gVar.e()).n((gVar.f() - 1) / 2).f(gVar.a())).k();
                    u b9 = v.b(kVar, (u) stack.pop(), a9, gVar2);
                    u uVar = new u(b9.a() + 1, b9.b());
                    gVar = (g) ((g.b) ((g.b) ((g.b) new g.b().g(gVar2.b())).h(gVar2.c())).m(gVar2.e() + 1).n(gVar2.f()).f(gVar2.a())).k();
                    a9 = uVar;
                }
                u uVar2 = this.f41196a;
                if (uVar2 == null) {
                    this.f41196a = a9;
                } else if (uVar2.a() == a9.a()) {
                    g gVar3 = (g) ((g.b) ((g.b) ((g.b) new g.b().g(gVar.b())).h(gVar.c())).m(gVar.e()).n((gVar.f() - 1) / 2).f(gVar.a())).k();
                    a9 = new u(this.f41196a.a() + 1, v.b(kVar, this.f41196a, a9, gVar3).b());
                    this.f41196a = a9;
                } else {
                    stack.push(a9);
                }
                if (this.f41196a.a() == this.f41197b) {
                    this.f41201f = true;
                    return;
                } else {
                    this.f41198c = a9.a();
                    this.f41199d++;
                    return;
                }
            }
            throw new IllegalStateException("finished or not initialized");
        }
        throw new NullPointerException("otsHashAddress == null");
    }
}
