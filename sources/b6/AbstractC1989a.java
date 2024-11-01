package b6;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import j6.InterfaceC3214c;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.InterfaceC3281m;
import kotlin.jvm.internal.U;

/* renamed from: b6.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1989a {
    public static final Class a(InterfaceC3214c interfaceC3214c) {
        AbstractC3292y.i(interfaceC3214c, "<this>");
        Class d8 = ((InterfaceC3281m) interfaceC3214c).d();
        AbstractC3292y.g(d8, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return d8;
    }

    public static final Class b(InterfaceC3214c interfaceC3214c) {
        AbstractC3292y.i(interfaceC3214c, "<this>");
        Class d8 = ((InterfaceC3281m) interfaceC3214c).d();
        if (!d8.isPrimitive()) {
            AbstractC3292y.g(d8, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return d8;
        }
        String name = d8.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    d8 = Double.class;
                    break;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    d8 = Integer.class;
                    break;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    d8 = Byte.class;
                    break;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    d8 = Character.class;
                    break;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    d8 = Long.class;
                    break;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    d8 = Void.class;
                    break;
                }
                break;
            case 64711720:
                if (name.equals(TypedValues.Custom.S_BOOLEAN)) {
                    d8 = Boolean.class;
                    break;
                }
                break;
            case 97526364:
                if (name.equals(TypedValues.Custom.S_FLOAT)) {
                    d8 = Float.class;
                    break;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    d8 = Short.class;
                    break;
                }
                break;
        }
        AbstractC3292y.g(d8, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return d8;
    }

    public static final InterfaceC3214c c(Class cls) {
        AbstractC3292y.i(cls, "<this>");
        return U.b(cls);
    }
}
