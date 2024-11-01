package androidx.compose.ui.modifier;

import Q5.r;
import Q5.x;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ModifierLocalModifierNodeKt {
    public static final ModifierLocalMap modifierLocalMapOf() {
        return EmptyMap.INSTANCE;
    }

    public static final <T> ModifierLocalMap modifierLocalMapOf(ModifierLocal<T> modifierLocal) {
        return new SingleLocalMap(modifierLocal);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> ModifierLocalMap modifierLocalMapOf(r rVar) {
        SingleLocalMap singleLocalMap = new SingleLocalMap((ModifierLocal) rVar.c());
        singleLocalMap.mo4183set$ui_release((ModifierLocal) rVar.c(), rVar.d());
        return singleLocalMap;
    }

    public static final ModifierLocalMap modifierLocalMapOf(r... rVarArr) {
        return new MultiLocalMap((r[]) Arrays.copyOf(rVarArr, rVarArr.length));
    }

    public static final ModifierLocalMap modifierLocalMapOf(ModifierLocal<?>... modifierLocalArr) {
        ArrayList arrayList = new ArrayList(modifierLocalArr.length);
        for (ModifierLocal<?> modifierLocal : modifierLocalArr) {
            arrayList.add(x.a(modifierLocal, null));
        }
        r[] rVarArr = (r[]) arrayList.toArray(new r[0]);
        return new MultiLocalMap((r[]) Arrays.copyOf(rVarArr, rVarArr.length));
    }
}
