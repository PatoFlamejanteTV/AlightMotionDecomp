package androidx.leanback.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.widget.GridLayoutManager;
import androidx.leanback.widget.ItemAlignmentFacet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class ItemAlignmentFacetHelper {
    private static Rect sRect = new Rect();

    private ItemAlignmentFacetHelper() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getAlignmentPosition(View view, ItemAlignmentFacet.ItemAlignmentDef itemAlignmentDef, int i8) {
        View view2;
        int i9;
        int height;
        int width;
        int width2;
        int width3;
        GridLayoutManager.LayoutParams layoutParams = (GridLayoutManager.LayoutParams) view.getLayoutParams();
        int i10 = itemAlignmentDef.mViewId;
        if (i10 == 0 || (view2 = view.findViewById(i10)) == null) {
            view2 = view;
        }
        int i11 = itemAlignmentDef.mOffset;
        if (i8 == 0) {
            if (view.getLayoutDirection() == 1) {
                if (view2 == view) {
                    width2 = layoutParams.getOpticalWidth(view2);
                } else {
                    width2 = view2.getWidth();
                }
                int i12 = width2 - i11;
                if (itemAlignmentDef.mOffsetWithPadding) {
                    float f8 = itemAlignmentDef.mOffsetPercent;
                    if (f8 == 0.0f) {
                        i12 -= view2.getPaddingRight();
                    } else if (f8 == 100.0f) {
                        i12 += view2.getPaddingLeft();
                    }
                }
                if (itemAlignmentDef.mOffsetPercent != -1.0f) {
                    if (view2 == view) {
                        width3 = layoutParams.getOpticalWidth(view2);
                    } else {
                        width3 = view2.getWidth();
                    }
                    i12 -= (int) ((width3 * itemAlignmentDef.mOffsetPercent) / 100.0f);
                }
                if (view != view2) {
                    Rect rect = sRect;
                    rect.right = i12;
                    ((ViewGroup) view).offsetDescendantRectToMyCoords(view2, rect);
                    return sRect.right + layoutParams.getOpticalRightInset();
                }
                return i12;
            }
            if (itemAlignmentDef.mOffsetWithPadding) {
                float f9 = itemAlignmentDef.mOffsetPercent;
                if (f9 == 0.0f) {
                    i11 += view2.getPaddingLeft();
                } else if (f9 == 100.0f) {
                    i11 -= view2.getPaddingRight();
                }
            }
            if (itemAlignmentDef.mOffsetPercent != -1.0f) {
                if (view2 == view) {
                    width = layoutParams.getOpticalWidth(view2);
                } else {
                    width = view2.getWidth();
                }
                i11 += (int) ((width * itemAlignmentDef.mOffsetPercent) / 100.0f);
            }
            int i13 = i11;
            if (view != view2) {
                Rect rect2 = sRect;
                rect2.left = i13;
                ((ViewGroup) view).offsetDescendantRectToMyCoords(view2, rect2);
                return sRect.left - layoutParams.getOpticalLeftInset();
            }
            return i13;
        }
        if (itemAlignmentDef.mOffsetWithPadding) {
            float f10 = itemAlignmentDef.mOffsetPercent;
            if (f10 == 0.0f) {
                i11 += view2.getPaddingTop();
            } else if (f10 == 100.0f) {
                i11 -= view2.getPaddingBottom();
            }
        }
        if (itemAlignmentDef.mOffsetPercent != -1.0f) {
            if (view2 == view) {
                height = layoutParams.getOpticalHeight(view2);
            } else {
                height = view2.getHeight();
            }
            i11 += (int) ((height * itemAlignmentDef.mOffsetPercent) / 100.0f);
        }
        if (view != view2) {
            Rect rect3 = sRect;
            rect3.top = i11;
            ((ViewGroup) view).offsetDescendantRectToMyCoords(view2, rect3);
            i9 = sRect.top - layoutParams.getOpticalTopInset();
        } else {
            i9 = i11;
        }
        if (itemAlignmentDef.isAlignedToTextViewBaseLine()) {
            return i9 + view2.getBaseline();
        }
        return i9;
    }
}
