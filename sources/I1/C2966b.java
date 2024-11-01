package i1;

import com.google.firebase.messaging.K;

/* renamed from: i1.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2966b {

    /* renamed from: b, reason: collision with root package name */
    private static final C2966b f32724b = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final C2965a f32725a;

    /* renamed from: i1.b$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private C2965a f32726a = null;

        a() {
        }

        public C2966b a() {
            return new C2966b(this.f32726a);
        }

        public a b(C2965a c2965a) {
            this.f32726a = c2965a;
            return this;
        }
    }

    C2966b(C2965a c2965a) {
        this.f32725a = c2965a;
    }

    public static a b() {
        return new a();
    }

    public C2965a a() {
        return this.f32725a;
    }

    public byte[] c() {
        return K.a(this);
    }
}
