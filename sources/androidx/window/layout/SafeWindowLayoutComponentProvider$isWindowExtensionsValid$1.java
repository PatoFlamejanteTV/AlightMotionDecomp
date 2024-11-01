package androidx.window.layout;

import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class SafeWindowLayoutComponentProvider$isWindowExtensionsValid$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ ClassLoader $classLoader;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafeWindowLayoutComponentProvider$isWindowExtensionsValid$1(ClassLoader classLoader) {
        super(0);
        this.$classLoader = classLoader;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        Class windowExtensionsClass;
        Class windowLayoutComponentClass;
        boolean isPublic;
        boolean z8;
        boolean doesReturn;
        SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = SafeWindowLayoutComponentProvider.INSTANCE;
        windowExtensionsClass = safeWindowLayoutComponentProvider.windowExtensionsClass(this.$classLoader);
        Method getWindowLayoutComponentMethod = windowExtensionsClass.getMethod("getWindowLayoutComponent", null);
        windowLayoutComponentClass = safeWindowLayoutComponentProvider.windowLayoutComponentClass(this.$classLoader);
        AbstractC3292y.h(getWindowLayoutComponentMethod, "getWindowLayoutComponentMethod");
        isPublic = safeWindowLayoutComponentProvider.isPublic(getWindowLayoutComponentMethod);
        if (isPublic) {
            AbstractC3292y.h(windowLayoutComponentClass, "windowLayoutComponentClass");
            doesReturn = safeWindowLayoutComponentProvider.doesReturn(getWindowLayoutComponentMethod, (Class<?>) windowLayoutComponentClass);
            if (doesReturn) {
                z8 = true;
                return Boolean.valueOf(z8);
            }
        }
        z8 = false;
        return Boolean.valueOf(z8);
    }
}
