package androidx.compose.foundation.lazy.staggeredgrid;

import c6.InterfaceC2073o;
import c6.InterfaceC2074p;
import kotlin.jvm.functions.Function1;

@LazyStaggeredGridScopeMarker
/* loaded from: classes.dex */
public interface LazyStaggeredGridScope {

    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope$-CC, reason: invalid class name */
    /* loaded from: classes.dex */
    public abstract /* synthetic */ class CC {
        public static /* synthetic */ void a(LazyStaggeredGridScope lazyStaggeredGridScope, Object obj, Object obj2, StaggeredGridItemSpan staggeredGridItemSpan, InterfaceC2073o interfaceC2073o, int i8, Object obj3) {
            if (obj3 == null) {
                if ((i8 & 1) != 0) {
                    obj = null;
                }
                if ((i8 & 2) != 0) {
                    obj2 = null;
                }
                if ((i8 & 4) != 0) {
                    staggeredGridItemSpan = null;
                }
                lazyStaggeredGridScope.item(obj, obj2, staggeredGridItemSpan, interfaceC2073o);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }

        public static /* synthetic */ void b(LazyStaggeredGridScope lazyStaggeredGridScope, int i8, Function1 function1, Function1 function12, Function1 function13, InterfaceC2074p interfaceC2074p, int i9, Object obj) {
            Function1 function14;
            Function1 function15;
            if (obj == null) {
                if ((i9 & 2) != 0) {
                    function14 = null;
                } else {
                    function14 = function1;
                }
                if ((i9 & 4) != 0) {
                    function12 = LazyStaggeredGridScope$items$1.INSTANCE;
                }
                Function1 function16 = function12;
                if ((i9 & 8) != 0) {
                    function15 = null;
                } else {
                    function15 = function13;
                }
                lazyStaggeredGridScope.items(i8, function14, function16, function15, interfaceC2074p);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
    }

    void item(Object obj, Object obj2, StaggeredGridItemSpan staggeredGridItemSpan, InterfaceC2073o interfaceC2073o);

    void items(int i8, Function1 function1, Function1 function12, Function1 function13, InterfaceC2074p interfaceC2074p);
}
