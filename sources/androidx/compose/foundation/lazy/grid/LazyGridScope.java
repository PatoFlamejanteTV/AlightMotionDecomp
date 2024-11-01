package androidx.compose.foundation.lazy.grid;

import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import c6.InterfaceC2074p;
import kotlin.jvm.functions.Function1;

@LazyGridScopeMarker
/* loaded from: classes.dex */
public interface LazyGridScope {

    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridScope$-CC, reason: invalid class name */
    /* loaded from: classes.dex */
    public abstract /* synthetic */ class CC {
        public static /* synthetic */ void a(LazyGridScope lazyGridScope, Object obj, Function1 function1, Object obj2, InterfaceC2073o interfaceC2073o, int i8, Object obj3) {
            if (obj3 == null) {
                if ((i8 & 1) != 0) {
                    obj = null;
                }
                if ((i8 & 2) != 0) {
                    function1 = null;
                }
                if ((i8 & 4) != 0) {
                    obj2 = null;
                }
                lazyGridScope.item(obj, function1, obj2, interfaceC2073o);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }

        public static /* synthetic */ void b(LazyGridScope lazyGridScope, int i8, Function1 function1, InterfaceC2072n interfaceC2072n, Function1 function12, InterfaceC2074p interfaceC2074p, int i9, Object obj) {
            Function1 function13;
            InterfaceC2072n interfaceC2072n2;
            if (obj == null) {
                if ((i9 & 2) != 0) {
                    function13 = null;
                } else {
                    function13 = function1;
                }
                if ((i9 & 4) != 0) {
                    interfaceC2072n2 = null;
                } else {
                    interfaceC2072n2 = interfaceC2072n;
                }
                if ((i9 & 8) != 0) {
                    function12 = LazyGridScope$items$1.INSTANCE;
                }
                lazyGridScope.items(i8, function13, interfaceC2072n2, function12, interfaceC2074p);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
    }

    void item(Object obj, Function1 function1, Object obj2, InterfaceC2073o interfaceC2073o);

    void items(int i8, Function1 function1, InterfaceC2072n interfaceC2072n, Function1 function12, InterfaceC2074p interfaceC2074p);
}
