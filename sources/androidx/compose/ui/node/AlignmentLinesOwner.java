package androidx.compose.ui.node;

import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Measurable;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public interface AlignmentLinesOwner extends Measurable {
    Map<AlignmentLine, Integer> calculateAlignmentLines();

    void forEachChildAlignmentLinesOwner(Function1 function1);

    AlignmentLines getAlignmentLines();

    NodeCoordinator getInnerCoordinator();

    AlignmentLinesOwner getParentAlignmentLinesOwner();

    boolean isPlaced();

    void layoutChildren();

    void requestLayout();

    void requestMeasure();
}
