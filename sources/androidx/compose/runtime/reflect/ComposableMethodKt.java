package androidx.compose.runtime.reflect;

import R5.AbstractC1435t;
import R5.N;
import androidx.compose.runtime.Composer;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import i6.i;
import i6.m;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.X;

/* loaded from: classes.dex */
public final class ComposableMethodKt {
    private static final int BITS_PER_INT = 31;

    public static final ComposableMethod asComposableMethod(Method method) {
        ComposableInfo composableInfo = getComposableInfo(method);
        if (composableInfo.isComposable()) {
            return new ComposableMethod(method, composableInfo);
        }
        return null;
    }

    private static final int changedParamCount(int i8, int i9) {
        if (i8 == 0) {
            return 1;
        }
        return (int) Math.ceil((i8 + i9) / 10.0d);
    }

    private static final int defaultParamCount(int i8) {
        return (int) Math.ceil(i8 / 31.0d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final /* synthetic */ <T> T[] dup(T t8, int i8) {
        i s8 = m.s(0, i8);
        ArrayList arrayList = new ArrayList(AbstractC1435t.x(s8, 10));
        Iterator<T> it = s8.iterator();
        while (it.hasNext()) {
            ((N) it).nextInt();
            arrayList.add(t8);
        }
        AbstractC3292y.n(0, "T?");
        return (T[]) arrayList.toArray(new Object[0]);
    }

    private static final ComposableInfo getComposableInfo(Method method) {
        int i8;
        Class<?>[] parameterTypes = method.getParameterTypes();
        int length = parameterTypes.length - 1;
        if (length >= 0) {
            while (true) {
                int i9 = length - 1;
                if (AbstractC3292y.d(parameterTypes[length], Composer.class)) {
                    break;
                }
                if (i9 < 0) {
                    break;
                }
                length = i9;
            }
        }
        length = -1;
        boolean z8 = false;
        if (length == -1) {
            return new ComposableInfo(false, method.getParameterTypes().length, 0, 0);
        }
        int changedParamCount = changedParamCount(length, !Modifier.isStatic(method.getModifiers()) ? 1 : 0);
        int i10 = length + 1 + changedParamCount;
        int length2 = method.getParameterTypes().length;
        if (length2 != i10) {
            i8 = defaultParamCount(length);
        } else {
            i8 = 0;
        }
        if (i10 + i8 == length2) {
            z8 = true;
        }
        return new ComposableInfo(z8, length, changedParamCount, i8);
    }

    public static final ComposableMethod getDeclaredComposableMethod(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException {
        Method method;
        int changedParamCount = changedParamCount(clsArr.length, 0);
        try {
            X x8 = new X(3);
            x8.b(clsArr);
            x8.a(Composer.class);
            Class cls2 = Integer.TYPE;
            i s8 = m.s(0, changedParamCount);
            ArrayList arrayList = new ArrayList(AbstractC1435t.x(s8, 10));
            Iterator it = s8.iterator();
            while (it.hasNext()) {
                ((N) it).nextInt();
                arrayList.add(cls2);
            }
            x8.b(arrayList.toArray(new Class[0]));
            method = cls.getDeclaredMethod(str, (Class[]) x8.d(new Class[x8.c()]));
        } catch (ReflectiveOperationException unused) {
            int defaultParamCount = defaultParamCount(clsArr.length);
            try {
                X x9 = new X(4);
                x9.b(clsArr);
                x9.a(Composer.class);
                Class cls3 = Integer.TYPE;
                i s9 = m.s(0, changedParamCount);
                ArrayList arrayList2 = new ArrayList(AbstractC1435t.x(s9, 10));
                Iterator it2 = s9.iterator();
                while (it2.hasNext()) {
                    ((N) it2).nextInt();
                    arrayList2.add(cls3);
                }
                x9.b(arrayList2.toArray(new Class[0]));
                Class cls4 = Integer.TYPE;
                i s10 = m.s(0, defaultParamCount);
                ArrayList arrayList3 = new ArrayList(AbstractC1435t.x(s10, 10));
                Iterator it3 = s10.iterator();
                while (it3.hasNext()) {
                    ((N) it3).nextInt();
                    arrayList3.add(cls4);
                }
                x9.b(arrayList3.toArray(new Class[0]));
                method = cls.getDeclaredMethod(str, (Class[]) x9.d(new Class[x9.c()]));
            } catch (ReflectiveOperationException unused2) {
                method = null;
            }
        }
        if (method != null) {
            ComposableMethod asComposableMethod = asComposableMethod(method);
            AbstractC3292y.f(asComposableMethod);
            return asComposableMethod;
        }
        throw new NoSuchMethodException(cls.getName() + '.' + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final Object getDefaultValue(Class<?> cls) {
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return Double.valueOf(0.0d);
                }
                return null;
            case 104431:
                if (name.equals("int")) {
                    return 0;
                }
                return null;
            case 3039496:
                if (name.equals("byte")) {
                    return (byte) 0;
                }
                return null;
            case 3052374:
                if (name.equals("char")) {
                    return (char) 0;
                }
                return null;
            case 3327612:
                if (name.equals("long")) {
                    return 0L;
                }
                return null;
            case 64711720:
                if (name.equals(TypedValues.Custom.S_BOOLEAN)) {
                    return Boolean.FALSE;
                }
                return null;
            case 97526364:
                if (name.equals(TypedValues.Custom.S_FLOAT)) {
                    return Float.valueOf(0.0f);
                }
                return null;
            case 109413500:
                if (name.equals("short")) {
                    return (short) 0;
                }
                return null;
            default:
                return null;
        }
    }
}
