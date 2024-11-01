package androidx.preference;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public class PreferenceViewHolder extends RecyclerView.ViewHolder {

    @Nullable
    private final Drawable mBackground;
    private final SparseArray<View> mCachedViews;
    private boolean mDividerAllowedAbove;
    private boolean mDividerAllowedBelow;
    private ColorStateList mTitleTextColors;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PreferenceViewHolder(@NonNull View view) {
        super(view);
        SparseArray<View> sparseArray = new SparseArray<>(4);
        this.mCachedViews = sparseArray;
        TextView textView = (TextView) view.findViewById(android.R.id.title);
        sparseArray.put(android.R.id.title, textView);
        sparseArray.put(android.R.id.summary, view.findViewById(android.R.id.summary));
        sparseArray.put(android.R.id.icon, view.findViewById(android.R.id.icon));
        int i8 = R.id.icon_frame;
        sparseArray.put(i8, view.findViewById(i8));
        sparseArray.put(16908350, view.findViewById(16908350));
        this.mBackground = view.getBackground();
        if (textView != null) {
            this.mTitleTextColors = textView.getTextColors();
        }
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.TESTS})
    public static PreferenceViewHolder createInstanceForTests(@NonNull View view) {
        return new PreferenceViewHolder(view);
    }

    public View findViewById(@IdRes int i8) {
        View view = this.mCachedViews.get(i8);
        if (view != null) {
            return view;
        }
        View findViewById = this.itemView.findViewById(i8);
        if (findViewById != null) {
            this.mCachedViews.put(i8, findViewById);
        }
        return findViewById;
    }

    public boolean isDividerAllowedAbove() {
        return this.mDividerAllowedAbove;
    }

    public boolean isDividerAllowedBelow() {
        return this.mDividerAllowedBelow;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void resetState() {
        Drawable background = this.itemView.getBackground();
        Drawable drawable = this.mBackground;
        if (background != drawable) {
            ViewCompat.setBackground(this.itemView, drawable);
        }
        TextView textView = (TextView) findViewById(android.R.id.title);
        if (textView != null && this.mTitleTextColors != null && !textView.getTextColors().equals(this.mTitleTextColors)) {
            textView.setTextColor(this.mTitleTextColors);
        }
    }

    public void setDividerAllowedAbove(boolean z8) {
        this.mDividerAllowedAbove = z8;
    }

    public void setDividerAllowedBelow(boolean z8) {
        this.mDividerAllowedBelow = z8;
    }
}
