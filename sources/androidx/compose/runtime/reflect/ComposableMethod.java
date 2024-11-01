package androidx.compose.runtime.reflect;

import R5.AbstractC1428l;
import R5.AbstractC1435t;
import R5.N;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import i6.i;
import i6.m;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class ComposableMethod {
    public static final int $stable = 8;
    private final ComposableInfo composableInfo;
    private final Method method;

    public ComposableMethod(Method method, ComposableInfo composableInfo) {
        this.method = method;
        this.composableInfo = composableInfo;
    }

    public final Method asMethod() {
        return this.method;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ComposableMethod) {
            return AbstractC3292y.d(this.method, ((ComposableMethod) obj).method);
        }
        return false;
    }

    public final int getParameterCount() {
        return this.composableInfo.getRealParamsCount();
    }

    public final Class<?>[] getParameterTypes() {
        return (Class[]) AbstractC1428l.p(this.method.getParameterTypes(), 0, this.composableInfo.getRealParamsCount());
    }

    public final Parameter[] getParameters() {
        Parameter[] parameters;
        parameters = this.method.getParameters();
        return (Parameter[]) AbstractC1428l.p(parameters, 0, this.composableInfo.getRealParamsCount());
    }

    public int hashCode() {
        return this.method.hashCode();
    }

    public final Object invoke(Composer composer, Object obj, Object... objArr) {
        Object obj2;
        int i8;
        ComposableInfo composableInfo = this.composableInfo;
        int component2 = composableInfo.component2();
        int component3 = composableInfo.component3();
        int component4 = composableInfo.component4();
        int length = this.method.getParameterTypes().length;
        int i9 = component2 + 1;
        int i10 = component3 + i9;
        Object[] objArr2 = new Integer[component4];
        for (int i11 = 0; i11 < component4; i11++) {
            int i12 = i11 * 31;
            i s8 = m.s(i12, Math.min(i12 + 31, component2));
            ArrayList arrayList = new ArrayList(AbstractC1435t.x(s8, 10));
            Iterator it = s8.iterator();
            while (it.hasNext()) {
                int nextInt = ((N) it).nextInt();
                if (nextInt < objArr.length && objArr[nextInt] != null) {
                    i8 = 0;
                } else {
                    i8 = 1;
                }
                arrayList.add(Integer.valueOf(i8));
            }
            int i13 = 0;
            int i14 = 0;
            for (Object obj3 : arrayList) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    AbstractC1435t.w();
                }
                i13 |= ((Number) obj3).intValue() << i14;
                i14 = i15;
            }
            objArr2[i11] = Integer.valueOf(i13);
        }
        Object[] objArr3 = new Object[length];
        for (int i16 = 0; i16 < length; i16++) {
            if (i16 >= 0 && i16 < component2) {
                if (i16 < 0 || i16 > AbstractC1428l.i0(objArr)) {
                    obj2 = ComposableMethodKt.getDefaultValue(this.method.getParameterTypes()[i16]);
                } else {
                    obj2 = objArr[i16];
                }
            } else if (i16 == component2) {
                obj2 = composer;
            } else if (i16 == i9 || (component2 + 2 <= i16 && i16 < i10)) {
                obj2 = 0;
            } else if (i10 <= i16 && i16 < length) {
                obj2 = objArr2[i16 - i10];
            } else {
                throw new IllegalStateException("Unexpected index".toString());
            }
            objArr3[i16] = obj2;
        }
        return this.method.invoke(obj, Arrays.copyOf(objArr3, length));
    }
}
