package C6;

import Q5.C1413h;
import j6.InterfaceC3214c;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: C6.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1009c {
    public static final Void a(InterfaceC3214c subClass, InterfaceC3214c baseClass) {
        AbstractC3292y.i(subClass, "subClass");
        AbstractC3292y.i(baseClass, "baseClass");
        String b9 = subClass.b();
        if (b9 == null) {
            b9 = String.valueOf(subClass);
        }
        b(b9, baseClass);
        throw new C1413h();
    }

    public static final Void b(String str, InterfaceC3214c baseClass) {
        String str2;
        AbstractC3292y.i(baseClass, "baseClass");
        String str3 = "in the polymorphic scope of '" + baseClass.b() + '\'';
        if (str == null) {
            str2 = "Class discriminator was missing and no default serializers were registered " + str3 + '.';
        } else {
            str2 = "Serializer for subclass '" + str + "' is not found " + str3 + ".\nCheck if class with serial name '" + str + "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '" + str + "' has to be '@Serializable', and the base class '" + baseClass.b() + "' has to be sealed and '@Serializable'.";
        }
        throw new y6.h(str2);
    }
}
