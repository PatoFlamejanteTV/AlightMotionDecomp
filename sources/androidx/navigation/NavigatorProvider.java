package androidx.navigation;

import R5.Q;
import android.annotation.SuppressLint;
import androidx.annotation.CallSuper;
import androidx.annotation.RestrictTo;
import androidx.navigation.Navigator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@SuppressLint({"TypeParameterUnusedInFormals"})
/* loaded from: classes3.dex */
public class NavigatorProvider {
    public static final Companion Companion = new Companion(null);
    private static final Map<Class<?>, String> annotationNames = new LinkedHashMap();
    private final Map<String, Navigator<? extends NavDestination>> _navigators = new LinkedHashMap();

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public final String getNameForNavigator$navigation_common_release(Class<? extends Navigator<?>> navigatorClass) {
            AbstractC3292y.i(navigatorClass, "navigatorClass");
            String str = (String) NavigatorProvider.annotationNames.get(navigatorClass);
            if (str == null) {
                Navigator.Name name = (Navigator.Name) navigatorClass.getAnnotation(Navigator.Name.class);
                if (name != null) {
                    str = name.value();
                } else {
                    str = null;
                }
                if (validateName$navigation_common_release(str)) {
                    NavigatorProvider.annotationNames.put(navigatorClass, str);
                } else {
                    throw new IllegalArgumentException(("No @Navigator.Name annotation found for " + navigatorClass.getSimpleName()).toString());
                }
            }
            AbstractC3292y.f(str);
            return str;
        }

        public final boolean validateName$navigation_common_release(String str) {
            if (str != null && str.length() > 0) {
                return true;
            }
            return false;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Navigator<? extends NavDestination> addNavigator(Navigator<? extends NavDestination> navigator) {
        AbstractC3292y.i(navigator, "navigator");
        return addNavigator(Companion.getNameForNavigator$navigation_common_release(navigator.getClass()), navigator);
    }

    public final <T extends Navigator<?>> T getNavigator(Class<T> navigatorClass) {
        AbstractC3292y.i(navigatorClass, "navigatorClass");
        return (T) getNavigator(Companion.getNameForNavigator$navigation_common_release(navigatorClass));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Map<String, Navigator<? extends NavDestination>> getNavigators() {
        return Q.w(this._navigators);
    }

    @CallSuper
    public Navigator<? extends NavDestination> addNavigator(String name, Navigator<? extends NavDestination> navigator) {
        AbstractC3292y.i(name, "name");
        AbstractC3292y.i(navigator, "navigator");
        if (Companion.validateName$navigation_common_release(name)) {
            Navigator<? extends NavDestination> navigator2 = this._navigators.get(name);
            if (AbstractC3292y.d(navigator2, navigator)) {
                return navigator;
            }
            boolean z8 = false;
            if (navigator2 != null && navigator2.isAttached()) {
                z8 = true;
            }
            if (!z8) {
                if (!navigator.isAttached()) {
                    return this._navigators.put(name, navigator);
                }
                throw new IllegalStateException(("Navigator " + navigator + " is already attached to another NavController").toString());
            }
            throw new IllegalStateException(("Navigator " + navigator + " is replacing an already attached " + navigator2).toString());
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
    }

    @CallSuper
    public <T extends Navigator<?>> T getNavigator(String name) {
        AbstractC3292y.i(name, "name");
        if (Companion.validateName$navigation_common_release(name)) {
            Navigator<? extends NavDestination> navigator = this._navigators.get(name);
            if (navigator != null) {
                return navigator;
            }
            throw new IllegalStateException("Could not find Navigator with name \"" + name + "\". You must call NavController.addNavigator() for each navigation type.");
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
    }
}
