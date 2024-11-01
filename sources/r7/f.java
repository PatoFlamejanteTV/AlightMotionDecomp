package r7;

import I7.h;
import I7.i;
import I7.k;

/* loaded from: classes5.dex */
public class f extends d {

    /* renamed from: b, reason: collision with root package name */
    private int f38883b;

    /* renamed from: c, reason: collision with root package name */
    private int f38884c;

    /* renamed from: d, reason: collision with root package name */
    private I7.b f38885d;

    /* renamed from: e, reason: collision with root package name */
    private i f38886e;

    /* renamed from: f, reason: collision with root package name */
    private I7.a f38887f;

    /* renamed from: g, reason: collision with root package name */
    private h f38888g;

    /* renamed from: h, reason: collision with root package name */
    private h f38889h;

    /* renamed from: i, reason: collision with root package name */
    private I7.a f38890i;

    /* renamed from: j, reason: collision with root package name */
    private i[] f38891j;

    public f(int i8, int i9, I7.b bVar, i iVar, h hVar, h hVar2, I7.a aVar) {
        super(true, null);
        this.f38884c = i9;
        this.f38883b = i8;
        this.f38885d = bVar;
        this.f38886e = iVar;
        this.f38887f = aVar;
        this.f38888g = hVar;
        this.f38889h = hVar2;
        this.f38890i = I7.c.a(bVar, iVar);
        this.f38891j = new k(bVar, iVar).c();
    }

    public I7.b a() {
        return this.f38885d;
    }

    public i b() {
        return this.f38886e;
    }

    public int c() {
        return this.f38884c;
    }

    public int d() {
        return this.f38883b;
    }

    public h e() {
        return this.f38888g;
    }

    public h f() {
        return this.f38889h;
    }

    public I7.a g() {
        return this.f38887f;
    }
}
