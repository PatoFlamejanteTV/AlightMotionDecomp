package Y0;

import Y0.d;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private int f11737a;

    /* renamed from: b, reason: collision with root package name */
    private d.a f11738b = d.a.DEFAULT;

    /* renamed from: Y0.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    private static final class C0259a implements d {

        /* renamed from: a, reason: collision with root package name */
        private final int f11739a;

        /* renamed from: b, reason: collision with root package name */
        private final d.a f11740b;

        C0259a(int i8, d.a aVar) {
            this.f11739a = i8;
            this.f11740b = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public Class annotationType() {
            return d.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f11739a == dVar.tag() && this.f11740b.equals(dVar.intEncoding())) {
                return true;
            }
            return false;
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.f11739a) + (this.f11740b.hashCode() ^ 2041407134);
        }

        @Override // Y0.d
        public d.a intEncoding() {
            return this.f11740b;
        }

        @Override // Y0.d
        public int tag() {
            return this.f11739a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f11739a + "intEncoding=" + this.f11740b + ')';
        }
    }

    public static a b() {
        return new a();
    }

    public d a() {
        return new C0259a(this.f11737a, this.f11738b);
    }

    public a c(int i8) {
        this.f11737a = i8;
        return this;
    }
}
