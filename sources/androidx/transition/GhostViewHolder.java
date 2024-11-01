package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
class GhostViewHolder extends FrameLayout {
    private boolean mAttached;

    @NonNull
    private ViewGroup mParent;

    /* JADX INFO: Access modifiers changed from: package-private */
    @RequiresApi(21)
    /* loaded from: classes3.dex */
    public static class Api21Impl {
        private Api21Impl() {
        }

        @DoNotInline
        static float getZ(View view) {
            return view.getZ();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GhostViewHolder(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        setClipChildren(false);
        this.mParent = viewGroup;
        viewGroup.setTag(R.id.ghost_view_holder, this);
        this.mParent.getOverlay().add(this);
        this.mAttached = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static GhostViewHolder getHolder(@NonNull ViewGroup viewGroup) {
        return (GhostViewHolder) viewGroup.getTag(R.id.ghost_view_holder);
    }

    private int getInsertIndex(ArrayList<View> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int childCount = getChildCount() - 1;
        int i8 = 0;
        while (i8 <= childCount) {
            int i9 = (i8 + childCount) / 2;
            getParents(((GhostViewPort) getChildAt(i9)).mView, arrayList2);
            if (isOnTop(arrayList, (ArrayList<View>) arrayList2)) {
                i8 = i9 + 1;
            } else {
                childCount = i9 - 1;
            }
            arrayList2.clear();
        }
        return i8;
    }

    private static void getParents(View view, ArrayList<View> arrayList) {
        Object parent = view.getParent();
        if (parent instanceof ViewGroup) {
            getParents((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    private static boolean isOnTop(ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        if (arrayList.isEmpty() || arrayList2.isEmpty() || arrayList.get(0) != arrayList2.get(0)) {
            return true;
        }
        int min = Math.min(arrayList.size(), arrayList2.size());
        for (int i8 = 1; i8 < min; i8++) {
            View view = arrayList.get(i8);
            View view2 = arrayList2.get(i8);
            if (view != view2) {
                return isOnTop(view, view2);
            }
        }
        return arrayList2.size() == min;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addGhostView(GhostViewPort ghostViewPort) {
        ArrayList<View> arrayList = new ArrayList<>();
        getParents(ghostViewPort.mView, arrayList);
        int insertIndex = getInsertIndex(arrayList);
        if (insertIndex >= 0 && insertIndex < getChildCount()) {
            addView(ghostViewPort, insertIndex);
        } else {
            addView(ghostViewPort);
        }
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        if (this.mAttached) {
            super.onViewAdded(view);
            return;
        }
        throw new IllegalStateException("This GhostViewHolder is detached!");
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            this.mParent.setTag(R.id.ghost_view_holder, null);
            this.mParent.getOverlay().remove(this);
            this.mAttached = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void popToOverlayTop() {
        if (this.mAttached) {
            this.mParent.getOverlay().remove(this);
            this.mParent.getOverlay().add(this);
            return;
        }
        throw new IllegalStateException("This GhostViewHolder is detached!");
    }

    private static boolean isOnTop(View view, View view2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int childCount = viewGroup.getChildCount();
        if (Api21Impl.getZ(view) != Api21Impl.getZ(view2)) {
            return Api21Impl.getZ(view) > Api21Impl.getZ(view2);
        }
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = viewGroup.getChildAt(ViewGroupUtils.getChildDrawingOrder(viewGroup, i8));
            if (childAt == view) {
                return false;
            }
            if (childAt == view2) {
                break;
            }
        }
        return true;
    }
}
