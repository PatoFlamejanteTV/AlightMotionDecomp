package androidx.transition;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public class Scene {
    private Context mContext;
    private Runnable mEnterAction;
    private Runnable mExitAction;
    private View mLayout;
    private int mLayoutId;
    private ViewGroup mSceneRoot;

    public Scene(@NonNull ViewGroup viewGroup) {
        this.mLayoutId = -1;
        this.mSceneRoot = viewGroup;
    }

    @Nullable
    public static Scene getCurrentScene(@NonNull ViewGroup viewGroup) {
        return (Scene) viewGroup.getTag(R.id.transition_current_scene);
    }

    @NonNull
    public static Scene getSceneForLayout(@NonNull ViewGroup viewGroup, @LayoutRes int i8, @NonNull Context context) {
        int i9 = R.id.transition_scene_layoutid_cache;
        SparseArray sparseArray = (SparseArray) viewGroup.getTag(i9);
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            viewGroup.setTag(i9, sparseArray);
        }
        Scene scene = (Scene) sparseArray.get(i8);
        if (scene != null) {
            return scene;
        }
        Scene scene2 = new Scene(viewGroup, i8, context);
        sparseArray.put(i8, scene2);
        return scene2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setCurrentScene(@NonNull ViewGroup viewGroup, @Nullable Scene scene) {
        viewGroup.setTag(R.id.transition_current_scene, scene);
    }

    public void enter() {
        if (this.mLayoutId > 0 || this.mLayout != null) {
            getSceneRoot().removeAllViews();
            if (this.mLayoutId > 0) {
                LayoutInflater.from(this.mContext).inflate(this.mLayoutId, this.mSceneRoot);
            } else {
                this.mSceneRoot.addView(this.mLayout);
            }
        }
        Runnable runnable = this.mEnterAction;
        if (runnable != null) {
            runnable.run();
        }
        setCurrentScene(this.mSceneRoot, this);
    }

    public void exit() {
        Runnable runnable;
        if (getCurrentScene(this.mSceneRoot) == this && (runnable = this.mExitAction) != null) {
            runnable.run();
        }
    }

    @NonNull
    public ViewGroup getSceneRoot() {
        return this.mSceneRoot;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isCreatedFromLayoutResource() {
        if (this.mLayoutId > 0) {
            return true;
        }
        return false;
    }

    public void setEnterAction(@Nullable Runnable runnable) {
        this.mEnterAction = runnable;
    }

    public void setExitAction(@Nullable Runnable runnable) {
        this.mExitAction = runnable;
    }

    private Scene(ViewGroup viewGroup, int i8, Context context) {
        this.mContext = context;
        this.mSceneRoot = viewGroup;
        this.mLayoutId = i8;
    }

    public Scene(@NonNull ViewGroup viewGroup, @NonNull View view) {
        this.mLayoutId = -1;
        this.mSceneRoot = viewGroup;
        this.mLayout = view;
    }
}
