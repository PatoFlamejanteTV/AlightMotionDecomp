package C6;

import B6.c;
import j6.InterfaceC3214c;
import kotlin.jvm.internal.AbstractC3292y;
import y6.InterfaceC4248a;

/* renamed from: C6.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1007b implements y6.b {
    /* JADX INFO: Access modifiers changed from: private */
    public final Object g(B6.c cVar) {
        return c.a.c(cVar, a(), 1, y6.f.a(this, cVar, cVar.o(a(), 0)), null, 8, null);
    }

    @Override // y6.InterfaceC4248a
    public final Object d(B6.e decoder) {
        Object obj;
        AbstractC3292y.i(decoder, "decoder");
        A6.f a9 = a();
        B6.c c8 = decoder.c(a9);
        kotlin.jvm.internal.T t8 = new kotlin.jvm.internal.T();
        if (c8.z()) {
            obj = g(c8);
        } else {
            obj = null;
            while (true) {
                int y8 = c8.y(a());
                if (y8 != -1) {
                    if (y8 != 0) {
                        if (y8 != 1) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Invalid index in polymorphic deserialization of ");
                            String str = (String) t8.f34573a;
                            if (str == null) {
                                str = "unknown class";
                            }
                            sb.append(str);
                            sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                            sb.append(y8);
                            throw new y6.h(sb.toString());
                        }
                        Object obj2 = t8.f34573a;
                        if (obj2 != null) {
                            t8.f34573a = obj2;
                            obj = c.a.c(c8, a(), y8, y6.f.a(this, c8, (String) obj2), null, 8, null);
                        } else {
                            throw new IllegalArgumentException("Cannot read polymorphic value before its type token".toString());
                        }
                    } else {
                        t8.f34573a = c8.o(a(), y8);
                    }
                } else if (obj != null) {
                    AbstractC3292y.g(obj, "null cannot be cast to non-null type T of kotlinx.serialization.internal.AbstractPolymorphicSerializer.deserialize$lambda$3");
                } else {
                    throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) t8.f34573a)).toString());
                }
            }
        }
        c8.a(a9);
        return obj;
    }

    @Override // y6.i
    public final void e(B6.f encoder, Object value) {
        AbstractC3292y.i(encoder, "encoder");
        AbstractC3292y.i(value, "value");
        y6.i b9 = y6.f.b(this, encoder, value);
        A6.f a9 = a();
        B6.d c8 = encoder.c(a9);
        c8.q(a(), 0, b9.a().a());
        A6.f a10 = a();
        AbstractC3292y.g(b9, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        c8.n(a10, 1, b9, value);
        c8.a(a9);
    }

    public InterfaceC4248a h(B6.c decoder, String str) {
        AbstractC3292y.i(decoder, "decoder");
        return decoder.b().d(j(), str);
    }

    public y6.i i(B6.f encoder, Object value) {
        AbstractC3292y.i(encoder, "encoder");
        AbstractC3292y.i(value, "value");
        return encoder.b().e(j(), value);
    }

    public abstract InterfaceC3214c j();
}
