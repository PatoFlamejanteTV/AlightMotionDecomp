package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class SpannableBuilder extends SpannableStringBuilder {

    @NonNull
    private final Class<?> mWatcherClass;

    @NonNull
    private final List<WatcherWrapper> mWatchers;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class WatcherWrapper implements TextWatcher, SpanWatcher {
        private final AtomicInteger mBlockCalls = new AtomicInteger(0);
        final Object mObject;

        WatcherWrapper(Object obj) {
            this.mObject = obj;
        }

        private boolean isEmojiSpan(Object obj) {
            return obj instanceof EmojiSpan;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.mObject).afterTextChanged(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
            ((TextWatcher) this.mObject).beforeTextChanged(charSequence, i8, i9, i10);
        }

        final void blockCalls() {
            this.mBlockCalls.incrementAndGet();
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(Spannable spannable, Object obj, int i8, int i9) {
            if (this.mBlockCalls.get() > 0 && isEmojiSpan(obj)) {
                return;
            }
            ((SpanWatcher) this.mObject).onSpanAdded(spannable, obj, i8, i9);
        }

        @Override // android.text.SpanWatcher
        public void onSpanChanged(Spannable spannable, Object obj, int i8, int i9, int i10, int i11) {
            int i12;
            int i13;
            if (this.mBlockCalls.get() > 0 && isEmojiSpan(obj)) {
                return;
            }
            if (Build.VERSION.SDK_INT < 28) {
                if (i8 > i9) {
                    i8 = 0;
                }
                if (i10 > i11) {
                    i12 = i8;
                    i13 = 0;
                    ((SpanWatcher) this.mObject).onSpanChanged(spannable, obj, i12, i9, i13, i11);
                }
            }
            i12 = i8;
            i13 = i10;
            ((SpanWatcher) this.mObject).onSpanChanged(spannable, obj, i12, i9, i13, i11);
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(Spannable spannable, Object obj, int i8, int i9) {
            if (this.mBlockCalls.get() > 0 && isEmojiSpan(obj)) {
                return;
            }
            ((SpanWatcher) this.mObject).onSpanRemoved(spannable, obj, i8, i9);
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
            ((TextWatcher) this.mObject).onTextChanged(charSequence, i8, i9, i10);
        }

        final void unblockCalls() {
            this.mBlockCalls.decrementAndGet();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    SpannableBuilder(@NonNull Class<?> cls) {
        this.mWatchers = new ArrayList();
        Preconditions.checkNotNull(cls, "watcherClass cannot be null");
        this.mWatcherClass = cls;
    }

    private void blockWatchers() {
        for (int i8 = 0; i8 < this.mWatchers.size(); i8++) {
            this.mWatchers.get(i8).blockCalls();
        }
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static SpannableBuilder create(@NonNull Class<?> cls, @NonNull CharSequence charSequence) {
        return new SpannableBuilder(cls, charSequence);
    }

    private void fireWatchers() {
        for (int i8 = 0; i8 < this.mWatchers.size(); i8++) {
            this.mWatchers.get(i8).onTextChanged(this, 0, length(), length());
        }
    }

    private WatcherWrapper getWatcherFor(Object obj) {
        for (int i8 = 0; i8 < this.mWatchers.size(); i8++) {
            WatcherWrapper watcherWrapper = this.mWatchers.get(i8);
            if (watcherWrapper.mObject == obj) {
                return watcherWrapper;
            }
        }
        return null;
    }

    private boolean isWatcher(@Nullable Object obj) {
        return obj != null && isWatcher(obj.getClass());
    }

    private void unblockwatchers() {
        for (int i8 = 0; i8 < this.mWatchers.size(); i8++) {
            this.mWatchers.get(i8).unblockCalls();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void beginBatchEdit() {
        blockWatchers();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void endBatchEdit() {
        unblockwatchers();
        fireWatchers();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanEnd(@Nullable Object obj) {
        WatcherWrapper watcherFor;
        if (isWatcher(obj) && (watcherFor = getWatcherFor(obj)) != null) {
            obj = watcherFor;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanFlags(@Nullable Object obj) {
        WatcherWrapper watcherFor;
        if (isWatcher(obj) && (watcherFor = getWatcherFor(obj)) != null) {
            obj = watcherFor;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanStart(@Nullable Object obj) {
        WatcherWrapper watcherFor;
        if (isWatcher(obj) && (watcherFor = getWatcherFor(obj)) != null) {
            obj = watcherFor;
        }
        return super.getSpanStart(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    @SuppressLint({"UnknownNullness"})
    public <T> T[] getSpans(int i8, int i9, @NonNull Class<T> cls) {
        if (isWatcher((Class<?>) cls)) {
            WatcherWrapper[] watcherWrapperArr = (WatcherWrapper[]) super.getSpans(i8, i9, WatcherWrapper.class);
            T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, watcherWrapperArr.length));
            for (int i10 = 0; i10 < watcherWrapperArr.length; i10++) {
                tArr[i10] = watcherWrapperArr[i10].mObject;
            }
            return tArr;
        }
        return (T[]) super.getSpans(i8, i9, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int nextSpanTransition(int i8, int i9, @Nullable Class cls) {
        if (cls == null || isWatcher((Class<?>) cls)) {
            cls = WatcherWrapper.class;
        }
        return super.nextSpanTransition(i8, i9, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void removeSpan(@Nullable Object obj) {
        WatcherWrapper watcherWrapper;
        if (isWatcher(obj)) {
            watcherWrapper = getWatcherFor(obj);
            if (watcherWrapper != null) {
                obj = watcherWrapper;
            }
        } else {
            watcherWrapper = null;
        }
        super.removeSpan(obj);
        if (watcherWrapper != null) {
            this.mWatchers.remove(watcherWrapper);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(@Nullable Object obj, int i8, int i9, int i10) {
        if (isWatcher(obj)) {
            WatcherWrapper watcherWrapper = new WatcherWrapper(obj);
            this.mWatchers.add(watcherWrapper);
            obj = watcherWrapper;
        }
        super.setSpan(obj, i8, i9, i10);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    @SuppressLint({"UnknownNullness"})
    public CharSequence subSequence(int i8, int i9) {
        return new SpannableBuilder(this.mWatcherClass, this, i8, i9);
    }

    private boolean isWatcher(@NonNull Class<?> cls) {
        return this.mWatcherClass == cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder delete(int i8, int i9) {
        super.delete(i8, i9);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i8, CharSequence charSequence) {
        super.insert(i8, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i8, int i9, CharSequence charSequence) {
        blockWatchers();
        super.replace(i8, i9, charSequence);
        unblockwatchers();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i8, CharSequence charSequence, int i9, int i10) {
        super.insert(i8, charSequence, i9, i10);
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    SpannableBuilder(@NonNull Class<?> cls, @NonNull CharSequence charSequence) {
        super(charSequence);
        this.mWatchers = new ArrayList();
        Preconditions.checkNotNull(cls, "watcherClass cannot be null");
        this.mWatcherClass = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i8, int i9, CharSequence charSequence, int i10, int i11) {
        blockWatchers();
        super.replace(i8, i9, charSequence, i10, i11);
        unblockwatchers();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public SpannableStringBuilder append(char c8) {
        super.append(c8);
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    SpannableBuilder(@NonNull Class<?> cls, @NonNull CharSequence charSequence, int i8, int i9) {
        super(charSequence, i8, i9);
        this.mWatchers = new ArrayList();
        Preconditions.checkNotNull(cls, "watcherClass cannot be null");
        this.mWatcherClass = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i8, int i9) {
        super.append(charSequence, i8, i9);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i8) {
        super.append(charSequence, obj, i8);
        return this;
    }
}
