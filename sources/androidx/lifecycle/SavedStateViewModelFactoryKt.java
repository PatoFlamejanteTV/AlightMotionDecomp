package androidx.lifecycle;

import R5.AbstractC1428l;
import R5.AbstractC1435t;
import android.app.Application;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes3.dex */
public final class SavedStateViewModelFactoryKt {
    private static final List<Class<?>> ANDROID_VIEWMODEL_SIGNATURE = AbstractC1435t.p(Application.class, SavedStateHandle.class);
    private static final List<Class<?>> VIEWMODEL_SIGNATURE = AbstractC1435t.e(SavedStateHandle.class);

    public static final <T> Constructor<T> findMatchingConstructor(Class<T> modelClass, List<? extends Class<?>> signature) {
        AbstractC3292y.i(modelClass, "modelClass");
        AbstractC3292y.i(signature, "signature");
        Object[] constructors = modelClass.getConstructors();
        AbstractC3292y.h(constructors, "modelClass.constructors");
        for (Object obj : constructors) {
            Constructor<T> constructor = (Constructor<T>) obj;
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            AbstractC3292y.h(parameterTypes, "constructor.parameterTypes");
            List V02 = AbstractC1428l.V0(parameterTypes);
            if (AbstractC3292y.d(signature, V02)) {
                AbstractC3292y.g(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>");
                return constructor;
            }
            if (signature.size() == V02.size() && V02.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + modelClass.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    public static final <T extends ViewModel> T newInstance(Class<T> modelClass, Constructor<T> constructor, Object... params) {
        AbstractC3292y.i(modelClass, "modelClass");
        AbstractC3292y.i(constructor, "constructor");
        AbstractC3292y.i(params, "params");
        try {
            return constructor.newInstance(Arrays.copyOf(params, params.length));
        } catch (IllegalAccessException e8) {
            throw new RuntimeException("Failed to access " + modelClass, e8);
        } catch (InstantiationException e9) {
            throw new RuntimeException("A " + modelClass + " cannot be instantiated.", e9);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException("An exception happened in constructor of " + modelClass, e10.getCause());
        }
    }
}
