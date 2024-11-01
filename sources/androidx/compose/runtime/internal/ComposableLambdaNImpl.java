package androidx.compose.runtime.internal;

import R5.AbstractC1428l;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Stable;
import c6.InterfaceC2080v;
import i6.m;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.X;

@Stable
/* loaded from: classes.dex */
public final class ComposableLambdaNImpl implements ComposableLambdaN {
    public static final int $stable = 0;
    private Object _block;
    private final int arity;
    private final int key;
    private RecomposeScope scope;
    private List<RecomposeScope> scopes;
    private final boolean tracked;

    public ComposableLambdaNImpl(int i8, boolean z8, int i9) {
        this.key = i8;
        this.tracked = z8;
        this.arity = i9;
    }

    private final int realParamCount(int i8) {
        int i9 = i8 - 2;
        for (int i10 = 1; i10 * 10 < i9; i10++) {
            i9--;
        }
        return i9;
    }

    private final void trackRead(Composer composer) {
        RecomposeScope recomposeScope;
        if (this.tracked && (recomposeScope = composer.getRecomposeScope()) != null) {
            composer.recordUsed(recomposeScope);
            if (ComposableLambdaKt.replacableWith(this.scope, recomposeScope)) {
                this.scope = recomposeScope;
                return;
            }
            List<RecomposeScope> list = this.scopes;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                this.scopes = arrayList;
                arrayList.add(recomposeScope);
                return;
            }
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                if (ComposableLambdaKt.replacableWith(list.get(i8), recomposeScope)) {
                    list.set(i8, recomposeScope);
                    return;
                }
            }
            list.add(recomposeScope);
        }
    }

    private final void trackWrite() {
        if (this.tracked) {
            RecomposeScope recomposeScope = this.scope;
            if (recomposeScope != null) {
                recomposeScope.invalidate();
                this.scope = null;
            }
            List<RecomposeScope> list = this.scopes;
            if (list != null) {
                int size = list.size();
                for (int i8 = 0; i8 < size; i8++) {
                    list.get(i8).invalidate();
                }
                list.clear();
            }
        }
    }

    @Override // androidx.compose.runtime.internal.ComposableLambdaN, kotlin.jvm.internal.InterfaceC3287t
    public int getArity() {
        return this.arity;
    }

    public final int getKey() {
        return this.key;
    }

    @Override // androidx.compose.runtime.internal.ComposableLambdaN, c6.InterfaceC2080v
    public Object invoke(Object... objArr) {
        int sameBits;
        int realParamCount = realParamCount(objArr.length);
        Object obj = objArr[realParamCount];
        AbstractC3292y.g(obj, "null cannot be cast to non-null type androidx.compose.runtime.Composer");
        Object[] array = AbstractC1428l.L0(objArr, m.s(0, objArr.length - 1)).toArray(new Object[0]);
        Object obj2 = objArr[objArr.length - 1];
        AbstractC3292y.g(obj2, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj2).intValue();
        Composer startRestartGroup = ((Composer) obj).startRestartGroup(this.key);
        trackRead(startRestartGroup);
        if (startRestartGroup.changed(this)) {
            sameBits = ComposableLambdaKt.differentBits(realParamCount);
        } else {
            sameBits = ComposableLambdaKt.sameBits(realParamCount);
        }
        int i8 = intValue | sameBits;
        Object obj3 = this._block;
        AbstractC3292y.g(obj3, "null cannot be cast to non-null type kotlin.jvm.functions.FunctionN<*>");
        X x8 = new X(2);
        x8.b(array);
        x8.a(Integer.valueOf(i8));
        Object invoke = ((InterfaceC2080v) obj3).invoke(x8.d(new Object[x8.c()]));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ComposableLambdaNImpl$invoke$1(objArr, realParamCount, this));
        }
        return invoke;
    }

    public final void update(Object obj) {
        boolean z8;
        if (!AbstractC3292y.d(obj, this._block)) {
            if (this._block == null) {
                z8 = true;
            } else {
                z8 = false;
            }
            AbstractC3292y.g(obj, "null cannot be cast to non-null type kotlin.jvm.functions.FunctionN<*>");
            this._block = (InterfaceC2080v) obj;
            if (!z8) {
                trackWrite();
            }
        }
    }
}
