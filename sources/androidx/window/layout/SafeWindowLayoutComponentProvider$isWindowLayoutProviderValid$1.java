package androidx.window.layout;

import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class SafeWindowLayoutComponentProvider$isWindowLayoutProviderValid$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ ClassLoader $classLoader;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafeWindowLayoutComponentProvider$isWindowLayoutProviderValid$1(ClassLoader classLoader) {
        super(0);
        this.$classLoader = classLoader;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        Class windowExtensionsProviderClass;
        Class windowExtensionsClass;
        boolean doesReturn;
        boolean z8;
        boolean isPublic;
        SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = SafeWindowLayoutComponentProvider.INSTANCE;
        windowExtensionsProviderClass = safeWindowLayoutComponentProvider.windowExtensionsProviderClass(this.$classLoader);
        Method getWindowExtensionsMethod = windowExtensionsProviderClass.getDeclaredMethod("getWindowExtensions", null);
        windowExtensionsClass = safeWindowLayoutComponentProvider.windowExtensionsClass(this.$classLoader);
        AbstractC3292y.h(getWindowExtensionsMethod, "getWindowExtensionsMethod");
        AbstractC3292y.h(windowExtensionsClass, "windowExtensionsClass");
        doesReturn = safeWindowLayoutComponentProvider.doesReturn(getWindowExtensionsMethod, (Class<?>) windowExtensionsClass);
        if (doesReturn) {
            isPublic = safeWindowLayoutComponentProvider.isPublic(getWindowExtensionsMethod);
            if (isPublic) {
                z8 = true;
                return Boolean.valueOf(z8);
            }
        }
        z8 = false;
        return Boolean.valueOf(z8);
    }
}
