package androidx.compose.ui.layout;

import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;

/* loaded from: classes.dex */
public interface LayoutInfo {
    LayoutCoordinates getCoordinates();

    Density getDensity();

    int getHeight();

    LayoutDirection getLayoutDirection();

    List<ModifierInfo> getModifierInfo();

    LayoutInfo getParentInfo();

    int getSemanticsId();

    ViewConfiguration getViewConfiguration();

    int getWidth();

    boolean isAttached();

    boolean isDeactivated();

    boolean isPlaced();
}
