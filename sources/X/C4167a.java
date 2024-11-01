package x;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import u.m;

/* renamed from: x.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4167a {

    /* renamed from: e, reason: collision with root package name */
    private static final C4167a f40784e = new C0926a().b();

    /* renamed from: a, reason: collision with root package name */
    private final f f40785a;

    /* renamed from: b, reason: collision with root package name */
    private final List f40786b;

    /* renamed from: c, reason: collision with root package name */
    private final C4168b f40787c;

    /* renamed from: d, reason: collision with root package name */
    private final String f40788d;

    /* renamed from: x.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0926a {

        /* renamed from: a, reason: collision with root package name */
        private f f40789a = null;

        /* renamed from: b, reason: collision with root package name */
        private List f40790b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private C4168b f40791c = null;

        /* renamed from: d, reason: collision with root package name */
        private String f40792d = "";

        C0926a() {
        }

        public C0926a a(C4170d c4170d) {
            this.f40790b.add(c4170d);
            return this;
        }

        public C4167a b() {
            return new C4167a(this.f40789a, DesugarCollections.unmodifiableList(this.f40790b), this.f40791c, this.f40792d);
        }

        public C0926a c(String str) {
            this.f40792d = str;
            return this;
        }

        public C0926a d(C4168b c4168b) {
            this.f40791c = c4168b;
            return this;
        }

        public C0926a e(f fVar) {
            this.f40789a = fVar;
            return this;
        }
    }

    C4167a(f fVar, List list, C4168b c4168b, String str) {
        this.f40785a = fVar;
        this.f40786b = list;
        this.f40787c = c4168b;
        this.f40788d = str;
    }

    public static C0926a e() {
        return new C0926a();
    }

    public String a() {
        return this.f40788d;
    }

    public C4168b b() {
        return this.f40787c;
    }

    public List c() {
        return this.f40786b;
    }

    public f d() {
        return this.f40785a;
    }

    public byte[] f() {
        return m.a(this);
    }
}
