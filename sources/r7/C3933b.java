package r7;

import I7.h;
import I7.i;
import I7.k;

/* renamed from: r7.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3933b extends AbstractC3932a {

    /* renamed from: c, reason: collision with root package name */
    private int f38873c;

    /* renamed from: d, reason: collision with root package name */
    private int f38874d;

    /* renamed from: e, reason: collision with root package name */
    private I7.b f38875e;

    /* renamed from: f, reason: collision with root package name */
    private i f38876f;

    /* renamed from: g, reason: collision with root package name */
    private h f38877g;

    /* renamed from: h, reason: collision with root package name */
    private I7.a f38878h;

    /* renamed from: i, reason: collision with root package name */
    private i[] f38879i;

    public C3933b(int i8, int i9, I7.b bVar, i iVar, I7.a aVar, h hVar, String str) {
        super(true, str);
        this.f38873c = i8;
        this.f38874d = i9;
        this.f38875e = bVar;
        this.f38876f = iVar;
        this.f38878h = aVar;
        this.f38877g = hVar;
        this.f38879i = new k(bVar, iVar).c();
    }

    public I7.b b() {
        return this.f38875e;
    }

    public i c() {
        return this.f38876f;
    }

    public I7.a d() {
        return this.f38878h;
    }

    public int e() {
        return this.f38874d;
    }

    public int f() {
        return this.f38873c;
    }

    public h g() {
        return this.f38877g;
    }

    public C3933b(int i8, int i9, I7.b bVar, i iVar, h hVar, String str) {
        this(i8, i9, bVar, iVar, I7.c.a(bVar, iVar), hVar, str);
    }
}
