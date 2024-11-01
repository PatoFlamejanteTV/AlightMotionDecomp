package androidx.compose.foundation.shape;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class GenericShape implements Shape {
    public static final int $stable = 0;
    private final InterfaceC2073o builder;

    public GenericShape(InterfaceC2073o builder) {
        AbstractC3292y.i(builder, "builder");
        this.builder = builder;
    }

    @Override // androidx.compose.ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI */
    public Outline mo308createOutlinePq9zytI(long j8, LayoutDirection layoutDirection, Density density) {
        AbstractC3292y.i(layoutDirection, "layoutDirection");
        AbstractC3292y.i(density, "density");
        Path Path = AndroidPath_androidKt.Path();
        this.builder.invoke(Path, Size.m2769boximpl(j8), layoutDirection);
        Path.close();
        return new Outline.Generic(Path);
    }

    public boolean equals(Object obj) {
        GenericShape genericShape;
        if (this == obj) {
            return true;
        }
        InterfaceC2073o interfaceC2073o = null;
        if (obj instanceof GenericShape) {
            genericShape = (GenericShape) obj;
        } else {
            genericShape = null;
        }
        if (genericShape != null) {
            interfaceC2073o = genericShape.builder;
        }
        return AbstractC3292y.d(interfaceC2073o, this.builder);
    }

    public int hashCode() {
        return this.builder.hashCode();
    }
}
