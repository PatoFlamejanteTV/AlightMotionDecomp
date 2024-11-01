package androidx.work;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class InputMergerKt {
    private static final String TAG;

    static {
        String tagWithPrefix = Logger.tagWithPrefix("InputMerger");
        AbstractC3292y.h(tagWithPrefix, "tagWithPrefix(\"InputMerger\")");
        TAG = tagWithPrefix;
    }

    public static final InputMerger fromClassName(String className) {
        AbstractC3292y.i(className, "className");
        try {
            Object newInstance = Class.forName(className).getDeclaredConstructor(null).newInstance(null);
            AbstractC3292y.g(newInstance, "null cannot be cast to non-null type androidx.work.InputMerger");
            return (InputMerger) newInstance;
        } catch (Exception e8) {
            Logger.get().error(TAG, "Trouble instantiating " + className, e8);
            return null;
        }
    }
}
