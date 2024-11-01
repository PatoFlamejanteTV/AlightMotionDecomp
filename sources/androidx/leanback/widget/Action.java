package androidx.leanback.widget;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class Action {
    public static final long NO_ID = -1;
    private Drawable mIcon;
    private long mId;
    private ArrayList<Integer> mKeyCodes;
    private CharSequence mLabel1;
    private CharSequence mLabel2;

    public Action(long j8) {
        this(j8, "");
    }

    public final void addKeyCode(int i8) {
        this.mKeyCodes.add(Integer.valueOf(i8));
    }

    public final Drawable getIcon() {
        return this.mIcon;
    }

    public final long getId() {
        return this.mId;
    }

    public final CharSequence getLabel1() {
        return this.mLabel1;
    }

    public final CharSequence getLabel2() {
        return this.mLabel2;
    }

    public final void removeKeyCode(int i8) {
        this.mKeyCodes.remove(i8);
    }

    public final boolean respondsToKeyCode(int i8) {
        return this.mKeyCodes.contains(Integer.valueOf(i8));
    }

    public final void setIcon(Drawable drawable) {
        this.mIcon = drawable;
    }

    public final void setId(long j8) {
        this.mId = j8;
    }

    public final void setLabel1(CharSequence charSequence) {
        this.mLabel1 = charSequence;
    }

    public final void setLabel2(CharSequence charSequence) {
        this.mLabel2 = charSequence;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.mLabel1)) {
            sb.append(this.mLabel1);
        }
        if (!TextUtils.isEmpty(this.mLabel2)) {
            if (!TextUtils.isEmpty(this.mLabel1)) {
                sb.append(" ");
            }
            sb.append(this.mLabel2);
        }
        if (this.mIcon != null && sb.length() == 0) {
            sb.append("(action icon)");
        }
        return sb.toString();
    }

    public Action(long j8, CharSequence charSequence) {
        this(j8, charSequence, null);
    }

    public Action(long j8, CharSequence charSequence, CharSequence charSequence2) {
        this(j8, charSequence, charSequence2, null);
    }

    public Action(long j8, CharSequence charSequence, CharSequence charSequence2, Drawable drawable) {
        this.mId = -1L;
        this.mKeyCodes = new ArrayList<>();
        setId(j8);
        setLabel1(charSequence);
        setLabel2(charSequence2);
        setIcon(drawable);
    }
}
