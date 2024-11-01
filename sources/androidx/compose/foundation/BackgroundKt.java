package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class BackgroundKt {
    public static final Modifier background(Modifier modifier, Brush brush, Shape shape, float f8) {
        Function1 noInspectorInfo;
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(brush, "brush");
        AbstractC3292y.i(shape, "shape");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new BackgroundKt$background$$inlined$debugInspectorInfo$1(f8, brush, shape);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new BackgroundElement(0L, brush, f8, shape, noInspectorInfo, 1, null));
    }

    public static /* synthetic */ Modifier background$default(Modifier modifier, Brush brush, Shape shape, float f8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        if ((i8 & 4) != 0) {
            f8 = 1.0f;
        }
        return background(modifier, brush, shape, f8);
    }

    /* renamed from: background-bw27NRU */
    public static final Modifier m258backgroundbw27NRU(Modifier background, long j8, Shape shape) {
        Function1 noInspectorInfo;
        AbstractC3292y.i(background, "$this$background");
        AbstractC3292y.i(shape, "shape");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new BackgroundKt$backgroundbw27NRU$$inlined$debugInspectorInfo$1(j8, shape);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return background.then(new BackgroundElement(j8, null, 1.0f, shape, noInspectorInfo, 2, null));
    }

    /* renamed from: background-bw27NRU$default */
    public static /* synthetic */ Modifier m259backgroundbw27NRU$default(Modifier modifier, long j8, Shape shape, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        return m258backgroundbw27NRU(modifier, j8, shape);
    }
}
