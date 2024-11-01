package androidx.compose.runtime.saveable;

import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class SaverKt {
    private static final Saver<Object, Object> AutoSaver = Saver(SaverKt$AutoSaver$1.INSTANCE, SaverKt$AutoSaver$2.INSTANCE);

    public static final <Original, Saveable> Saver<Original, Saveable> Saver(final InterfaceC2072n interfaceC2072n, final Function1 function1) {
        return new Saver<Original, Saveable>() { // from class: androidx.compose.runtime.saveable.SaverKt$Saver$1
            @Override // androidx.compose.runtime.saveable.Saver
            public Original restore(Saveable saveable) {
                return (Original) function1.invoke(saveable);
            }

            @Override // androidx.compose.runtime.saveable.Saver
            public Saveable save(SaverScope saverScope, Original original) {
                return (Saveable) InterfaceC2072n.this.invoke(saverScope, original);
            }
        };
    }

    public static final <T> Saver<T, Object> autoSaver() {
        Saver<T, Object> saver = (Saver<T, Object>) AutoSaver;
        AbstractC3292y.g(saver, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.SaverKt.autoSaver, kotlin.Any>");
        return saver;
    }
}
