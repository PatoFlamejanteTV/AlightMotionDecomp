package E6;

import A6.j;
import C6.AbstractC1007b;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.AbstractC3292y;
import y6.InterfaceC4248a;

/* loaded from: classes5.dex */
public abstract class L {
    public static final void b(A6.j kind) {
        AbstractC3292y.i(kind, "kind");
        if (!(kind instanceof j.b)) {
            if (!(kind instanceof A6.e)) {
                if (!(kind instanceof A6.d)) {
                    return;
                } else {
                    throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself".toString());
                }
            }
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
        }
        throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
    }

    public static final String c(A6.f fVar, D6.a json) {
        AbstractC3292y.i(fVar, "<this>");
        AbstractC3292y.i(json, "json");
        for (Annotation annotation : fVar.getAnnotations()) {
            if (annotation instanceof D6.e) {
                return ((D6.e) annotation).discriminator();
            }
        }
        return json.d().d();
    }

    public static final Object d(D6.h hVar, InterfaceC4248a deserializer) {
        String str;
        D6.x i8;
        AbstractC3292y.i(hVar, "<this>");
        AbstractC3292y.i(deserializer, "deserializer");
        if ((deserializer instanceof AbstractC1007b) && !hVar.d().d().n()) {
            String c8 = c(deserializer.a(), hVar.d());
            D6.i l8 = hVar.l();
            A6.f a9 = deserializer.a();
            if (l8 instanceof D6.v) {
                D6.v vVar = (D6.v) l8;
                D6.i iVar = (D6.i) vVar.get(c8);
                if (iVar != null && (i8 = D6.j.i(iVar)) != null) {
                    str = D6.j.d(i8);
                } else {
                    str = null;
                }
                try {
                    InterfaceC4248a a10 = y6.f.a((AbstractC1007b) deserializer, hVar, str);
                    AbstractC3292y.g(a10, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>");
                    return T.b(hVar.d(), c8, vVar, a10);
                } catch (y6.h e8) {
                    String message = e8.getMessage();
                    AbstractC3292y.f(message);
                    throw B.e(-1, message, vVar.toString());
                }
            }
            throw B.d(-1, "Expected " + kotlin.jvm.internal.U.b(D6.v.class) + " as the serialized body of " + a9.a() + ", but had " + kotlin.jvm.internal.U.b(l8.getClass()));
        }
        return deserializer.d(hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(y6.i iVar, y6.i iVar2, String str) {
    }
}
