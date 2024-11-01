package androidx.compose.ui.semantics;

import Q5.r;
import Q5.x;
import R5.AbstractC1435t;
import R5.Q;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ValueElementSequence;
import i6.m;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class SemanticsModifierKt {
    private static AtomicInteger lastIdentifier = new AtomicInteger(0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addSemanticsPropertiesFrom(InspectorInfo inspectorInfo, SemanticsConfiguration semanticsConfiguration) {
        ValueElementSequence properties = inspectorInfo.getProperties();
        LinkedHashMap linkedHashMap = new LinkedHashMap(m.d(Q.d(AbstractC1435t.x(semanticsConfiguration, 10)), 16));
        for (Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object> entry : semanticsConfiguration) {
            SemanticsPropertyKey<?> key = entry.getKey();
            r a9 = x.a(key.getName(), entry.getValue());
            linkedHashMap.put(a9.c(), a9.d());
        }
        properties.set("properties", linkedHashMap);
    }

    public static final Modifier clearAndSetSemantics(Modifier modifier, Function1 function1) {
        return modifier.then(new ClearAndSetSemanticsElement(function1));
    }

    public static final int generateSemanticsId() {
        return lastIdentifier.addAndGet(1);
    }

    public static final Modifier semantics(Modifier modifier, boolean z8, Function1 function1) {
        return modifier.then(new AppendedSemanticsElement(z8, function1));
    }

    public static /* synthetic */ Modifier semantics$default(Modifier modifier, boolean z8, Function1 function1, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        return semantics(modifier, z8, function1);
    }
}
