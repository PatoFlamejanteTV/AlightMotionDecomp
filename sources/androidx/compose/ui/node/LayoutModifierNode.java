package androidx.compose.ui.node;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.NodeMeasuringIntrinsics;

/* loaded from: classes.dex */
public interface LayoutModifierNode extends DelegatableNode {

    /* renamed from: androidx.compose.ui.node.LayoutModifierNode$-CC, reason: invalid class name */
    /* loaded from: classes.dex */
    public abstract /* synthetic */ class CC {
        public static int a(final LayoutModifierNode layoutModifierNode, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
            return NodeMeasuringIntrinsics.INSTANCE.maxHeight$ui_release(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode$maxIntrinsicHeight$1
                @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo4114measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j8) {
                    return LayoutModifierNode.this.mo340measure3p2s80s(measureScope, measurable, j8);
                }
            }, intrinsicMeasureScope, intrinsicMeasurable, i8);
        }

        public static int b(final LayoutModifierNode layoutModifierNode, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
            return NodeMeasuringIntrinsics.INSTANCE.maxWidth$ui_release(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode$maxIntrinsicWidth$1
                @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo4114measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j8) {
                    return LayoutModifierNode.this.mo340measure3p2s80s(measureScope, measurable, j8);
                }
            }, intrinsicMeasureScope, intrinsicMeasurable, i8);
        }

        public static int c(final LayoutModifierNode layoutModifierNode, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
            return NodeMeasuringIntrinsics.INSTANCE.minHeight$ui_release(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode$minIntrinsicHeight$1
                @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo4114measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j8) {
                    return LayoutModifierNode.this.mo340measure3p2s80s(measureScope, measurable, j8);
                }
            }, intrinsicMeasureScope, intrinsicMeasurable, i8);
        }

        public static int d(final LayoutModifierNode layoutModifierNode, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8) {
            return NodeMeasuringIntrinsics.INSTANCE.minWidth$ui_release(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode$minIntrinsicWidth$1
                @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo4114measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j8) {
                    return LayoutModifierNode.this.mo340measure3p2s80s(measureScope, measurable, j8);
                }
            }, intrinsicMeasureScope, intrinsicMeasurable, i8);
        }
    }

    int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8);

    int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8);

    /* renamed from: measure-3p2s80s */
    MeasureResult mo340measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j8);

    int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8);

    int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i8);
}
