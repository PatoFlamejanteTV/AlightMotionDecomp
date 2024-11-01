package B6;

import kotlin.jvm.internal.AbstractC3292y;
import y6.i;

/* loaded from: classes5.dex */
public interface f {
    void A(A6.f fVar, int i8);

    void B(int i8);

    void C(long j8);

    void F(String str);

    F6.b b();

    d c(A6.f fVar);

    void e();

    void h(double d8);

    void i(short s8);

    void j(byte b9);

    void k(boolean z8);

    d l(A6.f fVar, int i8);

    void p(float f8);

    void s(char c8);

    void t();

    f v(A6.f fVar);

    void z(i iVar, Object obj);

    /* loaded from: classes5.dex */
    public static final class a {
        public static d a(f fVar, A6.f descriptor, int i8) {
            AbstractC3292y.i(descriptor, "descriptor");
            return fVar.c(descriptor);
        }

        public static void c(f fVar, i serializer, Object obj) {
            AbstractC3292y.i(serializer, "serializer");
            if (serializer.a().c()) {
                fVar.z(serializer, obj);
            } else if (obj == null) {
                fVar.e();
            } else {
                fVar.t();
                fVar.z(serializer, obj);
            }
        }

        public static void d(f fVar, i serializer, Object obj) {
            AbstractC3292y.i(serializer, "serializer");
            serializer.e(fVar, obj);
        }

        public static void b(f fVar) {
        }
    }
}
