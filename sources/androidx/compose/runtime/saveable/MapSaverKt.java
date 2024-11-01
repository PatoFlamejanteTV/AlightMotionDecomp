package androidx.compose.runtime.saveable;

import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class MapSaverKt {
    public static final <T> Saver<T, Object> mapSaver(InterfaceC2072n interfaceC2072n, Function1 function1) {
        return ListSaverKt.listSaver(new MapSaverKt$mapSaver$1(interfaceC2072n), new MapSaverKt$mapSaver$2(function1));
    }
}
