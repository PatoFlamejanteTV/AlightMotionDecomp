package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.vector.PathNode;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class PathBuilder {
    private final ArrayList<PathNode> _nodes = new ArrayList<>(32);

    public final PathBuilder arcTo(float f8, float f9, float f10, boolean z8, boolean z9, float f11, float f12) {
        this._nodes.add(new PathNode.ArcTo(f8, f9, f10, z8, z9, f11, f12));
        return this;
    }

    public final PathBuilder arcToRelative(float f8, float f9, float f10, boolean z8, boolean z9, float f11, float f12) {
        this._nodes.add(new PathNode.RelativeArcTo(f8, f9, f10, z8, z9, f11, f12));
        return this;
    }

    public final PathBuilder close() {
        this._nodes.add(PathNode.Close.INSTANCE);
        return this;
    }

    public final PathBuilder curveTo(float f8, float f9, float f10, float f11, float f12, float f13) {
        this._nodes.add(new PathNode.CurveTo(f8, f9, f10, f11, f12, f13));
        return this;
    }

    public final PathBuilder curveToRelative(float f8, float f9, float f10, float f11, float f12, float f13) {
        this._nodes.add(new PathNode.RelativeCurveTo(f8, f9, f10, f11, f12, f13));
        return this;
    }

    public final List<PathNode> getNodes() {
        return this._nodes;
    }

    public final PathBuilder horizontalLineTo(float f8) {
        this._nodes.add(new PathNode.HorizontalTo(f8));
        return this;
    }

    public final PathBuilder horizontalLineToRelative(float f8) {
        this._nodes.add(new PathNode.RelativeHorizontalTo(f8));
        return this;
    }

    public final PathBuilder lineTo(float f8, float f9) {
        this._nodes.add(new PathNode.LineTo(f8, f9));
        return this;
    }

    public final PathBuilder lineToRelative(float f8, float f9) {
        this._nodes.add(new PathNode.RelativeLineTo(f8, f9));
        return this;
    }

    public final PathBuilder moveTo(float f8, float f9) {
        this._nodes.add(new PathNode.MoveTo(f8, f9));
        return this;
    }

    public final PathBuilder moveToRelative(float f8, float f9) {
        this._nodes.add(new PathNode.RelativeMoveTo(f8, f9));
        return this;
    }

    public final PathBuilder quadTo(float f8, float f9, float f10, float f11) {
        this._nodes.add(new PathNode.QuadTo(f8, f9, f10, f11));
        return this;
    }

    public final PathBuilder quadToRelative(float f8, float f9, float f10, float f11) {
        this._nodes.add(new PathNode.RelativeQuadTo(f8, f9, f10, f11));
        return this;
    }

    public final PathBuilder reflectiveCurveTo(float f8, float f9, float f10, float f11) {
        this._nodes.add(new PathNode.ReflectiveCurveTo(f8, f9, f10, f11));
        return this;
    }

    public final PathBuilder reflectiveCurveToRelative(float f8, float f9, float f10, float f11) {
        this._nodes.add(new PathNode.RelativeReflectiveCurveTo(f8, f9, f10, f11));
        return this;
    }

    public final PathBuilder reflectiveQuadTo(float f8, float f9) {
        this._nodes.add(new PathNode.ReflectiveQuadTo(f8, f9));
        return this;
    }

    public final PathBuilder reflectiveQuadToRelative(float f8, float f9) {
        this._nodes.add(new PathNode.RelativeReflectiveQuadTo(f8, f9));
        return this;
    }

    public final PathBuilder verticalLineTo(float f8) {
        this._nodes.add(new PathNode.VerticalTo(f8));
        return this;
    }

    public final PathBuilder verticalLineToRelative(float f8) {
        this._nodes.add(new PathNode.RelativeVerticalTo(f8));
        return this;
    }
}
