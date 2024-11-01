package androidx.compose.ui.draw;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;

/* loaded from: classes.dex */
public final class PainterModifierKt {
    public static final Modifier paint(Modifier modifier, Painter painter, boolean z8, Alignment alignment, ContentScale contentScale, float f8, ColorFilter colorFilter) {
        return modifier.then(new PainterElement(painter, z8, alignment, contentScale, f8, colorFilter));
    }

    public static /* synthetic */ Modifier paint$default(Modifier modifier, Painter painter, boolean z8, Alignment alignment, ContentScale contentScale, float f8, ColorFilter colorFilter, int i8, Object obj) {
        boolean z9;
        float f9;
        if ((i8 & 2) != 0) {
            z9 = true;
        } else {
            z9 = z8;
        }
        if ((i8 & 4) != 0) {
            alignment = Alignment.Companion.getCenter();
        }
        Alignment alignment2 = alignment;
        if ((i8 & 8) != 0) {
            contentScale = ContentScale.Companion.getInside();
        }
        ContentScale contentScale2 = contentScale;
        if ((i8 & 16) != 0) {
            f9 = 1.0f;
        } else {
            f9 = f8;
        }
        if ((i8 & 32) != 0) {
            colorFilter = null;
        }
        return paint(modifier, painter, z9, alignment2, contentScale2, f9, colorFilter);
    }
}
